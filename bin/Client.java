import java.util.Scanner;

public class Client {

	static Scanner scannerObject = new Scanner(System.in);

	public static void main(String[] args) {
		
	/*	String mesEntrees[]  = new String [6];
		mesEntrees[0] = "Gaufre de pomme de terre au saumon fumé et chantilly citronnée";
		mesEntrees[1] = "Œufs mimosa aux œufs de saumon";
		mesEntrees[2] = "Salade de crabe";
		mesEntrees[3] = "Terrine végétale";
		mesEntrees[4] = "Velouté aux champignons et à la truffe";
		mesEntrees[5] = "Rien";
		for (int i = 0; i < mesEntrees.length; i++) {
		    String lesEntrees = mesEntrees[i];
		}
		
		int[] prixEntrees = new int [6];
		prixEntrees [0] = 10;
		prixEntrees [1] = 12;
		prixEntrees [2] = 11;
		prixEntrees [3] = 8;
		prixEntrees [4] = 11;
		prixEntrees [5] = 0;
		for (int i = 0; i < prixEntrees.length; i++) {
		    int lesPrixEntrees = prixEntrees[i];
		}
		
		String [] mesPlats = new String [6];
		mesPlats [0] = "Saumon teriyaki aux légumes";
		mesPlats [1] = "Gigot d’agneau";
		mesPlats [2] = "Nouilles sautées aux légumes";
		mesPlats [3] = "Gratin de courgettes";
		mesPlats [4] = "Filet de bar et son riz safrané";
		mesPlats [5] = "Rien";
		for (int i = 0; i < mesPlats.length; i++) {
		    String lesPlats = mesPlats[i];
		}
		
		int [] prixPlats = new int [6];
		prixPlats [0] = 15;
		prixPlats [1] = 14;
		prixPlats [2] = 13;
		prixPlats [3] = 8;
		prixPlats [4] = 11;
		prixPlats [5] = 0;
		for (int i = 0; i < prixPlats.length; i++) {
		    int lesPrixPlats = prixPlats[i];
		}
		
		String [] mesDesserts = new String [9];
		mesDesserts [0] = "Gateau au chocolat et sa mousse onctueuse";
		mesDesserts [1] = "Crème brulée";
		mesDesserts [2] = "Tarte au citron meringué";
		mesDesserts [3] = "Tarte aux fraises de Plougastel";
		mesDesserts [4] = "Dame Blanche";
		mesDesserts [5] = "Café Liégeois";
		mesDesserts [6] = "Café gourmant";
		mesDesserts [7] = "Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache";
		mesDesserts [8] = "Rien";
		for (int i = 0; i < mesDesserts.length; i++) {
		    String lesDesserts = mesDesserts[i];
		}
			
		int [] prixDesserts = new int [9];
		prixDesserts [0] = 8;
		prixDesserts [1] = 7;
		prixDesserts [2] = 7;
		prixDesserts [3] = 9;
		prixDesserts [4] = 10;
		prixDesserts [5] = 10;
		prixDesserts [6] = 12;
		prixDesserts [7] = 11;
		prixDesserts [8] = 0;
		for (int i = 0; i < prixDesserts.length; i++) {
		    int lesPrixDesserts = prixDesserts[i];
		} */
		
		Menus menuTerreEtMer = new Menus("Entrées", "Plats", "Desserts", 35);
		Menus menuOcean = new Menus("Entrées", "Plats", "Desserts", 40);
		Menus menuDuTerroir = new Menus("Entrées", "Plats", "Desserts", 38);
		Menus menuVegetarien = new Menus("Entrées", "Plats", "Desserts", 22);
		Menus menuPetitPrince = new Menus("Entrées", "Plats", "Desserts", 13);
		
	/*	CarteEntrees entree1 = new CarteEntrees ("Gaufre de pomme de terre au saumon fumé et chantilly citronnée", 10);
		CarteEntrees entree2 = new CarteEntrees ("Œufs mimosa aux œufs de saumon", 12);
		CarteEntrees entree3 = new CarteEntrees ("Salade de crabe", 11);
		CarteEntrees entree4 = new CarteEntrees ("Terrine végétale", 8);
		CarteEntrees entree5 = new CarteEntrees ("Velouté aux champignons et à la truffe", 11);
		CarteEntrees entree6 = new CarteEntrees ("Je ne veux pas d'entrées.", 0);
		
		CartePlats plat1 = new CartePlats ("Saumon teriyaki aux légumes", 15);
		CartePlats plat2 = new CartePlats ("Gigot d’agneau", 14);
		CartePlats plat3 = new CartePlats ("Nouilles sautées aux légumes", 13);
		CartePlats plat4 = new CartePlats ("Gratin de courgettes", 8);
		CartePlats plat5 = new CartePlats ("Filet de bar et son riz safrané", 11);
		CartePlats plat6 = new CartePlats ("Rien", 0);
		
		CarteDesserts dessert1 = new CarteDesserts ("Gateau au chocolat et sa mousse onctueuse", 8);
		CarteDesserts dessert2 = new CarteDesserts ("Crème brulée", 7);
		CarteDesserts dessert3 = new CarteDesserts ("Tarte au citron meringué", 7);
		CarteDesserts dessert4 = new CarteDesserts ("Tarte aux fraises de Plougastel", 9);
		CarteDesserts dessert5 = new CarteDesserts ("Dame Blanche", 10);
		CarteDesserts dessert6 = new CarteDesserts ("Café Liégeois", 10);
		CarteDesserts dessert7 = new CarteDesserts ("Café gourmant", 12);
		CarteDesserts dessert8 = new CarteDesserts ("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache", 11);
		CarteDesserts dessert9 = new CarteDesserts ("Rien", 0); */
		
			System.out.println("Kenavo, voici la carte, choisissez votre menu: ");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu Terre et Mer, 35€");
					System.out.println(" ");
					System.out.println("Entrées :");
					System.out.println("Terrines de foie gras à l'anguille fumée");
					System.out.println("Flan d'épinard aux fruits de mers");
					System.out.println("Salade Terre et Mer (penne, chorizo, thon,courgette, maïs");
					System.out.println(" ");
					System.out.println("Les plats: ");
					System.out.println("Delices de canard au confit de figues et feuilletés à la mousse de sardine");
					System.out.println("Poulet aux écrevisses");
					System.out.println("Foie gras poêlé et Saint Jacques");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu Ocean, 40€");
					System.out.println(" ");
					System.out.println("Entrées :");
					System.out.println("Foie gras poêlé et Saint Jacques");
					System.out.println("Assiette de 12 huîtres");
					System.out.println("Carpaccio de saumon");
					System.out.println("Bisque de homard");
					System.out.println(" ");
					System.out.println("Les plats :");
					System.out.println("Noix de Saint Jacques sautées aux champignons");
					System.out.println("Risotto aux calamars");
					System.out.println("Spaguettis aux fruits de mer");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu du terroir, 38€");
					System.out.println(" ");
					System.out.println("Entrées :");
					System.out.println("Paté Hénaff et sa salade composée");
					System.out.println("Andouille de Guémené");
					System.out.println("Coquille Saint Jacques gratinée de la baie de Saint Brieuc");
					System.out.println(" ");
					System.out.println("Les plats : ");
					System.out.println("Galette au blé noir");
					System.out.println("La cotriade (morceaux de poissons, moules de Buchôt, pomme de terre, ails, échalotes");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu végétarien, 22€");
					System.out.println(" ");
					System.out.println("Entrées :");
					System.out.println("Salade de chèvre chaud");
					System.out.println("Salade César");
					System.out.println("Crème d'asperge et de champignons");
					System.out.println(" ");
					System.out.println("Les plats :");
					System.out.println("Patates douces gratinées au fromage");
					System.out.println("Polenta de légumes");
					System.out.println("Curry de légumes");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu Petit Prince, 13€");
					System.out.println(" ");
					System.out.println("Entrées :");
					System.out.println("Petite salade et carottes râpées");
					System.out.println(" ");
					System.out.println("Les plats :");
					System.out.println("Steack haché acompagné de frites");
					System.out.println("Poisson pané accompagné de son riz au safran");
					System.out.println(" ");
					System.out.println("Desserts : ");
					System.out.println("Glace 2 boules, parfum au choix");
					System.out.println("Mousse au chocolat");
					System.out.println("Crème brûlée");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Entrées à la carte: ");
					System.out.println(" ");
					System.out.println("Gaufre de pomme de terre au saumon fumé et chantilly citronnée");
					System.out.println("Œufs mimosa aux œufs de saumon");
					System.out.println("Salade de crabe");
					System.out.println("Terrine végétale");
					System.out.println("Velouté aux champignons et à la truffe");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Plats à la carte: ");
					System.out.println(" ");
					System.out.println("Saumon teriyaki aux légumes");
					System.out.println("Gigot d’agneau");
					System.out.println("Nouilles sautées aux légumes");
					System.out.println("Gratin de courgettes");
					System.out.println("Filet de bar et son riz safrané");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Desserts à la carte: ");
					System.out.println(" ");
					System.out.println("Gateau au chocolat et sa mousse onctueuse");
					System.out.println("Crème brulée");
					System.out.println("Tarte au citron meringué");
					System.out.println("arte aux fraises de Plougastel");
					System.out.println("Dame Blanche");
					System.out.println("Café Liégeois");
					System.out.println("Café gourmant");
					System.out.println("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache");
					System.out.println(" ");
					System.out.println(" ");
					
					boolean reponse = false;
					while(!reponse) {
						
						System.out.println("Avez vous fait votre choix? true/false");
					
						reponse = scannerObject.nextBoolean();
					
					if (reponse) {
					
						System.out.println("Voulez vous un menu? Ou à la carte? true/false");
					
						boolean reponse2 = scannerObject.nextBoolean();
					
						if (reponse2) {
						
							System.out.println("Que désirez-vous prendre?");
							System.out.println("1. Menu Terre et Mer");
							System.out.println("2. Menu Océan");
							System.out.println("3. Menu du terroir");
							System.out.println("4. Menu végétarien");
							System.out.println("5. Menu Petit Prince");
		
							int Menu = scannerObject.nextInt();
		
							switch(Menu) {
							case 1:
								System.out.println("Menu Terre et Mer, très bon choix!");
								System.out.println(" ");
								menuTerreEtMer.menuTerreEtMer();
								menuTerreEtMer.payer();
							break;
	
							case 2:
								System.out.println("Menu Océan, nos fruits de mers sont frais de la criée de ce matin!");
								System.out.println(" ");
								menuOcean.menuOcean();
								menuOcean.payer();
							break;
	
							case 3:
								System.out.println("Menu du Terroir, dégustez nos spécialités.");
								System.out.println(" ");
								menuDuTerroir.menuDuTerroir();
								menuDuTerroir.payer();
							break;
			
							case 4:
								System.out.println("Vous allez aimer nos légumes issus de l'agriculture biologique");
								System.out.println(" ");
								menuVegetarien.menuVegetarien();
								menuVegetarien.payer();
							break;
			
							case 5:
								menuPetitPrince.menuPetitPrince();
								menuPetitPrince.payer();
							break;
			
							default:
								System.out.println("Je reviendrai quand vous aurez fait votre choix.");
							}
						}	
					
						else {
			
							CarteEntrees.entrees();
							//System.out.println(CarteEntrees.prixEntree);
							CartePlats.plats();
							//System.out.println(CartePlats.prixPlat);
							CarteDesserts.desserts();
							//System.out.println(CarteDesserts.prixDessert);
					
							int addition =(CarteEntrees.prixEntree + CartePlats.prixPlat + CarteDesserts.prixDessert);
							System.out.println("Le montant de votre addition est : " + addition + " €.");
							
							System.out.println("Comment d'argent liquide possédez vous? ");
							int montantEspece = scannerObject.nextInt();
							
							if (montantEspece > addition) {
								int rendreMonnaie = montantEspece - addition;
								System.out.println("Je vous rends la monnaie : " + rendreMonnaie + " €.");	
							}		
							else if (montantEspece == addition) {
								System.out.println("Merci pour votre visite, à bientôt!");
							}		
							else {
								System.out.println("Tu nous rembourseras en faisant la plonge");
							}		
						} 
					}
					
					else {
						System.out.println("Pas de soucis, je reviendrai plus tard.");
					}
				}			
		scannerObject.close();
	}
}
