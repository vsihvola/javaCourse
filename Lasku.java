import java.io.*;

public class Lasku{
	public static void main(String[] args) {
		
		int firstInput;
		int secondInput;
		int summa;
		int erotus;
		int tulo;
		double osamaara;
		int jakojaannos;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("Syötä ensimmäinen kokonaisluku: ");
			firstInput = Integer.parseInt(in.readLine());
			
			System.out.print("Syötä toinen kokonaisluku: ");
			secondInput = Integer.parseInt(in.readLine());
			
			summa = firstInput + secondInput;
			System.out.println(firstInput +" + "+ secondInput +" = "+ summa);
			
			erotus = firstInput - secondInput;
			System.out.println(firstInput +" - "+ secondInput +" = "+ erotus);
			
			tulo = firstInput * secondInput;
			System.out.println(firstInput +" * "+ secondInput +" = "+ tulo);
			
			osamaara = (double)firstInput / (double)secondInput;
			System.out.println(firstInput +" / "+ secondInput +" = "+ osamaara);
			
			
			jakojaannos = firstInput % secondInput;
			System.out.println("Jakojäännös: "+ jakojaannos);
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("You might want try different input..");
		}
	}
}
