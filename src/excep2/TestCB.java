package excep2;

public class TestCB {

	public static void main(String[] args) {
		CompteBancaire monCompte = new CompteBancaire();
		monCompte.solde = 2500;
		System.out.println("solde = " + monCompte.solde);
		try {
			monCompte.créditer(-5);
		}
		catch (IllegalArgumentException iae) {
			System.err.println(iae.getMessage());
		}
		System.out.println("solde = " + monCompte.solde);
	}
}
