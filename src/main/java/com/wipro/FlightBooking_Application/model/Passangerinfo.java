package com.wipro.FlightBooking_Application.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "passangerinfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passangerinfo {
    @Id
    public Long id;
    public String name;
    @Email
    public String email;
    public String phone;
    public String address;
    public String city;
    public String state;
    public String zipcode;
    public String aadharnumber;
    public String passportnumber;
    @ManyToMany
    @JoinTable(name = "passanger_flight",
            joinColumns = @JoinColumn(name = "passanger_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id"))
    public Set<Flights> assignedFlights = new HashSet<Flights>();
}
