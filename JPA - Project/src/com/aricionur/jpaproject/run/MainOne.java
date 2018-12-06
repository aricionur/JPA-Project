package com.aricionur.jpaproject.run;

import java.util.List;

import com.aricionur.jpaproject.dao.DAO;
import com.aricionur.jpaproject.entity.Hospital;

public class MainOne {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		 //--INSERT data to DB
		Hospital hospital = new Hospital();
		hospital.setName("HospitalOne");
		dao.insert(hospital);
		
		Hospital hospitalTwo = new Hospital();
		hospitalTwo.setName("HospitalTwo");
		dao.insert(hospitalTwo);
			
		Hospital hospitalThree = new Hospital();
		hospitalThree.setName("HospitalThree");
		dao.insert(hospitalThree);
		
		//--DELETE data from DB
		dao.delete(hospitalThree);
		
		//--UPDATE data from DB
		hospitalTwo.setName("HospitalTwoModified");
		dao.update(hospitalTwo);
		
		//--GET single data from DB.hospital table
		int id =1;
		Hospital getHospital = dao.getSingleHospitalById(id);
		System.out.println("Hospital name: " + getHospital.getName());
		
		//--GET all data from DB.hospital table
		List<Hospital> hospitalList = dao.getAllHospitals();
		System.out.print ("All hospital names: ");
		for (Hospital eachHospital : hospitalList) {
			System.out.println(eachHospital.getName());
		}
		
		
		
	}
}
