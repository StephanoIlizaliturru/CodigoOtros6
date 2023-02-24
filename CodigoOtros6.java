package codigoOtros6;
//importacion del static
import java.util.*;

public class CodigoOtros6 {
//Static void main
    public static void main(String[] args) {
        int[] n = new int[20];
        //Random rand
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            n[i] = rand.nextInt(381) + 20;
            System.out.print(n[i] + " ");
        }
        //declarar variables
        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1-. los múltiplos de 5, 2-. los múltiplos de 7): ");
        Scanner scanner = new Scanner(System.in);
        //Usar Scanner
        int opcion = scanner.nextInt();

        int multiplo = (opcion == 1) ? 5 : 7;

        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }
    }
}
 
