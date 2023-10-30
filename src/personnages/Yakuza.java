package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	
	
	public Yakuza(String nom, String boissonpref, int qargent, String clan) {
		super(nom, boissonpref, qargent);
		this.clan= clan;
	}



	public String getClan() {
		return clan;
	}



	public int getReputation() {
		return reputation;
	}

	public void extorquerCommercant(Commercant victime) {
		int argentvoler;
		argentvoler=victime.sefaireExtorquer();
		gagnerArgent(argentvoler);
		reputation+=1;
		parler("J’ai piqué les "+ argentvoler +"  sous de Marco, ce qui me fait " + getQargent() +" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentperdu;
		argentperdu=getQargent();
		parler("J'ai perdu mon duel et mes "+argentperdu+" sous snif... J'ai desonhore l'honneur du clan "+ clan);
		return argentperdu;
	}
	
	public void gagner(int gain) {
		reputation+=1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment pouvoir battre "+ getNom() + " du clan "+ clan+ " ? Je l'ai depouille de ses "+ gain+ " sous");
	}
}
