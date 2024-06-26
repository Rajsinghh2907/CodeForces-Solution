package ZZ_CODEFORCES;
import java.util.*;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for(int i = 0; i<t; i++){

            int sum = 0;
            int c = 0;

            int n = sc.nextInt();

            int a = (n % 10) - 1;

            sum += a * 10;

            while(n > 0){
                n = n/10;
                c++;

            }

            if(c == 1){
                sum += 1;
            } else if(c == 2){
                sum += 3;
            } else if(c == 3){
                sum += 6;
            } else if(c == 4){
                sum += 10;
            }
            System.out.println(sum);
        }


        sc.close();
    }
}
