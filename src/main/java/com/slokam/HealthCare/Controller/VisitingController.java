package com.slokam.HealthCare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.HealthCare.Entity.Visiting;
import com.slokam.HealthCare.Service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {
	@Autowired
	private VisitingService visitingService;
	@PostMapping
	public void savevisiting(@RequestBody Visiting visiting){
		visitingService.savevisiting(visiting);
	}
	@PostMapping("/all")
	public void savevisiting(@RequestBody List<Visiting> visiting){
		visitingService.savevisiting(visiting);
	}
}
