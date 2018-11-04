package com.slokam.HealthCare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
