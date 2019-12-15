import java.util.*;
abstract class A
{
	int x=5;
	abstract void set();
	void show()
	{
		System.out.println(x);
	}
}
class B extends A
{
	int y=2;
	void set()
	{
		y=4;
	}
	void show()
	{
		System.out.println(y);
	}
}
public class AbstractClass
{
	public static void main(String[] args)
	{
	  //A a=new A();
	  B b=new B();
	  //a.setA();
	  b.set();	
	  //a.showA();
	  b.show();
	}
}