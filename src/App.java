
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isRunning = true;
        System.out.println("Welcome to SkyBox Ltd.");
        Manifest manifest = new Manifest();

        while (isRunning) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a passenger");
            System.out.println("2. Remove a passenger");
            System.out.println("3. Switch seats");
            System.out.println("4. Rename a passenger");
            System.out.println("5. Count passengers");
            System.out.println("6. Print passenger manifest");
            System.out.println("7. Exit");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("What is the name of the passenger?");
                String name = scanner.next();
                System.out.println("What is the age of the passenger?");
                int age = scanner.nextInt();
                manifest.insertPassenger(name, age);
                System.out.println("\n Passenger added.\n");
            } else if (userChoice == 2) {
                System.out.println("What seat number would you like to remove?");
                int seatNumber = scanner.nextInt();
                manifest.removePassenger(seatNumber);
                System.out.println("\nPassenger removed.\n");
            } else if (userChoice == 3) {
                System.out.println("What seat number would you like to switch?");
                int seat1 = scanner.nextInt();
                System.out.println("What seat number would you like to switch it with?");
                int seat2 = scanner.nextInt();
                manifest.switchSeats(seat1, seat2);
                System.out.println("\nSeats switched.\n");
            } else if (userChoice == 4) {
                System.out.println("What seat number would you like to rename?");
                int seatNumber = scanner.nextInt();
                System.out.println("What is the new name?");
                String newName = scanner.next();
                manifest.renamePassenger(seatNumber, newName);
                System.out.println("\nPassenger renamed.\n");
            } else if (userChoice == 5) {
                System.out.println("There are " + manifest.countPassengers() + " passengers on the plane.");
            } else if (userChoice == 6) {
                manifest.printPassengerManifest();
            } else if (userChoice == 7) {
                System.out.println("Thank you for flying with SkyBox Ltd.");
                isRunning = false;
            } else if (userChoice < 1 || userChoice > 8) {
                System.out.println("Invalid input. Please try again.");
            }


         }


    }


}