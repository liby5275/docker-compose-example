package com.auto1.auto1.service;

import com.auto1.auto1.repo.StudentRepo;
import com.auto1.auto1.model.Student;
import com.auto1.auto1.model.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(StudentRequest studentRequest) {

        Student student = new Student(studentRequest.getFirstName(),studentRequest.getLastName(),
                studentRequest.getEmail(),studentRequest.getAddress(),studentRequest.getMobileNumber());

        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> opStudent =  studentRepo.findById(id);
        return opStudent.get();
    }
}
