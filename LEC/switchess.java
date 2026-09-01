import java.util.Scanner;
public class switchess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Day of the Week: ");
        String day = input.nextLine();

        // switch (day) {
        //     case "Monday":
        //         System.out.println("It's Working Day");
        //         break;
        //     case "Tuesday":
        //         System.out.println("It's Working Day");
        //         break;
        //     case "Wednesday":
        //         System.out.println("It's Working Day");
        //         break;
        //     case "Thursday":
        //         System.out.println("It's Working Day");
        //         break;
        //     case "Friday":
        //         System.out.println("It's Working Day");
        //         break;
        //     case "Saturday":
        //         System.out.println("It's Enjoy weekend");
        //         break;
        //     case "Sunday":
        //         System.out.println("It's weekend");
        //         break;
        //     default:
        //         System.out.println("Invalid Day");
        // }

        switch(day){
            case "Monday" -> System.out.println("It's Working Day");
            case "Tuesday" -> System.out.println("It's Working Day");
            case "Wednesday" -> System.out.println("It's Working Day");
            case "Thursday" -> System.out.println("It's Working Day");
            case "Friday" -> System.out.println("It's Working Day");
            case "Saturday" -> System.out.println("It's Enjoy weekend");
            case "Sunday" -> System.out.println("It's weekend");
            default -> System.out.println("Invalid Day");
        }
    }
}