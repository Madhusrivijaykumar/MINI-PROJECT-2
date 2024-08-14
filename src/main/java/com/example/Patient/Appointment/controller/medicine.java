package com.example.Patient.Appointment.controller;
import com.example.Patient.Appointment.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medications")

public class medicine {


        @Autowired
        private medicine medicationRepository;

        @GetMapping
        public List<medicine> getAllMedications() {
            return medicationRepository.findAll();
        }

    private List<medicine> findAll() {
        return List.of();
    }

    @GetMapping("/{id}")
        public Object getMedicationById(@PathVariable Long id) {
            return medicationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medication not found"));
        }

    private <T> Optional<Object> findById(Long id) {
        return Optional.empty();
    }

    @PostMapping
        public medicine createMedication(@RequestBody medicine medication) {
            return medicationRepository.save(medication);
        }

        @PutMapping("/{id}")
        public medicine updateMedication(@PathVariable Long id, @RequestBody medicine medicationDetails) {
            medicine medicine = (com.example.Patient.Appointment.controller.medicine) medicationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medication not found"));
            medicine.setPatient(medicationDetails.getPatient());
            medicine.setName(medicationDetails.getName());
            medicine.setintake(medicationDetails.getDosage());

            return medicationRepository.save(medicine);
        }

    private void setintake(Object dosage) {
    }

    private void setPatient(Object patient) {
    }

    private void setName(Object name) {
    }

       private medicine save(medicine medicine) {
        return medicine;
    }

    private Object getFrequency() {
        return null;
    }

    private Object getDosage() {
        return null;
    }

    private Object getName() {
        return null;
    }

    private Object getPatient() {
        return null;
    }

    @DeleteMapping("/{id}")
        public void deleteMedication(@PathVariable Long id) {
            medicine medication = (medicine) medicationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medication not found"));
            medicationRepository.delete(medication);
        }

    private void delete(medicine medication) {
    }
}


