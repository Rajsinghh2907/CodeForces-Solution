package ZZ_CODEFORCES;
import java.util.*;

public class Ultra_Fast_Mathem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the two binary numbers as strings
        String n1 = sc.next();
        String n2 = sc.next();
        
        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Loop through each digit of the numbers
        for (int i = 0; i < n1.length(); i++) {
            // If the digits are different, append '1', else append '0'
            if (n1.charAt(i) != n2.charAt(i)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        // Print the resulting binary number
        System.out.println(result.toString());
        

        sc.close();
    }
}
