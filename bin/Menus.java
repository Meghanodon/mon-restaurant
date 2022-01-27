import java.util.Scanner;

public class Menus {

	static Scanner scannerObject = new Scanner(System.in);
	
	 String entrees;
	 String plats;
	 String desserts;
	 int prix;
	
	public Menus(String entrees, String plats, String desserts, int prix) {
		this.entrees = entrees;
		this.plats = plats;
		this.desserts = desserts;
		this.prix = prix;	
	}
	
	public void payer() {
		System.out.println(" Le montant de votre addition s'élève à : " + prix + " €.");
		System.out.println("Comment d'argent liquide possédez vous? ");
		int montantEspece = scannerObject.nextInt();
		
		if (montantEspece > prix) {
			int rendreMonnaie = montantEspece - prix;
			System.out.println("Je vous rends la monnaie : " + rendreMonnaie + " €.");	
		}		
		else if (montantEspece == prix) {
			System.out.println("Merci pour votre visite, à bientôt!");
		}		
		else {
			System.out.println("Tu nous rembourseras en faisant la plonge");
		}		
	}

	public void menuTerreEtMer() {
		System.out.println("Menu Terre et Mer, 35 €");
		System.out.println("Choisissez votre entrée :");
		System.out.println("1. Terrines de foie gras à l'anguille fumée");
		System.out.println("2. Flan d'épinard aux fruits de mers");
		System.out.println("3. Salade Terre et Mer (penne, chorizo, thon,courgette, maïs");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entrée: Terrines de foie gras à l'anguille fumée");
		break;

		case 2:
			System.out.println("Votre entrée: Flan d'épinard aux fruits de mers");
		break;

		case 3:
			System.out.println("Votre entrée: Salade Terre et Mer (penne, chorizo, thon,courgette, maïs");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entrée.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Delices de canard au confit de figues et feuilletés à la mousse de sardine");
		System.out.println("2. Poulet aux écrevisses");
		System.out.println("3. Foie gras poêlé et Saint Jacques");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie d'un: Delices de canard au confit de figues et feuilletés à la mousse de sardine");
		break;

		case 2:
			System.out.println("Suivie d'un: Poulet aux écrevisses");
		break;

		case 3:
			System.out.println("Suivi d'un: Foie gras poêlé et Saint Jacques");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuOcean () {
		System.out.println("Menu Ocean, 40 €");
		System.out.println("Choisissez votre entrée :");
		System.out.println("1. Assiette de 12 huîtres");
		System.out.println("2. Carpaccio de saumon");
		System.out.println("3. Bisque de homard");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entrée: Assiette de 12 huîtres");
		break;

		case 2:
			System.out.println("Votre entrée: Carpaccio de saumon");
		break;

		case 3:
			System.out.println("Votre entrée: Bisque de homard");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entrée.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Noix de Saint Jacques sautées aux champignons");
		System.out.println("2. Risotto aux calamars");
		System.out.println("3. Spaguettis aux fruits de mer");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie de: Noix de Saint Jacques sautées aux champignons");
		break;

		case 2:
			System.out.println("Suivie d'un: Risotto aux calamars");
		break;

		case 3:
			System.out.println("Suivie de:Spaguettis aux fruits de mer");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuDuTerroir() {
		System.out.println("Menu du terroir, 38 €");
		System.out.println("Choisissez votre entrée :");
		System.out.println("1. Paté Hénaff et sa salade composée");
		System.out.println("2. Andouille de Guémené");
		System.out.println("3. Coquille Saint Jacques gratinée de la baie de Saint Brieuc");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entrée: Paté Hénaff et sa salade composée");
		break;

		case 2:
			System.out.println("Votre entrée: Andouille de Guémené");
		break;

		case 3:
			System.out.println("Votre entrée: Coquille Saint Jacques gratinée de la baie de Saint Brieuc");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entrée.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Galette au blé noir");
		System.out.println("2. La cotriade (morceaux de poissons, moules de Buchôt, pomme de terre, ails, échalotes");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie d'une: Galette au blé noir");
		break;

		case 2:
			System.out.println("Suivie d'une: La cotriade (morceaux de poissons, moules de Buchôt, pomme de terre, ails, échalotes");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuVegetarien() {
		System.out.println("Menu végétarien, 22 €");
		System.out.println("Choisissez votre entrée :");
		System.out.println("1. Salade de chèvre chaud");
		System.out.println("2. Salade César");
		System.out.println("3. Crème d'asperge et de champignons");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entrée: Salade de chèvre chaud");
		break;

		case 2:
			System.out.println("Votre entrée: Salade César");
		break;

		case 3:
			System.out.println("Votre entrée: Crème d'asperge et de champignons");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entrée.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Patates douces gratinées au fromage");
		System.out.println("2. Polenta de légumes");
		System.out.println("3. Curry de légumes");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie de: Patates douces gratinées au fromage");
		break;

		case 2:
			System.out.println("Suivie d'une: Polenta de légumes");
		break;

		case 3:
			System.out.println("Suivie d'un: Curry de légumes");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuPetitPrince() {
		
		System.out.println("Saisissez votre âge");		
		int age = scannerObject.nextInt();
		
		if (age <= 12) {
			System.out.println("Regale-toi!");
			System.out.println(" ");
			
			System.out.println("Menu Petit Prince, 13 €");
			System.out.println("Choisissez votre entrée :");
			System.out.println("1. Petite salade et carottes râpées");
			int entrees = scannerObject.nextInt();
			
			switch(entrees) {
			case 1:
				System.out.println("Votre entrée: Petite salade et carottes râpées");
			break;
				default:
					System.out.println("Il vous faut choisir une entrée.");
			}
			
			System.out.println("Choisissez votre plat :");
			System.out.println("1. Steack haché acompagné de frites");
			System.out.println("2. Poisson pané accompagné de son riz au safran");
			int plats = scannerObject.nextInt();
			
			switch(plats) {
			case 1:
				System.out.println("Suivie d'un: Steack haché acompagné de frites");
			break;

			case 2:
				System.out.println("Suivie d'un: Poisson pané accompagné de son riz au safran");
			break;

				default:
					System.out.println("Il vous faut choisir un plat.");
			}
			
			System.out.println("Choisissez votre dessert :");
			System.out.println("1. 2 boules de glaces parfum au choix");
			System.out.println("2. Mousse au chocolat");
			System.out.println("3. Crème brûlée");
			int desserts = scannerObject.nextInt();
			
			switch(desserts) {
			case 1:
				System.out.println("2 boules de glaces parfum au choix");
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

			case 2:
				System.out.println("Mousse au chocolat");
			break;

			case 3:
				System.out.println("Crème brûlée");
			break;
			
				default:
					System.out.println("Il vous faut choisir un dessert."); 
		   }
	}
		else {
			System.out.println("Vous n'avez pas l'âge requis pour prendre le menu enfant.");
			System.out.println(" ");
		}		
	}
}