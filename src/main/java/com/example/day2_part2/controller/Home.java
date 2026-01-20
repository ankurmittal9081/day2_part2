package com.example.day2_part2.controller;

import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class Home {
   @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
       StudentModel student=new StudentModel(1,"ankur mittal","ankurmittal9081@gmail.com");
       StudentModel student1=new StudentModel(2,"tanya mittal","tanyamittal9081@gmail.com");
       StudentModel student2=new StudentModel(3,"sakshi mittal","sakshimittal9081@gmail.com");
       StudentModel student3=new StudentModel(4,"deeksha mittal","deekshamittal9081@gmail.com");
       StudentModel student4=new StudentModel(5,"anshu mittal","anshuittal9081@gmail.com");


       ArrayList<StudentModel> l=new ArrayList<>();
       l.add(student);
       l.add(student1);
       l.add(student2);
       l.add(student3);
       l.add(student4);
       return l;

   }

}
