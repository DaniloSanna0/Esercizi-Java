package New2025;

import java.util.Arrays;

public class ArrayInteger {

	public static void main(String[] args) {
		  Integer[] arr = new Integer[3];
	        arr[0] = 1;
	        arr[1] = 2;

	        arr = add(arr, 3);
	        arr = add(arr, 4); 

	}

	public static Integer[] add(Integer[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = x;
				return arr;
			}
		}
		
		Integer[] tmp = new Integer[arr.length * 2];
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		tmp[arr.length] = x;
		arr = tmp;
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
