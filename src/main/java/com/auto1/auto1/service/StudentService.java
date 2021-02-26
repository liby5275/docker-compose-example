package com.auto1.auto1.service;

import com.auto1.auto1.model.Student;
import com.auto1.auto1.model.StudentRequest;

public interface StudentService {

    public Student saveStudent(StudentRequest studentRequest);
    public Student getStudentById(int id);
}
