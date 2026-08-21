/*Write a Java program that:

Uses Scanner to take an integer from the user.
Stores the input in a variable named number.
Prints the value of number.*/ 
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        sc.close();
    }
}
