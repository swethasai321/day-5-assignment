package temperature;
import java.util.Scanner;

public class quadratic {
	public static void main(String[] args) {
		double a,b,c,root1,root2;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a value");
		a=input.nextInt();
		System.out.println("enter b value");
		b=input.nextInt();
		System.out.println("enter c value");
		c=input.nextInt();
		double delta = b*b-4*a*c;
		System.out.println("the delta value is"  +delta);
		if(delta>0.0)
		{
			root1 =(-b+ Math.sqrt(delta))/(2*a);
			root2 =(-b- Math.sqrt(delta))/(2*a);
			System.out.println("root1 value is" +root1);
			System.out.println("root2 value is" +root2);
			}
		else
			if(delta==0)
		{
		root1=-b/(2*a);
		System.out.println("root1 is real"+root1);
		}
			else
			{
				System.out.println("roots are not real");
			}
		
	}

}
