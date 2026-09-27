/*/*Write a Java program that:

Takes a number from the user and prints its day of the week using switch.

Use:

1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday
Any other number → Invalid day*/
import java.util.Scanner;
   public class Question6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default :
                System.out.println("Invalid day");
        }
        sc.close();
    }
}
