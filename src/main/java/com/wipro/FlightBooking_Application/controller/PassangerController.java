package com.wipro.FlightBooking_Application.controller;

import com.wipro.FlightBooking_Application.model.Passangerinfo;
import com.wipro.FlightBooking_Application.service.PassangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passanger")
public class PassangerController {

    @Autowired
    private PassangerService service;

    @PostMapping("/addpassanger")
    public ResponseEntity<Passangerinfo> addPassanger(@RequestBody Passangerinfo info) {
        service.addPassanger(info);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}/flight/{flightid}")
    public Passangerinfo assignFlightToPassenger(@PathVariable  Long id, @PathVariable("flightid") Long flightid){
        return service.assignFlightToPassenger(id, flightid);
    }


}
