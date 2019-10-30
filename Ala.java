import java.io.*;

public class Ala{
	public static void main(String[] args) {
		int ympyra_sade;
		double pii = 3.142;
		double ympyra_ala;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Anna ympyrän säde: ");
			ympyra_sade = Integer.parseInt(in.readLine());
			
			ympyra_ala = ympyra_sade * ympyra_sade * pii;
			System.out.print("Ympyrän ala annetulla säteellä: " + ympyra_ala);
			
		} catch (Exception e) {
			System.out.println(" UPS");
		}
	}
}
