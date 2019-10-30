import java.io.*;

public class Silmukka{
	public static void main(String[] args) {

        int i;
        int d;
        String output = "Anna kokonaisluku:";

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print(output);

            i = Integer.parseInt(in.readLine());

            for (d = 1; d <= i; d++) {

                System.out.println(d);

            }

        } catch (Exception e) {
            System.out.println("Antamasi syöte oli virheellinen...");
        }
    }
}