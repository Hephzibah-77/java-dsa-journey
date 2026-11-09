/*Write a Java program to check whether a given positive integer is a palindrome or not.*/
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = 0;
        int originalNumber = sc.nextInt();
        int number = originalNumber;
        for (int i = 0; number > 0; i++) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (reverse == originalNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}