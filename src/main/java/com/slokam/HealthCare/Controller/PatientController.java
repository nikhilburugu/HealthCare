package com.slokam.HealthCare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Patient;
import com.slokam.HealthCare.Service.PatientService;
@RestController
public class PatientController {

	@Autowired
	private PatientService patientservice;
	
	@RequestMapping("sp")
	public void savePatient(@RequestBody Patient p){
		patientservice.savePatient(p);
	}
	@RequestMapping("patientname/{name}")
	 List<Object[]> getPatientByMedicine(@PathVariable("name") String MedicineName){
		return patientservice.getPatientByMedicine(MedicineName);
		 
	 }
}
