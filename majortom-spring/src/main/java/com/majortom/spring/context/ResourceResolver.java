package com.majortom.spring.context;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Function;

import static com.sun.org.apache.xalan.internal.utils.SecuritySupport.getContextClassLoader;

/**
 * <p>
 *
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

    private <R> void scanFile(boolean b, String uriBaseStr, Object o, List<R> collector, Function<Resource, R> mapper) {
    }

    private Object jarUriToPath(String basePackagePath, URI uri) {
    }

    private String removeTrailingSlash(Object o) {
    }

    private Object uriToString(URI uri) {
    }
}
