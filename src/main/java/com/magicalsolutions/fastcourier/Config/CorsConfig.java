package com.magicalsolutions.fastcourier.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class CorsConfig extends WebMvcConfigurerAdapter {

    @Value("${spring.profiles.active}")
    private String active_profile;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        if (active_profile.equals("prod")) {
            registry.addMapping("/**");
        }
    }
}