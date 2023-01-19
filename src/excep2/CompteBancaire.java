package excep2;

public class CompteBancaire {

	int solde = 0;
	void créditer(int somme) {
		if (somme<0)
			throw new IllegalArgumentException("somme négative");
		solde += somme;
	}
}
