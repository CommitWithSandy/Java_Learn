
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.print("Enter your name:");
        String user = userName.nextLine();
        System.out.println("Hello " + user + "!");
        
        System.out.print("Also tell Your age:");
        int age = userName.nextInt();
        System.out.println("Your a Young:" + age);

    }
}
