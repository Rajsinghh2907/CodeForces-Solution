package ZZ_CODEFORCES;

import java.util.*;

public class DieRoll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x =(Math.max(a, b));
        
        int y = 7 - x;

        int totalOutcomes = 6;

        int gcd = gcd(y, totalOutcomes);

        int numerator = y / gcd;
        int denominator = totalOutcomes / gcd;

        

        System.out.println( numerator + "/" + denominator);

        

        sc.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}