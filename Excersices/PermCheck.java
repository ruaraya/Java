package excersices;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,25};
		
		PermCheck sol = new PermCheck();
		sol.solution(A);

	}
	
	public int solution(int[] A){
		
		Arrays.sort(A);
		int x = 0;
		
		for (int i=0; i<A.length; i++){
			x++;
			if (x == A[i]){
				System.out.println(x + " == " + A[i]);
			}else{
				System.out.println("0");
				return 0;
			}
			
			//System.out.println(A[i]);
			
		}
		//System.out.println("1");
		return 1;
		
	}

}
