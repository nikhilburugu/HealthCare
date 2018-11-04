package com.slokam.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Doctor;
import com.slokam.HealthCare.Service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorservice;
	@RequestMapping("sd")
	public void savedoctor(@RequestBody Doctor d){
		doctorservice.savedoctor(d);
	}
}
