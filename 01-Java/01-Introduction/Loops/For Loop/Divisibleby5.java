/*Count how many numbers from 1 to 100 are divisible by 5.*/
public class Divisibleby5{
    public static void main(String[] args) {
         int remainder = 0;
         int count = 0;
         for (int i = 1; i <= 100; i++) {
            remainder = i % 5;
            if (remainder == 0){
                count++;
            }
            
         }
         System.out.println(count);
    }

      
}