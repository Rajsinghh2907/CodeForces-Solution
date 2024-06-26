package ZZ_CODEFORCES;
import java.util.*;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        int count = 0;

        for(int j = 1; j<n; j++){
            if(arr[j] > max){
                count++;
                max = arr[j];
            } else if(arr[j] < min){
                count++;
                min = arr[j];
            }
        }
        System.out.println(count);
        sc.close();
    }
}
