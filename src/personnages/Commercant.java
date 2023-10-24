package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonpref, int qargent) {
		super(nom,"the", qargent);
	}
	
	
	public void recevoitArgent(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous!Je te remercie genereux donnateur");
	}
	
	public int sefaireExtorquer() {
		int argentvol=getQargent();
		perdreArgent(argentvol);
		return argentvol;
	}

}
