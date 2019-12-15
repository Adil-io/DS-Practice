import java.util.Scanner;

public class StringFun{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		String str=sc.nextLine();
		StringBuffer sbf=new StringBuffer(str);
		System.out.println(sbf.reverse());
		StringBuilder sbd=new StringBuilder(str);
		System.out.println(sbd.append(" Builder"));
	}
}