package com.slokam.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Medicine;
import com.slokam.HealthCare.Service.MedicineService;

@RestController
public class MedicineController {
	@Autowired
	private MedicineService ms;

	@RequestMapping("sm")
	public void savemedicine(@RequestBody Medicine m){
		ms.savemedicine(m);
	}
}
