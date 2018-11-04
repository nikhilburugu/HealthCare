package com.slokam.HealthCare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Visiting;

@Repository
public interface VisitingDao extends JpaRepository<Visiting, Integer> {

}
