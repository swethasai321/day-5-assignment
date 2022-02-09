package temperature;
import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		int year;
		System.out.println("enter a 4 digit value");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year%4==0) {;
		System.out.println("year is leap year" +year);
		if(year%100==0);
		System.out.println("year is leap year" +year);
		if(year%400==0);
		System.out.println("year is leap year" +year);
	}
	else
	{
		System.out.println("given year is not leap year"  +year);
		
	}

}
}
