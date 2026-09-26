/* Problem

Take two integers from the user:

firstNumber
secondNumber

Then check whether:

firstNumber > secondNumber

If it is true, print:

First number is greater

Otherwise print:

First number is not greater*/
import java.util.Scanner;
public class RelationalGreaterThanInConditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if ( firstNumber > secondNumber) {
            System.out.println("firstNumber is greater");
        } else {
            System.out.println("firstNumber is not greater");
        }
        sc.close();
    }
}
