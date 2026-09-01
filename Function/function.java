import java.util.Scanner;

public class function {
    // ---------------------Example 1
    // function name printName 
    // public static void printName(String name){
    //     System.out.println("Hello " + name);
    //     return;
    // }
    //     public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printName(name);// calling function
    // }


    // ----------------------Example 2
    // Sum of 2 numbers
    // public static int sumNum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = sumNum(a, b);
        // System.out.println("Sum of 2 Numbers :" + sum);
    // }


    //----------------------------New Approcah
    // Multiplication
    // public static int multiNum(int a, int b){
    //     return a * b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Multiplication of 2 Numbers :" + multiNum(a, b));
    // }
// }


    //----------------------------Find Factorial Number
    public static void printFact(int n){
        // loop
        int Factorial = 1;
        for (int i = n; i >=1; i--) {
            Factorial = Factorial * i;
        }
        System.out.println("Factorial of " +n+ " :"     +Factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFact(n);
    }
}