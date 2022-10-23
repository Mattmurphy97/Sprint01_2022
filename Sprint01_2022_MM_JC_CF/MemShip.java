public class MemShip {
    private String type;
    private double cost;
    private String startDate;
    private String duration;

    public MemShip(String type, double cost, String startDate, String duration) {
        this.type = type;

        if (type == "normal") {
            this.cost = 50;
        } else if (type == "trial") {
            this.cost = 0;
        } else if (type == "special") {
            this.cost = 50 - (50 * 0.10);
        } else if (type == "family") {
            this.cost = 100;
        }

        this.startDate = startDate;
        this.duration = duration;
    }

    public String toString() {
        return "Membership Type: " + type + ".\n" + "Cost: " + cost + ".\n" + "Start Date: " + startDate + ". \n"
                + "Duration: " + duration + ".";
    }
}
