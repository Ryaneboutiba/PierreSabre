package personnages;

public class Humain {
	private String nom;
	private String boissonpref;
	private int qargent;
	protected int nbConnaissance=0;
	protected Humain[] memoire ;
	
	
	public Humain(String nom, String boissonpref, int qargent) {
		this.nom = nom;
		this.boissonpref = boissonpref;
		this.qargent = qargent;
		memoire=new Humain[3];
		
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		
	}
	
	
	public void memoriser(Humain humain) {
		if (nbConnaissance<memoire.length){
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}else {
			for(int i=1;i<nbConnaissance;i++) {
				memoire[i-1]=memoire[i];		
			}
			memoire[nbConnaissance-1]=humain;
		}
	}
	
	public void listeConnaissance() {
		if (nbConnaissance==0) {
			System.out.println("Je ne connais personne!");
		}
		StringBuilder texte = new StringBuilder("Je connais beaucoups de monde dont : ");
		for(int i=0;i<nbConnaissance;i++) {
			if (nbConnaissance>0) {
				texte.append(memoire[i].getNom()+" ");
			}
		}
		System.out.println(texte);
	}
	
	
	public void repondre(Humain homme1) {
		direBonjour();
		memoriser(homme1);
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
	
	







