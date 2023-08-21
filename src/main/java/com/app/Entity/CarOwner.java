package com.app.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="carowner")
public class CarOwner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="CarOwner_Id")
private  int carOwner;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="user_Id",nullable = false)
private User user;

@Column(name="AdharCard_No",nullable = false)
private int adharCard_No;

@Column(name="driving_licence_no",nullable = false)
private String driving_Licence_No;

public int getCarOwner() {
	return carOwner;
}

public void setCarOwner(int carOwner) {
	this.carOwner = carOwner;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public int getAdharCard_No() {
	return adharCard_No;
}

public void setAdharCard_No(int adharCard_No) {
	this.adharCard_No = adharCard_No;
}

public String getDriving_Licence_No() {
	return driving_Licence_No;
}

public void setDriving_Licence_No(String driving_Licence_No) {
	this.driving_Licence_No = driving_Licence_No;
}

@Override
public String toString() {
	return "CarOwner [carOwner=" + carOwner + ", user=" + user + ", adharCard_No=" + adharCard_No
			+ ", driving_Licence_No=" + driving_Licence_No + "]";
}


}