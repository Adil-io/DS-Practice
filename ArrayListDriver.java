import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDriver{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
	    al.add(4);
	    al.add(5);
	    for(int i:al)
	    	System.out.print(i+" ");
	}
		
}