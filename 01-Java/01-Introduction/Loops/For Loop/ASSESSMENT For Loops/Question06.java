/*Write a Java program that uses a for loop to count how many odd numbers are between 1 and 100 (inclusive).

Print only the final count.*/
public class Question06 {
    public static void main(String[] args) {
        int count = 0;
     for (int i = 1; i <= 100; i += 2){
        count++;
     }
     System.out.println(count);
    }
}
