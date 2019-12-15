import java.util.Scanner;

public class Heap{
	static void BuildHeap(int[] arr,int i){
		int max;
		int l=(2*i)+1;
		int r=(2*i)+2;
		if(l<=arr.length-1 && arr[l]>arr[i]){
			max=l;
		}
		else{
			max=i;
		}
		if(r<=arr.length-1 && arr[r]>arr[i]){
			max=r;
		}
		else{
			max=i;
		}
		if(max!=i){
			int t=arr[i];
			arr[i]=arr[max];
			arr[max]=t;
			BuildHeap(arr,max);
		}	
	}
	static void heapify(int[] arr){
		for(int i=(arr.length/2);i>=0;i--){
			BuildHeap(arr,i);
		}
		for(int i=0;i<arr.length;i++){
			BuildHeap(arr,i);
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
	//	int n=sc.nextInt();
		int[] arr={50,60,70,80,90,100,120,150};
		heapify(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}