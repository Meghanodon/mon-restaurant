import java.util.Scanner;

public class CartePlats {

	static Scanner scannerObject = new Scanner(System.in);
	
	static int prixPlat;
	String plats;
	
	public CartePlats(String plats, int prixPlat) {
		this.plats = plats;
		this.prixPlat = prixPlat;
	}
	
	public static void plats() {
		
		System.out.println("Choisissez votre plat parmi la carte :");
		System.out.println(" ");
		System.out.println("1. Saumon teriyaki aux l�gumes");
		System.out.println("2. Gigot d�agneau");
		System.out.println("3. Nouilles saut�es aux l�gumes");
		System.out.println("4. Gratin de courgettes");
		System.out.println("5. Filet de bar et son riz safran�");
		System.out.println("6. Delices de canard au confit de figues et feuillet�s � la mousse de sardine");
		System.out.println("7. Noix de Saint Jacques saut�es aux champignons");
		System.out.println("6. Je ne veux pas de plat.");
	    
		int plats = scannerObject.nextInt();
		prixPlat = 0;
		
		switch(plats) {
		case 1:
			System.out.println("Votre plat de r�sistance: Saumon teriyaki aux l�gumes");
			prixPlat = 15;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;

		case 2:
			System.out.println("Votre plat de r�sistance: Gigot d�agneau");
			prixPlat = 14;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;

		case 3:
			System.out.println("Votre plat de r�sistance: Nouilles saut�es aux l�gumes");
			prixPlat = 13;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;
	
		case 4:
			System.out.println("Votre plat de r�sistance: Gratin de courgette");
			prixPlat = 8;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;

		case 5:
			System.out.println("Votre plat de r�sistance: Filet de bar et son riz safran�");
			prixPlat = 11;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;
		
		case 6:
			System.out.println("Delices de canard au confit de figues et feuillet�s � la mousse de sardine");
			prixPlat = 13;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;
		
		case 7:
			System.out.println("Poulet aux �crevisses");
			prixPlat = 14;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;
		
		case 8:
			System.out.println("Foie gras po�l� et Saint Jacques");
			prixPlat = 16;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;
		
		case 9:
			System.out.println("Je ne veux pas de plat.");
			prixPlat = 0;
			System.out.println( ("Le prix du plat est : " + prixPlat + " �.") );
		break;

		   default:
				System.out.println("Nous n'avons pas ce plat � vous proposer.");
		}
	}
}

