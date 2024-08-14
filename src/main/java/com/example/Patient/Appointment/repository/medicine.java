package com.example.Patient.Appointment.repository;

import com.example.Patient.Appointment.entity.medicine;
import org.springframework.data.jpa.repository.JpaRepository;

interface MedicationRepository extends JpaRepository<medicine, Long> {
}
