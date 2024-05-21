package com.springboot.demo.mycoolapp.dao;

import com.springboot.demo.mycoolapp.entity.Student;

// This is the Data Access Object interface
public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);
}
