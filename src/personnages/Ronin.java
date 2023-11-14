package personnages;

public class Ronin extends Humain {
	int attHoneur=1;
	
	public Ronin(String nom, String boissonpref, int qargent) {
		super(nom, boissonpref, qargent);
	}
	
	public void donnerArgent(Commercant beneficiare) {
		int argentdonne;
		argentdonne=getQargent()/10;
		perdreArgent(argentdonne);
		parler(beneficiare.getNom()+ " prends ces "+argentdonne+" sous!");
		beneficiare.recevoitArgent(argentdonne);
	}
	
	public void provoquerYakuza(Yakuza yaku) {
		if (attHoneur>=yaku.getReputation()) {
			int argentgagne;
			parler("Je t'ai eu petit yakuza");
			argentgagne=yaku.perdre();
			attHoneur++;
			gagnerArgent(argentgagne);
		}else {
			attHoneur--;
			yaku.gagner(getQargent());
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
		}
	}
}
