package ZZ_CODEFORCES;
import java.util.*;


public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder(str2);

        sb.reverse();

        String str3 = sb.toString();

        if(str1.equals(str3)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        sc.close();
    }
}
