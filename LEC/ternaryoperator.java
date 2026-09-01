
public class ternaryoperator {
    public static void main(String[] args) {
        
        // Ternary Operator = Return 1 and 2 values if condition was true or false

        // variable = (condition) ? expressionTrue : expressionFalse

        int age = 23;
        String driveOrNotDrive = (age >=20) ? "Drive a Car" : "Not Drive a Car";
        System.out.println(driveOrNotDrive);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfday = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfday);

        int income = 10000;
        String tax = (income > 50000) ? "Pay Tax" : "Don't Pay Tax";
        System.out.println(tax);
    }
}
