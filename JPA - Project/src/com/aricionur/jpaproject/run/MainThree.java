package com.aricionur.jpaproject.run;

import java.util.List;

import com.aricionur.jpaproject.dao.DAO;
import com.aricionur.jpaproject.entity.Doctor;
import com.aricionur.jpaproject.entity.Patient;

public class MainThree {

	public static void main(String[] args) {
		DAO dao = new DAO();

		// ----READ data From DB tables---

		// --Single patient--
		int patientId = 2;
		Patient patient = dao.getSinglePatientById(patientId);
		System.out.println("Name of patient by ID " + patientId + ": " + patient.getName());
		// --All patients--
		List<Patient> allPatients = dao.getAllPatients();
		System.out.println("All patients:");
		for (Patient eachPatient : allPatients) {
			System.out.println(eachPatient.getName());
		}

		// --Doctor/Doctors of single patient--
		List<Doctor> doctorList = patient.getDoctorList();
		System.out.println("Doctor/Doctors of patient by ID " + patientId);
		for (Doctor eachDoctor : doctorList) {
			System.out.println(eachDoctor.getName());
		}

		// --Doctor/Doctors of all patients--
		System.out.println("Doctor/Doctors of all patients: ");
		for (Patient eachPatient : allPatients) {
			System.out.println("Doctor/Doctors of patient " + eachPatient.getName() + " : ");
			List<Doctor> eachDoctorList = eachPatient.getDoctorList();
			for (Doctor eachDoctor : eachDoctorList) {
				System.out.println(eachDoctor.getName());
			}
		}

	}

}
