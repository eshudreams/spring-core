package com.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "insert into Student(id, name, city) values(?,?,?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public Student getStudent(int id) {
        String query = "select * from Student where id=?";
        return jdbcTemplate.queryForObject(query, new RowMapperImp(), id);
    }
}
