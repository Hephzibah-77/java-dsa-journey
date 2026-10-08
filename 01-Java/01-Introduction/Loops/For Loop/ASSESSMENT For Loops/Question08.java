/*Write a Java program that:

Takes an integer n as input.
Uses a for loop.
Calculates n! (factorial).
Prints the result.*/
import java.util.Scanner;
public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++){
            product = i * product;
        }
        System.out.println(product);
        sc.close();
    }
}
