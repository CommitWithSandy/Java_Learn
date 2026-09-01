// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class printAverage {
    public static int average(int a, int b, int c){
        int add = a + b + c ;
        int sum = add / 3;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int sum = average(a, b, c);

        System.out.println("Average is: "+sum);
    }
}
