/*Write a while loop to count how many digits are in a number.*/
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int count = 0;
      while (number > 0){
        number = number / 10;
        count++;
      }  
      System.out.println(count);
      sc.close();
    }
}
