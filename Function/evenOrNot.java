// Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class evenOrNot {
    public static void evenorNot(int num){
        {
            if (num%2==0)
            {
                System.out.println("Even numbers ");
            }
            else
            {
                System.out.println("Odd numbers ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        evenorNot(num);
    }
}
