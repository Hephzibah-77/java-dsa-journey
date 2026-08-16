/* Swap Two Variables 🔄

Create two integer variables:

a with value 10
b with value 20 */ 
public class Practice4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a; // Used a temporary variable.
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
