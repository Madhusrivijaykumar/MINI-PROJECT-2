package com.example.Patient.Appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.Patient.Appointment.entity")
public class PatientAppointmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatientAppointmentApplication.class, args);
	}

}
