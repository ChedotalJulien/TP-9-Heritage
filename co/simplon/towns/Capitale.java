package co.simplon.towns;

public class Capitale extends Ville {
	private String monument;


	public Capitale (String nomVille,String nomPays,int nbHabitants,String monuments) {
		super (nomVille, nomPays, nbHabitants);
		this.monument = monuments;

	}

	public void display() {
	}

	@Override
	public String toString() {
		return "Capitale : [monument=" + monument + " " + getNom() + " " + getpays()
		+ " " + getnbHabitants() + "]";
	}

}