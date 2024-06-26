package ZZ_CODEFORCES;
import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++){
            String str = sc.nextLine();

            if (str.length() != 6) {
                System.out.println("NO");
                continue;
            }

            int num = Integer.parseInt(str);

            // Extract and sum the digits
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < 6; j++) {
                int digit = num % 10;
                num /= 10;

                if (j < 3) {
                    sum2 += digit;
                } else {
                    sum1 += digit;
                }
            }

            // Compare the sums and print the result
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
