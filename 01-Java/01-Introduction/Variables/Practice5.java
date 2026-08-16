/* Create three integer variables:

x = 10
y = 20
z = 30

Then make the values become:

x = 30
y = 10
z = 20 */
public class Practice5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int temp = x;
        x = z;
        z = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
