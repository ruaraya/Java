package excersices;

public class TurnMatrix {

	static int n = 5;
	
	public static void main(String[] args) {
				
		int [][] matrix = new int [n][n];
		int [][] newMatrix = new int [n][n];
		int count = 1;
		TurnMatrix turnmatrix = new TurnMatrix();
		
		System.out.println("Before");
		
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				matrix[i][j] = count;
				System.out.print(matrix[i][j] + " ");
				count++;
			}
			System.out.println("");
		}
		
		newMatrix = turnmatrix.clockWiseSwipe(matrix);

		System.out.println("After");
		
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				System.out.print(newMatrix[i][j] + " ");
				
			}
			System.out.println("");
		}
		
	}
	
	public int[][] clockWiseSwipe(int [][] matrix){
		
		int offset = (matrix.length / 2);
		int length = matrix.length;
		int index = length-1;
		int poss1, poss2, poss3, poss4;
		int x = 0;
		
			for (int i=0; i<offset; i++){
				for (int j=x; j<length-1; j++){
					
					poss1 = matrix[i][j];
					poss2 = matrix[j][index-i];
					poss3 = matrix[index-i][index-j];
					poss4 = matrix[index-j][i];
					
					matrix[i][j] = poss4;
					matrix[j][index-i] = poss1;
					matrix[index-i][index-j] = poss2;
					matrix[index-j][i] = poss3;
					
				}
				x++;
				length--;
				System.out.println("next layer");
				
			}
			
		return matrix;
	
	}

	public int[][] clockWise(int [][] matrix){
		
		int [][] newMatrix = new int [n][n] ;
		int index = (newMatrix.length) - 1;
		
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				newMatrix[j][index] = matrix[i][j];
				System.out.println(newMatrix[index][j] + " ");
			}
			index--;
			//System.out.println("");
		}		
		
		return newMatrix;
		
	}
	
}
