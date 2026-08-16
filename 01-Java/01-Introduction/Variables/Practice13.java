/*You have:
int totalSeconds = 3675;
Convert this into:
hours
minutes
seconds
For 3675 seconds, the result should represent:
1 hour
1 minute
15 seconds*/
public class Practice13 {
    public static void main(String[] args){
        int totalseconds = 3675;
        int hours = totalseconds / 3600;
        int remainingseconds = totalseconds % 3600;
        int minutes = remainingseconds / 60;
        int seconds = totalseconds % 60;
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }
    
}
