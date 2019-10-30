class Koira
{
  int ika;
  String nimi, rotu, aani;


 public Koira() {
        ika = 0;
        nimi = null;
        rotu = null;
        aani = null;
        
    }

    public Koira(int uusi_ika, String uusi_nimi, String uusi_rotu, String uusi_aani) {
        ika = uusi_ika;
        nimi = uusi_nimi;
        rotu = uusi_rotu;
        aani = uusi_aani;
    }

    public void asetaNimi(String uusi_nimi) {
        nimi = uusi_nimi;
    }

    public void asetaRotu(String uusi_rotu) {
        rotu = uusi_rotu;
    }

    public void asetaIka(int uusi_ika) {
        ika = uusi_ika;
    }
    
    

    public void tulosta_tiedot() {

        System.out.println("Nimi: " + nimi
                + "\nIkä: " + ika
                + "\nRotu: " + rotu);
    }

    public String annaAani() {

        String uusi_aani = aani;
        return uusi_aani;

    }
}

public class KoiranTesti {

    public static void main(String[] args) {
        Koira rekku = new Koira(2, "Rekku", "Dalmatialainen", "Hau!!!");
        System.out.println("Koiran tiedot:");
        rekku.tulosta_tiedot();
        System.out.print("\nKoira sanoo: " + rekku.annaAani());

    }
}