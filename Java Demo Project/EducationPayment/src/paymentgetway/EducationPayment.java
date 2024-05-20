package paymentgetway;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author MD KUTUB UDDIN
 */
public class EducationPayment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        while (true) {
            // Gather student information
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();

            System.out.println("Enter student ID:");
            String studentID = scanner.nextLine();

            // Gather course information
            System.out.println("Enter course name:");
            String courseName = scanner.nextLine();

            System.out.println("Enter course fee:");
            double courseFee = 0;
            try {
                courseFee = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for course fee. Please enter a valid number.");
                continue;
            }

            // Gather payment information
            System.out.println("Enter payment amount:");
            double paymentAmount = 0;
            try {
                paymentAmount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for payment amount. Please enter a valid number.");
                continue;
            }

            // Calculate remaining balance
            double remainingBalance = courseFee - paymentAmount;

            // Display payment receipt
            System.out.println("\nPayment Receipt:");
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentID);
            System.out.println("Course Name: " + courseName);
            System.out.println("Course Fee: Tk:" + df.format(courseFee));
            System.out.println("Payment Amount: Tk:" + df.format(paymentAmount));
            System.out.println("Remaining Balance: Tk:" + df.format(remainingBalance));

            // Check if the user wants to continue
            System.out.println("\nDo you want to continue? (yes/no)");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }

        // Close scanner
        scanner.close();
    }
}
