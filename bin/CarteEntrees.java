import java.util.Scanner;

public class CarteEntrees {
	
	static Scanner scannerObject = new Scanner(System.in);

	static int prixEntree;
	String entrees;
	
	public CarteEntrees(String entrees, int prixEntree) {
		this.entrees = entrees;
		this.prixEntree = prixEntree;
	}
	
	public static void entrees() {
		
		System.out.println("Choisissez votre entr�e parmi la carte :");
		System.out.println(" ");
		System.out.println("1. Gaufre de pomme de terre au saumon fum� et chantilly citronn�e");
		System.out.println("2. �ufs mimosa aux �ufs de saumon");
		System.out.println("3. Salade de crabe");
		System.out.println("4. Terrine v�g�tale");
		System.out.println("5. Velout� aux champignons et � la truffe");
		System.out.println("6. Je ne veux pas d'entr�es.");
	
		int entrees = scannerObject.nextInt();
		prixEntree = 0;

		switch(entrees) {
		case 1:
			System.out.println("Votre entr�e: Gaufre de pomme de terre au saumon fum� et chantilly citronn�e");
			prixEntree = 10;
			System.out.println( ("Le prix du plat est : " + prixEntree + " �.") );
		break;

		case 2:
			System.out.println("Votre entr�e: �ufs mimosa aux �ufs de saumon");
			prixEntree = 12;
			System.out.println( ("Le prix du plat est : " + prixEntree + " �.") );
		break;

		case 3:
			System.out.println("Votre entr�e: Salade de crabe");
			prixEntree = 11;
			System.out.println( ("Le prix du plat est : " + prixEntree + " �.") );
		break;
	
		case 4:
			System.out.println("Votre entr�e: Terrine v�g�tale");
			prixEntree = 8;
			System.out.println( ("Le prix du plat est : " + prixEntree + " �.") );
		break;

		case 5:
			System.out.println("Votre entr�e: Velout� aux champignons et � la truffe");
			prixEntree = 11;
			System.out.println( ("Le prix du plat est : " + prixEntree + " �.") );
		break;
		
		case 6:
			System.out.println("Je ne veux pas d'entr�es.");
			prixEntree = 0;
			System.out.println( ("Le prix du plat est : " + prixEntree + " �.") );
		break;
		
		   default:
				System.out.println("Nous n'avons pas cette entr�e � vous proposer.");
		}
	}
}
