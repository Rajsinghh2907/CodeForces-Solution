package ZZ_CODEFORCES;
import java.util.*;

public class A_Boy_OR_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str = sc.nextLine();

        HashSet<Character> hm = new HashSet<>();


        for(char ch : str.toCharArray()){
            hm.add(ch);
        }

        int size = hm.size();

        if(size % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else{
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
