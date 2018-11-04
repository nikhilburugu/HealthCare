package com.slokam.HealthCare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.HealthCare.Entity.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
