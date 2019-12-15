import java.util.Scanner;
import java.util.Stack;
public class preTopostFix{
	static String postFix(String preFix){
		Stack<String> str=new Stack<String>();
		String post="";
		int n=preFix.length();
		for(int i=n-1;i>=0;i--){
			char ch=preFix.charAt(i);
			if(Character.isLetter(ch)){
				str.push(ch+"");
			}
			else{
				String s1=str.pop();
				String s2=str.pop();
				post=s1+s2+ch;
				str.push(post);
			}
		}
		return post;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter a preFix Expression");
		String preFix=sc.next();
		System.out.println("postFix Expression");
		System.out.println(postFix(preFix));
	}
}