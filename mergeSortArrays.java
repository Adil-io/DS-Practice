import java.util.Scanner;

public class mergeSortArrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter values in arr1");
		int arr1[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter m");
		int m=sc.nextInt();
		System.out.println("Enter values in arr2");
		int arr2[]=new int [m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int res[]=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m)
		{
			if(arr1[i]<=arr2[j])
			{
				res[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				res[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n)
		{
			res[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m)
		{
			res[k]=arr2[j];
			j++;
			k++;
		}
		
		for(int a=0;a<n+m;a++)
		{
			System.out.print(res[a]+" ");
		}
	}
}