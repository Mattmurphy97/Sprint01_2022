package com.keyin.sprint;

import java.util.ArrayList;

public class Tourney {

    private String tourneyName;
    private Address loc;
    private TourneyDate startDate;
    private TourneyDate endDate;
    private double entryFee;
    private double cashPrize;
    private ArrayList<String> regMembers = new ArrayList<String>();
    // private ?? finalStand;

    public Tourney(String tourneyName, Address loc, TourneyDate startDate, TourneyDate endDate,
            double entryFee, double cashPrize) {
        this.tourneyName = tourneyName;
        this.loc = loc;
        this.startDate = startDate;
        this.endDate = endDate;
        this.entryFee = entryFee;
        this.cashPrize = cashPrize;
        this.regMembers = regMembers;
    }

    public String getTourneyName() {
        return tourneyName;
    }

    public void setTourneyName(String updateName) {
        this.tourneyName = updateName;
    }

    public Address getLoc() {
        return loc;
    }

    public TourneyDate getStartDate() {
        return startDate;
    }

    public TourneyDate getEndDate() {
        return endDate;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double updateFee) {
        this.entryFee = updateFee;
    }

    public double getCashPrize() {
        return cashPrize;
    }

    public void setCashPrize(double updatePrize) {
        this.cashPrize = updatePrize;
    }

    public ArrayList<String> getRegMembers() {
        return regMembers;
    }

    public void setRegMembers(String member) {
        this.regMembers.add(member);
    }

    public String toString() {
        return getTourneyName() + "\n" + getLoc() + "\nEntry Fee: " + entryFee + "\nCash Prize: " + cashPrize
                + "\nStart Date: " + getStartDate() + "\nEnd Date " + getEndDate() + "\nRegistered Members: \n"
                + getRegMembers() + "\n";
    }

}
