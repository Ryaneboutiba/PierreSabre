package personnages;

public class Samourai extends Ronin{
	private String seigneur;

	public Samourai( String seigneur,String nom, String boissonpref, int qargent) {
		super(nom, boissonpref, qargent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon seigneur est "+ seigneur);
		
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+boisson);
	}
}
