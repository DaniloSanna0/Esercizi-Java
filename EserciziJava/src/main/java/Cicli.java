import java.util.Iterator;
import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		ciclo();
	}
	
	public static int ciclo() {
		Scanner scanner = new Scanner(System.in);
		int inte = scanner.nextInt();
		for(int i = 0; i <= inte; i++){
			System.out.println(i);
		}
		return inte;
	}

}
