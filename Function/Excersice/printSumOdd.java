// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class printSumOdd {
    public static void sumOdd(int num){
        int sum = 0;
        for (int i = 1; i <=num; i++) {
            if (i%2!=0) {
                sum = sum + i;
        }
        }
        System.out.println("Sum of Odd numbers :"+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOdd(num);

    }
}
