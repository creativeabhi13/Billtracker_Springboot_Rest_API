package com.billtracker.billtracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billtracker.billtracker.entities.Bill;

public interface BillDao extends JpaRepository<Bill,Long>{

	
	
}
