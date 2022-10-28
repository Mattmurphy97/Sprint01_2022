package com.keyin.sprint;

import java.time.LocalDate;

public class Members {

    private Person memInfo;
    private Address memAddress;
    private MemShip memType;
    // When Tourny class is complete, use these variables.
    // private int curTourny;
    // private Tourney memHistory;
    // private Tourney upComing;

    public Members(Person memInfo, Address memAddress, MemShip memType) {
        this.memInfo = memInfo;
        this.memAddress = memAddress;
        this.memType = memType;
    }

    // Get memInfo & specific selectors
    public Person getMemInfo() {
        return memInfo;
    }

    public String getName() {
        return memInfo.getName();
    }

    public void setName(String nameToSet) {
        setName(nameToSet);
    }

    public String getPhone() {
        return memInfo.getPhone();
    }

    public String getEmail() {
        return memInfo.getEmail();
    }

    // Get memAddress & specific selectors
    public Address getMemAddress() {
        return memAddress;
    }

    public String getStreet() {
        return memAddress.getStreet();
    }

    public String getCity() {
        return memAddress.getCity();
    }

    public String getProv() {
        return memAddress.getProv();
    }

    public String getPostal() {
        return memAddress.getPostal();
    }

    // Get memType & specific selectors
    public MemShip getMemType() {
        return memType;
    }

    public String getType() {
        return memType.getType();
    }

    public double getCost() {
        return memType.getCost();
    }

    public LocalDate getCurDate() {
        return memType.getStartDate();
    }

    // public LocalDate getCurDatePlusOneYear(){
    // return memType.getExpireDate();
    // }

    public String toString() {
        return getMemInfo() + "\n" + getMemAddress() + "\n" + getMemType();
    }

}
