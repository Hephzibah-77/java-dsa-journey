/*Palindrome number using while loop*/
import java.util.Scanner;
public class Palindrome {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Originalnumber = sc.nextInt();
    int reverse = 0;
    int number = Originalnumber;
    while (number > 0) {
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number / 10;
    }
    if (reverse == Originalnumber) {
      System.out.println("It is a Palindrome");
    } else {
        System.out.println("It is not a Palindrome");
    }
    sc.close();
   } 
}
