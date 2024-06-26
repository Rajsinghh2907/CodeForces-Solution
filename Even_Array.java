package ZZ_CODEFORCES;
import java.util.*;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){

            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int j = 0; j<n; j++){

                arr[j] = sc.nextInt();
            }

            int evenidx = 0;
            int oddidx = 0;

            for(int k = 0; k<n; k++){
               
                if( (k % 2 == 0) && (arr[k] % 2 != 0) ) {
                    evenidx++;
                } else if( (k % 2 != 0) && (arr[k] % 2 == 0)){
                    oddidx++;
                }
            }

            if(evenidx == oddidx){
                System.out.println(evenidx);
            } else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
