package Assignment;
import java.util.Scanner;
public class KthLargestSmallest {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int min=arr[0],max=arr[0];
		int count=0;
		System.out.println("Enter value of k:");
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]<=min)
				min=arr[i];
			if(arr[i]>=max)
				max=arr[i];
		}
		for(int i=min;i<=max;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[j]==i)
				{
					count++;
					break;
				}
			}
			if(count==k)
			{
				System.out.println(k+"th Min = "+i);
				break;
			}
		}
		count=0;
		for(int i=max;i>=min;i--){
			for(int j=0;j<n;j++){
				if(arr[j]==i){
					count++;
					break;
				}
			}
			if(count==k){
				System.out.println(k+"th Max = "+i);
				break;
			}
		}
		
	}
}
