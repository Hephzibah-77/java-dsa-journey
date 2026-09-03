/* Write a Java program that stores a distance in kilometers as a decimal value.

Then convert it to meters using:

meters = kilometers × 1000

Your program should:

Store the distance in kilometers.
Calculate the distance in meters.
Print both values.*/
public class Distance {
    public static void main(String[] args) {
        double distanceInKilometers = 2.5;
        double distanceInMeters = distanceInKilometers * 1000;
        System.out.println(distanceInKilometers);
        System.out.println(distanceInMeters);
    }
}