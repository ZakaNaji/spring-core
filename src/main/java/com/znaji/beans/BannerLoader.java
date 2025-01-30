package com.znaji.beans;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BannerLoader {

    private final Resource banner;

    public BannerLoader(Resource banner) {
        this.banner = banner;
    }

    public void init() throws IOException {
        var path = Paths.get(banner.getURI());
        try (var lines = Files.lines(path)) {
            lines.forEachOrdered(System.out::println);
        }
    }

}
