package com.slokam.HealthCare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.HealthCare.Dao.DoctorDao;
import com.slokam.HealthCare.Entity.Doctor;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao doctordao;
	
	public void savedoctor(Doctor d){
		doctordao.save(d);
	}
}
