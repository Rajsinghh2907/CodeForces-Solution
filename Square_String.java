package ZZ_CODEFORCES;
import java.util.*;

public class Square_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++){

            String s = sc.nextLine();

            if (isSquare(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean isSquare(String s){
        
        int n = s.length();

        if(n % 2 != 0){
            return false;
        }

        String firstHalf = s.substring(0, n / 2);
        String secondHalf = s.substring(n / 2);

        return firstHalf.equals(secondHalf);
    }
    
}
