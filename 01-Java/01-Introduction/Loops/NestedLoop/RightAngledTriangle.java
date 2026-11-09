/*Write a Java program using nested for loops to print a right-angled triangle with 5 rows.*/
public class RightAngledTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
