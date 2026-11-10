/*Write a while loop to count how many digits are in a number.*/
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int Originalnumber = sc.nextInt();
      int count = 0;
      int number = Originalnumber;
      while (number > 0){
        number = number / 10;
        count++;
        
     }  
     if (Originalnumber == 0) {
       count = 1;
         System.out.println(count);
        } else {
          
          System.out.println(count);
        }
      sc.close();
    }
}
