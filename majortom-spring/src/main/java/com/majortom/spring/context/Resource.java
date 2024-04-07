package com.majortom.spring.context;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2024/4/7 16:38
 **/
public class Resource {
    private final String path;

    private final String name;

    public Resource(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }
}
