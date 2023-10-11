package com.bus.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="busdetails")

public class Busdetails {

	@Id
	@Column(name="bus_id")
	private String busdetails;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="fare")
	private double fare;
	
	@Column(name="arrival_time")
	private String arrivaltime;
	
	@Column(name="dept_time")
	private String depttime;
	
	
	public Busdetails() {}

	public Busdetails(String busdetails, String source, String destination, double fare, String arrivaltime,
			String depttime) 
	{
		this.busdetails = busdetails;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.arrivaltime = arrivaltime;
		this.depttime = depttime;
	}

	public String getBusdetails() {
		return busdetails;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public double getFare() {
		return fare;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public String getDepttime() {
		return depttime;
	}
	

}