/*
Information about the "Ajoneuvo" task. In task I had to make program including a class. In assigment
only information what was given was what the program have to print in what order.
*/

class Auto extends Ajoneuvo {

    boolean kaynnissa;

    String merkki, malli, rekisteri_nro;

    public Auto(int paino, int huippunopeus, int ajetut_kilometrit, String merkki, String malli, String rekisteri_nro, boolean kaynnissa) {
        super(paino, huippunopeus, ajetut_kilometrit);
        this.merkki = merkki;
        this.malli = malli;
        this.rekisteri_nro = rekisteri_nro;

    }

    public void kaynnista() {
        kaynnissa = true;

    }

    public void asetaPaino(int uusi_paino) {

    }

    public void sammuta(boolean kaynnissa) {
        kaynnissa = false;
    }

    public void katsasta() {
        if (kaynnissa == true) {
            System.out.println("Auton tiedot:" + "\nMerkki: " + this.merkki + "\nMalli: " + this.malli + "\nAjokilometrit: "
                    + super.anna_ajetut_kilometrit() + "\nPaino (kg): " + super.anna_paino() + "\nHuippunopeus (km/h): " + super.anna_huippunopeus()
                    + "\nRekisterinumero: " + rekisteri_nro + "\nAuto on käynnissä");

        } else {
            System.out.println("Auton tiedot:" + "\nMerkki: " + this.merkki + "\nMalli: " + this.malli + "\nAjokilometrit: "
                    + super.anna_ajetut_kilometrit() + "\nPaino (kg): " + super.anna_paino() + "\nHuippunopeus (km/h): " + super.anna_huippunopeus()
                    + "\nRekisterinumero: " + rekisteri_nro + "\nAuto ei ole käynnissä");
        }
    }

}

/*--------------------------*/

package ajoneuvo;

import java.io.*;

class Ajoneuvo
{
   private int paino;
   private int huippunopeus;
   private int ajetut_kilometrit;

   Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit)
   {
      this.paino = paino;
      this.huippunopeus = huippunopeus;
      this.ajetut_kilometrit = ajetut_kilometrit;
   }

   protected void aja(int ajettava_matka)
   {
      this.ajetut_kilometrit += ajettava_matka;
   }

   protected int anna_paino()
   {
      return this.paino;
   }

   protected int anna_huippunopeus()
   {
      return this.huippunopeus;
   }

   protected int anna_ajetut_kilometrit()
   {
      return this.ajetut_kilometrit;
   }
} 
