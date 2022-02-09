package temperature;
import java.util.Scanner;

public class quoitent {
	public static void main(String[] args) {
		int dividend,divisor;
		System.out.println("enter the value of dividend value");
		Scanner sc = new Scanner(System.in);
		dividend = sc.nextInt();
		System.out.println("enter the value of divisor");
		Scanner sc1 = new Scanner(System.in);
		divisor = sc1.nextInt();
		
		int quoitent = dividend/divisor;
		int reminder = dividend%divisor;
		System.out.println("the quoitent is" +quoitent);
		System.out.println("the remainder is" +reminder);
		
	}

}
