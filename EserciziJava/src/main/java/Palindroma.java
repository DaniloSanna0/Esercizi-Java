import java.util.Arrays;

public class Palindroma {
	public static void main(String[] args) {
	//	palindroma("gatto");
	//	palindroma("anna");
		//	palindroma2(new char[]{'g', 'a', 't', 't', 'o'});
		//	palindroma2(new char[]{'a', 'n', 'n', 'a'});
		palindroma3(new char[]{'g', 'a', 't', 't', 'o'});
		palindroma3(new char[]{'a', 'n', 'n', 'a'});
		palindroma3(new char[]{'a', 'i', 'v', 'i', 'a'});
		palindroma3(new char[]{'c', 'a', 'n', 'n', 'a'});
	}
	
	public static boolean palindroma(String parola) {
		
		String[] arr = parola.split("");
		String[] reverse = new String[parola.length()];
		
		for (int i = 0; i < arr.length; i++) {
			reverse[(arr.length - 1) - i] = arr[i];
    		
    	}
		
		String str1 = String.join("", arr);
		String str2 = String.join("", reverse);
		if(str1.equals(str2)) {
			System.out.println(str1);
			System.out.println(str2);
			System.out.println("true");
			return true;
		}
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("false");
		return false;
	}
	
	
	
	public static boolean palindroma2(char[] parola) {
		
		char[] arr = new char[parola.length];
		
		for (int i = 0; i < parola.length; i++) {
			arr[i] = parola[(parola.length - 1) - i];
    		
    	}
		
		for (int i = 0; i < parola.length; i++) {
	        if (parola[i] != arr[i]) {
	            System.out.println(Arrays.toString(parola));
	            System.out.println(Arrays.toString(arr));
	            System.out.println("false");
	            return false;
	        }
	    } 
		System.out.println(Arrays.toString(parola));
		System.out.println(Arrays.toString(arr));
		System.out.println("true");
		return true;
		
	}
	
	public static boolean palindroma3(char[] parola) {
		for (int i = 0; i < parola.length /2; i++) {
			if(parola[i] != parola[(parola.length -1) - i]) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
		
	}
}
