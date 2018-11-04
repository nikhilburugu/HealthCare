
package com.slokam.HealthCare.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer> {

	@Query("Select p.name from  Complaint c join c.disease di "
			+ " join c.visiting v "
			+ " join v.appointment a "
			+ " join a.patient p where di.name=?1")
	public List<String> getPatientByDisease(String DiseaseName);
	
	@Query("Select p.name from Visiting v "
			+ " join v.doctor d "
			+ " join v.appointment a "
			+ " join a.patient p where d.name=?1 ")
	public List<String> getPatientbyDoctor(String DoctorName);
	
	@Query("select p.name from Appointment a join a.patient p where a.dateTime between ?1 and ?2 ")
	public List<String> getdetailsBYSdateAndEdate(Date sdate,Date edate);
}
