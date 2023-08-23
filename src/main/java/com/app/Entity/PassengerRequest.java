package com.app.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passenger_request")
public class PassengerRequest {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer request_Id;
	    
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "trip_Id",nullable = false)
  private Trip trip;

 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "passenger_Id",nullable = false)
 private Passenger passenger;
	    
 @Column(name = "created_Date",nullable = false)
 private LocalDate createdDate;
	    
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "city_Id",nullable = false)
 private City city;
 
 @Column(name="status" ,unique = false)
 private boolean status;

public Integer getRequest_Id() {
	return request_Id;
}

public void setRequest_Id(Integer request_Id) {
	this.request_Id = request_Id;
}

public Trip getTrip() {
	return trip;
}

public void setTrip(Trip trip) {
	this.trip = trip;
}

public Passenger getPassenger() {
	return passenger;
}

public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}

public LocalDate getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(LocalDate createdDate) {
	this.createdDate = createdDate;
}

public City getCity() {
	return city;
}

public void setCity(City city) {
	this.city = city;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

@Override
public String toString() {
	return "PassengerRequest [request_Id=" + request_Id + ", trip=" + trip + ", passenger=" + passenger
			+ ", createdDate=" + createdDate + ", city=" + city + ", status=" + status + "]";
}
 
 
}
