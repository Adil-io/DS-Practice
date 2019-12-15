import java.util.*;
public class operationOrder{
	static Scanner sc=new Scanner(System.in);
	static String postFix(String str){
		String post="";
		Stack<Character> o=new Stack<>();
		Stack<Character> p=new Stack<>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
				o.push(str.charAt(i));
			}
			if(Character.isLetter(str.charAt(i))){
				post=post+str.charAt(i);
			}
			if(str.charAt(i)=='('){
				p.push(str.charAt(i));
			}
			if(str.charAt(i)==')'&&p.peek()=='('){
				p.pop();
				post=post+o.pop();				
			}		 
		}
		post=post+o.pop();  
		return post;
	}
	static String preFix(String str){
		String sr="";
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)=='('){
				sr=sr+')';
			}
			else if(str.charAt(i)==')'){
				sr=sr+'(';
			}
			else{
				sr=sr+str.charAt(i);
			}
		}
		sr=postFix(sr);
		String pre="";
		for(int i=sr.length()-1;i>=0;i--){
			pre=pre+sr.charAt(i);
		}
		return pre;
	} 
	static String preTopost(String preFix){
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
	public static void main(String[] args){
		System.out.println("Enter an InFix Expression :");
		String str=sc.next();
		System.out.println("Prefix : "+preFix(str));
		System.out.println("Postfix : "+postFix(str));
	}
}