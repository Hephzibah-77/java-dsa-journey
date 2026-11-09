/*Write a while loop to calculate the sum of numbers from 1 to 5. */
public class Sum{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}