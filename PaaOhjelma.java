import java.io.*;

public class PaaOhjelma{

    public static void main(String args[]) {
        Tulostaja olio = new Tulostaja();
        olio.Tulosta();
    }
}

class Tulostaja {

    public void Tulosta() {
        int eka, toka, sum;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Syötä ensimmäinen kokonaisluku: ");
            eka = Integer.parseInt(br.readLine());
            System.out.print("Syötä toinen kokonaisluku: ");
            toka = Integer.parseInt(br.readLine());
            sum = Laskin.Summa(eka, toka);
            System.out.println("Lukujen summa: " + sum);

        } catch (Exception e) {

        }
    }

}

class Laskin {

    static int Summa(int eka, int toka) {
        int summa = eka + toka;
        return summa;
    }
}
