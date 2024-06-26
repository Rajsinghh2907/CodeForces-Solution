package ZZ_CODEFORCES;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWantToBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Total number of levels
        int p = sc.nextInt();  // Number of levels Little X can pass

        Set<Integer> levels = new HashSet<>();

        // Read levels Little X can pass
        for (int i = 0; i < p; i++) {
            int level = sc.nextInt();
            levels.add(level);
        }

        int q = sc.nextInt();  // Number of levels Little Y can pass

        // Read levels Little Y can pass
        for (int i = 0; i < q; i++) {
            int level = sc.nextInt();
            levels.add(level);
        }

        // Check if all levels from 1 to n are covered
        boolean allLevelsCovered = true;
        for (int i = 1; i <= n; i++) {
            if (!levels.contains(i)) {
                allLevelsCovered = false;
                break;
            }
        }

        if (allLevelsCovered) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        sc.close();
    }
}
