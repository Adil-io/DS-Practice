import java.util.Scanner;

public class QuickSort
{
	static Scanner sc=new Scanner(System.in);
	static int partition(int arr[],int l,int h)
	{
	  int pivot=arr[h];
	  int i=l-1;
	  for(int j=l;j<h;j++)
	  {
	   if(arr[j]<=pivot)
	   {
	   	i++;
	   	int temp=arr[i];
	   	arr[i]=arr[j];
	   	arr[j]=temp;
	   }	
	  }
	  int temp=arr[i+1];
	  arr[i+1]=arr[h];
	  arr[h]=temp;
	    	  
	  return ++i;	
	}
	static void QSort(int arr[],int l,int h)
	{
	  if(l<h)
	  {
	     int pi=partition(arr,l,h);
	     QSort(arr,l,pi-1);
	     QSort(arr,pi+1,h);
	  }  	
    }
	public static void main(String[] args)
	{
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	 	arr[i]=sc.nextInt();
	  }	
	  int l=0;
	  int h=n-1;
	  QSort(arr,l,h);
	  for(int k=0;k<arr.length;k++)
	  {
	   System.out.print(arr[k]+" ");
	  }	 		
	}
}