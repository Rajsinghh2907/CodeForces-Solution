package ZZ_CODEFORCES;
import java.util.*;

public class To_My_Critics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a+b >= 10){
                System.out.println("YES");
            } else if (a+c >= 10){
                System.out.println("YES");
            }else if (b+c >= 10){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}