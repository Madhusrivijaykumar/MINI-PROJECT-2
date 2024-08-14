package com.example.Patient.Appointment.controller;


import com.example.Patient.Appointment.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
public class doctor {

    @Autowired
    private doctor doctorRepository;

    @GetMapping
    public List<doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    private List<doctor> findAll() {
        return List.of();
    }

    @GetMapping("/{id}")
    public doctor getDoctorById(@PathVariable Long id) {
        return (doctor) doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
    }


    @PostMapping
    public doctor createDoctor(@RequestBody doctor doctor) {
        return doctorRepository.save(doctor);
    }

    private doctor save(doctor doctor) {
        return doctor;
    }

    @PutMapping("/{id}")
    public doctor updateDoctor(@PathVariable Long id, @RequestBody doctor doctorDetails) {
        doctor doctor = (com.example.Patient.Appointment.controller.doctor) doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        doctor.setName(doctorDetails.getName());
            return doctorRepository.save(doctor);
    }

    private void setName(Object name) {
    }

    private Object getName() {
        return null;
    }

    private <T> Optional<Object> findById(Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctor doctor = (com.example.Patient.Appointment.controller.doctor) doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        doctorRepository.delete(doctor);
    }

    private void delete(doctor doctor) {
    }
}

