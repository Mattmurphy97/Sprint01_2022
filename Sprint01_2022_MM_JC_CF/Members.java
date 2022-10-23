public class Members {
    // TEST
    private Person memInfo;
    private Address memAddress;
    private MemShip memType;
    // When Tourny class is complete, use these variables.
    // private Tourny curTourny;
    // private Tourny memHistory;
    // private Tourny upComing;

    public Members(Person memInfo, Address memAddress, MemShip memType) {
        this.memInfo = memInfo;
        this.memAddress = memAddress;
        this.memType = memType;
    }

    public Person getMemInfo() {
        return memInfo;
    }

    public Address getMemAddress() {
        return memAddress;
    }

    public MemShip getMemType() {
        return memType;
    }

    public String toString() {
        return "Members Information: \n" + memInfo + ". \n" + memAddress + ". \n" + memType;
    }

}