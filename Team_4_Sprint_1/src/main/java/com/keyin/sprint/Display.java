package com.keyin.sprint;

public class Display {

    public static void mainMenuHeader() {

        System.out.println();
        System.out.println("===========================================");
        System.out.println("==========WELCOME TO THE GOLF CLUB=========");
        System.out.println("===========================================");
    }

    public static void mainMenuOptions() {
        System.out.println("Please Select One of the Following Options:");
        System.out.println("1. Add New Member");
        System.out.println("2. View Memeber Info");
        System.out.println("3. Add New Tournament");
        System.out.println("4. View Tournament Info");
        System.out.println("5. Exit Program");
        System.out.print("Select: ");
    }

    public static void div01() {
        System.out.println("-------------------------------------------");
    }

    public static void div02() {
        System.out.println("===========================================");
    }

    public static void memTypeOptions() {
        System.out.println("Please Select Membership Type:");
        System.out.println("1. Normal Membership");
        System.out.println("2. Trial Membership");
        System.out.println("3. Special Membership");
        System.out.println("4. Family Membership");
        System.out.print("Select: ");

    }

}

