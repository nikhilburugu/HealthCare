package com.slokam.HealthCare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
	
	@Query("Select p.name,d.name,di.name  from Medication md"
			+ " join md.medicne m "
			+ "join md.complaint c "
			+ "join c.disease di "
			+ "join c.visiting v "
			+ "join v.doctor d "
			+ "join v.appointment a "
			+ "join a.patient p where m.name=?1")
		
	List<Object[]> getPatientByMedicine(String MedicineName);

	
	
	
}
