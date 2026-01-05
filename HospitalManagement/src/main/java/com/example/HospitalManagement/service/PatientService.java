package com.example.HospitalManagement.service;

import com.example.HospitalManagement.entity.Patient;
import com.example.HospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional
    public Patient getPatientById(Long id){
        Patient patient1 = patientRepository.findById(id).orElseThrow();
        Patient patient2 = patientRepository.findById(id).orElseThrow();
        return patient1;
    }


}
