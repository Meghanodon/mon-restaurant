import java.util.Scanner;

public class Client {

	static Scanner scannerObject = new Scanner(System.in);

	public static void main(String[] args) {
		
	/*	String mesEntrees[]  = new String [6];
		mesEntrees[0] = "Gaufre de pomme de terre au saumon fum� et chantilly citronn�e";
		mesEntrees[1] = "�ufs mimosa aux �ufs de saumon";
		mesEntrees[2] = "Salade de crabe";
		mesEntrees[3] = "Terrine v�g�tale";
		mesEntrees[4] = "Velout� aux champignons et � la truffe";
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
		mesPlats [0] = "Saumon teriyaki aux l�gumes";
		mesPlats [1] = "Gigot d�agneau";
		mesPlats [2] = "Nouilles saut�es aux l�gumes";
		mesPlats [3] = "Gratin de courgettes";
		mesPlats [4] = "Filet de bar et son riz safran�";
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
		mesDesserts [1] = "Cr�me brul�e";
		mesDesserts [2] = "Tarte au citron meringu�";
		mesDesserts [3] = "Tarte aux fraises de Plougastel";
		mesDesserts [4] = "Dame Blanche";
		mesDesserts [5] = "Caf� Li�geois";
		mesDesserts [6] = "Caf� gourmant";
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
		
		Menus menuTerreEtMer = new Menus("Entr�es", "Plats", "Desserts", 35);
		Menus menuOcean = new Menus("Entr�es", "Plats", "Desserts", 40);
		Menus menuDuTerroir = new Menus("Entr�es", "Plats", "Desserts", 38);
		Menus menuVegetarien = new Menus("Entr�es", "Plats", "Desserts", 22);
		Menus menuPetitPrince = new Menus("Entr�es", "Plats", "Desserts", 13);
		
	/*	CarteEntrees entree1 = new CarteEntrees ("Gaufre de pomme de terre au saumon fum� et chantilly citronn�e", 10);
		CarteEntrees entree2 = new CarteEntrees ("�ufs mimosa aux �ufs de saumon", 12);
		CarteEntrees entree3 = new CarteEntrees ("Salade de crabe", 11);
		CarteEntrees entree4 = new CarteEntrees ("Terrine v�g�tale", 8);
		CarteEntrees entree5 = new CarteEntrees ("Velout� aux champignons et � la truffe", 11);
		CarteEntrees entree6 = new CarteEntrees ("Je ne veux pas d'entr�es.", 0);
		
		CartePlats plat1 = new CartePlats ("Saumon teriyaki aux l�gumes", 15);
		CartePlats plat2 = new CartePlats ("Gigot d�agneau", 14);
		CartePlats plat3 = new CartePlats ("Nouilles saut�es aux l�gumes", 13);
		CartePlats plat4 = new CartePlats ("Gratin de courgettes", 8);
		CartePlats plat5 = new CartePlats ("Filet de bar et son riz safran�", 11);
		CartePlats plat6 = new CartePlats ("Rien", 0);
		
		CarteDesserts dessert1 = new CarteDesserts ("Gateau au chocolat et sa mousse onctueuse", 8);
		CarteDesserts dessert2 = new CarteDesserts ("Cr�me brul�e", 7);
		CarteDesserts dessert3 = new CarteDesserts ("Tarte au citron meringu�", 7);
		CarteDesserts dessert4 = new CarteDesserts ("Tarte aux fraises de Plougastel", 9);
		CarteDesserts dessert5 = new CarteDesserts ("Dame Blanche", 10);
		CarteDesserts dessert6 = new CarteDesserts ("Caf� Li�geois", 10);
		CarteDesserts dessert7 = new CarteDesserts ("Caf� gourmant", 12);
		CarteDesserts dessert8 = new CarteDesserts ("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache", 11);
		CarteDesserts dessert9 = new CarteDesserts ("Rien", 0); */
		
			System.out.println("Kenavo, voici la carte, choisissez votre menu: ");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu Terre et Mer, 35�");
					System.out.println(" ");
					System.out.println("Entr�es :");
					System.out.println("Terrines de foie gras � l'anguille fum�e");
					System.out.println("Flan d'�pinard aux fruits de mers");
					System.out.println("Salade Terre et Mer (penne, chorizo, thon,courgette, ma�s");
					System.out.println(" ");
					System.out.println("Les plats: ");
					System.out.println("Delices de canard au confit de figues et feuillet�s � la mousse de sardine");
					System.out.println("Poulet aux �crevisses");
					System.out.println("Foie gras po�l� et Saint Jacques");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu Ocean, 40�");
					System.out.println(" ");
					System.out.println("Entr�es :");
					System.out.println("Foie gras po�l� et Saint Jacques");
					System.out.println("Assiette de 12 hu�tres");
					System.out.println("Carpaccio de saumon");
					System.out.println("Bisque de homard");
					System.out.println(" ");
					System.out.println("Les plats :");
					System.out.println("Noix de Saint Jacques saut�es aux champignons");
					System.out.println("Risotto aux calamars");
					System.out.println("Spaguettis aux fruits de mer");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu du terroir, 38�");
					System.out.println(" ");
					System.out.println("Entr�es :");
					System.out.println("Pat� H�naff et sa salade compos�e");
					System.out.println("Andouille de Gu�men�");
					System.out.println("Coquille Saint Jacques gratin�e de la baie de Saint Brieuc");
					System.out.println(" ");
					System.out.println("Les plats : ");
					System.out.println("Galette au bl� noir");
					System.out.println("La cotriade (morceaux de poissons, moules de Buch�t, pomme de terre, ails, �chalotes");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu v�g�tarien, 22�");
					System.out.println(" ");
					System.out.println("Entr�es :");
					System.out.println("Salade de ch�vre chaud");
					System.out.println("Salade C�sar");
					System.out.println("Cr�me d'asperge et de champignons");
					System.out.println(" ");
					System.out.println("Les plats :");
					System.out.println("Patates douces gratin�es au fromage");
					System.out.println("Polenta de l�gumes");
					System.out.println("Curry de l�gumes");
					System.out.println(" ");
					System.out.println("Desserts :");
					System.out.println("Au choix");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println("Menu Petit Prince, 13�");
					System.out.println(" ");
					System.out.println("Entr�es :");
					System.out.println("Petite salade et carottes r�p�es");
					System.out.println(" ");
					System.out.println("Les plats :");
					System.out.println("Steack hach� acompagn� de frites");
					System.out.println("Poisson pan� accompagn� de son riz au safran");
					System.out.println(" ");
					System.out.println("Desserts : ");
					System.out.println("Glace 2 boules, parfum au choix");
					System.out.println("Mousse au chocolat");
					System.out.println("Cr�me br�l�e");
					System.out.println(" ");
					System.out.println("*****");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Entr�es � la carte: ");
					System.out.println(" ");
					System.out.println("Gaufre de pomme de terre au saumon fum� et chantilly citronn�e");
					System.out.println("�ufs mimosa aux �ufs de saumon");
					System.out.println("Salade de crabe");
					System.out.println("Terrine v�g�tale");
					System.out.println("Velout� aux champignons et � la truffe");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Plats � la carte: ");
					System.out.println(" ");
					System.out.println("Saumon teriyaki aux l�gumes");
					System.out.println("Gigot d�agneau");
					System.out.println("Nouilles saut�es aux l�gumes");
					System.out.println("Gratin de courgettes");
					System.out.println("Filet de bar et son riz safran�");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Desserts � la carte: ");
					System.out.println(" ");
					System.out.println("Gateau au chocolat et sa mousse onctueuse");
					System.out.println("Cr�me brul�e");
					System.out.println("Tarte au citron meringu�");
					System.out.println("arte aux fraises de Plougastel");
					System.out.println("Dame Blanche");
					System.out.println("Caf� Li�geois");
					System.out.println("Caf� gourmant");
					System.out.println("Glace 2 boules, parfum au choix: vanille, fraise, chocolat, pistache");
					System.out.println(" ");
					System.out.println(" ");
					
					boolean reponse = false;
					while(!reponse) {
						
						System.out.println("Avez vous fait votre choix? true/false");
					
						reponse = scannerObject.nextBoolean();
					
					if (reponse) {
					
						System.out.println("Voulez vous un menu? Ou � la carte? true/false");
					
						boolean reponse2 = scannerObject.nextBoolean();
					
						if (reponse2) {
						
							System.out.println("Que d�sirez-vous prendre?");
							System.out.println("1. Menu Terre et Mer");
							System.out.println("2. Menu Oc�an");
							System.out.println("3. Menu du terroir");
							System.out.println("4. Menu v�g�tarien");
							System.out.println("5. Menu Petit Prince");
		
							int Menu = scannerObject.nextInt();
		
							switch(Menu) {
							case 1:
								System.out.println("Menu Terre et Mer, tr�s bon choix!");
								System.out.println(" ");
								menuTerreEtMer.menuTerreEtMer();
								menuTerreEtMer.payer();
							break;
	
							case 2:
								System.out.println("Menu Oc�an, nos fruits de mers sont frais de la cri�e de ce matin!");
								System.out.println(" ");
								menuOcean.menuOcean();
								menuOcean.payer();
							break;
	
							case 3:
								System.out.println("Menu du Terroir, d�gustez nos sp�cialit�s.");
								System.out.println(" ");
								menuDuTerroir.menuDuTerroir();
								menuDuTerroir.payer();
							break;
			
							case 4:
								System.out.println("Vous allez aimer nos l�gumes issus de l'agriculture biologique");
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
							System.out.println("Le montant de votre addition est : " + addition + " �.");
							
							System.out.println("Comment d'argent liquide poss�dez vous? ");
							int montantEspece = scannerObject.nextInt();
							
							if (montantEspece > addition) {
								int rendreMonnaie = montantEspece - addition;
								System.out.println("Je vous rends la monnaie : " + rendreMonnaie + " �.");	
							}		
							else if (montantEspece == addition) {
								System.out.println("Merci pour votre visite, � bient�t!");
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
