package ZZ_CODEFORCES;
import java.util.*;
public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int timeLeft = 240 - k;
        int count = 0;

        for(int i = 5; i<=timeLeft; i = i +5){

            timeLeft = timeLeft - i;
            count++;
        }
        System.out.println(Math.min(n, count));

        sc.close();
    }
}
