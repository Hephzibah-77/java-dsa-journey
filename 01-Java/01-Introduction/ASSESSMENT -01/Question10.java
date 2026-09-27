/*Write a Java program that:

Takes an integer from the user and checks whether it is divisible by both 3 and 5.

Print Divisible by both if it is divisible by both; otherwise print Not divisible by both.*/
import java.util.Scanner;
public class Question10 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 3 == 0 && number % 5 == 0) {
        System.out.println("Divisible by Both");
    } else {
        System.out.println("Not divisible by Both");
    }
    sc.close();
   } 
}
