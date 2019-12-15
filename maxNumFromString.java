import java.util.*;
public class maxNumFromString{
	static long maxNum(String s){
		String[] str=s.split(" ");
		int n=str.length;
		String num="";
		Arrays.sort(str,Collections.reverseOrder());
		for(int i=0;i<n;i++){
			num=num+str[i];
		}
	//	Arrays.sort(str);
	//  for(int i=n-1;i>=0;i--){
	//		num=num+str[i];
	//	}
		long max=Long.parseLong(num);
		return max;	
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter Array of Numbers :-");
		String s=sc.nextLine();
		System.out.println("Largest Number formed is :-\n"+maxNum(s));
	}
}