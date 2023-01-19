/**
 * 
 */
package excep1;

/**
 * @author donati
 *
 */
public class Somme {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int somme = 0;
			
			for(String arg : args)
				somme += Integer.parseInt(arg);
			
			System.out.println(somme);
			
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage() + " n'est pas un nombre !");
		}
	}
}
