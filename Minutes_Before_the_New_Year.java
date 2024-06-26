package ZZ_CODEFORCES;
import java.util.*;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 1; i<=t; i++){

            int h = sc.nextInt();
            int m = sc.nextInt();

            int sum = (( 24 - (h+1)) * 60 ) + (60 - m);

            System.out.println(sum);
        }
        sc.close();
    }
}
