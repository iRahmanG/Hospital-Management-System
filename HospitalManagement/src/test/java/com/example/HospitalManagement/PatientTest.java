package com.example.HospitalManagement;

import com.example.HospitalManagement.entity.Patient;
import com.example.HospitalManagement.entity.type.BloodGroupType;
import com.example.HospitalManagement.repository.PatientRepository;
import com.example.HospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }
    @Test
    public void testTransactionMethods(){
//        Patient patient = patientService.getPatientById(1L);
//        Patient patient = patientRepository.findByName("Meera Joshi");

        List<Patient> patientList= patientRepository.findByBloodGroup(BloodGroupType.A_NEGATIVE);
        for(Patient patient:patientList) {
            System.out.println(patient);
        }
    }
}
