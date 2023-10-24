package personnages;

public class Humain {
	private String nom;
	private String boissonpref;
	private int qargent;
	
	
	public Humain(String nom, String boissonpref, int qargent) {
		this.nom = nom;
		this.boissonpref = boissonpref;
		this.qargent = qargent;
	}
	
	
	
	
	public String getNom() {
		return nom;
	}
	
	public int getQargent() {
		return qargent;
	}
	
	
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle "+ nom +" et j'aime boire du "+boissonpref +"."); 
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonpref+" !Gloups");
	}
	
	public void acheter(String bien, int prix) {
		if(qargent >=prix) {
		qargent-=prix;
		parler("J'ai "+qargent+" en poche je vais pouvoir m'acheter un "+bien);
	}else {
		parler("Je n'ai plus que "+qargent+"je ne peux meme pas m'offrir un "+ bien+" de "+ prix+".");
	}
	}
	
	public void gagnerArgent(int gain) {
		qargent+=gain;
	}	
	
	public void perdreArgent(int perte) {
		qargent-=perte;
	}
	
	
	}
	
	







