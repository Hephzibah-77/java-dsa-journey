/*Write a Java program that:

Takes three integers from the user and prints the smallest number among the three.

You decide the approach yourself.*/
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.println("firstNumber is smallest Number");
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            System.out.println("secondNumber is smallest Number");
        } else {
            System.out.println("thirdNumber is smallest Number");
        }
        sc.close();
    }
}
