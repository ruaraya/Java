package excersices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {

	public static void main(String[] args) {
		
		//int A[] = {1,3,1,4,2,3,5,4};
		
		//int A[] = {1,3,3,1,2,2,3};
		
		//int A[] = {1,2,3,4,5};
		
		int A[] = {5};
		
		FrogRiverOne sol = new FrogRiverOne();
		sol.solution(5, A);
		
	}
	
	public int solution(int X, int[] A){
		
		//Arrays.sort(A);
		int counter = 0;
				
		Map<Integer, Integer> map = new HashMap<>();
		for (int key : A) {
            if (map.containsKey(key)) {
                
            	if (map.size() == X){
            		//System.out.println(counter);
            		return counter;
            	}
            	
            } else {
            	//System.out.println("put value : " + key);
                map.put(key, 1);
                //System.out.println("map size : " + map.size());
                	if (map.size() == X){
                		//System.out.println(counter);
                		return counter;
                	}
                
            }
            counter++;
            //System.out.println("counter : "+ counter);
        }
		
		/*
		for (int i=0; i<A.length; i++){
			System.out.println(A[i]);
		}
		*/
		//System.out.println("-1");
		return -1;
		
	}

}
