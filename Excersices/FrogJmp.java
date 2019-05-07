package excersices;

public class FrogJmp {

	public static void main(String[] args) {
		
		FrogJmp sol = new FrogJmp();
		sol.solution(1, 1000000000, 1);

	}

	public int solution(int X, int Y, int D){
		
		int dist = 0;
		int count = 0;
		int rest = 0;
		int remainder = 0;
				
		if (X == Y){
			//System.out.println("number of jumps : " + 0);
			return 0;
		}
		
		dist = X;
		/*
		while (dist < Y) {
			
			dist = dist + D;
			count++;
			
		}
		*/
		
		remainder = (Y-X) % D;
				
		//System.out.println("remainder : " + remainder);
		
		rest = (Y-X) / D;
		
		
		
		if (remainder > 0)
			rest++;
		
		//System.out.println("number of jumps : " + rest);
		
		return rest;
		
	}
	
}
