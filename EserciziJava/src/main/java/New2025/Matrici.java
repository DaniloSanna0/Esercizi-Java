package New2025;

public class Matrici {

	public static void main(String[] args) {

    int[][] prova = {{2, 4, 8}, {3, 2, 0}, {5, 3, 1}, {0, 1, 0}};
        
        System.out.println("Matrice originale:");
        for (int i = 0; i < prova.length; i++) {
            for (int j = 0; j < prova[i].length; j++) {
                System.out.print(prova[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] trasposta = matriceTrasposta(prova);
        System.out.println("\nMatrice trasposta:");
        for (int i = 0; i < trasposta.length; i++) {
            for (int j = 0; j < trasposta[i].length; j++) {
                System.out.print(trasposta[i][j] + " ");
            }
            System.out.println();
        }
	}
	public static void metodo1() {
		int[][] matrix = new int[2][2];
		
		int rows = matrix.length;
		
		for (int i = 0; i < rows; i++) {
			int[] row = matrix[i];
			int cols = matrix[i].length;
			
			for (int j = 0; j < cols; j++) {
				System.out.println(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void metodo2() {
		int[][] matrix = new int[3][3];
		
	}

	public static int[][] sommaMatrici(int[][] m1, int[][] m2) {
		
		int [][] tmp = new int [m1.length][m1[0].length];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				tmp[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		return tmp;
		
	}

	public static int sommaDiagonale(int[][] x) {
		int acc = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			int num = x[i][i];

			acc += num;
		}
		
		return acc;
	}
	
	public static int sommaSuperiore(int[][] x) {
	int acc = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				
					int num = x[i][j];
					
					acc += num;
					
			}
			
		}
		
		return acc;
	}
	
	public static int[][] matriceTrasposta(int[][] x) {
		
		int[][] nuovo = new int [x[0].length][x.length];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				
				nuovo[j][i] = x[i][j];
			}
			
		}
		
		return nuovo;
	}
}