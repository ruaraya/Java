package excersices;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryGap sol = new BinaryGap();
		sol.solution(1376796946);
		
	}
	
	public int solution(int N) {
       
		String x = "";
		int a = 0;
		int count = 0;
		int greatest = 0;
		char cero = '0';
		boolean valid = true;
		
		while(N > 0)
        {
            a = N % 2;
            //System.out.println("value of N : " + N);
            //System.out.println("value of a : " + a);
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            N = N / 2;
        }
		
		count = 0;
        //System.out.println("Binary number : " + x);
        //System.out.println("No. of 1s:"+count);
		
        if ((x.charAt(x.length()-1) == cero) || (x.charAt(0) == cero))
        	valid = false;
        
        //System.out.println("valid : " + valid);
        
        if (valid == false){
	        for (int i = 1; i < x.length()-1; i++){
	        	if (x.charAt(i) == cero){
		        	valid = false;
		        } else {
		        	valid = true;
		        	break;
		        }
	        }
        }
	    
        //System.out.println("valid : " + valid);
        
        if (valid == false)
        	return 0;
        
       
        
        for (int i = 0; i < x.length(); i++){
        	
        	if (x.charAt(i) == (cero)){
        		//System.out.println("cero at index : " + i);
        		count++;
        	} else {
        		
        		if (count > greatest){
        			
        			greatest = count;
        			//System.out.println("greatest : " + greatest);
        			count = 0;
        		}
        		count = 0;
        	}
        	
        }
        
        //System.out.println(greatest);
        
		return greatest;
		
    }

}
