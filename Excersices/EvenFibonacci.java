package excersices;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacci {

	public static void main(String[] args) {

		EvenFibonacci evenFibonacci = new EvenFibonacci();
		int resp = evenFibonacci.evenFibonacciSum(100);
		System.out.println(resp);

	}

	public Integer evenFibonacciSum(Integer n) {
		
		int sumEvenNumbers = 0;
		List<Integer> fibonacci = new ArrayList<Integer>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		for (int i = 1; i<=1000; i++){
			int val = fibonacci.get(i-1) + fibonacci.get(i);
			fibonacci.add(val);
		}
		
		for (int i = 1; i<fibonacci.size(); i++){
			
			if (fibonacci.get(i) <= n) {
				
				if(fibonacci.get(i) % 2 == 0)
					sumEvenNumbers = fibonacci.get(i) + sumEvenNumbers;
				
			} else {
				break;
			}
			
		}
		
		return sumEvenNumbers;
		
	}
	
}
