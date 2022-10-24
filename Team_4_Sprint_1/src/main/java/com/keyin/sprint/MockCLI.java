package com.keyin.sprint;

import java.util.*; // For Scanner
import java.io.*; // For Reading/Writing
import java.time.*; // For Date/Time

public class MockCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Display.mainMenuHeader();
        while (true) {
            Display.mainMenuOptions();
            int optionNum01 = sc.nextInt();
            sc.nextLine();

            System.out.println();
            if (optionNum01 == 1) {
                System.out.println("Enter New Member's Full Name: ");
                String optionNum02 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s Phone #: ");
                String optionNum03 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s Email: ");
                String optionNum04 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s Street Address: ");
                String optionNum05 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s City: ");
                String optionNum06 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s Province: ");
                String optionNum07 = sc.nextLine();
                optionNum07 = optionNum07.toUpperCase();

                System.out.println("Enter " + optionNum02 + "'s Postal Code: ");
                String optionNum08 = sc.nextLine();
                optionNum08 = optionNum08.toUpperCase();

                double setCost = 0;
                int optionNum09;
                while (true) {
                    Display.memTypeOptions();
                    optionNum09 = sc.nextInt();
                    sc.nextLine();

                    if (optionNum09 == 1) {
                        setCost = 50;
                        break;
                    }
                    if (optionNum09 == 2) {
                        setCost = 0.01;
                        break;
                    }
                    if (optionNum09 == 3) {
                        setCost = 40;
                        break;
                    }
                    if (optionNum09 == 4) {
                        // will write more conditions for family memType
                        setCost = 90;
                        break;
                    } else {
                        System.out.println("Invalid Entry, Please Try Again");
                        System.out.println();
                    }
                }

                Members member01 = new Members(new Person(optionNum02, optionNum03, optionNum04),
                        new Address(optionNum05, optionNum06, optionNum07, optionNum08),
                        new MemShip(optionNum09, setCost, LocalDate.now()));
                // At this point, this info will have to be saved somewhere, never
                // looked at the best way to do this just yet

                System.out.println();
                Display.div02();
                System.out.println("Membership Information:");
                System.out.println(member01.getMemInfo());
                Display.div01();
                System.out.println("Address Information:");
                System.out.println(member01.getMemAddress());
                Display.div01();
                System.out.println("Membership Type: " + member01.getMemType());
                Display.div02();
                System.out.println();

            } else if (optionNum01 == 2) {
                System.out.println("You Selected 2");
                // Here we should be able to select a current member by name/phone# etc.
                // and display the results similar to how "New Membership Information" is
                // displayed

            } else if (optionNum01 == 3) {
                System.out.println("You Selected 3");
                // might remove this later, but this will allow us to create new Tourny object
                // basically, adding new tournaments.

            } else if (optionNum01 == 4) {
                System.out.println("You Selected 4");
                // Here we should be able to select a particular tournament and view its info
                // never dug into the Tourny class yet, still undecided

            } else if (optionNum01 == 5) {
                // close the program
                System.out.println("Goodbye!");
                System.out.println();
                sc.close();
                System.exit(0);

            } else {
                System.out.println("Invalid Selection, Please Try Again");
            }
        }

    }
}