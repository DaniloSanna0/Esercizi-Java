package New2025.es3;

import java.util.Scanner;

public class Controller2 {

	static Libro[] libreria = new Libro[10];
	static boolean aperta = true;
	static int index = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (aperta) {
			stampaMenu();
			int input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				System.out.println("Arrivederci");
				aperta = false;
				break;
			case 2:
				addLibro();

				break;
			case 3:
				deleteLibro();
				break;
			case 4:
				editLibro();
				break;
			case 5:
				ricercaPrezzo();
				break;

			default:
				System.out.println("Input errato");
				break;
			}
		}

	}

	private static void ricercaPrezzo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il prezzo minimo");
		double x = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci il prezzo massimo");
		double y = scanner.nextDouble();
		scanner.nextLine();

		for (int i = 0; i < libreria.length; i++) {
			if (libreria[i] != null && libreria[i].prezzo >= x && libreria[i].prezzo <= y) {
				System.out.println(libreria[i].toString());
			}
		}
	}

	private static void ricercaPrezzoMax() {
	    System.out.println("Ricerca del libro dal prezzo maggiore");
	    Libro libroMax = null;

	    for (int i = 0; i < libreria.length; i++) {
	        if (libreria[i] != null && (libroMax == null || libreria[i].prezzo > libroMax.prezzo)) {
	            libroMax = libreria[i];
	        }
	    }

	    if (libroMax != null) {
	        System.out.println(libroMax.toString());
	    } else {
	        System.out.println("Nessun libro disponibile.");
	    }
	}


	private static void editLibro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il titolo del libro da modificare:");
		String titolox = scanner.nextLine();
		boolean trovato = false;

		for (int i = 0; i < index; i++) {
			if (libreria[i] != null && libreria[i].titolo.equals(titolox)) {
				trovato = true;

				System.out.println("sati modificando il libro");
				System.out.println("inserisci IBSN");
				int ibsn = Integer.parseInt(scanner.nextLine());
				System.out.println("inserisci il titolo");
				String titolo = scanner.nextLine();
				System.out.println("inserisci l'autore");
				String autore = scanner.nextLine();
				System.out.println("inserisci il numero di pagine");
				int pagine = Integer.parseInt(scanner.nextLine());
				System.out.println("inserisci il prezzo");
				double prezzo = Double.parseDouble(scanner.nextLine());
				System.out.println("libro modificato");

				libreria[i] = new Libro(ibsn, titolo, autore, pagine, prezzo);
				break;
			}

		}

		if (!trovato) {
			System.out.println("Libro non trovato.");
		}
	}

	private static void deleteLibro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il titolo del libro da eliminare:");
		String titolo = scanner.nextLine();

		boolean trovato = false;

		for (int i = 0; i < index; i++) {
			if (libreria[i] != null && libreria[i].titolo.equals(titolo)) {
				trovato = true;

				for (int j = i; j < index - 1; j++) {
					libreria[j] = libreria[j + 1];
				}

				libreria[index - 1] = null;
				index--;
				System.out.println("Libro \"" + titolo + "\" eliminato.");
				break;
			}
		}

		if (!trovato) {
			System.out.println("Libro non trovato.");
		}
	}

	private static void addLibro() {
		if (index >= libreria.length) {
			System.out.println("Libreria piena! Impossibile aggiungere altri libri.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("sati aggiungendo il libro");
		System.out.println("inserisci IBSN");
		int ibsn = Integer.parseInt(scanner.nextLine());
		System.out.println("inserisci il titolo");
		String titolo = scanner.nextLine();
		System.out.println("inserisci l'autore");
		String autore = scanner.nextLine();
		System.out.println("inserisci il numero di pagine");
		int pagine = Integer.parseInt(scanner.nextLine());
		System.out.println("inserisci il prezzo");
		double prezzo = Double.parseDouble((scanner.nextLine()));
		System.out.println("libro aggiunto");

		libreria[index] = new Libro(ibsn, titolo, autore, pagine, prezzo);
		index++;
		System.out.println("Libro aggiunto con successo!");
	}

	private static void stampaMenu() {
		System.out.println("MENù");
		System.out.println("1 chiudi menù");
		System.out.println("2 AGGIUNGI LIBRO");
		System.out.println("3 CANCELLA LIBRO");
		System.out.println("4 MODIFICA LIBRO");
		System.out.println("5 RICERCA PREZZO");

	}

}
