/* Problem

Take two boolean inputs from the user:

hasStudentID
hasInvitation

Print:

Entry Allowed

if the person has a student ID OR an invitation.

Otherwise print:

Entry Denied*/
import java.util.Scanner;
public class LogicalOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasStudentId = sc.nextBoolean();
        boolean hasInvitation = sc.nextBoolean();
        if (hasStudentId || hasInvitation) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("Entry Denied");
        }
        sc.close();
    }
}
