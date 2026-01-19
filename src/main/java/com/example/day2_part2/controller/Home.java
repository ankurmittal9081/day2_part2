package com.example.day2_part2.controller;

import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
   @GetMapping("/")
    public StudentModel getStudent(){
       StudentModel student=new StudentModel(1,"ankur mittal","ankurmittal9081@gmail.com");
       return student;

   }

}
