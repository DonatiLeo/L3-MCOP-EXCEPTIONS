package excep3;

public class DécouvertException extends RuntimeException {
	CompteBancaire compte; 
	
	DécouvertException(CompteBancaire c) {
		super("Découvert non autorisé sur "+c);
		this.compte = c;
	}
}
