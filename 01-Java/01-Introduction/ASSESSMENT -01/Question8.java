/*Write a Java program that:

Takes two integers from the user and an operator choice:

1 → Addition
2 → Subtraction
3 → Multiplication
4 → Division

Print the result of the selected operation.
For any other choice, print Invalid Choice.

Use switch.*/
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
                default :5
                System.out.println("Invalid Choice");
        }
        sc.close();    
        
    }
}
