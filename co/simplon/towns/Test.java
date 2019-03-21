package co.simplon.towns;

public class Test {


	public static void main(String[] args) {

		Capitale paris = new Capitale("paris","fance",1000000,"tour eiffel");
		Capitale paris1 = new Capitale("londres","angleterre",400000,"big ben");
		Capitale paris2 = new Capitale("rome","italie",300000,"la tour de pise");

		paris.display();
		paris1.display();
		paris2.display();

		System.out.println(paris);
		System.out.println(paris1);
		System.out.println(paris2);
	}
}

