package ZZ_CODEFORCES;
import java.util.*;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++){
            String s = sc.nextLine();

            String str = s.toLowerCase();

            if(str.equals("yes")){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
