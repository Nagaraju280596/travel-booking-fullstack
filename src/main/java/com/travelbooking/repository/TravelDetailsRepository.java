package com.travelbooking.repository;

import com.travelbooking.entity.TravelDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelDetailsRepository extends JpaRepository<TravelDetails, Long> {}
