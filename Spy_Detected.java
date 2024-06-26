package ZZ_CODEFORCES;
import java.util.*;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){

            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }



            int commonValue;

            if (arr[0] == arr[1] || arr[0] == arr[2]) {
                commonValue = arr[0];
            } else if (arr[1] == arr[2]) {
                commonValue = arr[1];
            } else {
                System.out.println(1); 
                continue;
            }


            for(int k = 0; k<n; k++){
               if (arr[k] != commonValue) {
                    System.out.println(k + 1); 
                    break;
                }
            }

        }

        sc.close();
    }
}
