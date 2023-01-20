package excep4;

public class TestCB {

	public static void main(String[] args)  {
		CompteBancaire monCompte = new CompteBancaire();
		
		monCompte.solde = 2500;
		System.out.println("solde = " + monCompte.solde);
		
		try {
			monCompte.créditer(100);
			monCompte.débiter(3000);
			monCompte.créditer(5);
			
		}
		catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		catch (DécouvertException dec) {
			System.out.println(dec.getMessage() + " car le solde est " + dec.compte.solde);
		}
		
		System.out.println("solde = " + monCompte.solde);
	}
}
