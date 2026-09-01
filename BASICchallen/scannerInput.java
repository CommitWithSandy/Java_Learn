package BASICchallen;
import java.util.Scanner;
public class scannerInput {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = Name.nextLine();
        System.out.print("Hello " + name + " !");

        System.out.println("\n");
        Scanner Int1 = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = Int1.nextInt();
        Scanner Int2 = new Scanner(System.in);
        System.out.print("Enter another number:");
        int b = Int2.nextInt();
        int c = a + b;
        System.out.println("Addition:" + c);
    }
}
