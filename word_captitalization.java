package ZZ_CODEFORCES;
import java.util.*;

public class word_captitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String capitalizedWord = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.println(capitalizedWord);

            sc.close();
    }
}
