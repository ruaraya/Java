package excersices;

public class CyclingRotation {

	public static void main(String[] args) {
		
		int A[] = {1,2,3};
		int K = 3;
		
		CyclingRotation sol = new CyclingRotation();
		sol.solution(A, K);

	}
	
	public int[] solution(int[] A, int K){
		
		int shifted[]=new int[A.length];
		int count = 1;
		int aux = 0;
		
		while (count <= K) {
			//shifted.
			for (int i=0; i<=A.length-1; i++){
				
				if (i == A.length-1){
					shifted[0]=A[i]; 
					System.out.println("Last Index : " + i + " - " + A[i]);
				}else{
					System.out.println("Index : " + i + " - " + A[i]);
					shifted[i+1]=A[i];
				}
							
			}
			
			for (int i=0; i<=A.length-1; i++){
				A[i] = shifted[i];
			}
			
			count++;
		}
		
		
		for (int i=0; i<=shifted.length-1; i++){
			System.out.println("new array : ");
			System.out.print(shifted[i]);
		}
		return shifted;
		
	}

}
