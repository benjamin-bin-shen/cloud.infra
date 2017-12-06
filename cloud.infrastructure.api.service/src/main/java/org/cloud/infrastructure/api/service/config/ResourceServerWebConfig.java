package org.cloud.infrastructure.api.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({ "org.cloud.infrastructure.api.service.web.controller" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {

}
