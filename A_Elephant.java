package ZZ_CODEFORCES;
  

import java.util.Scanner;

public class A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.close();

        // Calculate the number of full steps of 5
        int steps = x / 5;

        // If there is a remainder, add one more step
        if (x % 5 != 0) {
            steps++;
        }

        System.out.println(steps);

    }
}
