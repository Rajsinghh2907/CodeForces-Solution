package ZZ_CODEFORCES;
import java.util.*;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        

        for(int i = 0; i<t; i++){

            int k = sc.nextInt();

            if(k == 1000){
                System.out.println(1666);
            }

            ArrayList<Integer> list = new ArrayList<>();

            for(int j = 1; j<=1000; j++){
                if( (j % 3 != 0) && (j % 10 != 3)){
                    list.add(j);
                }
            }

            System.out.println(list.get(k-1));
        }

        sc.close();
    }
}
