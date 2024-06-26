package ZZ_CODEFORCES;
import java.util.HashMap;
import java.util.Scanner;

public class Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character

        // Map to store the number of faces for each polyhedron type
        HashMap<String, Integer> facesMap = new HashMap<>();
        facesMap.put("Tetrahedron", 4);
        facesMap.put("Cube", 6);
        facesMap.put("Octahedron", 8);
        facesMap.put("Dodecahedron", 12);
        facesMap.put("Icosahedron", 20);

        int totalFaces = 0;

        for (int i = 0; i < n; i++) {
            String polyhedron = sc.nextLine();
            totalFaces += facesMap.get(polyhedron);
        }

        System.out.println(totalFaces);

        sc.close();
    }
}
