package com.example.testspringpmc.webconfiguration;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfiguration extends WebMvcAutoConfiguration {

@Bean
public InternalResourceViewResolver viewResolver()
{
    InternalResourceViewResolver resolver= new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/pages");
    resolver.setSuffix("*.jsp");
  return resolver;
}
}
