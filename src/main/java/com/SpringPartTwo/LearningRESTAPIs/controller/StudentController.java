package com.SpringPartTwo.LearningRESTAPIs.controller;

import com.SpringPartTwo.LearningRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L, "Ankit", "ankit@gmail.com");
    }
    @GetMapping("/student{id}")
    public StudentDto getStudentId(){
        return new StudentDto(4L, "Aman", "aman@gmail.com");
    }
}
