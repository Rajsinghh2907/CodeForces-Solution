package ZZ_CODEFORCES;
import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        // for(int i = 0; i<t; i++){

        //     int arr[] = new int[4];
        //     int count = 0;

        //     arr[0] = sc.nextInt();
        //     arr[1] = sc.nextInt();
        //     arr[2] = sc.nextInt();
        //     arr[3] = sc.nextInt();

        //     for(int a = 1; a<4; a++){
        //         int x = arr[0];
        //         if(x < arr[a]){
        //             count++;
        //         }
        //     }

        //     System.out.println(count);
        // }

        for(int i = 0; i<t; i++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int count = 0;

            if(a < b){
                count++;
            }
            if(a < c){
                count++;
            }
            if(a < d){
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
