package ZZ_CODEFORCES;
import java.util.*;

public class Hit_The_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = 5;
        int c = 10;
        int d = 20;
        int e = 100;

        int count = 0;

        while(n > 0){
            if(n >= e){
                n -= e;
                count++;
            } else if(n >=d){
                n -=d;
                count++;
            }else if(n >=c){
                n -=c;
                count++;
            }else if(n >=b){
                n -=b;
                count++;
            }else if(n >=a){
                n -=a;
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
