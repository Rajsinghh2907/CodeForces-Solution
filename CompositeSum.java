package ZZ_CODEFORCES;
import java.util.Scanner;

public class CompositeSum {

    // Method to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 3) {
            return false;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return true;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to find two composite numbers that sum up to n
    public static int[] findCompositePair(int n) {
        // Iterate over possible values for the first composite number
        for (int x = 4; x < n; x++) {
            if (isComposite(x)) {
                int y = n - x;
                if (isComposite(y)) {
                    return new int[]{x, y};
                }
            }
        }
        return null;  // Should never happen for the given constraints
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Find and print the pair of composite numbers
        int[] result = findCompositePair(n);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}

