package excersices;

import java.util.ArrayList;
import java.util.Arrays;

public class DigitConvertion {

	public static void main(String[] args) {
		DigitConvertion sol = new DigitConvertion();
		//int A = 103;
		int A = 123456;
		sol.solution(A);

	}
	
	public int solution(int A){
		
		String word = Integer.toString(A);
		int wordLength = word.length();
		String newWord[] = new String[word.length()];
		ArrayList<String> newWord2 = new ArrayList<String>();
		int x = word.length()-1;
		String letter1;
		String letter2;
		int div = 0;
		
		String finalString = "";
		int finalInteger = 0;
		
		
		if (wordLength == 1)
			return A;
		
		for (int i=0; i<wordLength; i++){
			newWord[i] = Character.toString(word.charAt(i));
			//System.out.println(newWord[i]);
		}
		
		if (wordLength % 2 == 0){
			div = wordLength / 2;
			//System.out.println(div);
			
			for (int i=0; i<div; i++){
				
				letter1 = Character.toString(word.charAt(i));
				letter2 = Character.toString(word.charAt(x));
				newWord2.add(letter1);
				newWord2.add(letter2);
				x--;
				
			}
			
		}else{
			div = (wordLength % 2) + 1;
			//System.out.println(div);
			
			for (int i=0; i<div; i++){
				
				if (i == (div-1)){
					letter1 = Character.toString(word.charAt(i));
					//letter2 = Character.toString(word.charAt(x));
					newWord2.add(letter1);
					//newWord2.add(letter2);
					x--;
				} else {
				
				letter1 = Character.toString(word.charAt(i));
				letter2 = Character.toString(word.charAt(x));
				newWord2.add(letter1);
				newWord2.add(letter2);
				x--;
				}
			}
			
		}
		
		for (int i=0; i<newWord2.size(); i++){
			
			finalString = finalString + newWord2.get(i).toString();
		}
		
		System.out.println(finalString);
		
		finalInteger = Integer.parseInt(finalString);
		
		
		return finalInteger;
		
	}

}
