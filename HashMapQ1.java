import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapQ1{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		HashMap<String,Integer> hm=new HashMap<>();
		while(n-->0){
			hm.put(sc.next(),sc.nextInt());
		}
		int f=sc.nextInt();
		if(hm.containsValue(f)){	
			Iterator itr=hm.entrySet().iterator();
		    while(itr.hasNext()){
			    Map.Entry mp=(Map.Entry)itr.next();
			    if(f==(int)mp.getValue()){
			    	System.out.print(mp.getKey()+" ");
			    }
		    }
		}
		else{
			System.out.println("false");
		}
	}
}