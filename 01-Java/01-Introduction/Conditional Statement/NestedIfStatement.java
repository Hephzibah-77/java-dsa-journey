/*Write a program that takes two inputs:

age
hasPermission (true or false)

Rules:

If age >= 18, then check hasPermission.

If hasPermission is true, print:

Access Granted

If age >= 18 but hasPermission is false, print:

Permission Required

If age < 18, print:

Age Restriction */
import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        boolean hasPermission = sc.nextBoolean();

        if (age >= 18) {

            if (hasPermission) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Permission Required");
            }

        } else {
            System.out.println("Age Restriction");
        }

        sc.close();
    }
}
    