    // Write a program to enter the numbers till the user wants and at 
    // the end it should display the count of positive, negative and zeros entered. 

    import java.util.Scanner;

    public class countposinegizero {
        public static void countPosiNegiZero(Scanner sc){
            int positive = 0;
            int negative = 0;
            int zero = 0;
            String response ;
            do {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zero++;
            }
                System.out.println("Do you want to continue? Y/N");
                response = sc.next();
            } while (response.equals("y"));
            
            System.out.println("Positive :" +positive);
            System.out.println("Negitive :" +negative);
            System.out.println("Zero :" +zero);

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            countPosiNegiZero(sc);
        }
    }
