/* Problem

Take one boolean input from the user:

isBlocked

If the user is not blocked, print:

Access Allowed

Otherwise print:

Access Denied*/
import java.util.Scanner;
public class LogicalNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isBlocked = sc.nextBoolean();
        if (!isBlocked) {
            System.out.println("Access Allowed");
        } else {
            System.out.println("Access Denied");
        }
        sc.close();
    }
}
