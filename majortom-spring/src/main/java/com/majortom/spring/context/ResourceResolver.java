package com.majortom.spring.context;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.function.Function;

import static com.sun.org.apache.xalan.internal.utils.SecuritySupport.getContextClassLoader;

/**
 * <p>
 * 扫描器
 * </p>
 *
 * @author Major Tom
 * @date 2024/4/7 16:32
 **/
public class ResourceResolver {

    Logger logger = LoggerFactory.getLogger(getClass());
    String basePackages;

    public ResourceResolver(String basePackages) {
        this.basePackages = basePackages;
    }

    public <R> List<R> scan(Function<Resource, R> mapper) {
        String basePackagePath = this.basePackages.replace(".", "/");
        String path = basePackagePath;
        try {
            List<R> collector = new ArrayList<>();
            executeScan(basePackagePath, path, collector, mapper);
            return collector;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    private <R> void executeScan(String basePackagePath, String path, List<R> collector, Function<Resource, R> mapper) throws IOException, URISyntaxException {
        logger.debug("scan path:{}", path);
        Enumeration<URL> en = getContextClassLoader().getResources(path);
        while (en.hasMoreElements()) {
            URL url = en.nextElement();
            URI uri = url.toURI();
            String uriStr = removeTrailingSlash(uriToString(uri));
            String uriBaseStr = uriStr.substring(0, uriStr.length() - basePackagePath.length());
            if (uriBaseStr.startsWith("file:")) {
                uriBaseStr = uriBaseStr.substring(5);
            }
            if (uriStr.startsWith("jar:")) {
                scanFile(true, uriBaseStr, jarUriToPath(basePackagePath, uri), collector, mapper);
            } else {
                scanFile(false, uriBaseStr, Paths.get(uri), collector, mapper);
            }
        }
    }

    private ClassLoader getContextClassLoader() {
        ClassLoader loader;
        loader = Thread.currentThread().getContextClassLoader();
        if (null == loader) {
            loader = getClass().getClassLoader();
        }
        return loader;
    }

    private Path jarUriToPath(String basePackagePath, URI jarUri) throws IOException {
        return FileSystems.newFileSystem(jarUri, new HashMap<>()).getPath(basePackagePath);
    }

    private <R> void scanFile(boolean isJar, String uriBaseStr, Path root, List<R> collector, Function<Resource, R> mapper) throws IOException {
        String baseDir = removeTrailingSlash(uriBaseStr);
        Files.walk(root).filter(Files::isRegularFile).forEach(file -> {
            Resource res;
            if (isJar) {
                res = new Resource(baseDir, removeTrailingSlash(file.toString()));
            } else {
                String path = file.toString();
                String name = removeLeadingSlash(path.substring(baseDir.length()));
                res = new Resource("file:" + path, name);
            }
            logger.debug("found resource:{}", res);
            R r = mapper.apply(res);
            if (null != r) {
                collector.add(r);
            }
        });
    }

    private String uriToString(URI uri) throws UnsupportedEncodingException {
        return URLDecoder.decode(uri.toString(), String.valueOf(StandardCharsets.UTF_8));
    }

    private String removeTrailingSlash(String s) {
        if (s.startsWith("/") || s.startsWith("\\")) {
            s = s.substring(1);
        }
        return s;
    }

    private String removeLeadingSlash(String s) {
        if (s.endsWith("/") || s.endsWith("\\")) {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }


}
