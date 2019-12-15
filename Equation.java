import java.util.Scanner;

public class Equation{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		String e=sc.next();
		int d=1;
		int a,b,c,r;
		a=0;b=0;c=0;r=0;
		for(int i=0;i<e.length();i++){
		/*	if(e.charAt(i)=='x'||e.charAt(i)=='y'){
				b=e.charAt(i-1);
				if(e.charAt(i+1)>='0'&&e.charAt(i+1)<='9'){
					d=2;	
					a=e.charAt(i-1);
				}
				else if(e.charAt(i)=='='){
					System.out.println(e.charAt(i+1));
				}
	
			}
		} */
		if(d==1){
			
		}
		else if(d==2){
			
		}
		else{
			System.out.println("Invalid equation Degree greater than 2");
		}
		//System.out.println(r);
	}
}