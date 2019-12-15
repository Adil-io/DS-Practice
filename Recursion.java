import java.util.Scanner;

public class Recursion{
	
	static int f=1;
	static void fact(int n)
	{	
		if(n>=1)
		{
			f=f*n;
			fact(n-1);
		}
	}
	public static void main(String[] args){
		  int n=5;
		  fact(5);
		  System.out.println(f);
		
	}
}