import java.util.Scanner;

public class SommaElementiArray {

	public static void main(String[] args) {
		sommaElementiArray(new int[] { 2, 6, 5, 6, 4 });
		System.out.println(sommaElementiArray(new int[] { 2, 6, 5, 6, 4 }));
		System.out.println(ElementoMinoreArray(new int[] { 2, 6, 5, 6, 4 }));
	}

	public static int sommaElementiArray(int[] arr) {
		int acc = 0;
		for (int i = 0; i < arr.length; i++) {
			acc += arr[i];
		}
		return acc;
	}

	public static int sommaElementiPariArray(int[] arr) {
		int acc = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				acc += arr[i];
			}
		}
		return acc;
	}

	public static double mediaElementiArray(int[] arr) {
		int acc = 0;
		for (int i = 0; i < arr.length; i++) {
			acc += arr[i];
		}
		double media = acc / arr.length;
		return media;
	}

	public static int ElementoMinoreArray(int[] arr) {
		int acc = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (acc > arr[i]) {
				acc = arr[i];
			}
		}
		return acc;
	}
	public static int contaOccorrenze(int[] arr, int x) {
		int acc = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (x == arr[i]) {
				acc++;
			}
		}
		return acc;
	}
	public static int contaOccorrenze2(int[] arr) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int acc = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (x == arr[i]) {
				acc++;
			}
		}
		return acc;
	}
}
