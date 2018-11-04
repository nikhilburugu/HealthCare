package com.slokam.HealthCare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.HealthCare.Dao.ComplaintDao;
import com.slokam.HealthCare.Entity.Complaint;
import com.slokam.HealthCare.Entity.Medication;

@Service
public class ComplaintService {

	@Autowired
	private ComplaintDao complaintDao;

	public void saveComplaint(Complaint complaint){
		List<Medication> mclist = complaint.getMclist();
		for (Medication m : mclist) {
			m.setComplaint(complaint);
		}
		complaintDao.save(complaint);
	}

}
