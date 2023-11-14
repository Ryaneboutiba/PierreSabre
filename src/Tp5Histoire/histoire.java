package Tp5Histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;
import personnages.Commercant;

public class histoire {
	public static void main(String [] args) {
		Commercant marco= new Commercant("marco", "the", 20);
		Commercant chonin= new Commercant("chonin", "the", 40);
		Commercant kumi= new Commercant("kumi", "the", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Ronin roro =  new Ronin ("Roro","shochu",60);
		Samourai akimoto =new Samourai("Miyamoto","Akimoto","sake",80);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listeConnaissance();
		roro.listeConnaissance();
		yaku.listeConnaissance();
		
		yaku.direBonjour();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listeConnaissance();
		akimoto.boire("the");
		akimoto.boire();
	}
}
