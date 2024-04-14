package hotel;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, Administrateur> administrateurs = new HashMap<>();
    static HashMap<Integer, Client> clients = new HashMap<>();
    static HashMap<Integer, Chambre> chambres = new HashMap<>();
    static HashMap<String, HashMap<String, Date[]>> reservations = new HashMap<>();
    public static HashMap<Integer, Reservation> infoReservation = new HashMap<>();
    static double price1, price2, price3, price4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        Client client = new Client();

        System.out.println("Hello user, are you here today as:");
        System.out.println("1) Client");
        System.out.println("2) Administrator");
        System.out.println("Press 1 or 2");
        int checkUser = scanner.nextInt();

        if (checkUser == 1) {
            System.out.println("Hello Client, are you new here?");
            System.out.println("1) SIGN UP");
            System.out.println("2) LOGIN");
            System.out.println("Press 1 or 2");
            int checkSign = scanner.nextInt();

            if (checkSign == 1) {
                try {
                    client.signUpClient(id++, scanner.next(), scanner.next(), scanner.next(),
                            scanner.next(), scanner.next(), scanner.next());
                } catch (AlreadyExistException e) {
                    System.out.println("User already exists.");
                    System.out.println("Please LOGIN instead.");
                    // Log or handle the exception appropriately
                } 
            }
        }

        scanner.close(); // Close the scanner to release resources
    }
}
