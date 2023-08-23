package com.app.Repository.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.Entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
