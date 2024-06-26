package ZZ_CODEFORCES;
import java.util.*;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

            sum += arr[i];
        }

        if(sum > 0){
            System.out.println("HARD");
        } else{
            System.out.println("EASY");
        }

        sc.close();
    }
}
