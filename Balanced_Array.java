package ZZ_CODEFORCES;
import java.util.*;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){

            int n = sc.nextInt();

            if(n %4 != 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");

                int arr[] = new int[n];

                int sumFirstHalf = 0, sumSecondHalf = 0;

                // Fill the first half with even numbers
                for (int j = 0; j < n / 2; j++) {
                    arr[j] = 2 * (j + 1);
                    sumFirstHalf += arr[j];
                }

                // Fill the second half with odd numbers
                for (int k = 0; k < n / 2 - 1; k++) {
                    arr[n / 2 + k] = 2 * k + 1;
                    sumSecondHalf += arr[n / 2 + k];
                }
                arr[n-1] = sumFirstHalf - sumSecondHalf; // It is for balance the sum condition

                for (int a = 0; a < n; a++) {
                    System.out.print(arr[a] + " ");
                }
                System.out.println();

            }
        }
        sc.close();
    }
}
