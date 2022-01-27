import java.util.Scanner;

public class Carte {
	
	static Scanner scannerObject = new Scanner(System.in);

	int prix;
	
	int entrees;
	int plats;
	int desserts;
	int parfums;
	String platsCarte;
	
	public Carte(int entrees, int plats, int desserts, int prix) {
		this.entrees = entrees;
		this.plats = plats;
		this.desserts = desserts;
		this.prix = prix;
	}
	
	public Carte(String platsCarte, int prix) {
		this.platsCarte = platsCarte;
		this.prix = prix;
	}
	

	public int Glace(int parfum1, int parfum2) {
		return parfum1 +parfum2;
	}

	
	public static void entrees() {
		
		Carte entree1 = new Carte ("Gaufre de pomme de terre au saumon fumé et chantilly citronnée", 10);
		Carte entree2 = new Carte ("Œufs mimosa aux œufs de saumon", 12);
		Carte entree3 = new Carte ("Salade de crabe", 11);
		Carte entree4 = new Carte ("Terrine végétale", 8);
		Carte entree5 = new Carte ("Velouté aux champignons et à la truffe", 11);
		Carte entree6 = new Carte ("Rien", 0);
		
		System.out.println("Choisissez votre entrée parmi la carte :");
		System.out.println(" ");
		System.out.println("1. Gaufre de pomme de terre au saumon fumé et chantilly citronnée");
		System.out.println("2. Œufs mimosa aux œufs de saumon");
		System.out.println("3. Salade de crabe");
		System.out.println("4. Terrine végétale");
		System.out.println("5. Velouté aux champignons et à la truffe");
		System.out.println("6. Je ne veux pas d'entrées");
	
		int entrees = scannerObject.nextInt();

		
		switch(entrees) {
		case 1:
			System.out.println("Votre entrée: Gaufre de pomme de terre au saumon fumé et chantilly citronnée");
			
		break;

		case 2:
			System.out.println("Votre entrée: Œufs mimosa aux œufs de saumon");
		
		break;

		case 3:
			System.out.println("Votre entrée: Salade de crabe");
		
		break;
	
		case 4:
			System.out.println("Votre entrée: Terrine végétale");
		
		break;

		case 5:
			System.out.println("Votre entrée: Velouté aux champignons et à la truffe");
		
		break;
		
		case 6:
			System.out.println("Je ne veux pas d'entrées.");
		
		break;
		
		   default:
				System.out.println("Nous n'avons pas cette entrée à vous proposer.");
		}
	}
	
	public static void plats() {
		
		Carte plat1 = new Carte ("Saumon teriyaki aux légumes", 15);
		Carte plat2 = new Carte ("Gigot d’agneau", 14);
		Carte plat3 = new Carte ("Nouilles sautées aux légumes", 13);
		Carte plat4 = new Carte ("Gratin de courgettes", 8);
		Carte plat5 = new Carte ("Filet de bar et son riz safrané", 11);
		Carte plat6 = new Carte ("Rien", 0);
		
		System.out.println("Choisissez votre plat parmi la carte :");
		System.out.println(" ");
		System.out.println("1. Saumon teriyaki aux légumes");
		System.out.println("2. Gigot d’agneau");
		System.out.println("3. Nouilles sautées aux légumes");
		System.out.println("4. Gratin de courgettes");
		System.out.println("5. Filet de bar et son riz safrané");
		System.out.println("6. Je ne veux pas de plat.");
	
		int plats = scannerObject.nextInt();

		
		switch(plats) {
		case 1:
			System.out.println("Votre plat de résistance: Saumon teriyaki aux légumes");
			
		break;

		case 2:
			System.out.println("Votre plat de résistance: Gigot d’agneau");
		
		break;

		case 3:
			System.out.println("Votre plat de résistance: Nouilles sautées aux légumes");
	
		break;
	
		case 4:
			System.out.println("Votre plat de résistance: Gratin de courgette");
		
		break;

		case 5:
			System.out.println("Votre plat de résistance: Filet de bar et son riz safrané");
			
		break;
		
		case 6:
			System.out.println("Je ne veux pas de plat.");
		
		break;

		   default:
				System.out.println("Nous n'avons pas ce plat à vous proposer.");
		}
	}
	
