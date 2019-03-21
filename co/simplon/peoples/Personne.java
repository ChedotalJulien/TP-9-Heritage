package co.simplon.peoples;

class Personne {
	private String nom;
	private String entreprises;
	private int salaire;
	

	
	public Personne(String nom, String entreprises,int salaire) {
		this.nom = nom;
		this.entreprises = entreprises;
		this.salaire = salaire;
		
	}


	public Personne(Personne personne) {
		this.nom = personne.nom;
		this.entreprises =  personne.entreprises;
		this.salaire = personne.salaire;
		
	}


	public String getNom() {
		return getNom();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEntreprises() {
		return getEntreprises();
	}
	public void setEntreprises(String entreprises) {
		this.entreprises = entreprises;
	}

	public int getSalaire() {
		return getSalaire();
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}		
}
