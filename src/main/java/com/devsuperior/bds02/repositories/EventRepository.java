package com.devsuperior.bds02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds02.entities.City;

public interface EventRepository extends JpaRepository<City, Long> {

}
