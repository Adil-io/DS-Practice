import java.util.Scanner;

public class sumsubArray{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		} 
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}	
		int k=sc.nextInt();
		n=n-k+1;
		System.out.println((n*(n+1))/2);	
	}
}