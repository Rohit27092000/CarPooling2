package com.app.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_Id")
	private Integer city_Id;
	
    @Column(name="City_Name")
    private String City_Name;
    
    @Column(name="state")
    private String state;
    
    @Column(name="country")
    private String country;

	public Integer getCity_Id() {
		return city_Id;
	}

	public void setCity_Id(Integer city_Id) {
		this.city_Id = city_Id;
	}

	public String getCity_Name() {
		return City_Name;
	}

	public void setCity_Name(String city_Name) {
		City_Name = city_Name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [city_Id=" + city_Id + ", City_Name=" + City_Name + ", state=" + state + ", country=" + country
				+ "]";
	}
    
    
}
