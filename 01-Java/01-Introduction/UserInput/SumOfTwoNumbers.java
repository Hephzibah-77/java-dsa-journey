/* Write a Java program that:

Uses Scanner to take two integers from the user.
Stores them in two variables:
firstNumber
secondNumber
Calculates their sum.
Stores the result in a variable called sum.
Prints the sum.*/
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
        sc.close();
    }
}
