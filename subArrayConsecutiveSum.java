import java.util.Scanner;
public class subArrayConsecutiveSum{
	
	static void subSum(int[] arr,int num){
		int n=arr.length;
		boolean bool=true;
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				sum=sum+arr[j];
				if(num==sum){
					System.out.print("Starting Index : "+i+", Ending Index : "+j);
					bool=false;
					break;
				}
			}
			if(!bool){
				break;
			}	
		}
		if(bool){
			System.out.print("There is no range that evaluates to the Sum "+num);
		}
	}
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("Enter no of Elements : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Sum to be calculated with : ");
		int num=sc.nextInt();
		subSum(arr,num);
	}
}