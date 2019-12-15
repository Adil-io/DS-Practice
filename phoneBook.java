import java.util.HashMap;
import java.util.Scanner;
public class phoneBook
{
	public static void main(String[] args)
	{
		HashMap<String,String> hash=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of enteries:");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{

			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter the Phone number:");
			String phone=sc.nextLine();
			hash.put(name, phone);
		}
		System.out.println("Enter the number of queries:");
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.println("Enter name:");
			String name=sc.nextLine();
		if(hash.get(name)!=null)
		{
			System.out.println(name+"="+hash.get(name));
		}
		else
		{
			System.out.println("Not Found");
		}
		}
	}

}