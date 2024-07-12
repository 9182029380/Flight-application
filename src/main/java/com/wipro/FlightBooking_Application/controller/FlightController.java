package com.wipro.FlightBooking_Application.controller;

import com.wipro.FlightBooking_Application.model.Flights;
import com.wipro.FlightBooking_Application.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService service;

    @PostMapping("/addflight")
    public ResponseEntity<Flights> addflight(@RequestBody Flights flight) {
        service.addflight(flight);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
