package com.app.Repository.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.app.Entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

	@Query("FROM City c WHERE c.cityName=:theCity")
	public City getByCityName(String theCity);
}
