package com.keyin.sprint;

import java.time.LocalDate;

public class MemShip {

    private int type;
    private double cost;
    private LocalDate startDate;
    private LocalDate duration;

    public MemShip(int type, double cost, LocalDate startDate) {
        this.type = type;
        this.cost = cost;
        this.startDate = LocalDate.now();
        this.duration = startDate.plusYears(1);
    }

    public String getType() {
        if (type == 1) {
            return "Normal";
        } else if (type == 2) {
            return "Trial";
        } else if (type == 3) {
            return "Special";
        } else {
            return "Family";
        }
    }

    public double getCost() {
        return cost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getExpireDate() {
        return startDate.plusYears(1);
    }

    public String toString() {
        return "Membership Type: " + getType() + "\nCost: " + getCost() + "\nStart Date:  " + getStartDate()
                + "\nExpire Date: " + getExpireDate() + "\n";
    }
}
