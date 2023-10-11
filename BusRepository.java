package com.bus.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.demo.entity.Busdetails;

public interface BusRepository extends JpaRepository<Busdetails,String>{

}