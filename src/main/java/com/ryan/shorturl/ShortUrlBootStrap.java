package com.ryan.shorturl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhangjianbing
 * time 2019/9/16
 */
@SpringBootApplication
public class ShortUrlBootStrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ShortUrlBootStrap.class).run(args);
    }

}
