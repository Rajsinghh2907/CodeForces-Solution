package ZZ_CODEFORCES;
import java.util.*;

public class Plus_One_onthe_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i< t; i++){
            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[n-1] - arr[0]);
        }
        sc.close();
    }
}
