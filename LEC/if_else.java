
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your Name: ");
        name = input.nextLine();

        System.out.print("Enter Your Age: ");;
        age = input.nextInt();

        System.out.print("Are u Student true/false: ");
        isStudent = input.nextBoolean();


        // Name 

        if(name.isEmpty()){
            System.out.println("Nam kon mera BAPA lihkega....!!!!");
        }
        else{
            System.out.println("Hello " + name + " Bhauuu...!");
        }


        // Age

        if(age >=30){
            System.out.println("Your A Senior...!");
        }
        else if(age >=18){
            System.out.println("Your a Adult Bro FAHHHAAA.....");
        }
        else if(age >=10){
            System.out.println("Your a Young Babuuu...!");
        }
        else if(age >=0){
            System.out.println("your a child Bacchhaa...!");
        }
        else{
            System.out.println("Maa ki Koka se to aaaa....!");
        }

        // isStudent

        if(isStudent){
            System.out.println("Meahnata kr bhai ");
        }
        else{
            System.out.println("Tu Enjoy kr ");
        }
    }
}
