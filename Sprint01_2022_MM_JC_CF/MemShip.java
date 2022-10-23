public class MemShip {
    private String type;
    private double cost;
    private String startDate;
    private String duration;

    public MemShip(String type, double cost, String startDate, String duration) {
        this.type = type;
        this.cost = cost;
        this.startDate = startDate;
        this.duration = duration;
    }

    public String toString() {
        return "Membership Type: " + type + ".\n" + "Cost: " + cost + ".\n" + "Start Date: " + startDate + ". \n"
                + "Duration: " + duration + ".";
    }
}
