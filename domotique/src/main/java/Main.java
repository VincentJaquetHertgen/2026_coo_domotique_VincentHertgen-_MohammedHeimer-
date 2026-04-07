
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		Lampe l1=new Lampe("Lampe1");
		Hifi h1 = new Hifi();
		Cheminee c1 = new Cheminee();
		AdaptateurCheminee a1 = new AdaptateurCheminee(c1);
		t.ajouterAppareil(l1);
		t.ajouterAppareil(h1);
		t.ajouterAppareil(a1);
		TelecommandeGraphique tg = new TelecommandeGraphique(t);

		

		
	}
	
}
