/*Write a Java program that:
- Takes a number using Scanner
- Counts its digits using a for loop
- Prints the digit count*/
import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = sc.nextInt();
        int digit = number;
        for (int i = 0; number > 0; i++) {
            int remainder = number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
