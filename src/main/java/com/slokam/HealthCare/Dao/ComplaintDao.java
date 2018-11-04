package com.slokam.HealthCare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Complaint;
@Repository
public interface ComplaintDao extends JpaRepository<Complaint, Integer> {

}
