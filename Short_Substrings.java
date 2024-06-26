package ZZ_CODEFORCES;
import java.util.*;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String b = scanner.nextLine();
            String a = reconstructStringA(b);
            System.out.println(a);
        }

        scanner.close();
    
    }

    private static String reconstructStringA(String b) {
       
        StringBuilder a = new StringBuilder();

       
        a.append(b.charAt(0));

        
        for (int i = 1; i < b.length() - 1; i += 2) {
            a.append(b.charAt(i));
        }

        
        a.append(b.charAt(b.length() - 1));

        return a.toString();
    }
}
