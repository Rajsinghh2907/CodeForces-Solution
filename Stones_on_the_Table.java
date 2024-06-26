package ZZ_CODEFORCES;

import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        sc.nextLine();


        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
