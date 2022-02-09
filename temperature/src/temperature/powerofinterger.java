package temperature;
import java.util.Scanner;

public class powerofinterger {
	public static void main(String[] args) {
		int num,i,value1=1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(i=1;i<31;i++)
		{
			value1 = i*num;
			System.out.println("table is:" +value1);
		}
	}

}
