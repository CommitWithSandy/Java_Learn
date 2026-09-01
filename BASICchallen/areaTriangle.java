package BASICchallen;

import java.util.Scanner;

public class areaTriangle {

    //Find Area of Triangle
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Breadth :");
        double B = input.nextDouble();
        System.out.println("Enter the Height :");
        double H = input.nextDouble();

        double Area = 0.5*B*H; // Also (B * H)/ 2
        System.out.println("Area of Triangle: " + Area + "cms2");
    }
}
