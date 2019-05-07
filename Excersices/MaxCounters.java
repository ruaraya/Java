package excersices;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		
		//int A[] = {3,4,4,6,1,4,4};
		int A[] = {2, 1, 1, 2, 1};
		MaxCounters sol = new MaxCounters();
		int N = 1;
		sol.solution(N, A);
	}
	
	public int[] solution(int N, int[] A){
		
		int counter[] = new int[N];
		int value = 0;
		int maxCounter = 0;
		
		Arrays.fill(counter, 0);
		
		for (int i=0; i<A.length; i++){
			
			if (A[i] <= N){
				
				int index = A[i]-1;
				value = counter[index];
				value++;
				counter[index] = value;
				
				if (value > maxCounter)
					maxCounter = value;
				
				System.out.println(Arrays.toString(counter));
				
			}else{
				Arrays.fill(counter, maxCounter);
				System.out.println(Arrays.toString(counter));
			}
			
		}
		
		return counter;
		
	}

}
