/*Write a program that takes two integers and an operator choice.

Input:

firstNumber
secondNumber
choice

Where:

1 → Addition
2 → Subtraction
3 → Multiplication
4 → Division

Then use switch:

1 → print firstNumber + secondNumber
2 → print firstNumber - secondNumber
3 → print firstNumber * secondNumber
4 → print firstNumber / secondNumber
anything else → print "Invalid choice"*/
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice){
        case 1 : 
        System.out.println(firstNumber + secondNumber);
        break;
        case 2 : 
        System.out.println(firstNumber-secondNumber);
        break;
        case 3 : 
        System.out.println(firstNumber * secondNumber);
        break;
        case 4 :
        System.out.println(firstNumber / secondNumber);
        break;
        default :
        System.out.println("Invalid Choice");
        break;
        

    }
    sc.close();
  }
}
        