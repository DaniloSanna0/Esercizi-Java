
public class App {

	public static void main(String[] args) {
		// stampaPrimi10NumeriFor();
		// stampaPrimi10NumeriWhile();
		// stampaPrimiXNumeri();
		testSomma();
	}

	public static void testSomma() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Inserisci x: ");
		int x1 = scanner.nextInt();
		System.out.print("Inserisci y: ");
		int x2 = scanner.nextInt();
		int x3 = somma(x1, x2);
		System.out.println(x1 + " + " + x2 + " = " + x3);
	}

	// z = x + y
	// es. x = 3 | y = 4
	// z = 3 + 1 + 1 + 1 + 1
	public static int somma(int x, int y) {
		/*-
		int z = x + y;
		return z;
		*/
		int z = x;
		for (int i = 0; i < y; i++) {
			// z = z + 1;
			z++;
		}
		return z;
	}

	public static void stampaPrimiXNumeri() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Inserisci numero: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static void stampaPrimi10NumeriWhile() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void stampaPrimi10NumeriFor() {
		/*-
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		*/

		for (int i = 1; i <= 10; i++) {
			System.out.println("valore i-esimo: " + i + " ...");
		}

		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("valore i-esimo: " + i + " ...");
		}
	}

}
