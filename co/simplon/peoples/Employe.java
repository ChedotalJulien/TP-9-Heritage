package co.simplon.peoples;

public class Employe extends Personne {
	private static String nomPersonne;

	public Employe (String nomNom, String nomEntreprises, int nomSalaire, String personne){
		super (nomNom, nomEntreprises, nomSalaire, nomPersonne);
		this.personne = personne;
	}


	public void display() {

	}
}


