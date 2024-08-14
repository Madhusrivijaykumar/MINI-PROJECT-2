package com.example.Patient.Appointment.repository;

import com.example.Patient.Appointment.entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;

interface DoctorRepository extends JpaRepository<doctor, Long> {
}
