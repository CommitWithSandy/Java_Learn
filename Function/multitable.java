// Make a function to print the table of a given number n.

import java.util.Scanner;

public class multitable {
    public static void multiTable(int n){
        for (int i = 1; i <=10; i++) {
            System.out.println(n+ "*" + i +" = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        multiTable(n);
    }
}
