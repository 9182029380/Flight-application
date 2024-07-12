package com.wipro.FlightBooking_Application.repository;

import com.wipro.FlightBooking_Application.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Flightrepository extends JpaRepository<Flights,Long> {
    Flights findByFlightId(Long flightId);
}
