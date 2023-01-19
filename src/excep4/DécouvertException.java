package excep4;

public class DécouvertException extends Exception {
	CompteBancaire compte; 
	
	DécouvertException(CompteBancaire c) {
		super("Découvert non autorisé sur "+c);
		this.compte = c;
	}
}
