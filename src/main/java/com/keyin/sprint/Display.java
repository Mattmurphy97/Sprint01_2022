package com.keyin.sprint;

public class Display {

    public static void div01() {
        System.out.println("-------------------------------------------");
    }

    public static void div02() {
        System.out.println("===========================================");
    }

    public static void mainMenuHeader() {
        System.out.println();
        System.out.println("===========================================");
        System.out.println("==========WELCOME TO THE GOLF CLUB=========");
        System.out.println("===========================================");
    }

    public static void mainMenuOptions() {
        System.out.println();
        System.out.println("Main Menu: Select Option:");
        System.out.println("1. Add New Member");
        System.out.println("2. View Memeber Info");
        System.out.println("3. Add New Tournament");
        System.out.println("4. View Tournament Info");
        System.out.println("5. Exit Program");
        System.out.print("Select: ");
    }

    public static void memTypeOptions() {
        System.out.println("Please Select Membership Type:");
        System.out.println("1. Normal Membership");
        System.out.println("2. Trial Membership");
        System.out.println("3. Special Membership");
        System.out.println("4. Family Membership");
        System.out.print("Select: ");
    }

    public static void viewMemersOptions() {
        System.out.println("View Members: Select Option");
        System.out.println("1. View All Members");
        System.out.println("2. Search & View Members Detail");
        System.out.println("3. Search & Edit Members Details");
        System.out.println("4. Back to Main Menu");
        System.out.print("Select: ");
    }

    public static void searchForMemersInfo() {
        System.out.println("Search Options: Select Option");
        System.out.println("1. Search For Members by Name");
        System.out.println("2. Search For Members by Phone#");
        System.out.println("3. Search For Members by Email");
        // Here we would have a bunch of other options such as:
        // Search by Membership Type, exipry data, registered tourneys, etc...
        System.out.println("4. Back to Main Menu");
        System.out.print("Select: ");
    }

    public static void viewTourneyOptions() {
        System.out.println("View Tournaments: Select Options");
        System.out.println("1. View All Tournaments");
        System.out.println("2. Search & View Tournament Details");
        System.out.println("3. Search & Edit Tournament Details");
        System.out.println("4. Back to Main Menu");
        System.out.print("Select: ");
    }

    public static void searchForTourneyInfo() {
        System.out.println("Search Options: Select Options");
        System.out.println("1. Search Tournaments by Name");
        System.out.println("2. Search Tournaments by Entry Fee");
        System.out.println("3. Search Tournaments by Cash Prize");
        // Here we would have other options such as:
        // Search by Address, Start Time, End Time, registered members, etc...
        System.out.println("4. Back to Main Menu");
        System.out.print("Select: ");
    }

}