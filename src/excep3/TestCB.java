package excep3;

public class TestCB {

	public static void main(String[] args) {
		CompteBancaire monCompte = new CompteBancaire();
		
		monCompte.solde = 2500;
		System.out.println("solde = " + monCompte.solde);
		
		try {
			monCompte.créditer(100);
			monCompte.débiter(2000);
			monCompte.créditer(-5);
			
		}
		catch (IllegalArgumentException iae) {
			System.err.println(iae.getMessage());
		}
		catch (DécouvertException dec) {
			System.err.println(dec.getMessage() + " car le solde est " + dec.compte.solde);
		}
		
		System.out.println("solde = " + monCompte.solde);
	}
}
