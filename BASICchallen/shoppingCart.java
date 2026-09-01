package BASICchallen;

import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Shopping Cart 

        String item;
        int price;
        int quantity;
        int total;

        System.out.print("Item Name Which you want to buy: ");
        item = input.nextLine();

        System.out.print("Price of " + item + " is Rs.");
        price = input.nextInt();

        System.out.print("How many would You Like: ");
        quantity = input.nextInt();

        total = price * quantity;

        System.out.print("Total amount of "+ item + " with " + quantity + " Quantity is :Rs " + total);
        total = input.nextInt();
    }
}
