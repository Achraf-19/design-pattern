package metier;

public class CompteBancaire {
	private int numero;
	private double solde;

	public CompteBancaire(int numero) {
		this.numero = numero;
		this.solde = 0.0;
	}

	public void deposerArgent(double depot){ 
		if ( depot >0.0){ 
			solde+=depot;
			Journalisation.getInstance().ajouterLog("D�p�t de "+depot+" DH sur le compte "+numero+".");
		}
		else {
			Journalisation.getInstance().ajouterLog("D�p�t d'une valeur n�gative impossible("+numero+").");
		}
	}
	public void retirerArgent(double retrait) {
		if (retrait > 0.0) {
			if (solde >= retrait) {
				solde -= retrait;
				Journalisation.getInstance().ajouterLog("Retrait de " + retrait + " DH sur le compte " + numero + ".");
			} else {
				Journalisation.getInstance().ajouterLog("/!\\ La banque n'autorise pas de d�couvert (" + numero + ").");
			}
		} else {
			Journalisation.getInstance().ajouterLog("/!\\ Rerait d'une valeur n�gative impossible (" + numero + ").");
		}
	}
}