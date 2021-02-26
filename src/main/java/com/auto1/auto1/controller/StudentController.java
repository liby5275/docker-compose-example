package com.auto1.auto1.controller;

import com.auto1.auto1.model.Student;
import com.auto1.auto1.model.StudentRequest;
import com.auto1.auto1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/student", method = RequestMethod.POST)
    public Student saveStudent(@RequestBody StudentRequest studentRequest){
        return studentService.saveStudent(studentRequest);
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
        public String getData(){
            return "Hello World";

    }

    @RequestMapping(value="/student/{id}", method = RequestMethod.GET)
    public Student getCustomerBuId(@PathVariable int id){
        return studentService.getStudentById(id);
    }
}
