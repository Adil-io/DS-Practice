import java.util.*;
public class subArrayKthSum{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		int s=0,c=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				for(int k=i;k<=j;k++){
					s=s+arr[k];
				//	System.out.print(arr[k]+" ");	
				}
				if(s==r){
					c++;
				}
				s=0;
			}
		}
		System.out.println(c);
	}
}