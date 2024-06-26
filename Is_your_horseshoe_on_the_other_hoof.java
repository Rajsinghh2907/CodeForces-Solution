package ZZ_CODEFORCES;
import java.util.*;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];

        for(int i = 0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        Arrays.sort(arr);

        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
