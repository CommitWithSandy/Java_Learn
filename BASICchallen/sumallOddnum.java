import java.util.Scanner;

public class sumallOddnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumOdd(num);
        System.out.println(sum);
    }
    public static int sumOdd(int num) {
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
