package com.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.springjdbc")
public class JdbcConfiguration {
    private static final String URL = "jdbc:mysql://localhost:3306/springjdbc";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "eshudreams";
    @Bean
    public DriverManagerDataSource getDriverManagerDataSource() {
        return new DriverManagerDataSource(URL, USER_NAME, PASSWORD);
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDriverManagerDataSource());
    }
}
