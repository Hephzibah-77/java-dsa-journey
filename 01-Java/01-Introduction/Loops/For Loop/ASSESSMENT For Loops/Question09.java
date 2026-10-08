/*Write a Java program that:

Takes an integer n as input.
Uses a for loop.
Prints the digits of the number in reverse order.
*/
import java.util.Scanner;
public class Question09 {
    public static void main(String[] args) {
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
