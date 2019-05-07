package excersices;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean resp;
		
		PrimeNumber primeNumer = new PrimeNumber();
		resp = primeNumer.isPrime(928347923);
		System.out.println(resp);
	}
	
	
	public Boolean isPrime(Integer n) {
		
		if (n > 1) {
			for (int i = 2; i<n; i++){
				if( n % i == 0 ){
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
		
	}

}
