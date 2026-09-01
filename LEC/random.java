

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        float number1;
        double number2;
        boolean isCoin;

        number = random.nextInt(1, 7);
        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        isCoin= random.nextBoolean();

        // System.out.println(number);
        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(isHead);
        if(isCoin){
            System.out.println("Head");
        }
        else{
            System.out.println("Tails");
        }

    }
}
