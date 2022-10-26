package com.keyin.sprint;

import java.util.*; // For Scanner
import com.keyin.data.Database;
import java.time.*; // For Date/Time

public class MockCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Mock Database's for Members & Tournaments
        Database db = new Database();
        Database db2 = new Database();

        // Populate Tournaments Mock Database for demonstration purposes
        Tourney dummyTourney01 = new Tourney("springer invitational",
                new Address("123 springdale place", "marystown", "NL", "A0E2M0"),
                new TourneyDate(2023, 10, 15),
                new TourneyDate(2023, 10, 3), 0, 5000);

        Tourney dummyTourney02 = new Tourney("jones annual fundraiser",
                new Address("1 logy bay rd", "st john's", "NL", "A1R9W0"),
                new TourneyDate(2022, 8, 22),
                new TourneyDate(2023, 10, 3), 1000, 5000);

        Tourney dummyTourney03 = new Tourney("four lakes championship finals",
                new Address("1 olde branch rd", "dor", "NL", "A0D2A3"),
                new TourneyDate(2022, 10, 26),
                new TourneyDate(2023, 10, 3), 1000, 5000);

        // Populate Members Mock Database for demonstration purposes
        Members dummyMem01 = new Members(new Person("jack benimble", "123456789", "jb@nimble.com"),
                new Address("45 nimble street", "be'quick", "NL", "A0E1H0"),
                new MemShip(1, 50, LocalDate.now()));
        Members dummyMem02 = new Members(new Person("peter pantless", "5678901234", "pp@pants.com"),
                new Address("25 hook Street", "neverlin", "NL", "A4T5E3"),
                new MemShip(2, 0.01, LocalDate.now()));
        Members dummyMem03 = new Members(new Person("sonya ash", "2233322323", "sash@devon.com"),
                new Address("25 ashford place", "addytown", "NL", "A2E3R4"),
                new MemShip(1, 0.01, LocalDate.now()));

        // Save objects to their respective databases
        db.addMemberToDb(dummyMem01);
        db.addMemberToDb(dummyMem02);
        db.addMemberToDb(dummyMem03);
        db2.addTourneyToDb(dummyTourney01);
        db2.addTourneyToDb(dummyTourney02);
        db2.addTourneyToDb(dummyTourney03);

        // CLI Starts Here //
        Display.mainMenuHeader();
        while (true) {
            Display.mainMenuOptions();
            int optionNum01 = sc.nextInt();
            sc.nextLine();

            // Add New Member
            System.out.println();
            if (optionNum01 == 1) {
                // User Inputs values and saved to variable to use as parameters when creating
                // Member objects
                System.out.println("Selection #1: Add New Member");
                Display.div01();

                System.out.println("Enter New Member's Full Name: ");
                String optionNum02 = sc.nextLine();
                optionNum02.toLowerCase();

                System.out.println("Enter " + optionNum02 + "'s Phone #: ");
                String optionNum03 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s Email: ");
                String optionNum04 = sc.nextLine();
                optionNum04.toLowerCase();

                System.out.println("Enter " + optionNum02 + "'s Street Address: ");
                String optionNum05 = sc.nextLine();
                optionNum05.toLowerCase();

                System.out.println("Enter " + optionNum02 + "'s City: ");
                String optionNum06 = sc.nextLine();
                optionNum06.toLowerCase();

                System.out.println("Enter " + optionNum02 + "'s Province: ");
                String optionNum07 = sc.nextLine();
                optionNum07 = optionNum07.toUpperCase();

                System.out.println("Enter " + optionNum02 + "'s Postal Code: ");
                String optionNum08 = sc.nextLine();
                optionNum08 = optionNum08.toUpperCase();

                // Initialize optionNum09 so we can use it outside of the next loop
                // Had an issue while setting cost. Cost depends on type and both are created at
                // the same time resulting in cost displaying incorrect value. So here we
                // initialize a cost @ 0 and change that value pending on the Membership Type
                // the user selects, and adjusts the cost accordingly
                int optionNum09;
                double setCost = 0;

                while (true) {
                    Display.memTypeOptions();
                    optionNum09 = sc.nextInt();
                    sc.nextLine();

                    // If normal
                    if (optionNum09 == 1) {
                        setCost = 50;
                        break;
                        // If Trial
                    } else if (optionNum09 == 2) {
                        setCost = 0.01;
                        break;
                        // If Special
                    } else if (optionNum09 == 3) {
                        setCost = 40;
                        break;
                        // If Family
                    } else if (optionNum09 == 4) {
                        // will write more conditions for family memType
                        setCost = 90;
                        break;
                    } else {
                        // Display error
                        System.out.println("Invalid Entry, Please Try Again");
                        System.out.println();
                    }
                }

                // Create object using user inputted values.
                Members member01 = new Members(new Person(optionNum02, optionNum03, optionNum04),
                        new Address(optionNum05, optionNum06, optionNum07, optionNum08),
                        new MemShip(optionNum09, setCost, LocalDate.now()));

                // Save Object to ArrayList (database)
                db.addMemberToDb(member01);

                // Display entry results to user.
                System.out.println();
                Display.div02();
                System.out.println("Membership Information:");
                System.out.println(member01.getMemInfo());
                Display.div01();
                System.out.println("Address Information:");
                System.out.println(member01.getMemAddress());
                Display.div01();
                System.out.println(member01.getMemType());
                Display.div02();
                System.out.println();

            } else if (optionNum01 == 2) {
                // Options to view Membership information
                Display.viewMemersOptions();
                int viewOption01 = sc.nextInt();
                sc.nextLine();

                // Display Entire Members Database
                if (viewOption01 == 1) {
                    System.out.println();
                    System.out.println(db.getMemberList());

                } else if (viewOption01 == 2) {
                    // Options for searching Members to view Member object in db
                    System.out.println();
                    Display.searchForMemersInfo();
                    int searchOption01 = sc.nextInt();
                    sc.nextLine();

                    if (searchOption01 == 1) {
                        System.out.println("Search Members by Name:");
                        String searchOption02 = sc.nextLine();
                        searchOption02.toLowerCase();
                        db.checkDbForMemberName(searchOption02);

                    } else if (searchOption01 == 2) {
                        System.out.println("Search Members by Phone#:");
                        String searchOption02 = sc.nextLine();
                        db.checkDbForMemberPhoneNum(searchOption02);

                    } else if (searchOption01 == 3) {
                        System.out.println("Search Members by Email:");
                        String searchOption02 = sc.nextLine();
                        searchOption02.toLowerCase();
                        db.checkDbForMemberEmail(searchOption02);

                    } else {
                        continue;
                    }

                } else if (viewOption01 == 3) {
                    // Options for searching Members to Edit/view Member object in db
                    System.out.println();
                    Display.searchForMemersInfo();
                    int searchOption03 = sc.nextInt();
                    sc.nextLine();

                    if (searchOption03 == 1) {
                        System.out.println("Search Members by Name:");
                        String searchOption02 = sc.nextLine();
                        searchOption02.toLowerCase();
                        db.checkDbForMemberName(searchOption02);
                        System.out.println("Update Member's Name to: ");
                        String searchOption05 = sc.nextLine();
                        // SETTER GOES HERE

                    } else if (searchOption03 == 2) {
                        System.out.println("Search Members by Phone#:");
                        String searchOption02 = sc.nextLine();
                        db.checkDbForMemberPhoneNum(searchOption02);
                        System.out.println("Update Member's Phone# to: ");
                        String searchOption05 = sc.nextLine();
                        // SETTER GOES HERE

                    } else if (searchOption03 == 3) {
                        System.out.println("Search Members by Email:");
                        String searchOption02 = sc.nextLine();
                        searchOption02.toLowerCase();
                        db.checkDbForMemberEmail(searchOption02);
                        System.out.println("Update Member's Email to :");
                        String searchOption05 = sc.nextLine();
                        // SETTER GOES HERE

                    } else {
                        continue;
                    }
                }

            } else if (optionNum01 == 3) {
                // User Inputs values and saved to variable to pass to fields while creating
                // Tourney objects
                System.out.println("Selection #2: Add New Tournament");
                Display.div01();

                System.out.println("Enter Name of Tournament:");
                String optionNum02 = sc.nextLine();

                System.out.println("Enter Location of " + optionNum02);
                System.out.print("Enter Street Name: ");
                String optionNum03 = sc.nextLine();
                System.out.print("Enter City Name: ");
                String optionNum04 = sc.nextLine();
                // No postal code, set to NL.
                System.out.print("Enter Postal Code: ");
                String optionNum05 = sc.nextLine();
                optionNum05.toUpperCase();

                System.out.println("Enter Start Date for " + optionNum02);
                System.out.print("Year: ");
                int optionNum06 = sc.nextInt();
                sc.nextLine();
                System.out.print("Month: ");
                int optionNum07 = sc.nextInt();
                sc.nextLine();
                System.out.print("Day: ");
                int optionNum08 = sc.nextInt();

                System.out.println("Enter Entry Fee for " + optionNum02);
                double optionNum09 = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Cash Prize Amount: ");
                double optionNum10 = sc.nextInt();
                sc.nextLine();

                // Creates object with user inputted values (NOTE: <prov> All Tourney addresses
                // are in NL)
                Tourney addTourney01 = new Tourney(optionNum02,
                        new Address(optionNum03, optionNum04, "NL", optionNum05),
                        new TourneyDate(optionNum06, optionNum07, optionNum08),
                        new TourneyDate(optionNum06, optionNum07, optionNum08 + 3),
                        optionNum09, optionNum10);

                // Save Object to ArrayList (database)
                db2.addTourneyToDb(addTourney01);

                // Display entered values to user
                System.out.println();
                Display.div02();
                System.out.println("Tournament Information:");
                System.out.println(addTourney01.getTourneyName());
                System.out.println(addTourney01.getLoc());
                System.out.println("Start Date: " + addTourney01.getStartDate());
                System.out.println("End Date:   " + addTourney01.getEndDate());
                Display.div01();
                System.out.println("Fees & Payouts:");
                System.out.println("Entry Fee: " + addTourney01.getEntryFee());
                System.out.println("Cash Prize: " + addTourney01.getCashPrize());
                // Come back here when implementing Participating Members
                // Come back here when implementing COMPLETED tourney standings
                Display.div02();
                System.out.println();

            } else if (optionNum01 == 4) {
                // Options to view Tournemnt Information
                System.out.println();
                Display.viewTourneyOptions();
                int viewOption01 = sc.nextInt();
                sc.nextLine();

                // View entire Tourney Database
                if (viewOption01 == 1) {
                    System.out.println();
                    System.out.println(db2.getTourneyList());

                    // Options for searching Tournaments
                } else if (viewOption01 == 2) {
                    System.out.println();
                    Display.searchForTourneyInfo();
                    int viewOption02 = sc.nextInt();
                    sc.nextLine();

                    if (viewOption02 == 1) {
                        System.out.print("Search Tournaments by Name: ");
                        String viewOption03 = sc.nextLine();
                        db2.checkDbForTourneyName(viewOption03);

                    } else if (viewOption02 == 2) {
                        System.out.println("Search Tournaments by Entry Fee");
                        int viewOption03 = sc.nextInt();
                        sc.nextLine();
                        db2.checkDbForTourneyFee(viewOption03);

                    } else if (viewOption02 == 3) {
                        System.out.println("Search Tournaments by Cash Prize");
                        int viewOption03 = sc.nextInt();
                        sc.nextLine();
                        db2.checkDbForTourneyPrize(viewOption03);

                    } else {
                        continue;
                    }
                } else if (viewOption01 == 3) {
                    System.out.println();
                    Display.searchForTourneyInfo();
                    int viewOption02 = sc.nextInt();
                    sc.nextLine();

                    if (viewOption02 == 1) {
                        System.out.print("Search Tournament's by Name: ");
                        String viewOption03 = sc.nextLine();
                        db2.checkDbForTourneyName(viewOption03);
                        System.out.println("Update Tournament's Name to: ");
                        String viewOption04 = sc.nextLine();
                        // SETTER GOES HERE

                    } else if (viewOption02 == 2) {
                        System.out.print("Search Tournament's by Entry Fee: ");
                        String viewOption03 = sc.nextLine();
                        db2.checkDbForTourneyName(viewOption03);
                        System.out.println("Update Tournament's Entry Fee to: ");
                        String viewOption04 = sc.nextLine();
                        // SETTER GOES HERE

                    } else if (viewOption02 == 3) {
                        System.out.print("Search Tournament's by Cash Prize: ");
                        String viewOption03 = sc.nextLine();
                        db2.checkDbForTourneyName(viewOption03);
                        System.out.println("Update Tournament's Cash Prize to: ");
                        String viewOption04 = sc.nextLine();
                        // SETTER GOES HERE

                    } else {
                        continue;
                    }

                } else {
                    continue;
                }

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