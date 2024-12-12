public class ArrayCheck {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6}; 
        int[] array2 = {2, 6, 4, 1, 5, 3}; 


        System.out.println("Array 1 è ordinato: " + isSorted(array1));
        System.out.println("Array 2 è ordinato: " + isSorted(array2));
    }

    
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
}
