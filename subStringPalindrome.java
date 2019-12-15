import java.util.Scanner;
public class subStringPalindrome{
	static boolean checkPal(String subStr){
		String rev="";
		int n=subStr.length();
		for(int i=n-1;i>=0;i--){
			rev=rev+subStr.charAt(i);
		}
		if(rev.equals(subStr))
			return true;
		else
			return false;
	}
	static String subPal(String str){
		int n=str.length(),max=0;
		String pal="";
		String temp="";
		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n;j++){
				if(checkPal(str.substring(i,j))){
					temp=str.substring(i,j);
					if(temp.length()>max){
						max=temp.length();
						pal=temp;
					}
				}
			}
		}
		if(pal.length()<=1)
			return "No Palindrome is Present";
		else
			return pal;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		String str=sc.next();
		System.out.println(subPal(str));
	}
}