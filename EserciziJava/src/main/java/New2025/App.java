package New2025;

import java.util.Arrays;

public class App {

	public static Contatto[] rubrica = new Contatto[10]; // variabile globale

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		boolean continua = true;
		while (continua) { // while (continua == true) { ... }
			stampaMenu();
			int scelta = leggiScelta(scanner);

			switch (scelta) {
			case 0: // scelta == 0 ? TRUE/FALSE
				System.out.println("Arrivederci!");
				continua = false;
				break;
			case 1: // scelta == 1 ? TRUE/FALSE
				inserimentoContatto(scanner);
				break;
			case 2: // scelta == 2 ? TRUE/FALSE
				modifica(scanner);
				break;
			case 3:
				elimina(scanner);
				break;
			case 4:
				RicercaContattoNumero(scanner);
				break;
			case 5:
				stampaRubrica();
				break;
			}
		}
	}

	public static void stampaRubrica() {
		System.out.println("*** RUBRICA ***");
		// System.out.println(rubrica);
		// System.out.println(java.util.Arrays.toString(rubrica));
		for (int i = 0; i < rubrica.length; i++) {
			Contatto contatto = rubrica[i];
			if (contatto != null) {
				// System.out.println(contatto) <==> System.out.println(contatto.toString())
				// System.out.println(contatto.toString());
				System.out.println(contatto);
			}
		}
	}

	public static void inserimentoContatto(java.util.Scanner scanner) {

		Contatto contatto = new Contatto();
		System.out.print("Inserisci nome: ");
		contatto.nome = scanner.nextLine();
		System.out.print("Inserisci cognome: ");
		contatto.cognome = scanner.nextLine();
		System.out.print("Inserisci cellulare: ");
		contatto.cellulare = scanner.nextLine();
		addContatto(contatto);
	}

	public static void addContatto(Contatto contatto) {
		for (int i = 0; i < rubrica.length; i++) {
			if (rubrica[i] == null) {
				if (rubrica[i] != null && rubrica[i].nome.equals(contatto.nome)) {
					System.out.println("già presente");
				}
				rubrica[i] = contatto;
				return;
			}
		}
		Contatto[] tmp = new Contatto[rubrica.length * 2];
		for (int i = 0; i < rubrica.length; i++) {
			tmp[i] = rubrica[i];
		}
		tmp[rubrica.length] = contatto;
		rubrica = tmp;
	}

	public static void stampaMenu() {
		System.out.println("*** MENU ***");
		System.out.println("0. per uscire");
		System.out.println("1. per inserire un contatto");
		System.out.println("2. per modificare un contatto");
		System.out.println("3. per eliminare un contatto");
		System.out.println("4. per cercare un numero");
		System.out.println("5. per visualizzare la rubrica");
	}

	public static int leggiScelta(java.util.Scanner scanner) {
		System.out.print("Inserisci scelta: ");
		// Integer.parseInt(value: String): int
		int scelta = Integer.parseInt(scanner.nextLine());
		/*-
		x = scelta != 0 ? TRUE/FALSE (1/0)
		y = scelta != 1 ? TRUE/FALSE (1/0)
		
		x | y | x && y      x    |   y   | x && y
		-------------- =>  ---------------------
		0 | 0 |   0        FALSE | FALSE | FALSE
		0 | 1 |   0        FALSE | TRUE  | FALSE
		1 | 0 |   0        TRUE  | FALSE | FALSE
		1 | 1 |   1        TRUE  | TRUE  | TRUE
		*/
		while (scelta < 0 || scelta > 5) {
			System.out.print("Errore...inserisci scelta: ");
			scelta = Integer.parseInt(scanner.nextLine());
		}
		return scelta;
	}

	public static int modifica(java.util.Scanner scanner) {

		System.out.print("Inserisci il nome del contatto da modificare: ");
		String nomeDaCercare = scanner.nextLine();
		boolean trovato = false;

		for (int i = 0; i < rubrica.length; i++) {
			if (rubrica != null && rubrica[i].nome.equalsIgnoreCase(nomeDaCercare)) {
				System.out.println("inserisci nome");
				rubrica[i].nome = scanner.nextLine();
				System.out.println("inserisci cognome");
				rubrica[i].cognome = scanner.nextLine();
				System.out.println("inserisci numero");
				rubrica[i].cellulare = scanner.nextLine();
				trovato = true;
				System.out.println("Contatto modificato con successo!");
				break;
			}
			if (!trovato) {
				System.out.println("Contatto non trovato!");
			}

		}

		return 0;

	}

	public static void RicercaContattoNumero(java.util.Scanner scanner) {
		if (rubrica == null || rubrica.length == 0) {
			System.out.println("La rubrica è vuota o non inizializzata.");
			return;
		}

		System.out.print("Inserisci il numero del cellulare da cercare: ");
		String tel = scanner.nextLine();
		boolean trovato = false;

		for (int i = 0; i < rubrica.length; i++) {
			if (rubrica[i] != null && rubrica[i].cellulare.equals(tel)) {
				System.out.println("Numero trovato: " + tel);
				trovato = true;
				break;
			}
		}

		if (!trovato) {
			System.out.println("Numero non esistente.");
		}

	}

	public static int elimina(java.util.Scanner scanner) {

		System.out.print("Inserisci il nome del contatto da eliminare: ");
		String nomeDaCercare = scanner.nextLine();
		boolean trovato = false;

		for (int i = 0; i < rubrica.length; i++) {
			if (rubrica != null && rubrica[i].nome.equalsIgnoreCase(nomeDaCercare)) {
				rubrica[i] = null;
				trovato = true;
				System.out.println("Contatto eliminato con successo!");
				break;
			}

		}
		if (!trovato) {
			System.out.println("Contatto non trovato!");
		}
		
		compattazioneRubrica(rubrica);
		return 0;
	}

	public static Contatto[] compattazioneRubrica(Contatto[] rubrica) {
	    for (int i = 0; i < rubrica.length; i++) {
	        if (rubrica[i] == null) {  
	            for (int j = i + 1; j < rubrica.length; j++) {
	            	if (rubrica[j] != null) {  
	            		rubrica[i] = rubrica[j];
	            		rubrica[j] = null;
	            		break;
	                }
	            }
	        }
	    }
	    return rubrica;
	}

}
