
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String email ;
        String username;
        String domain;
        System.out.print("Enter a Email:");
        email = input.nextLine();

        //.substring(startIndex, endIndex) 

        // username = email.substring(0, email.indexOf('@'));
        // System.out.println(username);

        // domain = email.substring(email.indexOf('@') + 1);
        // System.out.println(domain); 

        // We just use if else condition

        if(email.contains("@gmail.com")){
            username = email.substring(0, email.indexOf('@'));
        System.out.println(username);

        domain = email.substring(email.indexOf('@') + 1);
        System.out.println(domain);
        }
        else{
            System.out.println("Email must be in @gmail.com domain...");
        }
    }
}
