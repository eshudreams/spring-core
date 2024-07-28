package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("eshan")
public class StudentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public long insert(Student student) {
        return (long) hibernateTemplate.save(student);
    }
}
