package com.example.Patient.Appointment.repository;

import com.example.Patient.Appointment.entity.appointment;
import org.springframework.data.jpa.repository.JpaRepository;

interface AppointmentRepository extends JpaRepository<appointment, Long> {
}
