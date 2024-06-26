package ZZ_CODEFORCES;
import java.util.*;

class a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mishkaWins = 0;
        int chrisWins = 0;

        for(int i = 0; i < n; i++){
            int mishka = sc.nextInt();
            int chris = sc.nextInt();

            if(mishka > chris){
                mishkaWins++;
            } else if(chris > mishka){
                chrisWins++;
            }
        }

        if(mishkaWins > chrisWins){
            System.out.println("Mishka");
        } else if(chrisWins > mishkaWins){
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}