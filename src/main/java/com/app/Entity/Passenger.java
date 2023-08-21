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
@Table(name ="passenger")
public class Passenger {
@Id
@Column(name = "passenger_Id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int passenger_Id;


@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name ="user_Id",nullable = false)
private User user;

@Column(name = "AdharCard_No",nullable = false)
private int aadharCard_No;

@Column(name = "driving_licence_no")
private String driving_Licence_No;

public int getPassenger_Id() {
	return passenger_Id;
}

public void setPassenger_Id(int passenger_Id) {
	this.passenger_Id = passenger_Id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public int getAadharCard_No() {
	return aadharCard_No;
}

public void setAadharCard_No(int aadharCard_No) {
	this.aadharCard_No = aadharCard_No;
}

public String getDriving_Licence_No() {
	return driving_Licence_No;
}

public void setDriving_Licence_No(String driving_Licence_No) {
	this.driving_Licence_No = driving_Licence_No;
}


}
