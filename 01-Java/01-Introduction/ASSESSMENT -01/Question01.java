/*Write a Java program that:

Takes an integer from the user and prints Positive, Negative, or Zero depending on its value.*/
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
    
}
