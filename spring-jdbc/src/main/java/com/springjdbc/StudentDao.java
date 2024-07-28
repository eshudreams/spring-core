package com.springjdbc;

import org.springframework.stereotype.Component;

public interface StudentDao {
    public int insert(Student student);

    public Student getStudent(int id);
}
