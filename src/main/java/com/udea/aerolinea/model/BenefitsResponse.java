package com.udea.aerolinea.model;

import java.util.ArrayList;
import java.util.List;

public class BenefitsResponse {

    private boolean businessUpgrade = false;
    private boolean priorityCheckIn = false;
    private double discountPercent = 0.0;
    private boolean eligibleForUpgrade = true;
    private boolean emergencyExitSeatAssigned = false;
    private boolean luggageAllowed = true;
    private double compensation = 0.0;
    private int loyaltyPointsAdded = 0;
    private boolean vipLoungeAccess = false;
    private String assignedSeat = "Sin asignar";
    private List<String> appliedRules = new ArrayList<>();

    public BenefitsResponse() {
    }

    public void addRule(String rule) {
        this.appliedRules.add(rule);
    }

    public boolean isBusinessUpgrade() { return businessUpgrade; }
    public void setBusinessUpgrade(boolean businessUpgrade) { this.businessUpgrade = businessUpgrade; }

    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }

    public double getDiscountPercent() { return discountPercent; }
    public void setDiscountPercent(double discountPercent) { this.discountPercent = discountPercent; }

    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }

    public boolean isEmergencyExitSeatAssigned() { return emergencyExitSeatAssigned; }
    public void setEmergencyExitSeatAssigned(boolean emergencyExitSeatAssigned) { this.emergencyExitSeatAssigned = emergencyExitSeatAssigned; }

    public boolean isLuggageAllowed() { return luggageAllowed; }
    public void setLuggageAllowed(boolean luggageAllowed) { this.luggageAllowed = luggageAllowed; }

    public double getCompensation() { return compensation; }
    public void setCompensation(double compensation) { this.compensation = compensation; }

    public int getLoyaltyPointsAdded() { return loyaltyPointsAdded; }
    public void setLoyaltyPointsAdded(int loyaltyPointsAdded) { this.loyaltyPointsAdded = loyaltyPointsAdded; }

    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }

    public String getAssignedSeat() { return assignedSeat; }
    public void setAssignedSeat(String assignedSeat) { this.assignedSeat = assignedSeat; }

    public List<String> getAppliedRules() { return appliedRules; }
    public void setAppliedRules(List<String> appliedRules) { this.appliedRules = appliedRules; }
}