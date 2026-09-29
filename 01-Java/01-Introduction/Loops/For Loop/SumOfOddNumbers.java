/*Find the sum of odd numbers from 1–19*/
public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 19; i += 2){
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
