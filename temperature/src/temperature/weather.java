package temperature;
import java.util.Scanner;

public class weather {

	int temperature = 0;
	int windspeed = 0;
	int windChill_F = 0;
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
				System.out.println("Enter the outside temperature(F)[>50]");
		int temperature = reader.nextInt();
		boolean isGoodTemp = (temperature >=50);
		System.out.println("Enter the wind speed [3 to 120]:");
		int windspeed = reader.nextInt();
		boolean isgoodspeed = (windspeed<=3 && windspeed >=120);
	}
		
		//calculate wind chill using temperature and windspeed
		private double calculatewindChill(int temperature, int windspeed,double windChill_F) {
		
		windChill_F = 35.74 + 0.6215 *temperature - 35.75 * Math.pow(windspeed,0.16)+0.4275 *temperature * Math.pow(windspeed, 0.16);
		return windChill_F;
		}
	//display result
		private void displayResults(int temperature,int windspeed,double windChill_F) {
			System.out.println("temperature"+"windspeed"+"windChill");
			System.out.println(temperature +" "+windspeed+" "+windChill_F);
		}

}

 
