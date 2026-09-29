/*Write a Java program that prints the multiplication table of 5, from 5 × 1 to 5 × 10.*/
public class MultiplicationTable {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 10; i++){
        product = 5 * i;
        System.out.println(product);
        }
        
    }
}
