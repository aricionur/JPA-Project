package com.aricionur.jpaproject.run;

import java.util.List;

import com.aricionur.jpaproject.dao.DAO;
import com.aricionur.jpaproject.entity.Doctor;
import com.aricionur.jpaproject.entity.Patient;

public class MainFour {

	public static void main(String[] args) {
		DAO dao = new DAO();

		// ----READ data From DB tables---

		// --Single doctor--
		int doctorId = 5;
		Doctor doctor = dao.getSingleDocotrById(doctorId);
		System.out.println("Name of doktor by ID " + doctorId + " : " + doctor.getName());

		// --All doctors--
		List<Doctor> allDoctors = dao.getAllDoctors();
		System.out.println("All doktors:");
		for (Doctor eachDoctor : allDoctors) {
			System.out.println(eachDoctor.getName());
		}

		// --Patient/Patients of a single Doctor and pations' hospital--
		List<Patient> patientList = doctor.getPatientList();
		System.out.println("Pation/Pations of doctor " + doctor.getName() + " /and pations' hospitals: ");
		for (Patient eachPatient : patientList) {
			System.out.println(
					"Patient Name/Hospital : " + eachPatient.getName() + "/" + eachPatient.getHospital().getName());
		}

		// --Patient/Patients of all doctors--
		System.out.println("Patient/Patients of all doctors: ");
		for (Doctor eachDoctor : allDoctors) {
			System.out.println("Patient/Patients of doctor " + eachDoctor.getName() + " : ");
			List<Patient> eachPatientList = eachDoctor.getPatientList();
			for (Patient eachPatient : eachPatientList) {
				System.out.println("Patient Name/Hospital : " + eachPatient.getName() + "/" + eachPatient.getHospital().getName());
			}
		}

	}
}
