package najmanji_najveci_clan_u_nizu;
import java.util.Scanner;

public class Najmanji_najveci_clan_u_nizu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] niz = new double[10];

        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite idući broj: ");
            niz[i] = s.nextDouble();
        }

        double najmanji = Double.MAX_VALUE;
        double najveci = Double.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < najmanji) {
                najmanji = niz[i];
            }
            if (niz[i] > najveci) {
                najveci = niz[i];
            }
        }

        System.out.println("Najmanja vrijednost u nizu je: " + najmanji);
        System.out.println("Najveća vrijednost u nizu je: " + najveci);
    }
}
