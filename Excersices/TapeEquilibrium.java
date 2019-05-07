package excersices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.math.*;

public class TapeEquilibrium {

	public static void main(String[] args) {
		
		int A[] = {3,1,2,4,3};
		TapeEquilibrium sol = new TapeEquilibrium();
		sol.solution(A);

	}

	public int solution(int[] A){
		
		//List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		int min = 9999999;		
		int curr = 0;
		int size = A.length;
		int num1 = 0;
		int num2 = 0;
				
		for (int i = 0; i < size-1; i++){
			
			//first = IntStream.range(0,  i+1).sum();
			//second = IntStream.range(i+1, size).sum();
			
			int first[] = Arrays.copyOfRange(A, 0, i+1);
			int second[] = Arrays.copyOfRange(A, i+1, size);
			
			num1 = IntStream.of(first).sum();
			num2 = IntStream.of(second).sum();
			
			//for (int j = 0; j < first.length; j++){
			//	System.out.print(Arrays.toString(first));
			//	System.out.print(Arrays.toString(second));
			//	System.out.println("");
			//}
			//first = list.subList(0, i+1).stream().mapToInt(Integer::intValue).sum();
			//second = list.subList(i+1, size).stream().mapToInt(Integer::intValue).sum();
			
			curr = Math.abs(num1-num2);
			
			if (curr < min)
				min = curr;
					
		}
		
		System.out.println(min);
								
		return min;
		
	}
	
}
