package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
        StudentDao studentDao = applicationContext.getBean("studentDaoImpl", StudentDao.class);
        //studentDao.insert(new Student(50120, "Sarvesh", "Nainital"));
        System.out.println(studentDao.getStudent(50119));

    }
}