	public static void desserts() {
		
		Carte dessert1 = new Carte ("Gateau au chocolat et sa mousse onctueuse", 8);
		Carte dessert2 = new Carte ("Crème brulée", 7);
		Carte dessert3 = new Carte ("Tarte au citron meringué", 7);
		Carte dessert4 = new Carte ("Tarte aux fraises de Plougastel", 9);
		Carte dessert5 = new Carte ("Dame Blanche", 10);
		Carte dessert6 = new Carte ("Café Liégeois", 10);
		Carte dessert7 = new Carte ("Café gourmant", 12);
		Carte dessert8 = new Carte ("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache", 11);
		Carte dessert9 = new Carte ("Rien", 0);
		
		System.out.println("Choisissez votre dessert parmi la carte :");
		System.out.println(" ");
		System.out.println("1. Gateau au chocolat et sa mousse onctueuse");
		System.out.println("2. Crème brulée");
		System.out.println("3. Tarte au citron meringué");
		System.out.println("4. Tarte aux fraises de Plougastel");
		System.out.println("5. Dame Blanche");
		System.out.println("6. Café Liégeois");
		System.out.println("7. Café gourmant");
		System.out.println("8. Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache");
		int desserts = scannerObject.nextInt();

		
		switch(desserts) {
		case 1:
			System.out.println("Un peu de sucre: Gateau au chocolat et sa mousse onctueuse");
		break;

		case 2:
			System.out.println("Un peu de sucre: Crème brulée");
		break;

		case 3:
			System.out.println("Un peu de sucre: Tarte au citron meringué");
		break;
	
		case 4:
			System.out.println("Un peu de sucre: Tarte aux fraises de Plougastel");
		break;

		case 5:
			System.out.println("Un peu de sucre: Dame Blanche");
		break;

		case 6:
			System.out.println("Un peu de sucre: Café Liégeois");
		break;
	
		case 7:
			System.out.println("Un peu de sucre: Café gourmant");
		break;

		case 8:
			System.out.println("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache");
			System.out.println("Choisissez vos parfums: ");
			System.out.println("1. Vanille");
			System.out.println("2. Fraise");
			System.out.println("3. Chocolat");
			System.out.println("4. Pistache");
			int parfum1 = scannerObject.nextInt();
			int parfum2 = scannerObject.nextInt();
			
			switch(parfum1) {
			case 1:
				System.out.println("Parfum Vanille");
			break;
			
			case 2:
				System.out.println("Parfum Fraise");
			break;
			
			case 3:
				System.out.println("Parfum Chocolat");
			break;
			
			case 4:
				System.out.println("Parfum Pistache");
			break;
			
			default:
				System.out.println("Nous n'avons pas d'autres parfums.");
			}
				
				switch(parfum2) {
				case 1:
					System.out.println("Parfum Vanille");
				break;
				
				case 2:
					System.out.println("Parfum Fraise");
				break;
				
				case 3:
					System.out.println("Parfum Chocolat");
				break;
				
				case 4:
					System.out.println("Parfum Pistache");
				break;
				
				default:
					System.out.println("Nous n'avons pas d'autres parfums.");
				}
				
				System.out.println("Vous avez choisi + " + parfum1 + " un parfum que vous allez adorer." + parfum2);
				
			
	   break; 
	   
	   case 9:
			System.out.println("Je ne veux pas de desserts.");
	   break;

	   default:
			System.out.println("Nous n'avons pas ce dessert à vous proposer.");
	   } 
		
		
		scannerObject.close();	
		
	}	
}



