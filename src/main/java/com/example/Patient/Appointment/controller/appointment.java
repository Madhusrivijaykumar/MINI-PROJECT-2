package com.example.Patient.Appointment.controller;

import com.example.Patient.Appointment.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
    @RequestMapping("/api/appointments")
    public class appointment{

        @Autowired
        private appointment appointmentRepository;

        @GetMapping
        public List<appointment> getAllAppointments() {
            return appointmentRepository.findAll();
        }

        private List<appointment> findAll() {
            return List.of();
        }

        @GetMapping("/{id}")
        public appointment getAppointmentById(@PathVariable Long id) {
            return (appointment) appointmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
        }

        private <T> Optional<Object> findById(Long id) {
            return Optional.empty();
        }

        @PostMapping
        public appointment createAppointment(@RequestBody appointment appointment) {
            return appointmentRepository.save(appointment);
        }

    private appointment save(appointment appointment) {
        return appointment;
    }

    @PutMapping("/{id}")
        public appointment updateAppointment(@PathVariable Long id, @RequestBody appointment appointmentDetails) {
            appointment appointment = (com.example.Patient.Appointment.controller.appointment) appointmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
            appointment.getAppointmentById(appointmentDetails.getPatient());
            appointment.setAppointmentDateTime(appointmentDetails.getAppointmentDateTime());

            return appointmentRepository.save(appointment);
        }

    private void setAppointmentDateTime(Object appointmentDateTime) {
    }

    private Object getAppointmentDateTime() {
        return null;
    }

    private Object getDoctor() {
        return null;
    }

    private Long getPatient() {
        return null;
    }

    @DeleteMapping("/{id}")
        public void deleteAppointment(@PathVariable Long id) {
            appointment appointment = (com.example.Patient.Appointment.controller.appointment) appointmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
            appointmentRepository.delete(appointment);
        }

    private void delete(appointment appointment) {
    }
}


