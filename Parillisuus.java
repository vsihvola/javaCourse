import java.io.*;

public class Parillisuus{

	public static void main(String[] args) {
		int firstInput;
                int jakoInput = 2;
                int jakojaannos;
		
		
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Anna kokonaisluku: ");
			firstInput = Integer.parseInt(in.readLine());
                        
                        jakojaannos = firstInput % jakoInput;
                        
                        if (jakojaannos == 0){
                            System.out.println("Luku "+ firstInput + " on parillinen.");
                        }
                        else{
                            System.out.println("Luku "+ firstInput + " on pariton.");
                        }
			
			
				
		} catch (Exception e) {
			System.out.println("Ups.. what happened?");
		}
	}
 }
