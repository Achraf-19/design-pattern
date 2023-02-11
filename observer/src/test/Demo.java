package test;

import capteur.CapteurHumidite;
import capteur.CapteurLumiere;
import capteur.CapteurTemperature;
import model.Conducteur;
import model.TableauDeBord;

public class Demo {
	public static void main(String[] args) {
		System.out.println("***Capteur Observer Pattern Demo***\n");
		Conducteur conducteur = new Conducteur();
		TableauDeBord tdb = new TableauDeBord();
		CapteurTemperature capTemperature = new CapteurTemperature();
		CapteurHumidite capHumidite = new CapteurHumidite();
		CapteurLumiere capLumiere = new CapteurLumiere();
		// Capteur Temp�rature
		capTemperature.ajouter(conducteur);
		capTemperature.ajouter(tdb);
		//Capteur Humidit�
		capHumidite.ajouter(tdb);
		// Capteur Lumi�re
		capLumiere.ajouter(tdb);
		// Notification des observateurs
		capTemperature.setTemperature(25);
		capHumidite.setHumidite(50);
		capLumiere.setLumiere(4);
	}
}
