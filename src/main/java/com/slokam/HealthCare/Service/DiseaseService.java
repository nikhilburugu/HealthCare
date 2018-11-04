package com.slokam.HealthCare.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.HealthCare.Dao.DiseaseDao;
import com.slokam.HealthCare.Entity.Disease;

@Service
public class DiseaseService {
	@Autowired
	private DiseaseDao diseasedao;

	public void savedisease(Disease disease){
		diseasedao.save(disease);
	}
	public List<String> getPatientByDisease(String DiseaseName){
		return diseasedao.getPatientByDisease(DiseaseName);
		
	}
	public List<String> getPatientbyDoctor(String DoctorName){
		return diseasedao.getPatientbyDoctor(DoctorName);
	}
	public List<String> getdetailsBYSdateAndEdate(Date sdate,Date edate){
		return diseasedao.getdetailsBYSdateAndEdate(sdate, edate);
	}
}
