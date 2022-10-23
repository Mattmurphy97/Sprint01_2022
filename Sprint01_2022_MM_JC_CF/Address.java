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

    public String toString() {
        return "Address: " + street + ", " + city + ". \n" + prov + ", " + postal + ".";
    }
}
