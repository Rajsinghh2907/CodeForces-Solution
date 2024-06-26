package ZZ_CODEFORCES;
import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String str2 = str.toLowerCase();

        HashSet<Character> set = new HashSet<Character>(); 

        for(int i = 0; i<n; i++){

            char ch = str2.charAt(i);
            set.add(ch);
        }

        if(set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
