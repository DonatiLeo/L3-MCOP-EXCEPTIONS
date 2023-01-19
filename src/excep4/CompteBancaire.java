package excep4;

public class CompteBancaire {

	int solde = 0;
	
	void créditer(int somme) {
		if (somme < 0)
			throw new IllegalArgumentException("somme négative");
		solde += somme;
	}
	
	void débiter(int somme) throws DécouvertException {
		if (somme > solde)
			throw new DécouvertException(this);
		solde -= somme;
	}
}
