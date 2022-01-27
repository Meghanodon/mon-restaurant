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
		
		System.out.println("Choisissez votre entrée parmi la carte :");
		System.out.println(" ");
		System.out.println("1. Gaufre de pomme de terre au saumon fumé et chantilly citronnée");
		System.out.println("2. Œufs mimosa aux œufs de saumon");
		System.out.println("3. Salade de crabe");
		System.out.println("4. Terrine végétale");
		System.out.println("5. Velouté aux champignons et à la truffe");
		System.out.println("6. Je ne veux pas d'entrées.");
	
		int entrees = scannerObject.nextInt();
		prixEntree = 0;

		switch(entrees) {
		case 1:
			System.out.println("Votre entrée: Gaufre de pomme de terre au saumon fumé et chantilly citronnée");
			prixEntree = 10;
			System.out.println( ("Le prix du plat est : " + prixEntree + " €.") );
		break;

		case 2:
			System.out.println("Votre entrée: Œufs mimosa aux œufs de saumon");
			prixEntree = 12;
			System.out.println( ("Le prix du plat est : " + prixEntree + " €.") );
		break;

		case 3:
			System.out.println("Votre entrée: Salade de crabe");
			prixEntree = 11;
			System.out.println( ("Le prix du plat est : " + prixEntree + " €.") );
		break;
	
		case 4:
			System.out.println("Votre entrée: Terrine végétale");
			prixEntree = 8;
			System.out.println( ("Le prix du plat est : " + prixEntree + " €.") );
		break;

		case 5:
			System.out.println("Votre entrée: Velouté aux champignons et à la truffe");
			prixEntree = 11;
			System.out.println( ("Le prix du plat est : " + prixEntree + " €.") );
		break;
		
		case 6:
			System.out.println("Je ne veux pas d'entrées.");
			prixEntree = 0;
			System.out.println( ("Le prix du plat est : " + prixEntree + " €.") );
		break;
		
		   default:
				System.out.println("Nous n'avons pas cette entrée à vous proposer.");
		}
	}
}
