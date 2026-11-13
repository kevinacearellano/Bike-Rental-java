
package bikerent;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BikeRent {

    public static void main(String[] args) {
        //starting point
       Scanner inp = new Scanner(System.in);
        RentalForm form1 = new RentalForm();
        String[] bike = {"Road Bike", "Mountain Bike", "Fixie", "Fat Bike", "Folding Bike"};
        double[] price = {30, 25, 25, 25, 20};
        int choice, hrs ;
        double selectedPrice = 0;
        int selectedBikeIndex = -1; // To keep track of the selected bike's index
        LocalTime startTime, endTime; //time in and time out
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("======GELACE RENTAL BIKESHOP======\n");
        System.out.println("AVAILABLE BIKES:");
        for (int i = 1; i <= bike.length; i++) {
            System.out.printf("[%d] %s -PHP %.2f Per Hour \n", i, bike[i - 1], price[i - 1]);
        }
        // do while loop and selection of bike
        do {
            System.out.print("[0] Exit\nSELECT THE BIKE NUMBER YOU WANT TO RENT: ");
            choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1
                        :selectedBikeIndex = choice - 1; // isasave and correct index para sa naselect na bike
                    selectedPrice = price[selectedBikeIndex];
                    System.out.printf("You Select   : %s\n", bike[selectedBikeIndex]);
                    choice = 0; 
                    break;
                case 2
                        :selectedBikeIndex = choice - 1; // isasave and correct index para sa naselect na bike
                    selectedPrice = price[selectedBikeIndex];
                    System.out.printf("You Select   : %s\n", bike[selectedBikeIndex]);
                    choice = 0; 
                    break;
                case 3
                        :selectedBikeIndex = choice - 1; // isasave and correct index para sa naselect na bike
                    selectedPrice = price[selectedBikeIndex];
                    System.out.printf("You Select   : %s\n", bike[selectedBikeIndex]);
                    choice = 0; 
                    break;
                case 4
                        :selectedBikeIndex = choice - 1; // isasave and correct index para sa naselect na bike
                    selectedPrice = price[selectedBikeIndex];
                    System.out.printf("You Select   : %s\n", bike[selectedBikeIndex]);
                    choice = 0; 
                    break;
                case 5:
                    selectedBikeIndex = choice - 1; // isasave and correct index para sa naselect na bike
                    selectedPrice = price[selectedBikeIndex];
                    System.out.printf("You Select   : %s\n", bike[selectedBikeIndex]);
                    choice = 0; 
                    break;
                case 0:
                    System.out.println("Exiting the System. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        //rent hrs nakahiwalay sa do while bracket
        //receipt block
        System.out.print("Enter Rent Hours: ");
        hrs = inp.nextInt();
        inp.nextLine();
        //Info Form 
        form1.form();
        

        System.out.println("\n============= RECEIPT =============");
        System.out.printf("Name: %s\nAddress: %s\nGender: %s\nAge: %d\n", 
                form1.name, form1.add, form1.gen, form1.age);
        System.out.printf("Bike: %s\n", bike[selectedBikeIndex]); // Use selectedBikeIndex instead of choice
        double total = selectedPrice * hrs;
        System.out.printf("Total: PHP %.2f\n", total);
        startTime = LocalTime.now(ZoneId.of("Asia/Manila"));//start time 
        System.out.println("Rental started at: " + startTime.format(timeFormatter));
         endTime = startTime.plusHours(hrs);
        System.out.println("Rental will end at: " + endTime.format(timeFormatter));
        System.out.print("Enter your Paymnet: PHP ");
        double pay = inp.nextDouble();
        double change = pay - total;
        System.out.printf("Change: PHP %.2f\n",change);
        System.out.println("Thankyou and Ride Safe!!");
    }
}
    
    

