// This is just to test the CLI program

import java.util.*;

public class MockCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Display.mainMenuHeader();
        while (true) {
            Display.mainMenuOptions();

            int optionNum01 = sc.nextInt();
            // sc.nextLine() is used here to fix a bug when using sc.nextInt()
            // which sometimes results in upcoming input to be skipped for some reason
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

                System.out.println("Enter " + optionNum02 + "'s Postal Code: ");
                String optionNum08 = sc.nextLine();

                System.out.println("Enter " + optionNum02 + "'s Membership Type: ");
                String optionNum09 = sc.nextLine();

                System.out.println("Cost of Membership: $");

                System.out.println("Enter Start Date of Membership: ");
                String optionNum10 = sc.nextLine();

                System.out.println("Membership Expires: ");
                String optionNum11 = sc.nextLine();

                Members member01 = new Members(new Person(optionNum02, optionNum03, optionNum04),
                        new Address(optionNum05, optionNum06, optionNum07, optionNum08),
                        new MemShip(optionNum09, 50, optionNum10, optionNum11));
                // At this point, this info will have to be saved somewhere, never
                // looked at the best way to do this just yet

                System.out.println();
                // this will probably be replaced by calling the object and using toString()
                System.out.println("===========================");
                System.out.println("Membership Information:");
                System.out.println("Name: " + optionNum02);
                System.out.println("Phone#: " + optionNum03);
                System.out.println("Email : " + optionNum04);
                System.out.println();
                System.out.println("Address Information:");
                System.out.println(optionNum05 + ", " + optionNum06 + ".");
                System.out.println(optionNum07 + ", " + optionNum08 + ".");
                System.out.println();
                System.out.println("Membership Type: " + optionNum09);
                System.out.println("Cost of Membership: (Have to set up cost PENDING ON MemShip type)");
                System.out.println("Start Date: " + optionNum10);
                System.out.println("Expiry Date: (One Year After Start Date)");
                System.out.println("===========================");
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
