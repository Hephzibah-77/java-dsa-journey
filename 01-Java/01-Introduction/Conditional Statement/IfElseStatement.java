/*Write a Java program that:

Takes an integer from the user using Scanner.
Checks whether the number is even or odd.*/
import java.util.Scanner;
public class IfElseStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
