import java.util.Scanner;
import java.util.Stack;

public class postFixEval{
	static int postEval(String str){
		Stack<Integer> s=new Stack<>();
		int n=str.length();
		for(int i=0;i<n;i++){
			char ch=str.charAt(i);
			if(Character.isDigit(ch)){
				s.push(ch-'0');
			}
			else{
				int val1=s.pop();
				int val2=s.pop();
				switch(ch){
					case '+':s.push(val2+val1);
					         break;
					case '-':s.push(val2-val1);
					         break;
					case '*':s.push(val2*val1);
					         break;
					case '/':s.push(val2/val1);
					         break;                           
				}
			}
		}
		return s.pop();
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		String str=sc.next();
		System.out.println(postEval(str));
	}
}