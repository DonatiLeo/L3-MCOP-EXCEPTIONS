package excep5;
import java.io.*;

public class Lecture {

	public static void main(String[] args) throws  IOException {
		try (
			FileReader fr = new FileReader("fic.txt");
			BufferedReader br = new BufferedReader(fr) 
		){
			String ligne = null; 
			do {
				ligne = br.readLine();
				System.out.println(ligne); 
			} while(ligne != null);
		}
		catch (FileNotFoundException fnfe) { 
			System.err.println(fnfe.getMessage());
		}
		System.out.println("ICI TOUT EST NORMAL"); 
	}
}
