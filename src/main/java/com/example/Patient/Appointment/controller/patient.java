package com.example.Patient.Appointment.controller;


import com.example.Patient.Appointment.exception.ResourceNotFoundException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
    @RequestMapping("/api/patients")
    @Getter
    @Setter
    public class patient {

        @Autowired
        private patient patientRepository;

        @GetMapping
        public List<patient> getAllPatients() {
            return patientRepository.findAll();
        }

        private List<patient> findAll() {
            return List.of();
        }

        @GetMapping("/{id}")
        public patient getPatientById(@PathVariable Long id) {
            return (patient) patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
        }

        @PostMapping
        public patient createPatient(@RequestBody patient patient) {
            return patientRepository.save(patient);
        }

        @PutMapping("/{id}")
        public patient updatePatient(@PathVariable Long id, @RequestBody patient patientDetails) {
            patient patient = (com.example.Patient.Appointment.controller.patient) patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
            patient.setName(patientDetails.getName());
            patient.setContactDetails(patientDetails.getContactDetails());
            return patientRepository.save(patient);
        }

        private void setName(Object name) {
        }

        private void setContactDetails(Object contactDetails) {
        }

        private Object getContactDetails() {
            return null;
        }

        private Object getName() {
            return null;
        }

        private patient save(patient patient) {
            return patient;
        }

        @DeleteMapping("/{id}")
        public void deletePatient(@PathVariable Long id) {
            patient patient = (com.example.Patient.Appointment.controller.patient) patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
            patientRepository.delete(patient);
        }

        private <T> Optional<Object> findById(Long id) {
            return Optional.empty();
        }

        private void delete(patient patient) {
        }
    }


