import java.util.Scanner;

public class revStringNoSpChar{
	static Scanner sc=new Scanner(System.in);
	
	static String revAlpha(String str){
		char[] ch=str.toCharArray();
		int l=0,r=str.length()-1;
		while(l<r){
			if(!Character.isAlphabetic(ch[l]))
				l++;
			else if(!Character.isAlphabetic(ch[r]))
				r--;
			else{
				char t=ch[l];
				ch[l]=ch[r];
				ch[r]=t;
				l++;
				r--;
			}		
		}
		String revA = new String(ch);
		return revA;
	}
	
	public static void main(String[] args){
		String str=sc.next();
		System.out.println(revAlpha(str));
	}
}