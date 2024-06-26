package ZZ_CODEFORCES;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        int result = word1.compareTo(word2);


        if (result < 0){
            System.out.println("-1");
        } else if(result > 0){
            System.out.println("1");
        } else{
            System.out.println("0");
        }

        sc.close();

    }
}
