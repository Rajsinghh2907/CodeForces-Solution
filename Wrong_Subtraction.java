package ZZ_CODEFORCES;
import java.util.*;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int n = sc.nextInt();

        int k = sc.nextInt();

        while(k > 0){
            int ld = n % 10;

            if(ld != 0){
                n = n-1;
            } else if(ld == 0){
                n = n/10;
            }
            k--;
        }

        System.out.println(n);

        sc.close();
    }
}
