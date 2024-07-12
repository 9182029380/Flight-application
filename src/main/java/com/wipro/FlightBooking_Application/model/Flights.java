package com.wipro.FlightBooking_Application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flights {
    @Id
    public Long flightId;
    public String flightNumber;
    public String airlineName;
    public String departureCity;
    public String arrivalCity;
    public String departureTime;
    public String arrivalTime;
    public int seatsAvailable;
    public double ticketPrice;
    @JsonIgnore
    @ManyToMany(mappedBy = "assignedFlights")
    public Set<Passangerinfo> passengers= new HashSet<>();
}
