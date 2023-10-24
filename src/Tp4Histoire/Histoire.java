package Tp4Histoire;

import personnages.Humain;
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
		
	}
	
	

}
