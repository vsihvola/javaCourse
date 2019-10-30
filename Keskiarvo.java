import java.io.*;

public class Keskiarvo {

    
    public static void main(String[] args) {

        String arvoTeksti = "Anna arvosana (4-10):";
        int arvosana;
        int minimi = 0;
        int min = 4;
        int maximi = 10;
        int amount = 0;
        double totalNumbers = 0;
        double keskiArvo;
        System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.\nLopetus negatiivisella kokonaisluvulla.");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print(arvoTeksti);
            arvosana = Integer.parseInt(in.readLine());

            while (arvosana >= minimi) {
                    
                if (arvosana <= maximi && arvosana >= min) {
                    amount++;
                    totalNumbers = arvosana + totalNumbers;
                    System.out.print(arvoTeksti);
                    arvosana = Integer.parseInt(in.readLine());
                    
                } else {
                    System.out.print(arvoTeksti);
                    arvosana = Integer.parseInt(in.readLine());
                }
                

            }
            keskiArvo = totalNumbers / amount;
            System.out.print("Ohjelmaan syötetty " + amount + " arvosanaa.\nArvosanojen keskiarvo:" + keskiArvo);
        } catch (Exception e) {
            System.out.println("Antamasi syöte oli virheellinen...");
        }
    }
}
