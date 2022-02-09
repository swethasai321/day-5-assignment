package temperature;

import java.util.Scanner;

public class largest {
	public static void main(String[] args) {
		double a,b,c;
		
		System.out.println("Enter a value");
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		System.out.println("Enter b value");
		Scanner input1 = new Scanner(System.in);
		b=input1.nextInt();
		System.out.println("Enter c value");
		Scanner input2 = new Scanner(System.in);
		c=input2.nextInt();
		//largest number
		if(a>=b)
		{
			if(a>=c)
		
			System.out.println(" a is largest" +a);
		else
			System.out.println("c is largest" +c);
		}
		else
			if(b>=c)
				System.out.println("b is largest value" +b);
			else
				System.out.println("c is largest value" +c);
			
				
}
}