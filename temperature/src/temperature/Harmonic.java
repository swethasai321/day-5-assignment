package temperature;

public class Harmonic {
	public static void main(String[] args) {
		int n=8;
		int i;
		double sum=0;
		
		for(i=n;i>0;i--) {
			
			sum = (double)1/i;
			
			System.out.println("the harmonic series is " +  "1 / " + sum);
		}
		
		
	}
	
}
