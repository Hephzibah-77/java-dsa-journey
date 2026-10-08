/*Write a Java program that:

Takes an integer number as input.
Uses a for loop.
Reverses the number.
Checks whether the original number and reversed number are the same.
Prints true if it is a palindrome, otherwise fals*/
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int original = number;
        int reverse = 0;

        for (int i = 0; number > 0; i++) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}