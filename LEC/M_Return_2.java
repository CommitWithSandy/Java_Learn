import java.util.Scanner;
// Return Statement: A return statement is used to exit from a method and optionally return a value. 
// It is used to send a value back to the caller of the method. 
// The return type of the method must match the type of the value being returned.
public class M_Return_2 {
    public static void main(String[] args) {
        greeting();
        int firstNum = Addition();
        int secondNum = Addition();

        int sum = firstNum + secondNum;
        System.out.print("The sum is: " + sum);
    }
    public static int Addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        return number;
    }
    public static void greeting(){
        System.out.println("Return Statement Example..!");
    }
}
