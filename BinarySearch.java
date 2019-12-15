import java.util.Scanner;
public class BinarySearch
{
	static int search(int[] arr,int k){
		int l=0;
		int r=arr.length-1;
		while(l<=r){
			int m=l+(r-l)/2;
			if(k==arr[m])
			//	System.out.println("Element "+k+" found at index "+m);
			    return m;
			if(k>arr[m])
				l=m+1;
			else
				r=m-1;	
		}
	//	System.out.println("Element "+k+" Not found");
	    return -1;
	}
	static int recSearch(int[] arr,int l,int r,int k){
		if(l<=r){
			int m=l+(r-l)/2;
			if(arr[m]==k)
				return m;
			else if(k>arr[m])
				return recSearch(arr,m+1,r,k);
			else
				return recSearch(arr,l,m-1,k);	
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
	//	int m=search(arr,k);
	    int m=recSearch(arr,0,n-1,k);
		if(m!=-1)
			System.out.println("Element "+k+" found at index "+m);
		else
			System.out.println("Element "+k+" Not found");	
	}
}