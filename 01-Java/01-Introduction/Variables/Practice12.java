/* Create:
int number = 25;
int divisor = 4;
Then create:
quotient
remainder
Your program should:
Calculate the quotient when number is divided by divisor.
Calculate the remainder.
Print both values.*/
public class Practice12 {
    public static void main(String[] args){
        int number = 25;
        int divisor = 4;
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
