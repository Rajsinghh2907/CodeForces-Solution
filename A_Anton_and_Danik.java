package ZZ_CODEFORCES;
import java.util.*;

public class A_Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int A = 0, D = 0;

        for(int i = 0; i<n; i++){
            if(str.charAt(i) == 'A'){
                A++;
            } else if(str.charAt(i) == 'D'){
                D++;
            }
        }

        if(A > D){
            System.out.println("Anton");
        } else if(D > A){
            System.out.println("Danik");
        } else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}
