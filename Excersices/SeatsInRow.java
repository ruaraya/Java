package excersices;

public class SeatsInRow {

	public static void main(String[] args) {
		
		String S = "2D";
		int N = 10;
		
		SeatsInRow sol = new SeatsInRow(); 

		sol.solution(N, S);
	}
	
	public int solution(int N, String S){
		
		String[] parts = S.split(" ");
		String[][] seats = new String[N][10];
		String[] coord = new String[parts.length];
		
		
		for (int i = 0; i < seats.length; i++) {
		    for (int j = 0; j < seats[i].length; j++) {
		       	//System.out.println(i + " , " + j);
		    	seats[i][j] = "";		       	
		       	for (int x=0; x<parts.length; x++){
					
					String pos = parts[x];
					
					if (pos.length() != 0) {
					
					int pos1 = Character.getNumericValue(pos.charAt(0))-1; 
					
					switch (pos.charAt(1)) {
						case 'A':
							
							if (i == pos1 && j == 0){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}							
							break;
						case 'B':
							if (i == pos1 && j == 1){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'C':
							if (i == pos1 && j == 2){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'D':
							if (i == pos1 && j == 3){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'E':
							if (i == pos1 && j == 4){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'F':
							if (i == pos1 && j == 5){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'G':
							if (i == pos1 && j == 6){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'H':
							if (i == pos1 && j == 7){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'I':
							if (i == pos1 && j == 8){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						case 'J':
							if (i == pos1 && j == 9){
								//System.out.println(pos.charAt(0) + " - " + pos.charAt(1));
								seats[i][j] = "X";
							}
							break;
						default:
							break;
					}
					
					}
					
				}
		       	
		    }
       }
		
		int count = 0;
		
		for (int i = 0; i < seats.length; i++) {
		    		    	
		    			    	
		    	if(i==0){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    		
		    	if(i==1){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==2){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==3){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==4){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==5){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==6){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==7){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==8){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    	if(i==9){
		    		if(seats[i][0].equals("") && seats[i][1].equals("") && seats[i][2].equals("")){
		    			count++;
		    		}
		    		if((seats[i][3].equals("") && seats[i][4].equals("") && seats[i][5].equals("")) || (seats[i][4].equals("") && seats[i][5].equals("") && seats[i][6].equals(""))){
		    			count++;
		    		}
		    		if(seats[i][7].equals("") && seats[i][8].equals("") && seats[i][9].equals("")){
		    			count++;
		    		}
		    	}
		    	
		    }
		
		System.out.println(count);
		
		return count;
		
	}

}
