import java.io.*;
import java.util.*;

public class UserMainCode{
	
	public int minSets(String input1,int input2,int input3){
		ArrayList<Integer> al=new ArrayList<>();
		int c=0;
		for(int i=0;i<=input3+1;i++){
			
			for(int j=i+1;j<=input3;j++){
			int x=Integer.parseInt(input1.substring(i,j));
			if(x<=input2){
			   al.add(x);
			 
			}
			if(x<=input2 && j==input3){
				c++;
			}
			
			}
			
		}
		for(int i:al){
			System.out.print(i+" ");
		}
		return c;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		UserMainCode a=new UserMainCode();
		String input1=sc.nextLine();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		System.out.println(a.minSets(input1,input2,input3));
	}
  	
}