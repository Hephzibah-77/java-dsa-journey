/*Write a Java program that:

Takes marks as input using Scanner.

If marks are 90 or above, print:

Grade A

Else if marks are 75 or above, print:

Grade B

Else if marks are 50 or above, print:

Grade C

Otherwise print:

Fail */
import java.util.Scanner;
public class IfElseIfStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}