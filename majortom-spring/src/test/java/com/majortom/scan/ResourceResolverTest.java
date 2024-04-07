package com.majortom.scan;


import com.majortom.spring.context.ResourceResolver;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2024/4/7 22:35
 **/
public class ResourceResolverTest {

    @Test
    public void scanClass() {
        String pkg = "com.majortom.scan";
        ResourceResolver resourceResolver = new ResourceResolver(pkg);
        List<String> classes = resourceResolver.scan(res -> {
            String name = res.getName();
            if (name.endsWith(".class")) {
                return name.substring(0, name.length() - 6).replace("/", ".").replace("\\", ".");
            }
            return null;
        });
        Collections.sort(classes);
        System.out.println(classes);
        String[] listClasses = new String[]{
                "com.majortom.scan.convert.ValueConverterToBean",
                "com.majortom.scan.destroy.AnnotationDestroyBean",
                "com.majortom.scan.destroy.SpecifyDestroyBean"
        };
        for (String listClass : listClasses) {
            assertTrue(classes.contains(listClass));
        }
    }

}
