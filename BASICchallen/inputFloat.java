package BASICchallen;
import java.util.Scanner;
public class inputFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a floating number:");
        double first = input.nextDouble();
        System.out.println("Enter a floating number:");
        double second = input.nextDouble();
        double multi = first * second;
        System.out.println("Result:" + multi);
    }
}
