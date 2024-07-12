package com.wipro.FlightBooking_Application.service;

import com.wipro.FlightBooking_Application.model.Flights;
import com.wipro.FlightBooking_Application.repository.Flightrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private Flightrepository frepo;
    public void addflight(Flights flight) {
        frepo.save(flight);
    }

}
