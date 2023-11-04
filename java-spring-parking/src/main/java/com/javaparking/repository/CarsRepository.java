package com.javaparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaparking.model.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {

}
