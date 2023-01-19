package excep3;

public class CompteBancaire {

	int solde = 0;
	
	void créditer(int somme) {
		if (somme < 0)
			throw new IllegalArgumentException("somme négative");
		solde += somme;
	}
	
	void débiter(int somme) {
		if (somme > solde)
			throw new DécouvertException(this);
		solde -= somme;
	}
}
