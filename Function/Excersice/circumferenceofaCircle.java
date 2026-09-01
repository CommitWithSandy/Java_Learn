// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class circumferenceofaCircle {
    public static double circle(double radius){
        //(C = 2*pi*r)
        double C = 2 * Math.PI * radius;
        return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double C = circle(radius);
        System.out.println("Circumference of a Circle :" +C );
    }
    
}