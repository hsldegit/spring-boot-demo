package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.domain.Student1;
import com.example.springbootdemo.service.SchedualServiceStudent;

@RestController
public class StudentController {

    @Autowired
    private SchedualServiceStudent schedualServiceStudent;

    @RequestMapping("getStudent")
    public Student1 getStudent() {
        return schedualServiceStudent.getStudent();
    }

}
