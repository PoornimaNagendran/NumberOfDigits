package guvi;
import java.util.*;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
		int a;
		int n=0;
		System.out.println("Enter a number");
		a=s.nextInt();
		int b=a;
		while(b!=0)
		{
		 b=b/10;
		n++;	
		}
		System.out.println("THe number of digits in "+a+" is "+n);

	}

}
