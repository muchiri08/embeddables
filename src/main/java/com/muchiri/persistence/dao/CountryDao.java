package com.muchiri.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muchiri.persistence.domain.Country;

public interface CountryDao extends JpaRepository<Country, Long> {

}
