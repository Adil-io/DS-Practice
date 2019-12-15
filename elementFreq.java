import java.util.Scanner;

public class elementFreq{
	static void freq(int[] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			int c=1;
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					c++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			if(arr[i]!=Integer.MIN_VALUE){
				System.out.println(arr[i]+" occurs "+c+" times");
			}	
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
		freq(arr);
	}
}