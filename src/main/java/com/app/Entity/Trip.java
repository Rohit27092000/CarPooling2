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
@Table(name="trip")
public class Trip {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="trip_Id")
 private int trip_Id;
    
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "CarOwner_Id",nullable = false)
 private CarOwner carOwner;
    
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "Car_Id",nullable = false)
 private Car car;
    
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "SourceCity_Id",nullable = false)
 private City sourceCity;
    
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "DestinationCity_Id",nullable = false)
 private City destinationCity;
    
 @Column(name="seats_offer",nullable = false)
 private int seats_offer;
    
 @Column(name="total_cost",nullable = false)
 private int total_cost;
    
 @Column(name = "Trip_Date",nullable = false)
 private LocalDate tripDate;

public int getTrip_Id() {
	return trip_Id;
}

public void setTrip_Id(int trip_Id) {
	this.trip_Id = trip_Id;
}

public CarOwner getCarOwner() {
	return carOwner;
}

public void setCarOwner(CarOwner carOwner) {
	this.carOwner = carOwner;
}

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}

public City getSourceCity() {
	return sourceCity;
}

public void setSourceCity(City sourceCity) {
	this.sourceCity = sourceCity;
}

public City getDestinationCity() {
	return destinationCity;
}

public void setDestinationCity(City destinationCity) {
	this.destinationCity = destinationCity;
}

public int getSeats_offer() {
	return seats_offer;
}

public void setSeats_offer(int seats_offer) {
	this.seats_offer = seats_offer;
}

public int getTotal_cost() {
	return total_cost;
}

public void setTotal_cost(int total_cost) {
	this.total_cost = total_cost;
}

public LocalDate getTripDate() {
	return tripDate;
}

public void setTripDate(LocalDate tripDate) {
	this.tripDate = tripDate;
}

@Override
public String toString() {
	return "Trip [trip_Id=" + trip_Id + ", carOwner=" + carOwner + ", car=" + car + ", sourceCity=" + sourceCity
			+ ", destinationCity=" + destinationCity + ", seats_offer=" + seats_offer + ", total_cost=" + total_cost
			+ ", tripDate=" + tripDate + "]";
}
 
 
 
}
