import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class listMerge{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int k=sc.nextInt();
		int n=sc.nextInt();
		List[] arr=new List[k];
		
		for(int i=0;i<k;i++){
			List<Integer> l=new LinkedList<Integer>();
			for(int j=0;j<n;j++){
				l.add(sc.nextInt());
			}
			arr[i]=l;
		}
		
		List<Integer> l=new LinkedList<>();
		
		for(int i=0;i<k;i++){
			l.addAll(arr[i]);
		}
		
		Collections.sort(l);
		
		System.out.println(l);
	}
}