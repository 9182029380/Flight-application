package com.wipro.FlightBooking_Application.repository;

import com.wipro.FlightBooking_Application.model.Passangerinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Passangerrepository extends JpaRepository<Passangerinfo,Long> {
}
