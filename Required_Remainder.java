package ZZ_CODEFORCES;
import java.util.*;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();

        for(int i = 0; i<t; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int maxMultiple = (n - y) / x;
            int ans = maxMultiple * x + y;

            System.out.println(ans);
        }
        sc.close();
    }
}
