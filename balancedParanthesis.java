import java.util.Scanner;
import java.util.Stack;

public class balancedParanthesis{
	
	static boolean balPara(String str){
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
				s.push(str.charAt(i));
			}
			else if((str.charAt(i)==')'&&s.peek()=='(')||(str.charAt(i)==']'&&s.peek()=='[')||(str.charAt(i)=='}'&&s.peek()=='{')){
				s.pop();
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;	
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		String str=sc.next();
		if(balPara(str)){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Not Balanced");		
		}
	}
}