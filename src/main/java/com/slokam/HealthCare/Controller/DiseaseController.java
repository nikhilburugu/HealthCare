package com.slokam.HealthCare.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Disease;
import com.slokam.HealthCare.Service.DiseaseService;

@RestController
public class DiseaseController {
	@Autowired
	private DiseaseService diseaseservice;

	@RequestMapping("save")
	public void savedisease(@RequestBody Disease disease){
		diseaseservice.savedisease(disease);
	}
	@RequestMapping("gp/{name}")
	public List<String> getPatientByDisease(@PathVariable("name") String DiseaseName){
		return diseaseservice.getPatientByDisease(DiseaseName);
		
	}
	@RequestMapping("ani/{nik}")
	public List<String> getPatientbyDoctor(@PathVariable ("nik")String DoctorName){
		return diseaseservice.getPatientbyDoctor(DoctorName);
	}
	@RequestMapping("sdateedate/{start}/{end}")
	public List<String> getdetailsBYSdateAndEdate(@PathVariable("start") @DateTimeFormat(pattern="yyyy-MM-dd") Date sdate,
			@PathVariable("end") @DateTimeFormat(pattern="yyyy-MM-dd") Date edate){
		return diseaseservice.getdetailsBYSdateAndEdate(sdate, edate);
	}
}