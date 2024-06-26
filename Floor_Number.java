package ZZ_CODEFORCES;
import java.util.*;

public class Floor_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for(int i = 0; i<t; i++){

            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else {
                
                n -= 2;
                int floor = (n + x - 1) / x; 
                System.out.println(floor + 1);
            }
        }

        sc.close();
    }
}
