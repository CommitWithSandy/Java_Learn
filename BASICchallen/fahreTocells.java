package BASICchallen;

import java.util.Scanner;

public class fahreTocells  {

    // F to C = (Fahrenheit - 32 )* 5 / 9 ;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit  :");
        float Fahrenheit = input.nextInt();
        
        float Celsius = (Fahrenheit - 32 )* 5 / 9 ;
        System.out.println("Celsius: " + Celsius + "C" );
    }
}
