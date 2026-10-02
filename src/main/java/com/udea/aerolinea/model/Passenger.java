package com.udea.aerolinea.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Passenger {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Min(value = 0, message = "La edad no puede ser negativa")
    private int age;

    @NotBlank(message = "La membresia es obligatoria (Basic, Gold o Platinum)")
    private String membership;

    @Min(value = 0, message = "El peso del equipaje no puede ser negativo")
    private double luggageWeight;

    @NotBlank(message = "La preferencia de asiento es obligatoria")
    private String seatPreference;

    private boolean travelingWithChildren;

    public Passenger() {
    }

    public Passenger(String name, int age, String membership, double luggageWeight,
                     String seatPreference, boolean travelingWithChildren) {
        this.name = name;
        this.age = age;
        this.membership = membership;
        this.luggageWeight = luggageWeight;
        this.seatPreference = seatPreference;
        this.travelingWithChildren = travelingWithChildren;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMembership() { return membership; }
    public void setMembership(String membership) { this.membership = membership; }

    public double getLuggageWeight() { return luggageWeight; }
    public void setLuggageWeight(double luggageWeight) { this.luggageWeight = luggageWeight; }

    public String getSeatPreference() { return seatPreference; }
    public void setSeatPreference(String seatPreference) { this.seatPreference = seatPreference; }

    public boolean isTravelingWithChildren() { return travelingWithChildren; }
    public void setTravelingWithChildren(boolean travelingWithChildren) { this.travelingWithChildren = travelingWithChildren; }
}