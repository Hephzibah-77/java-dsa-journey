/*Write a Java program that:

Takes an integer number as input.
Uses a for loop.
Reverses the number using the reverse pattern you learned.
Prints the reversed number.*/
import java.util.Scanner;
public class ReversePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        for (int i = 0; number > 0; i++){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
        sc.close();
    }
   
}
