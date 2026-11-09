/*Write a Java program using a for loop that reads an integer and finds its smallest digit.*/
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int smallest = 10;
        for (int i = 0; number > 0; i++) {
            int remainder = number % 10;
                number = number / 10;
            if (remainder < smallest) {
                smallest = remainder;
            
            }
        }
        System.out.println(smallest);
        sc.close();
    }
}