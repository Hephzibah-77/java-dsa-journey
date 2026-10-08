/*Write a Java program that uses a for loop to count how many numbers between 1 and 50 (inclusive) are divisible by 3.

Print only the final count.*/
public class Question04 {
    public static void main(String[] args) {
        int remainder = 0;
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            remainder = i % 3;
            if (remainder == 0) {
               count++;
            } 
        }
        System.out.println(count);
    }
}