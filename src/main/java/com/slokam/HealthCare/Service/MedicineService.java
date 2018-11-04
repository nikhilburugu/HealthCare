package com.slokam.HealthCare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.HealthCare.Dao.MedicineDao;
import com.slokam.HealthCare.Entity.Medicine;

@Service
public class MedicineService {

	@Autowired
	private MedicineDao md;
	
	public void savemedicine(Medicine m){
		md.save(m);
	}
}
