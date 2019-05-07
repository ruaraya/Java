package excersices;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSequence {

	public static void main(String[] args) {
		
		ArrayList<Integer> sequence = new ArrayList<>();
		sequence.add(2);
		sequence.add(8);
		sequence.add(3);
		sequence.add(-2);
		sequence.add(4);
		sequence.add(10);
		
		ContinuousSequence check = new ContinuousSequence();
		check.getSequenceandValue(sequence);
		
		//{2, 8, 3, -2, 4, 10}
		
	}
	
	public void getSequenceandValue(ArrayList<Integer> sequence){
		
		ArrayList<Integer> curSequence = new ArrayList<>();
		//ArrayList<Integer> bestSequence = new ArrayList<>();
		ArrayList<String> bestSequence = null;
		int limit = sequence.size();
		int currValue = 0;
		int nextValue = 0;
		int sum = 0;
		int maxValue = 0;
		
		for(int i=0; i<limit; i++){
			curSequence.add(sequence.get(i));
			currValue = sequence.get(i);
			sum = currValue;
			for(int j=i; j<limit-1; j++){
				
				curSequence.add(sequence.get(j+1));
				nextValue = sequence.get(j+1);
								
				sum = sum + nextValue;
				/*
				System.out.println("currValue : " + currValue);
				System.out.println("nextValue : " + nextValue);
				System.out.println("sum : " + sum);
				*/
				if (sum > maxValue){
					maxValue = sum;
					bestSequence = (ArrayList<String>)curSequence.clone();
					
					System.out.println("Max value : " + maxValue);
					System.out.println("Sequence : " + bestSequence.toString());
					System.out.println("");
					
				} else {
					curSequence.clear();
					//maxValue = 0;
					sum = 0;
					break;
				}
			}
			
		}
		
		
			
		
	}

}
