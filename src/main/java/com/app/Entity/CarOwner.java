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
import javax.validation.constraints.Size;

import org.hibernate.annotations.MetaValue;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="carowner")
public class CarOwner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="car_owner_id")
private  int CarOwnerId;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="user_id",nullable = false, unique = true)
private User user;


@NumberFormat
//@Size(min = 12,max = 12 , message = "Aadhar card Number should 12 digit only")
@Column(name="adhar_card_no",nullable = false , unique = true)
private long adharCard_No;


@Column(name="driving_licence_no",nullable = false , unique = true)
private String driving_Licence_No;

public int getCarOwnerId() {
	return CarOwnerId;
}

public void setCarOwnerId(int carOwnerId) {
	CarOwnerId = carOwnerId;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public long getAdharCard_No() {
	return adharCard_No;
}

public void setAdharCard_No(long adharCard_No) {
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
	return "CarOwner [CarOwnerId=" + CarOwnerId + ", user=" + user + ", adharCard_No=" + adharCard_No
			+ ", driving_Licence_No=" + driving_Licence_No + "]";
}


}
