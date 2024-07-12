package com.wipro.FlightBooking_Application.service;

import com.wipro.FlightBooking_Application.model.Flights;
import com.wipro.FlightBooking_Application.model.Passangerinfo;
import com.wipro.FlightBooking_Application.repository.Flightrepository;
import com.wipro.FlightBooking_Application.repository.Passangerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PassangerService {
    @Autowired
    private Passangerrepository prepo;
    @Autowired
    private Flightrepository frepo;

    public void addPassanger(Passangerinfo info) {
        prepo.save(info);
    }

    public Passangerinfo assignFlightToPassenger(Long id,Long flightId){
        Set<Flights> flightset= null;
        Passangerinfo info= prepo.findById(id).get();
        Flights flight=frepo.findByFlightId(flightId);
        flightset=info.getAssignedFlights();
        flightset.add(flight);
        info.setAssignedFlights(flightset);
        return prepo.save(info);


    }
}
