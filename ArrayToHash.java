import java.util.*;

public class ArrayToHash{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		int arr[]=new int[n];
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=i;
			str[i]=sc.next();
		}
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		HashSet<String> hs=new HashSet<String>();
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		for(int i=0;i<n;i++){
			hm.put(arr[i],str[i]);
			ht.put(arr[i],str[i]);
			hs.add(str[i]);
			lhm.put(arr[i],str[i]);
		}
		System.out.println(hm);
		System.out.println(ht);	
    	System.out.println(hs);	
		System.out.println(lhm);				
	}
}