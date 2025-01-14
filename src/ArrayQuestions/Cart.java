package ArrayQuestions;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the arrays
        int n = sc.nextInt();

        // Input the price array
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        // Input the quantity array
        int[] quantity = new int[n];
        for (int i = 0; i < n; i++) {
            quantity[i] = sc.nextInt();
        }

        // Calculate the cart total
        int cartTotal = 0;
        for (int i = 0; i < n; i++) {
            cartTotal += price[i] * quantity[i];
        }

        // Output the result
        System.out.println(cartTotal);

        sc.close();
    }
}