package theatre;

import java.util.Scanner;

public class Movie {
    String movieName;
    double ticketPrice;
    int availableSeats;
    int bookedTickets;

    Scanner sc = new Scanner(System.in);

    // Method to add movie details
    public void addMovie() {
        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        ticketPrice = sc.nextDouble();

        System.out.print("Enter Available Seats: ");
        availableSeats = sc.nextInt();
    }

    // Method to book tickets
    public void bookTickets() {
        System.out.print("Enter Number of Tickets to Book: ");
        bookedTickets = sc.nextInt();

        if (bookedTickets <= availableSeats) {
            availableSeats = availableSeats - bookedTickets;
            System.out.println("Tickets booked successfully!");
        } else {
            System.out.println("Not enough seats available.");
            bookedTickets = 0;
        }
    }

    // Method to display booking details
    public void displayBookingDetails() {
        double totalAmount = bookedTickets * ticketPrice;

        System.out.println("\n----- Booking Details -----");
        System.out.println("Movie Name       : " + movieName);
        System.out.println("Tickets Booked   : " + bookedTickets);
        System.out.println("Remaining Seats  : " + availableSeats);
        System.out.println("Total Amount     : ₹" + totalAmount);
    }
}
