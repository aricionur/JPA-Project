package com.aricionur.jpaproject.dao;

import java.util.List;

import com.aricionur.jpaproject.entity.Hospital;

public class DAO extends ADao {

	// -------INSERT-----//
	public void insert(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	public void update(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	public void delete(Object obj) {
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
	}

	public Hospital getSingleHospitalById(int id) {
		return em.find(Hospital.class, id);
	}
	
	public List<Hospital> getAllHospitals(){
		return	em.createQuery("SELECT h FROM Hospital h")
                .getResultList();
	}

}
