package com.SpringPartTwo.LearningRESTAPIs.service;

import com.SpringPartTwo.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.SpringPartTwo.LearningRESTAPIs.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
}
