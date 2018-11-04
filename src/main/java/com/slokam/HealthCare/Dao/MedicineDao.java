package com.slokam.HealthCare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Medicine;
@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer> {

	
}
