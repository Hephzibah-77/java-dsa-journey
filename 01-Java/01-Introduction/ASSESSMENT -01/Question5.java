/*Write a Java program that:

Takes age and a boolean value indicating whether the person has an ID.

Print Eligible only when the person is 18 or older AND has an ID. Otherwise print Not Eligible.*/
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean hasId = sc.nextBoolean();
        if (age >= 18 && hasId) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
