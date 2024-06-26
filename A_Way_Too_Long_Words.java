package ZZ_CODEFORCES;
import java.util.*;

public class A_Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++){
            String str = sc.nextLine();

            if(str.length() > 10){
                String ans = str.charAt(0) + String.valueOf(str.length() - 2) + str.charAt(str.length() - 1);
                System.out.println(ans);
            } else{
                System.out.println(str);
            }
        }

        sc.close();

    }
}
