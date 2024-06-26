package ZZ_CODEFORCES;
import java.util.*;

public class Insomnia_cure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        HashSet<Integer> set = new HashSet<Integer>(); 

        for(int i = 1; i<=d; i++){
            if( i % k == 0){
                set.add(i);
            } else if(i % l == 0){
                set.add(i);
            }else if(i % m == 0){
                set.add(i);
            }else if(i % n == 0){
                set.add(i);
            }
        }

        System.out.println(set.size());

        sc.close();

    }
}
