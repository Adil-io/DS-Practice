import java.util.Scanner;

public class InsertionSort
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	    for(int i=1;i<n;i++)
	    {
	    	int key=arr[i];
	    	int index=i-1;
	    	while(index>=0&&arr[index]>key)
	    	{
	    	  arr[index+1]=arr[index];
	    	  index--;
	    	}
	    	arr[index+1]=key;
	    }	
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }	
	}
}