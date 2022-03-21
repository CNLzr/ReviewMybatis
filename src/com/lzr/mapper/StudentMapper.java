package com.lzr.mapper;

import com.lzr.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getAll();
    Student getById(int id);
}
