package com.keyin.sprint;

public class Address {

    private String street;
    private String city;
    private String prov;
    private String postal;

    public Address(String street, String city, String prov, String postal) {
        this.street = street;
        this.city = city;
        this.prov = prov;
        this.postal = postal;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProv() {
        return prov;
    }

    public String getPostal() {
        return postal;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String toString() {
        return street + ", " + city + "\n" + prov + ", " + postal;
    }
}
