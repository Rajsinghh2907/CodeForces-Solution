package ZZ_CODEFORCES;
import java.util.*;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = 0;

        if(n % 2 ==0){
            sum = n /2;
        } else{
            sum = -(n+1)/2; 
        }
        System.out.println(sum);

        sc.close();
    }
}
