package ZZ_CODEFORCES;
import java.util.*;

public class Soft_Drinking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np= sc.nextInt();


        int totalmldrink = (k * l)/nl;
        int totallime = (c*d);
        int totalsalt = p/np;


        int minm = minimm(totalmldrink,totallime,totalsalt);

        System.out.println( (minm)/n );
        sc.close();
    }

    public static int minimm(int num1, int num2, int num3){
        int ans = num1;
        
        if (num2 < ans) {
            ans = num2;
        }
        
        if (num3 < ans) {
            ans = num3;
        }

        return ans;
        
       
    }
}