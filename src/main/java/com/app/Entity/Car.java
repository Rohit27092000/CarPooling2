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
}
