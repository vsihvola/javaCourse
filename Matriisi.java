import java.io.*;
import java.util.*;

public class Matriisi
{
  public static void main(String[] args)
  {
    int matriisi[][] = new int[5][5];
    int summa;
    String temp;

    try{
      BufferedReader syote = new BufferedReader(new FileReader("matriisi.txt"));
      for(int x = 0; x < 5; x++){
      temp = syote.readLine();
      StringTokenizer eroitin = new StringTokenizer(temp, "\t");

        for(int y = 0; y < 5; y++){
          matriisi[x][y] = Integer.parseInt(eroitin.nextToken());
        }
      }
      syote.close();

      System.out.print("Matriisi:\n\n");
      tulosta_matriisi(matriisi);
      summa = laske_summa(matriisi);
      System.out.print("\nMatriisin alkioiden summa: " +summa);

    }catch(Exception e){
      System.out.print("Antamasi syöte oli virheellinen..." + e);
    }
  }

	public static void tulosta_matriisi(int matriisi[][]){
         int x;
		 int y;
			for (y=0; y<5; y++){
				
				
				for (x=0; x<5; x++){
					
					if (x==4) {
						System.out.println(matriisi[y][x]);
					} else {
					System.out.print(matriisi[y][x] + "\t");
					}
				
				}
			}
         
         
     }
	
	public static int laske_summa(int[][] matriisi) {
        int col;
        int row;
        int rowSum = 0;
        
        for (row = 0; row < 5; row++) {
            
            for (col = 0; col < 5; col++) {
                rowSum += matriisi[row][col];

            }
            
        }
        return rowSum;

        

    }
