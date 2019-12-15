import java.util.*;
public class chocolateProblem 
{
	static int []a;
	static int find(int[] a,int m)
	{
		if(a.length==0||m==0)
		return 0;
		Arrays.sort(a);
		if(a.length<m)
			return -1;
		int min=Integer.MAX_VALUE;
		int a1=0;
		int b=0;
		for(int i=0;i+m-1<a.length;i++)
		{
			int diff=a[i+m-1]-a[i];
			if(diff<min)
			{
				min=diff;
				a1=i;
				b=i+m-1;
			}
		}
		return a[b]-a[a1];
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the no of students");
		int m=sc.nextInt();
		int z=find(a,m);
		System.out.println(z);
	}

}