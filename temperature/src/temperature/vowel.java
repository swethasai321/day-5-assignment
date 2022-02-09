package temperature;
import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		char ch;
		System.out.println("enter a character");
		Scanner reader = new Scanner(System.in);
		ch = reader.next().charAt(0);
		if(ch =='a'|| ch =='e' || ch =='i' || ch =='o' || ch =='u')
		{
		System.out.println("given character is vowel");
		}
		else
		{
			System.out.println("given character is constant");
		}
		
		
		
	}

}
