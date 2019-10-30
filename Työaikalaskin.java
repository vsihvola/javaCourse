import java.io.*;

public class Tunnit {

    
    public static void main(String[] args) {
        int tyoPaivat;
        float tyoTunnit;
        float kaikki = 0;
        float taulukko[] = new float[30];
		float keskiArvo;
        int k = 0;
        int i;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana "
                    + "\ntehdyt työtunnit sekä keskimääräisen työpäivän pituuden.");
            System.out.print("Kuinka monta päivää:");
            tyoPaivat = Integer.parseInt(in.readLine());

            for (i = 1; i <= tyoPaivat; i++) {
                System.out.print("Anna " + i + ". päivän työtunnit:");
                tyoTunnit = Float.parseFloat(in.readLine());
                taulukko[k] = tyoTunnit;
                kaikki = tyoTunnit + kaikki;
                k++;

            }
            
            keskiArvo = kaikki / tyoPaivat;
			float keskArvo = (float) ((float) Math.round(keskiArvo * 100.0) / 100.0);
			float kaikko = (float) ((float) Math.round(kaikki * 100.0) / 100.0);
            System.out.println("Tehdyt työtunnit yhteensä: " + kaikko);
            System.out.println("Keskimääräinen työpäivän pituus: " + keskArvo);
            System.out.print("Syötetyt tunnit: ");
            for (i = 0; tyoPaivat > i; i++) {
                System.out.print(taulukko[i] + " ");
            }

        } catch (Exception e) {

        }

    }

}