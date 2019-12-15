import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapQ2{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		HashMap<Integer,String> hm=new HashMap<>();
		System.out.print("Enter Number of Passengers : ");
		int n=sc.nextInt(),k,i=1;
		while(n-->0){
			System.out.print("Passenger No."+i);
			System.out.println(" Enter Your Boarding Pass Number :");
			k=sc.nextInt();
			if(hm.containsKey(k)){
				hm.replace(k,"checked");
			}
			else{
				hm.put(k,"unchecked");
			}
			i++;
		}
		boolean bool=true;
		Iterator itr=hm.entrySet().iterator();
		System.out.println("Duplicate Boarding Pass are : ");
		while(itr.hasNext()){
			Map.Entry mp=(Map.Entry)itr.next();
			if((String)mp.getValue()=="checked"){
				System.out.println(mp.getKey());
				bool=false;
			}
		}
		if(bool){
			System.out.println("No Duplicate Boarding Pass");
		}
	}
}