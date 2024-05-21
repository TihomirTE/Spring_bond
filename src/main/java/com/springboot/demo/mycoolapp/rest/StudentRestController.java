package com.springboot.demo.mycoolapp.rest;

import com.springboot.demo.mycoolapp.entity.Student;
import com.springboot.demo.mycoolapp.rest.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov", "iv@ivanov.com"));
        students.add(new Student("Georgi", "Georgiev", "ge@georgiev.com"));
        students.add(new Student("Dimityr", "Ivanov", "dim@ivanov.com"));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){


        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if ( (studentId >= students.size()) || studentId < 0){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return students.get(studentId);
    }


}
