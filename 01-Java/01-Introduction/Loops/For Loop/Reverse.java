/*Write a Java program to reverse a number using a for loop.*/
import java.util.Scanner;
public class Reverse {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int reverse = 0;
    int number = sc.nextInt();
    for (int i = 0; number > 0; i++) {
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number / 10;
     }
     System.out.println(reverse);
     sc.close();
  }  
}
