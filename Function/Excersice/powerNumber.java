// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;

public class powerNumber {
    public static double raisedPower(int x, int n){
        double r = Math.pow(x, n);
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        double result = raisedPower(x, n);
        System.out.println(x+ " x " +n+ " = " +result);
    }
}
