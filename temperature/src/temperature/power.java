package temperature;
import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		int b,e;
		Scanner sc = new Scanner(System.in);
		{
		System.out.println("Enter the base:");
		b = sc.nextInt();
		System.out.println("enter the exponent:");
		e = sc.nextInt();
	 double power=Math.pow(b,e); 
		System.out.println("base to the power of exponent is:" +power);
		
	}

}
}