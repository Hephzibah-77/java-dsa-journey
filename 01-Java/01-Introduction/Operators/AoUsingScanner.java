/*Write the program yourself where the user enters a and b using Scanner, then calculate the five arithmetic operations.*/
import java.util.Scanner;
public class AoUsingScanner {
     public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();
            int Addition = a + b;
            int Subtraction = a - b;
            int Multiplication = a * b;
            int Division = a / b;
            int Remainder = a % b;
            System.out.println(Addition);
            System.out.println(Subtraction);
            System.out.println(Multiplication);
            System.out.println(Division);
            System.out.println(Remainder);
            sc.close();

        }
     }
    

