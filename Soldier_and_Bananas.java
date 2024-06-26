package ZZ_CODEFORCES;

import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read input values
        int k = scanner.nextInt();  // Cost of the first banana
        int n = scanner.nextInt();  // Initial amount of money the soldier has
        int w = scanner.nextInt();  // Number of bananas the soldier wants to buy
 
        // Calculate the total cost
        int totalCost = k * w * (w + 1) / 2;
 
        // Calculate the amount of money to borrow
        int borrow = totalCost - n;
 
        // If the soldier doesn't need to borrow money, the result should be 0
        if (borrow <= 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }
 
        scanner.close();
    }
}
