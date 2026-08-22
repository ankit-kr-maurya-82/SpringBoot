package com.SpringPartTwo.LearningRESTAPIs.controller;

import com.SpringPartTwo.LearningRESTAPIs.dto.StudentDto;
import com.SpringPartTwo.LearningRESTAPIs.intity.Student;
import com.SpringPartTwo.LearningRESTAPIs.repository.StudentRepository;
import com.SpringPartTwo.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
