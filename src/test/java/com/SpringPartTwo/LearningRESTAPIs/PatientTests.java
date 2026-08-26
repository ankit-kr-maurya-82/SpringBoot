package com.SpringPartTwo.LearningRESTAPIs;

import com.SpringPartTwo.LearningRESTAPIs.intity.Patient;
import com.SpringPartTwo.LearningRESTAPIs.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatientRespository(){
        List<Patient> patientList =  patientRepository.findAll();
        System.out.println(patientList);
    }
}
