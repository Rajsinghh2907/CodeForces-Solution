package ZZ_CODEFORCES;
import java.util.*;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = findGreatest(a, b, c);
        int smallest = findSmallest(a, b, c);

        // System.out.println("Greatest: " + greatest);
        // System.out.println("Smallest: " + smallest);

        System.out.println(greatest - smallest);

        sc.close();
    }


    public static int findGreatest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int findSmallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
    
