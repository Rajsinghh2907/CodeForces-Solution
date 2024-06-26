package ZZ_CODEFORCES;
import java.util.*;

public class Vanya_and_Fence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int arr[] = new int[n];
        int count = 0;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] <= h){
                count++;
            } else if(arr[i] > h){
                count = count + 2;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
