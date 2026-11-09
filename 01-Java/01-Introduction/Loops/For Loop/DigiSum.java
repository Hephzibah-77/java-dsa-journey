/*Write a Java program using a for loop that takes an integer as input and finds the sum of its digits.*/
import java.util.Scanner;
public class DigiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        for (int i = 0; number > 0; i++) { // number > 0 because, We want to process every digit until no digits are left and number becomes 0.
           int remainder = number % 10;
           sum = sum + remainder;
           number = number / 10;
        }
    System.out.println(sum);
    sc.close();
    }
}
