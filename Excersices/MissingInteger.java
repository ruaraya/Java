package excersices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingInteger {

	public static void main(String[] args) {
		
		//int myNumbers[] = {-1,-3,3};
		int myNumbers[] = {1,3,6,4,1,2};
		//int myNumbers[] = {-1,-3};
		//int myNumbers[] = {1,2,3};
		
		
		MissingInteger sol = new MissingInteger();
		sol.solution(myNumbers);
		
	}

	public int solution(int[] A){
		
		Arrays.sort(A);
		
		int index = 1;
		int curr = 0;
		int smallest = 1;
		boolean cont = false;
		
		for (int i=0; i<A.length; i++){
			curr = A[i];
			
			if (curr > smallest){
				cont = true;
			}
		}
			
		if (cont == true){
			
			cont = false;
			
			for (int i=0; i<A.length; i++){
				curr = A[i];
				
				if (curr == index){
					index++;
				} else {
					cont = true;
					index++;
				}
				
			}
			
			if (cont == true){
				
				for (int i=0; i<A.length; i++){
					curr = A[i];
					
					if (curr < 0){
						curr = 1;
						index = 1;
						break;
					}
				
					if (curr <= index){
						index = curr;
					} else
						index++;
					
				}
				
				System.out.println("Larger positive : " + index);
				return index;
				
			} else {
				System.out.println("Larger positive : " + index);
				return index;
			}
			
		}else{
			System.out.println("Larger positive : " + smallest);
			return smallest;
		}
		
		//return smallest;
			
	}	
	
}
