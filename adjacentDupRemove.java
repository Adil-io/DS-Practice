import java.util.Scanner;

public class adjacentDupRemove{
	static void adjRemDupl(String str){
		if(str.length()<=1)
         {
             System.out.println(str);
             return;
         }
         String noDup="";
         int count=0;
         for(int i=0;i<str.length();i++)
         {
             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
             {
                 if(i<str.length()-2 &&str.charAt(i)!=str.charAt(i+2))
                 i+=2;
                 else
                 i++;
                 count++;
             }
             if(i!=str.length()-1)
             noDup=noDup+str.charAt(i);
             else
             {if(i==str.length()-1 && str.charAt(i)!=str.charAt(i-1))
                 noDup=noDup+str.charAt(i);
             }
         }
         if(count>0)
         adjRemDupl(noDup);
         else
         System.out.println(noDup);
	} 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		String str=sc.next();
	    adjRemDupl(str);  
	}
	
}