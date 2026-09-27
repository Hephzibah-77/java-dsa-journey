/*Write a Java program that takes an integer month number from the user (1–12) and prints the number of days in that month.

Use switch.

For this assessment, assume:

1, 3, 5, 7, 8, 10, 12 → 31 days
4, 6, 9, 11 → 30 days
2 → 28 days
Anything else → Invalid month

Send your code when you're finished.*/
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        switch (monthNumber){
            case 1 : 
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            case 3:
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("30 Days");
                break;
            case 5:
                System.out.println("31 Days");
                break;
            case 6:
                System.out.println("30 Days");
                break;
            case 7:
                System.out.println("31 Days");
                break;
            case 8:
                System.out.println("31 Days");
                break;
            case 9:
                System.out.println("30 Days");
                break;
            case 10:
                System.out.println("31 Days");
                break;
            case 11:
                System.out.println("30 Days");
                break;
            case 12:
                System.out.println("31 Days");
                break;
                default :
                System.out.println("Invalid month");
        }
        sc.close();
    }
}
