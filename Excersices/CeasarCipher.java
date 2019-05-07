package excersices;

public class CeasarCipher {

	public static void main(String[] args) {
		
		String str = new String("welcomez");
		String newStr = "";
		
		CeasarCipher ceasarCipher = new CeasarCipher();
		
		newStr = ceasarCipher.decode(str);
		
	    

	}

	public String decode(String code) {
		
		int index = 0;
		String decode = "";
		final int n = 5;
		String[] alphabetArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
		char[] array= code.toCharArray();
	    	    
	    for(char c: array){
	    		    	
	    	for (int i=0; i<alphabetArray.length; i++){
	    		
	    		if (alphabetArray[i].equals(Character.toString(c)) ){
	    			
	    			index = i + n;
	    			if (index >= alphabetArray.length-1)
	    				index = index - (alphabetArray.length);
	    			
	    			decode += alphabetArray[index];
	    			
	    		}
	       	}
	    }
	   		
		return decode;
		
	}
}
