/*  Check Voting Eligibility

Write a Java program that:

Takes an integer age from the user.

If the age is 18 or greater, print:

Eligible to vote */
import java.util.Scanner;
public class IfStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
        System.out.println("Eligible to vote");
        }
    }
}

