/*Exercise 10: Find the Largest Number

Problem: Write a Java program that:

Takes 5 integers as input.

Uses a for loop to process them.

Finds and prints the largest number. */
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int largest = sc.nextInt();
        for (int i = 1; i <5; i++){
            int number = sc.nextInt();
        if (number > largest) {
            largest = number;
        }
    }
    System.out.println(largest);
    sc.close();
 }
}
    