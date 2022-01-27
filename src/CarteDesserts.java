import java.util.Scanner;

public class CarteDesserts {

	static Scanner scannerObject = new Scanner(System.in);

	static int prixDessert;
	String platsCarte;
	
	public CarteDesserts(String platsCarte, int prixDessert) {
		this.platsCarte = platsCarte;
		this.prixDessert = prixDessert;
	}
	
	public static void desserts() {
		
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
		System.out.println("9. Rien");
	
		int desserts = scannerObject.nextInt();
		prixDessert = 0;
		
	
		switch(desserts) {
		case 1:
			System.out.println("Un peu de sucre: Gateau au chocolat et sa mousse onctueuse");
			prixDessert = 8;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;

		case 2:
			System.out.println("Un peu de sucre: Crème brulée");
			prixDessert = 7;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;

		case 3:
			System.out.println("Un peu de sucre: Tarte au citron meringué");
			prixDessert = 7;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;

		case 4:
			System.out.println("Un peu de sucre: Tarte aux fraises de Plougastel");
			prixDessert = 9;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;

		case 5:
			System.out.println("Un peu de sucre: Dame Blanche");
			prixDessert = 10;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;

		case 6:
			System.out.println("Un peu de sucre: Café Liégeois");
			prixDessert = 10;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;

		case 7:
			System.out.println("Un peu de sucre: Café gourmant");
			prixDessert = 12;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
		break;
	
		case 8:
			System.out.println("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache");
			prixDessert = 11;
			System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
			System.out.println("Choisissez vos parfums: ");
			System.out.println("1. Vanille");
			System.out.println("2. Fraise");
			System.out.println("3. Chocolat");
			System.out.println("4. Pistache");
			int parfum1 = scannerObject.nextInt();
		
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
					System.out.println("Nous n'avons que ces 4 parfums.");
				}
			
				System.out.println("Choisissez votre deuxième parfum :");
				int parfum2 = scannerObject.nextInt();
			
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
					System.out.println("Nous n'avons pas d'autres parfums. Bon appétit. ");		
				}
		
			break; 
   
			case 9:
				System.out.println("Je ne veux pas de desserts.");
				prixDessert = 0;
				System.out.println( ("Le prix du plat est : " + prixDessert + " €.") );
			break;

			default:
				System.out.println("Nous n'avons pas ce dessert à vous proposer.");
		}
		
	}
		
	public static void dessertsMenu() {
		
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
		System.out.println("9. Rien");
	
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
					System.out.println("Nous n'avons que ces 4 parfums.");
				}
			
				System.out.println("Choisissez votre deuxième parfum :");
				int parfum2 = scannerObject.nextInt();
			
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
					System.out.println("Nous n'avons pas d'autres parfums. Bon appétit. ");		
				}
		
			break; 
   
			case 9:
				System.out.println("Je ne veux pas de desserts.");
			break;

			default:
				System.out.println("Nous n'avons pas ce dessert à vous proposer.");
		}
	}
}	