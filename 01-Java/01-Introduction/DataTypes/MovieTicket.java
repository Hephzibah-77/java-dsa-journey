/*A movie ticket system needs to store the following information:

The movie's name
The ticket price
Number of tickets purchased
The first letter of the customer's name
Whether the booking is confirmed

Write a Java program that:

Declares a variable for each piece of information.
Chooses the appropriate data type for each variable.
Assigns suitable values.
Calculates the total ticket cost.
Prints the movie name, customer initial, total cost, and booking status.*/
public class MovieTicket {
    public static void main(String[] args) {
        String MovieName = "Pushpa";
        float TicketPrice = 499.5f;
        int TicketsPurchased = 500;
        char FirstLetter = 'L';
        boolean isConfirmed = true;
        double TotalTicketCost = TicketPrice * TicketsPurchased;
        System.out.println(MovieName);
        System.out.println(TicketPrice);
        System.out.println(TicketsPurchased);
        System.out.println(FirstLetter);
        System.out.println(isConfirmed);
        System.out.println(TotalTicketCost);

    }
}
