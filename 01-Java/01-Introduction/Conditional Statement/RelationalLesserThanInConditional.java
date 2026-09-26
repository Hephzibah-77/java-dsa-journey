/*take two integers and print:

"firstNumber is lesser" if the first number is smaller
"firstNumber is not lesser"*/
import java.util.Scanner;
public class RelationalLesserThanInConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println("firstNumber is Lesser");
        } else {
            System.out.println("firstNumber is not Lesser");
        }
        sc.close();
    }
}
