package com.bus.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.bus.demo.entity.Busdetails;
import com.bus.demo.repository.BusRepository;
@Service 

public class BusService {
	@Autowired
	BusRepository busRepository;
	@Transactional(readOnly=true)
	public List<Busdetails> getAllBusdetails()
	{
		return busRepository.findAll();
	}
	@Transactional(readOnly=true)
	public Busdetails getOneBusdetails(String busId)
	{
		Optional<Busdetails>bus=busRepository.findById(busId);
		if(bus.isPresent())
			return bus.get();
		return null;
	}
	@Transactional

	public boolean insertbusdetails(Busdetails e)
	{
		return busRepository.save(e)!=null;
	}
	@Transactional
	public boolean deletebusdetails(String busId) 
	{
		long count=busRepository.count();
		busRepository.deleteById(busId);
		return count>busRepository.count();
	}



}
