import java.util.Scanner;

public class subArrayMax{
	
	static int subMax(int[] arr,int sMax){
		int n=arr.length;
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int max=0;
				for(int k=i;k<=j;k++){
					if(sMax<arr[k])
						cnt++;
				}
			}
		}
		return cnt;
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
		System.out.print("Enter Value to compare subArrays with : ");
		int sMax=sc.nextInt();
		System.out.println(subMax(arr,2));
	}
}