
public class SommaElementiArray {

	public static void main(String[] args) {
		sommaElementiArray(new int[] {2, 6, 5, 6, 4});
		System.out.println(sommaElementiArray(new int[] {2, 6, 5, 6, 4}));
	}
	
	public static int sommaElementiArray(int [] arr){
		int acc = 0;
		for(int i = 0; i<arr.length;i++){
			acc += arr[i];
		}
		return acc;
	}

}
