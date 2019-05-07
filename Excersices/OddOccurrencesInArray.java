package excersices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		
		int A[] = {9,3,9,3,9,7,9,2,2,7,7,7,3,4,3,4,5,6,6,8,8,7,6,5,3,2,5,7,5,4,3,2,1,3,2,4,3,2,2,4,8,9,7,6,5,1,1};
		//int A[] = {3,3,9,9,9,9,7};
		
		//Arrays.sort(A);
		
		OddOccurrencesInArray sol = new OddOccurrencesInArray();
		sol.solution(A);

	}
	
public int solution(int[] A){
		
		int aux = 0;
		int count = 0;
		boolean paried = false;
				
		Map<Integer, Integer> map = new HashMap<>();
		for (int key : A) {
            if (map.containsKey(key)) {
                int occurrence = map.get(key);
                occurrence++;
                map.put(key, occurrence);
            } else {
                map.put(key, 1);
            }
        }

        for (Integer key : map.keySet()) {
            int occurrence = map.get(key);
            if ((occurrence == 1) || (occurrence % 2 != 0)) {
            	System.out.println(key + " occur " + occurrence + " time(s).");
            	return key;
            }
        }
	
        return 0;
        
	}	

}
