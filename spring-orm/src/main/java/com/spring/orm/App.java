package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OrmConfiguration.class);
        StudentDao studentDao = applicationContext.getBean("eshan", StudentDao.class);
        long insert = studentDao.insert(new Student(50119L, "Eshan", "Pune"));

        System.out.println("Done: "+ insert);
    }

}
