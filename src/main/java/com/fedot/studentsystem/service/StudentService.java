package com.fedot.studentsystem.service;

import com.fedot.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student seveStudent(Student student);
    public List<Student> getAllStudents();
}
