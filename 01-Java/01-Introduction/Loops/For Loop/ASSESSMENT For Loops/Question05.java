/*Write a Java program that uses a for loop to calculate the sum of all even numbers from 1 to 50 (inclusive).

Print only the final sum.*/
public class Question05 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 50; i += 2){
         sum = i + sum;
        }
        System.out.println(sum);
    }
}

