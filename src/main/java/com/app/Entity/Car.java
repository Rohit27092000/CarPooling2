package com.app.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer car_Id;
	    
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "CarOwner_Id")
 private CarOwner carOwner;
 
 @Column(name="company")    
 private String company;
 @Column(name="Model")
 private String model;
 @Column(name="car_no")
 private String CarNo;
 
public Integer getCar_Id() {
	return car_Id;
}
public void setCar_Id(Integer car_Id) {
	this.car_Id = car_Id;
}
public CarOwner getCarOwner() {
	return carOwner;
}
public void setCarOwner(CarOwner carOwner) {
	this.carOwner = carOwner;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getCarNo() {
	return CarNo;
}
public void setCarNo(String carNo) {
	CarNo = carNo;
}
@Override
public String toString() {
	return "Car [car_Id=" + car_Id + ", carOwner=" + carOwner + ", company=" + company + ", model=" + model + ", CarNo="
			+ CarNo + "]";
}
 
 
}
