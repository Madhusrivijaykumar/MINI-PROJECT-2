package com.example.Patient.Appointment.repository;
import com.example.Patient.Appointment.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

interface PatientRepository extends JpaRepository<patient, Long> {
}
