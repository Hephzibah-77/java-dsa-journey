/*Create a Java program named:

LogicalAnd.java
Problem

Take two inputs from the user:

age
hasID (true or false)

Print:

Access Granted

only when:

age is 18 or above, AND
the person has an ID

Otherwise print:

Access Denied*/
import java.util.Scanner;
public class LogicalAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean hasId = sc.nextBoolean();
        if (age >= 18 && hasId) {
           System.out.println("Access Granted"); 
        } else {
            System.out.println("Access Denied");
        }
        sc.close();
    }
}
