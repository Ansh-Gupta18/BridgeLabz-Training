import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSlots = 5;   // total parking capacity
        int occupied = 0;     // currently parked cars
        int choice;

        // loop runs until user exits or parking is full
        while (true) {

            // stop if parking is full
            if (occupied == totalSlots) {
                System.out.println("Parking Lot is FULL!");
                break;
            }

            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Car");
            System.out.println("2. Exit Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    occupied++;
                    System.out.println("Car Parked Successfully.");
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car Exited Successfully.");
                    } else {
                        System.out.println("No cars to exit.");
                    }
                    break;

                case 3:
                    System.out.println("Total Slots: " + totalSlots);
                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (totalSlots - occupied));
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
