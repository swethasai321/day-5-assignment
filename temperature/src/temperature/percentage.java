package temperature;

import java.util.Random;


public class percentage {
	
	public static void main(String[] args) {
	Random r = new Random(); 
	{
	int heads=0;
	int tail=0;
	int total =1000;
	{
	for(int i=0;i<total;i++) {
		
		{
			if(r.nextInt (100) % 2 == 0)
			{
				heads++;
			}
			else
			{
				tail++;
			}
		} 
		}
	System.out.println("number of times:" +heads);
	System.out.println("number of times:" +tail);
	System.out.println("number of times:" +total);
	}
		
	}
	}
}



