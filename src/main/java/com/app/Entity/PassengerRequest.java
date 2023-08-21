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
}
