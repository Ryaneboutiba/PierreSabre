package Tp4Histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Commercant;

public class Histoire {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kambucha",54);
		Commercant commercant= new Commercant("Paul","the",20);
		prof.direBonjour();
		prof.acheter("boisson", 2);
		prof.boire();
		prof.acheter("jeux", 2);
		prof.acheter("kimono", 50);
		
		commercant.direBonjour();
		commercant.sefaireExtorquer();
		commercant.parler("J'ai tout perdu, le monde est trop injuste!");
		commercant.recevoitArgent(15);
		commercant.boire();
		
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whysky",30,"Worgang");
		Commercant commerce = new Commercant("Marco","coca",15);
		yakuza.direBonjour();
		yakuza.parler("Tiens tiens tiens ne serait ce pas la un faible petit marchand");
		yakuza.parler(commerce.getNom()+" si tu tiens a la vie donne moi ta bourse");
		commerce.parler("J'ai tout perdu, le monde est trop injuste!");
		yakuza.extorquerCommercant(commerce);
		
		Ronin ronin=new Ronin("Roro","shochu",60);
		ronin.direBonjour();
		ronin.donnerArgent(commerce);
		ronin.parler("Je t'ai retrouve petite vermine tu vas payer pour ce que tu as fait a ce pauvre petit marchant");
		ronin.provoquerYakuza(yakuza);
	}
	
	

}
