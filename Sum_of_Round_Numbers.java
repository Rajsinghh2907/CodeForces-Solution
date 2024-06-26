package ZZ_CODEFORCES;
import java.util.*;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            
            ArrayList<Integer> list = new ArrayList<>();

            int tenPow = 1;

            while(n > 0){
                int ld = n % 10;

                if(ld != 0){
                    list.add(ld * tenPow);
                }

                n = n/10;
                tenPow = tenPow * 10;
            }

            System.out.println(list.size());

            for(int j = 0; j<list.size(); j++){
                System.out.println(list.get(j));
            }
        }

        sc.close();
    }
}
