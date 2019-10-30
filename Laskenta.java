import java.io.*;

public class Laskenta{
	public static void main(String[] args)
  {
    int toimitusInput;
    int secondInput;
    int firstInput;
    int summa;
    double jakojaannos;
    
    String laskuToimitukset = "Käytössäsi on seuraavat laskutoimitukset:\n1: Vähennyslasku\n2: Yhteenlasku\n3: Kertolasku\n4: Osamäärä\n5: Jakojäännös";
    String valitseLasku = "Valitse laskutoimitus:";
    
      
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
        System.out.println(laskuToimitukset);
        System.out.println(valitseLasku);
        toimitusInput = Integer.parseInt(in.readLine());
        System.out.println("Anna eka luku: ");
        firstInput = Integer.parseInt(in.readLine());
        System.out.println("Anna toka luku: ");
        secondInput = Integer.parseInt(in.readLine());
        
        switch(toimitusInput){
            case 1:
                summa = firstInput - secondInput;
                System.out.println(firstInput+" - "+ secondInput +" = "+ summa);
                break;
            case 2:
                summa = firstInput + secondInput;
                System.out.println(firstInput+" + "+ secondInput+" = "+ summa);
                break;
            case 3:
                summa = firstInput * secondInput;
                System.out.println(firstInput+" * "+secondInput+" = "+ summa);
                break;
            case 4:
                summa = firstInput / secondInput;
                System.out.println(firstInput +" / "+secondInput+" = "+summa);
                break;
            case 5:
                summa = firstInput % secondInput;
                System.out.println(firstInput +" % "+secondInput+" = "+summa);
                break;
            default:
                System.out.println("Virhe");
                break;
                
        }
        
    }
      
     
    catch(Exception e) {
      System.out.println("Antamasi syöte oli virheellinen...");
    }
  }
} 