import java.util.Stack;
import java.util.Scanner;

public class oprOrder{
	static boolean isOperator(char ch){
		if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
			return true;
		else
			return false;	
	}
	static String preToPost(String str){
		Stack<String> s=new Stack<>();
		int n=str.length();
		for(int i=n-1;i>=0;i--){
			if(isOperator(str.charAt(i))){
				String op1=s.pop();
				String op2=s.pop();
				String temp=op1+op2+str.charAt(i);
				s.push(temp);
			}
			else{
				s.push(str.charAt(i)+"");
			}
		}
		return s.peek();
	}
	static String preToInfix(String str){
		Stack<String> s=new Stack<>();
		int n=str.length();
		for(int i=n-1;i>=0;i--){
			if(isOperator(str.charAt(i))){
				String op1=s.pop();
				String op2=s.pop();
				String temp="("+op1+str.charAt(i)+op2+")";
				s.push(temp);
			}
			else{
				s.push(str.charAt(i)+"");
			}
		}
		return s.peek();
	}
	static String postToPre(String str){
		Stack<String> s=new Stack<>();
		int n=str.length();
		for(int i=0;i<n;i++){
			if(isOperator(str.charAt(i))){
				String op1=s.pop();
				String op2=s.pop();
				String temp=str.charAt(i)+op2+op1;
				s.push(temp);
			}
			else{
				s.push(str.charAt(i)+"");
			}
		}
		return s.peek();
	}
	static String postToInfix(String str){
		Stack<String> s=new Stack<>();
		int n=str.length();
		for(int i=0;i<n;i++){
			if(isOperator(str.charAt(i))){
				String op1=s.pop();
				String op2=s.pop();
				String temp="("+op2+str.charAt(i)+op1+")";
				s.push(temp);
			}
			else{
				s.push(str.charAt(i)+"");
			}
		}
		return s.peek();
	}
	static int operatorPrec(char c){
		switch(c){
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;			
		}
		return -1;
	}
	static String inToPost(String str){
		String post="";
		Stack<Character> s=new Stack<>();
		int n=str.length();
		for(int i=0;i<n;i++){
			char ch=str.charAt(i);
			if(Character.isLetter(ch)){
				post=post+ch;
			}
			else if(ch=='('){
				s.push(ch);
			}
			else if(ch==')'){
				while(!s.isEmpty()&&s.peek()!='('){
					post=post+s.pop();
				}
				if(!s.isEmpty()&&s.peek()!='('){
					return "Invalid Expression";
				}
				else{
					s.pop();
				}
			}
			else{
				while(!s.isEmpty()&&operatorPrec(ch)<=operatorPrec(s.peek())){
					if(s.peek()=='('){
						return "Invalid Expression";
					}
					post=post+s.pop();
				}
				s.push(ch);
			}
		}
		while(!s.isEmpty()){
			if(s.peek()=='('){
				return "Invalid Expression";
			}
			post=post+s.pop();
		}
		return post;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter an preFix expression");
		String pre=sc.next();
		System.out.println("PostFix : "+preToPost(pre));
		System.out.println("Enter an postFix expression");
		String post=sc.next();
		System.out.println("PreFix : "+postToPre(post));
		System.out.println("Enter an preFix expression");
		String preIn=sc.next();
		System.out.println("InFix : "+preToInfix(preIn));
		System.out.println("Enter an postFix expression");
		String postIn=sc.next();
		System.out.println("InFix : "+postToInfix(postIn));
		System.out.println("Enter an InFix expression");
		String infix=sc.next();
		System.out.println("PostFix : "+inToPost(infix));
	}
}