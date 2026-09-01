package BASICchallen;

import java.util.Scanner;

public class perimeterRectangle {

    // Find Perimeter of Rectangle = A+B+C+D;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the All Triangle side  Value:");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double D = input.nextDouble();

        double angle = A+B+C+D;
        System.out.println("Perimeter of Rectangle: " + angle + "cm");
    }
}
