package com.slokam.HealthCare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.HealthCare.Dao.AppointmentDao;
import com.slokam.HealthCare.Entity.Appointment;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;
	
	public void saveappointment(List<Appointment> appointment){
		appointmentDao.saveAll(appointment);
	}
}
