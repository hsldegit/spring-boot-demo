package com.example.springbootdemo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springbootdemo.domain.Student1;

@FeignClient(value = "service-hi")
public interface SchedualServiceStudent {

    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    Student1 getStudent();

}
