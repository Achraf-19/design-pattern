package model;

import service.IObserver;

public class TableauDeBord implements IObserver {
	public void update(String nom, int valeur) {
		System.out.println("Tableau de Bord notifi� par : " + nom + " valeur : " + valeur);
	}
}
