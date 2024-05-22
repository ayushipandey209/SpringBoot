package com.MongoSpring.Controller;

import com.MongoSpring.Model.Student;
import com.MongoSpring.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//mongodb://localhost:27017
@RestController
public class MainController {

    @Autowired
    StudentRepo studentRepo ;
    @PostMapping("/addStudent") //adding data from
    public void addStudent(@RequestBody Student student)
    {
       studentRepo.save(student);

    }

    @GetMapping("/getStudent/{id}") //adding data from
    public Student getStudent(@PathVariable Integer id)
    {
       return studentRepo.findById(id).orElse(null);

    }

    //delete
//    @GetMapping("/getStudent/{id}") //adding data from
//    public Student deleteStudent(@PathVariable Integer id)
//    {
//        return studentRepo.findById(id).orElse(null);
//
//    }
//
}
