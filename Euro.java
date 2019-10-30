import java.io.*;

public class Euro{
	public static void main(String[] args) {
		int Markka;
		double kerroin = 5.94573;
		double markatEuroina;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("Syötä jokin markkamäärä: ");
			Markka = Integer.parseInt(in.readLine());
			
			
			markatEuroina = Markka / kerroin;
			System.out.println("Markat euroina: " + markatEuroina);
			
		} catch (Exception e) {
			System.out.println("Vain kokonaislukuja..");
		}
	}
}
