import java.io.*;

public class Kertoma{
	 public static void main(String[] args) {

        String kokonaisLuku = "Anna kokonaisluku:";
        int luku;
        int d;
        int factorial = 1;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print(kokonaisLuku);
            luku = Integer.parseInt(in.readLine());

            for (d = 1; luku >= d; d++) {
                factorial = factorial * d;

                
            }
            System.out.println("Luvun "+ luku +" kertoma on "+factorial);

        } catch (Exception e) {
            System.out.println("Antamasi syöte oli virheellinen...");
        }
    }
}