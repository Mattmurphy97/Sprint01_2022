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

    public int getType() {
        return this.type;
    }

    public double getCost() {
        return this.cost;
    }

    public LocalDate getCurDate() {
        return startDate;
    }

    public LocalDate getExpireDate() {
        return startDate.plusYears(1);
    }

    public String toString() {
        return type + "\n" + "Cost: " + cost + "\n" + "Start Date:  " + startDate + "\n"
                + "Expire Date: " + duration;
    }
}
