package com.udea.aerolinea.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Flight {

    @NotBlank(message = "El numero de vuelo es obligatorio")
    private String flightNumber;

    @Min(value = 0, message = "El retraso no puede ser negativo")
    private int delayMinutes;

    @Min(value = 0, message = "La duracion no puede ser negativa")
    private double durationHours;

    private boolean emergencyExitSeatAvailable;

    public Flight() {
    }

    public Flight(String flightNumber, int delayMinutes, double durationHours,
                  boolean emergencyExitSeatAvailable) {
        this.flightNumber = flightNumber;
        this.delayMinutes = delayMinutes;
        this.durationHours = durationHours;
        this.emergencyExitSeatAvailable = emergencyExitSeatAvailable;
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public int getDelayMinutes() { return delayMinutes; }
    public void setDelayMinutes(int delayMinutes) { this.delayMinutes = delayMinutes; }

    public double getDurationHours() { return durationHours; }
    public void setDurationHours(double durationHours) { this.durationHours = durationHours; }

    public boolean isEmergencyExitSeatAvailable() { return emergencyExitSeatAvailable; }
    public void setEmergencyExitSeatAvailable(boolean emergencyExitSeatAvailable) { this.emergencyExitSeatAvailable = emergencyExitSeatAvailable; }
}