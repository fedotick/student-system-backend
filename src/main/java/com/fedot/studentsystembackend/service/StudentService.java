package com.fedot.studentsystembackend.service;

import com.fedot.studentsystembackend.model.Student;

import java.util.List;

public interface StudentService {
    public Student seveStudent(Student student);
    public List<Student> getAllStudents();
}
