package com.SpringPartTwo.LearningRESTAPIs.repository;

import com.SpringPartTwo.LearningRESTAPIs.intity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
