import java.util.Scanner;

public class KthMaxMin{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int min,max;
		min=max=arr[0];
		for(int j=0;j<k;j++){
	    	for(int i=1;i<n;i++){
		    	if(min>arr[i]){
		    		min=arr[i];
		    	}
		    	if(max<arr[i]){
		    		max=arr[i];
		    	}
	        }
		}
		int count=0;
		for(int i=min;i<=max;i++){
			for(int j=0;j<n;j++){
				if(arr[j]==i){
					count++;
					break;
				}
			}
			if(count==k){
				System.out.println("Kth Min : "+i);
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
				System.out.println("Kth Max : "+i);
				break;
			}
		}
		//System.out.println(min+" "+max);
	}
}