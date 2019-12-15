import java.util.*;
public class RevStringNoFun
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		char ch[]=new char[n];
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
		    if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
		    {
		     ch[j]='`';   
		    }
		    else
		    {
		     ch[j]=s.charAt(i);
		    }
		    j++;
		}
		/*
		for(int i=0;i<n;i++)
		{
		    if(ch[i]!='`')
		    System.out.print(ch[i]);
		}
	    */
	    ArrayList<Character> ac=new ArrayList<Character>();
		for(int i=0;i<n;i++)
		{
		    if(ch[i]!='`')
		    ac.add(ch[i]);
		}
		for(char c:ac)
		{
			System.out.print(c);
		}
	}
}
