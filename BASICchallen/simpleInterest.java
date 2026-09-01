package BASICchallen;

import java.util.Scanner;

public class simpleInterest {

    // Find Simple Interest = (P * R * T) / 100;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle Rs :");
        int P = input.nextInt();
        
        System.out.println("Enter the Interest Rate % :");
        float R = input.nextFloat();

        System.out.println("Enter the Time (Year) :");
        int T = input.nextInt();

        double SimpleINT = (P * R * T) / 100;
        System.out.println("Simple Interest : " + SimpleINT );
    }
}
