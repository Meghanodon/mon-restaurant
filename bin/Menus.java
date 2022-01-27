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
		System.out.println(" Le montant de votre addition s'�l�ve � : " + prix + " �.");
		System.out.println("Comment d'argent liquide poss�dez vous? ");
		int montantEspece = scannerObject.nextInt();
		
		if (montantEspece > prix) {
			int rendreMonnaie = montantEspece - prix;
			System.out.println("Je vous rends la monnaie : " + rendreMonnaie + " �.");	
		}		
		else if (montantEspece == prix) {
			System.out.println("Merci pour votre visite, � bient�t!");
		}		
		else {
			System.out.println("Tu nous rembourseras en faisant la plonge");
		}		
	}

	public void menuTerreEtMer() {
		System.out.println("Menu Terre et Mer, 35 �");
		System.out.println("Choisissez votre entr�e :");
		System.out.println("1. Terrines de foie gras � l'anguille fum�e");
		System.out.println("2. Flan d'�pinard aux fruits de mers");
		System.out.println("3. Salade Terre et Mer (penne, chorizo, thon,courgette, ma�s");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entr�e: Terrines de foie gras � l'anguille fum�e");
		break;

		case 2:
			System.out.println("Votre entr�e: Flan d'�pinard aux fruits de mers");
		break;

		case 3:
			System.out.println("Votre entr�e: Salade Terre et Mer (penne, chorizo, thon,courgette, ma�s");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entr�e.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Delices de canard au confit de figues et feuillet�s � la mousse de sardine");
		System.out.println("2. Poulet aux �crevisses");
		System.out.println("3. Foie gras po�l� et Saint Jacques");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie d'un: Delices de canard au confit de figues et feuillet�s � la mousse de sardine");
		break;

		case 2:
			System.out.println("Suivie d'un: Poulet aux �crevisses");
		break;

		case 3:
			System.out.println("Suivi d'un: Foie gras po�l� et Saint Jacques");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuOcean () {
		System.out.println("Menu Ocean, 40 �");
		System.out.println("Choisissez votre entr�e :");
		System.out.println("1. Assiette de 12 hu�tres");
		System.out.println("2. Carpaccio de saumon");
		System.out.println("3. Bisque de homard");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entr�e: Assiette de 12 hu�tres");
		break;

		case 2:
			System.out.println("Votre entr�e: Carpaccio de saumon");
		break;

		case 3:
			System.out.println("Votre entr�e: Bisque de homard");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entr�e.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Noix de Saint Jacques saut�es aux champignons");
		System.out.println("2. Risotto aux calamars");
		System.out.println("3. Spaguettis aux fruits de mer");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie de: Noix de Saint Jacques saut�es aux champignons");
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
		System.out.println("Menu du terroir, 38 �");
		System.out.println("Choisissez votre entr�e :");
		System.out.println("1. Pat� H�naff et sa salade compos�e");
		System.out.println("2. Andouille de Gu�men�");
		System.out.println("3. Coquille Saint Jacques gratin�e de la baie de Saint Brieuc");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entr�e: Pat� H�naff et sa salade compos�e");
		break;

		case 2:
			System.out.println("Votre entr�e: Andouille de Gu�men�");
		break;

		case 3:
			System.out.println("Votre entr�e: Coquille Saint Jacques gratin�e de la baie de Saint Brieuc");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entr�e.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Galette au bl� noir");
		System.out.println("2. La cotriade (morceaux de poissons, moules de Buch�t, pomme de terre, ails, �chalotes");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie d'une: Galette au bl� noir");
		break;

		case 2:
			System.out.println("Suivie d'une: La cotriade (morceaux de poissons, moules de Buch�t, pomme de terre, ails, �chalotes");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuVegetarien() {
		System.out.println("Menu v�g�tarien, 22 �");
		System.out.println("Choisissez votre entr�e :");
		System.out.println("1. Salade de ch�vre chaud");
		System.out.println("2. Salade C�sar");
		System.out.println("3. Cr�me d'asperge et de champignons");
		int entrees = scannerObject.nextInt();
		
		switch(entrees) {
		case 1:
			System.out.println("Votre entr�e: Salade de ch�vre chaud");
		break;

		case 2:
			System.out.println("Votre entr�e: Salade C�sar");
		break;

		case 3:
			System.out.println("Votre entr�e: Cr�me d'asperge et de champignons");
		break;
		
			default:
				System.out.println("Il vous faut choisir une entr�e.");
		}
		
		System.out.println("Choisissez votre plat :");
		System.out.println("1. Patates douces gratin�es au fromage");
		System.out.println("2. Polenta de l�gumes");
		System.out.println("3. Curry de l�gumes");
		int plats = scannerObject.nextInt();
		
		switch(plats) {
		case 1:
			System.out.println("Suivie de: Patates douces gratin�es au fromage");
		break;

		case 2:
			System.out.println("Suivie d'une: Polenta de l�gumes");
		break;

		case 3:
			System.out.println("Suivie d'un: Curry de l�gumes");
		break;
		
			default:
				System.out.println("Il vous faut choisir un plat.");
		}
		
		CarteDesserts.dessertsMenu();
	}
	
	public void menuPetitPrince() {
		
		System.out.println("Saisissez votre �ge");		
		int age = scannerObject.nextInt();
		
		if (age <= 12) {
			System.out.println("Regale-toi!");
			System.out.println(" ");
			
			System.out.println("Menu Petit Prince, 13 �");
			System.out.println("Choisissez votre entr�e :");
			System.out.println("1. Petite salade et carottes r�p�es");
			int entrees = scannerObject.nextInt();
			
			switch(entrees) {
			case 1:
				System.out.println("Votre entr�e: Petite salade et carottes r�p�es");
			break;
				default:
					System.out.println("Il vous faut choisir une entr�e.");
			}
			
			System.out.println("Choisissez votre plat :");
			System.out.println("1. Steack hach� acompagn� de frites");
			System.out.println("2. Poisson pan� accompagn� de son riz au safran");
			int plats = scannerObject.nextInt();
			
			switch(plats) {
			case 1:
				System.out.println("Suivie d'un: Steack hach� acompagn� de frites");
			break;

			case 2:
				System.out.println("Suivie d'un: Poisson pan� accompagn� de son riz au safran");
			break;

				default:
					System.out.println("Il vous faut choisir un plat.");
			}
			
			System.out.println("Choisissez votre dessert :");
			System.out.println("1. 2 boules de glaces parfum au choix");
			System.out.println("2. Mousse au chocolat");
			System.out.println("3. Cr�me br�l�e");
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
					
					System.out.println("Choisissez votre deuxi�me parfum :");
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
						System.out.println("Nous n'avons pas d'autres parfums. Bon app�tit. ");		
					}
			break;

			case 2:
				System.out.println("Mousse au chocolat");
			break;

			case 3:
				System.out.println("Cr�me br�l�e");
			break;
			
				default:
					System.out.println("Il vous faut choisir un dessert."); 
		   }
	}
		else {
			System.out.println("Vous n'avez pas l'�ge requis pour prendre le menu enfant.");
			System.out.println(" ");
		}		
	}
}