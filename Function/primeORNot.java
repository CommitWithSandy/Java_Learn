// Make a function to check if a number is prime or not.

import java.util.Scanner;

public class primeORNot {
    public static void primeorNot(int num){
        int count = 0;
        if(num>1){
            for (int i = 1; i <=num; i++) {
                if (num%i==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println("Prime Number ");
            }
            else{
                System.out.println("Not Prime Number ");
            }
        }
        else{
                System.out.println("Not Prime Number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        primeorNot(num);
    }
}
