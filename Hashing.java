import java.util.Hashtable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashSet;

public class Hashing{
	
	public static void main(String[] args){
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(105,"Chitkara");
		ht.put(102,"Hello");
		ht.put(104,"Bye");
		ht.put(103,"Hey");
	//	ht.put(103,"Arun");
		System.out.println(ht);
		System.out.println(ht.hashCode());
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(15632,"CSA");
		hm.put(264,"DS");
		hm.put(3,"CN");
		ht.put(264,"Arun");
		System.out.println(hm);
		System.out.println(hm.hashCode());
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(15632,"CSA");
		lhm.put(264,"DS");
		lhm.put(3,"CN");
		lhm.put(264,"Arun");
		System.out.println(lhm);
		System.out.println(lhm.hashCode());
		
		HashSet<String> hs=new HashSet();
		hs.add("Arun");
		hs.add("Kudiyal");
		hs.add("Bye");
		System.out.println(hs);
		
	}
}