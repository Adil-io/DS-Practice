import java.util.Scanner;

public class pairSumTwoArray{
	static int[] merge(int[] arr1,int[] arr2){
		int n1=arr1.length;
		int n2=arr2.length;
		int[] arr=new int[n1+n2];
		int k=0;
		for(int i=0;i<n1;i++){
			arr[k]=arr1[i];
			k++;
		}
		for(int i=0;i<n2;i++){
			arr[k]=arr2[i];
			k++;
		}
		return arr;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int k=sc.nextInt();
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		int[] arr2=new int[n2];
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		int[] arr=merge(arr1,arr2);
		int n=arr.length;
		int p1=0,p2=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j]==k && arr[i]!=p1 && arr[j]!=p2){
					System.out.println(arr[i]+" "+arr[j]);
					p1=arr[i];
					p2=arr[j];
				}
			}
		}
	}
}