package com.slokam.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Complaint;
import com.slokam.HealthCare.Service.ComplaintService;

@RestController
@RequestMapping("complaint")
public class ComplaintController {
	@Autowired
	private ComplaintService cs;
	@PostMapping
	public void saveComplaint(@RequestBody Complaint c){
		cs.saveComplaint(c);
	}

}
