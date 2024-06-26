package ZZ_CODEFORCES;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            
            // Sort the array
            Arrays.sort(array);
            
            // Check for adjacent differences greater than one
            boolean canReduce = true;
            for (int j = 1; j < n; j++) {
                if (array[j] - array[j - 1] > 1) {
                    canReduce = false;
                    break;
                }
            }
            
            if (canReduce) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
