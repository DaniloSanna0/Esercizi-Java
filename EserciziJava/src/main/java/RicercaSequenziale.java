
public class RicercaSequenziale {

	public static void main(String[] args) {
		testRicercaSequenziale();
	}
	
	private static void testRicercaSequenziale() {
		int[] arr = {3,8,1,6,9};
		int x = 7;
		int index = ricercaSequenziale(arr, x);
		if (index != -1) {
			System.out.println(x + " presente in posizione " + index);
		}else {
			System.out.println("Nessuna corrispondenza");
		}
	}

	public static int ricercaSequenziale(int[] arr,int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
