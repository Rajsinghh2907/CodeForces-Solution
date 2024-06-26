package ZZ_CODEFORCES;
import java.util.*;

public class Panoramix_Prediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        
            if (nextPrime(n) == m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        sc.close();
    }

    public static int nextPrime(int x) {
        int num = x + 1;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
