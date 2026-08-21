/*Write a Java program that takes:

A person's name
Their age

as input from the user.

Then print both values. */
import java.util.Scanner;
public class NameAge {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name);
        System.out.println(age);
        sc.close();
    }
}
