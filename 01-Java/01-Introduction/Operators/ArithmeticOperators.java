/*Write a Java program that:

Creates two int variables:
a = 25
b = 4
Prints the result of:
Addition
Subtraction
Multiplication
Division
Remainder*/
import java.util.Scanner;
public class ArithmeticOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =  25;
        int b = 4;
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