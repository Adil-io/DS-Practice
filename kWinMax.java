import java.util.Scanner;

public class kWinMax{
	static void kWindowMax(int[] arr,int k){
		int n=arr.length;
		for(int i=0;i<=n-k;i++){
			int max=0;
			for(int j=i;j<i+k;j++){
				if(arr[j]>max){
					max=arr[j];
				}
			}
			System.out.print(max+" ");
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter no of Elements : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Window size : ");
		int k=sc.nextInt();
		kWindowMax(arr,k);
	}
}