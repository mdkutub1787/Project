import java.util.Scanner;

class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    public void bookTickets(int numTickets) {
        if (numTickets > 0 && numTickets <= availableTickets) {
            availableTickets -= numTickets;
            System.out.println(numTickets + " ticket(s) booked successfully.");
        } else {
            System.out.println("Sorry, insufficient tickets available.");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ticket Booking System!");

        System.out.print("Enter the total number of tickets: ");
        int totalTickets = scanner.nextInt();
        TicketBookingSystem bookingSystem = new TicketBookingSystem(totalTickets);

        while (true) {
            System.out.println("\n1. Book Tickets");
            System.out.println("2. Check Available Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of tickets to book: ");
                    int numTickets = scanner.nextInt();
                    bookingSystem.bookTickets(numTickets);
                    break;
                case 2:
                    System.out.println("Available Tickets: " + bookingSystem.getAvailableTickets());
                    break;
                case 3:
                    System.out.println("Thank you for using the Ticket Booking System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}