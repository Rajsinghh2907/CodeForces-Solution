package ZZ_CODEFORCES;
import java.util.*;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++){

            String s = sc.nextLine();

            if( (s.equals( "abc")) || (s.equals( "acb")) || (s.equals( "bac")) || (s.equals( "cba")) ){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
