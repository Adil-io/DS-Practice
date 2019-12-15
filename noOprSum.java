import java.util.Scanner;

public class noOprSum{
	static int add(int x,int y){
	//	if(y==0)
	//		return x;
	//	else
	//		return add(x^y ,(x&y) << 1);	
		return x-(-y);		
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter x : ");
		int x=sc.nextInt();
		System.out.print("Enter y : ");
		int y=sc.nextInt();
		int sum=add(x,y);
		System.out.println("Sum is "+sum);
	}
}