import java.util.Scanner;

class A
{
	A()
	{
		System.out.println("Class A Constructor");
	}
	public void show()
	{
		System.out.println("Class A");
	}
}
interface B                           //class B extends A
{
	
	public void show();
//	{
  //	System.out.println("Class B");
//	}
}
interface C                           //class C extends A
{
	public void show();
//	{
  //		System.out.println("Class C");
//	}
}
class D extends A implements B,C
{
	D()
	{
		System.out.println("Class D Constructor");
	}
	public void show()
	{
		System.out.println("Class D");
	}
}
public class DiamondProblem{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		D d=new D();
		d.show();
		
	}
}