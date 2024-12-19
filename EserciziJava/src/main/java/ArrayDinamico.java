import java.util.Arrays;
import java.util.Scanner;

public class ArrayDinamico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inscerisci n: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length;i++){
			System.out.println("Inscerisci arr["+i+"] ");
			int x = scanner.nextInt();
			arr[i]= x;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
