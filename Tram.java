package ZZ_CODEFORCES;
import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int currentPassengers = 0;
        int maxPassengers = 0;
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            currentPassengers -= a;
            currentPassengers += b;
            
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }
        
        scanner.close();
        System.out.println(maxPassengers);
    }
}
