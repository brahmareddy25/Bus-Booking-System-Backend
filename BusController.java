package com.bus.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bus.demo.entity.Busdetails;
import com.bus.demo.service.BusService;
@RestController
@CrossOrigin(origins="http://localhost:3000")


public class BusController
{
	@Autowired
	BusService busService;
	
	@GetMapping("/")
	public ResponseEntity<List<Busdetails>> getAllBusdetail()
	{
		return new ResponseEntity<List<Busdetails>>(busService.getAllBusdetails(),HttpStatus.OK);
	}
	
	@GetMapping(value="/{busId}",produces="application/json")
	public ResponseEntity<Busdetails> getOneBusdetails(@PathVariable String busId)
	{
		Busdetails e=busService.getOneBusdetails(busId);
		if (e!=null)
			return new ResponseEntity<Busdetails>(e,HttpStatus.OK);
		return new ResponseEntity<Busdetails>(e,HttpStatus.NOT_FOUND);
	}
	@PostMapping("/")
	public HttpStatus addOneBusdetails(@RequestBody Busdetails e)
	{
		if (busService.insertbusdetails(e))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	@PutMapping("/")
	public HttpStatus modifyOneBusdetails(@RequestBody Busdetails e)
	{
		if (busService.insertbusdetails(e))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	@DeleteMapping("/{busId}")
	public HttpStatus deleteOneBusdetails(@PathVariable String busId)
	{
		if (busService.deletebusdetails(busId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
}