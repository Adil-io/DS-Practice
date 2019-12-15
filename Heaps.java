import java.util.Scanner;
public class Heaps{
	static void heapify(int[] arr){
		int n=arr.length;
		int r=arr[0];
		for(int i=n-1;i>=0;i--){
			int p=(int)((i-1)/2);
			int lc=(2*p)+1;
			int rc=(2*p)+2;
			if(lc<=n-1){
				if(rc>=n){
					int t=arr[lc];
			        arr[lc]=arr[p];
			        arr[p]=t;
				}
				else if(arr[lc]>arr[rc]){
					int t=arr[lc];
			        arr[lc]=arr[p];
			        arr[p]=t;
				}
			}	
			if(rc<=n-1){
				if(lc>=n){
					int t=arr[rc];
			        arr[rc]=arr[p];
			        arr[p]=t;
				}
				else if(arr[rc]>arr[lc]){
					int t=arr[rc];
			        arr[rc]=arr[p];
			        arr[p]=t;
				}
			}
		} 
		for(int i=0;i<n;i++){
			int lc=2*i+1;
			int rc=2*i+2;
			if(lc<=n-1 && rc<=n-1){
				if(arr[i]<arr[lc]){	
				    int t=arr[i];
				    arr[i]=arr[lc];
				    arr[lc]=t;
			    }
				if(arr[i]<arr[rc]){	
				    int t=arr[i];
				    arr[i]=arr[rc];
				    arr[rc]=t;
			    }
			}
		} 
		if(arr[0]!=r){
			heapify(arr);
		}	
	}
	static int[] insert(int[] arr,int d){
		int arr1[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
		arr1[arr.length-1]=d;
		return arr1;
	}
	static void delete(int[] arr,int d){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==d){
				for(int j=i+1;j<arr.length;j++){
					arr[i]=arr[j];
				}
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter No of Elements in Heap : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements in Heap :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Heapify() :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		heapify(arr);
	//	int[] narr=insert(arr,150);
		System.out.println("\nAfter Heapify() :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}