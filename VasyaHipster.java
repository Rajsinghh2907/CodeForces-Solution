package ZZ_CODEFORCES;
import java.util.Scanner;

public class VasyaHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of red and blue socks
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calculate the maximum number of days wearing different socks
        int differentDays = Math.min(a, b);
        
        // Calculate the remaining socks of each color
        int remainingRed = a - differentDays;
        int remainingBlue = b - differentDays;
        
        // Calculate the number of days wearing the same socks
        int sameDays = (remainingRed + remainingBlue) / 2;
        
        // Print the results
        System.out.println(differentDays + " " + sameDays);
        
        sc.close();
    }
}

