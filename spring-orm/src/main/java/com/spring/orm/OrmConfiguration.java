package com.spring.orm;

import com.spring.orm.entities.Student;
import net.bytebuddy.asm.Advice;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Objects;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.spring.orm.dao")
@EnableTransactionManagement
public class OrmConfiguration {

    private static final String URL = "jdbc:mysql://localhost:3306/springjdbc";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "eshudreams";
    @Bean
    public DriverManagerDataSource getDriverManagerDataSource() {
        return new DriverManagerDataSource(URL, USER_NAME, PASSWORD);
    }

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDriverManagerDataSource());
        localSessionFactoryBean.setAnnotatedClasses(Student.class);
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        localSessionFactoryBean.setHibernateProperties(hibernateProperties);
        return localSessionFactoryBean;
    }

    @Bean
    public HibernateTemplate getHibernateTemplate() {
        return new HibernateTemplate(Objects.requireNonNull(getLocalSessionFactoryBean().getObject()));
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(getLocalSessionFactoryBean().getObject());
        return hibernateTransactionManager;

    }
}
