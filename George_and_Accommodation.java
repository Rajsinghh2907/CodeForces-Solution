package ZZ_CODEFORCES;
import java.util.*;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rooms = sc.nextInt();
        int count = 0;

        for(int i = 1; i<=rooms; i++){
            int people = sc.nextInt();
            int capacity = sc.nextInt();

            if( (capacity - people) > 1 ){
                count++;
            }
        }
        System.out.println(count);
        
        sc.close();
    }
}
