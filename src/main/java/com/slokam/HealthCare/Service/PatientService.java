package com.slokam.HealthCare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slokam.HealthCare.Dao.PatientDao;
import com.slokam.HealthCare.Entity.Patient;
@Service
public class PatientService {

	@Autowired
	private PatientDao patientdao;
	
	public void savePatient(@RequestBody Patient p){
		patientdao.save(p);
	}
	
	public List<Object[]> getPatientByMedicine(String MedicineName){
		return patientdao.getPatientByMedicine(MedicineName);
		
		
	}
}
