package com.example.reddit_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class RedditProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditProjectApplication.class, args);
    }

}
