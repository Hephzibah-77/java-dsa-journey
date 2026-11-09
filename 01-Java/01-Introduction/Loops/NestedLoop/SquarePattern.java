/*Write a Java program using nested for loops to print a square pattern consisting of 4 rows and 4 columns of stars (*). */

public class SquarePattern{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
