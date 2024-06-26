package ZZ_CODEFORCES;
import java.util.*;

public class Maximum_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){
            
            int n = sc.nextInt();

            System.out.println(n/2);  // Always remember that maximum GCD for a range from 1 to n is always(n/2)
        }

        sc.close();
    }
}
