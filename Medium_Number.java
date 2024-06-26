package ZZ_CODEFORCES;
import java.util.*;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 1; i<=t; i++){

            int arr[] = new int[3];

            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            Arrays.sort(arr);

            System.out.println(arr[1]);

        }
        sc.close();
    }
}
