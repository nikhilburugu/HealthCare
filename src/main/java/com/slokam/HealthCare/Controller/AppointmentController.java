package com.slokam.HealthCare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Appointment;
import com.slokam.HealthCare.Service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	@RequestMapping("sa")
	public void saveappointment(@RequestBody List<Appointment> appointment){
		appointmentService.saveappointment(appointment);
	}
}
