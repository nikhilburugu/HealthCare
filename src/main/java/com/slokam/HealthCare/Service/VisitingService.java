package com.slokam.HealthCare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.HealthCare.Dao.VisitingDao;
import com.slokam.HealthCare.Entity.Visiting;

@Service
public class VisitingService {
	@Autowired
	private VisitingDao visitingDao;
	
	public void savevisiting(Visiting visiting){
		visitingDao.save(visiting);
	}
	public void savevisiting(List<Visiting> visiting){
		visitingDao.saveAll(visiting);
	}
	}

