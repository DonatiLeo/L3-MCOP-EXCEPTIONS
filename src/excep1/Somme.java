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
		int somme = 0;
		for(String arg : args) {
			try {
				somme += Integer.parseInt(arg);
	
			} catch (NumberFormatException nfe) {
				System.err.println(nfe.getMessage() + " n'est pas un nombre ! Donc ignoré dans la somme.");
			}
		}
		
		System.out.println("Le résultat de la somme est " + somme);
		
	}
}
