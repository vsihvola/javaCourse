import java.io.*;

public class Hypotenuusa{
	public static void main(String[] args) {
		int firstInput;
		int firstInputPotency;
		int secondInput;
		int secondInputPotency;
		double third;
		double length;
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Anna ensimmäinen kateetti: ");
			firstInput = Integer.parseInt(in.readLine());
			
			System.out.print("Anna toinen kateetti: ");
			secondInput = Integer.parseInt(in.readLine());
			
			firstInputPotency = firstInput * firstInput;
			secondInputPotency = secondInput * secondInput;
			
			third = firstInputPotency + secondInputPotency;
			
			
			length = Math.sqrt(third);
			System.out.println("Hypotenuusan pituus: "+ length);
				
		} catch (Exception e) {
			System.out.println("Ups.. what happened?");
		}
	}
}
