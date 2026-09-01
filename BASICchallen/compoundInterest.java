package BASICchallen;

import java.util.Scanner;

public class compoundInterest {

    // Find Compound Interest = P * Math.pow(( 1 + R / 100), T);
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle Rs :");
        int P = input.nextInt();
        
        System.out.println("Enter the Interest Rate % :");
        float R = input.nextFloat();

        System.out.println("Enter the Time (Year) :");
        int T = input.nextInt();

        double compound = P * Math.pow(( 1 + R / 100), T);
        System.out.println("Compound Interest : " + compound );
    }
}
