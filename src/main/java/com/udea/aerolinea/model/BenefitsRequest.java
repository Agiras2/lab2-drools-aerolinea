package com.udea.aerolinea.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class BenefitsRequest {

    @NotNull(message = "Los datos del pasajero son obligatorios")
    @Valid
    private Passenger passenger;

    @NotNull(message = "Los datos del vuelo son obligatorios")
    @Valid
    private Flight flight;

    public BenefitsRequest() {
    }

    public BenefitsRequest(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }
}