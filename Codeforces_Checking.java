package ZZ_CODEFORCES;
import java.util.*;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "codeforces";


        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++){

            char ch = sc.next().charAt(0);

            if (str.indexOf(ch) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
