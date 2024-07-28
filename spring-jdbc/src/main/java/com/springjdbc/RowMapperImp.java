package com.springjdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Student(resultSet.getLong(1),
                           resultSet.getString(2),
                           resultSet.getString(3));
    }
}
