// Write a function that takes in age as input and returns 
// if that person is eligible to vote or not. A person of age > 18 is eligible to vote

import java.util.Scanner;

public class eligibleVote {
    public static String eligibleVoting(int age){
        if (age>18) {
            return "Eligible to Vote";
        }
        else{
            return "Not eligible to Vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String voting = eligibleVoting(age);
        System.out.println(voting); 

    }
}
