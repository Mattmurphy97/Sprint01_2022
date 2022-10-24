package com.keyin.sprint;

import java.time.*;

public class Tourney {

    private String tourneyName;
    private Address loc;
    private TourneyDate startDate;
    private TourneyDate endDate;
    private double entryFee;
    private double cashPrize;
//    private ?? particMems;
//    private ?? finalStand;

    public Tourney(String tourneyName, Address loc, TourneyDate startDate, TourneyDate endDate, double entryFee,
                   double cashPrize){
        this.tourneyName = tourneyName;
        this.loc = loc;
        this.startDate = startDate;
        this.endDate = endDate;
        this.entryFee = entryFee;
        this.cashPrize = cashPrize;
    }

    public  String getTourneyName(){
        return tourneyName;
    }

    public Address getLoc(){
        return loc;
    }

    public TourneyDate getStartDate(){
        return startDate;
    }

    public TourneyDate getEndDate(){
        return endDate;
    }

    public double getEntryFee(){
        return entryFee;
    }

    public double getCashPrize(){
        return cashPrize;
    }

    public String toString(){
        return "Tourney Name: " + tourneyName + "\n" + "Location: " + loc + "\n" + "Start Time: " + startDate + "\n"
                + "End Date: " + endDate;
    }

}
