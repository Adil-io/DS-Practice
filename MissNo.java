import java.util.Scanner;

public class MissNo{
	static Scanner sc=new Scanner(System.in);
	static int checkSort(int[] arr,int n){
		if(n==1||n==0){
			return 1;
		}
		else if(arr[n-1]<arr[n-2]){
			return 0;
		}
		return checkSort(arr,n-1);	
	}
	static boolean check(int[] arr, int i) 
    { 
        boolean t=false; 
        for(int e:arr){ 
            if(e==i){ 
                t=true; 
                break; 
            } 
        } 
        return t;	
    }    	
	public static void main(String[] args){
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(checkSort(arr,n)==0){
			System.out.print("Input Invalid");
		}
		else{
		 int i,f=0;		
		 for(i=arr[0];i<=arr[n-1];i++){
		 	if(arr[n-1]>100){
		 		f=1;
		 		break;
		 	}
			else if(check(arr,i)==false){
				System.out.print(i+" ");
			}
		 }
		 if(i>100||f==1){
			System.out.println("Invalid Input");
		 } 
		}
	}
}