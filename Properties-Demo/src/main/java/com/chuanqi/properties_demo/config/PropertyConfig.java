package com.chuanqi.properties_demo.config;

import com.chuanqi.properties_demo.model.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Value("${url}")
    String url;

    @Bean
    public DataSource dataSource() {
        return new DataSource(username, password, url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
