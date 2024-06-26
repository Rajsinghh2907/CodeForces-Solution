package ZZ_CODEFORCES;
import java.util.*;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int aPlusBPlusC = nums[3];
        int aPlusB = nums[0];
        int aPlusC = nums[1];
        int bPlusC = nums[2];

        int a = aPlusBPlusC - bPlusC;
        int b = aPlusBPlusC - aPlusC;
        int c = aPlusBPlusC - aPlusB;

        System.out.println(a + " " + b + " " + c);

        sc.close();
    }

    public static int maxii(int n1,int n2,int n3,int n4){
        int max = 0; // Assume the first number is the maximum initially

        if (n1>n2 && n1>n3 && n1>n4) {
            max = n1;
        } else if(n2>n1 && n2>n3 && n2>n4) {
			max = n2;
		} else if(n3>n1 && n3>n2 && n3>n4) {
			max = n3;
		} else {
			max = n4;
		}
        

        return max;

    }
}
