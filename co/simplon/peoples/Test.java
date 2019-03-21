package co.simplon.peoples;

public class Test {

	public static void main(String[] args) {
		
		Employe employe = new Employe("richard","THALES",10000);
		Employe employe1 = new Employe("john","SANOFI",40000);
		Employe employe2 = new Employe("eddy","AIRBUS",30000);
		Employe employe3 = new Employe("luc","sncf",15000);
		Employe employe4 = new Employe("jean","atr",34000);
		Employe employe5 = new Employe("carl","altrans",39900);
		Employe employe6 = new Employe("max","sodimetal",12000);
		Employe employe7 = new Employe("eric","po",78000);
		Employe employe8 = new Employe("franck","simplon",89000);
		Employe employe9 = new Employe("patrick","mairie",78000);
		Employe employe10 = new Employe("tom","habitat",45000);
		
		employe.display();
		employe1.display();
		employe2.display();

		System.out.println(employe);
		System.out.println(employe1);
		System.out.println(employe2);

	}

}
