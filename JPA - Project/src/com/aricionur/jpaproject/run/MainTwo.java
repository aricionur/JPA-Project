package com.aricionur.jpaproject.run;

import java.util.ArrayList;
import java.util.List;

import com.aricionur.jpaproject.dao.DAO;
import com.aricionur.jpaproject.entity.Doctor;
import com.aricionur.jpaproject.entity.Hospital;
import com.aricionur.jpaproject.entity.Patient;

public class MainTwo {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		Hospital hospitalOne = new Hospital();
		hospitalOne.setName("HospitalOne");
		dao.insert(hospitalOne);
		
		Patient patientOne = new Patient();
		patientOne.setName("PatientOne");
		patientOne.setPatientComplaint("headache");
		patientOne.setHospital(hospitalOne);
		dao.insert(patientOne);
		
		Patient patientTwo = new Patient();
		patientTwo.setName("PatientTwo");
		patientTwo.setPatientComplaint("headache");
		patientTwo.setHospital(hospitalOne);
		dao.insert(patientTwo);
		
		Patient patientThree = new Patient();
		patientThree.setName("PatientThree");
		patientThree.setPatientComplaint("headache");
		patientThree.setHospital(hospitalOne);
		dao.insert(patientThree);
		
		List<Patient> patientList = new ArrayList<>();
		patientList.add(patientOne);
		patientList.add(patientTwo);
		patientList.add(patientThree);
		
		hospitalOne.setPatientList(patientList);
		dao.insert(hospitalOne);
		
		Doctor doctorOne = new Doctor();
		doctorOne.setName("DoctorOne");
		doctorOne.setPatientList(patientList);
		dao.insert(doctorOne);
		
		Doctor doctorTwo = new Doctor();
		doctorTwo.setName("DoctorTwo");
		doctorTwo.setPatientList(patientList);
		dao.insert(doctorTwo);
		
		Doctor doctorThree = new Doctor();
		doctorThree.setName("DoctorThree");
		doctorThree.setPatientList(patientList);
		dao.insert(doctorThree);
		
		
		
		
		
		
	}
}
