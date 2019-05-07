package excersices;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {

		int A[] = {};
		
		PermMissingElem sol = new PermMissingElem();
		sol.solution(A);
		
		
	}
	
	public int solution(int[] A){
		
		int x = 0;
		Arrays.sort(A);
		
		if (A.length == 0){
			return 1;
		}
		
		if (A.length == 1){
			
			return 2;
		}
		
		
		for (int i=0; i<A.length; i++){
			
			x = i+1;
			
			if (i+1 != A[i]){
				return x;
			}
		}
		
		return x;
		
	}

}
