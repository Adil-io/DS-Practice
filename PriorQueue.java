import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorQueue{
	
	public static void main(String[] args){
		PriorityQueue<String> pq=new PriorityQueue();
		pq.add("Arun");
		pq.add("Bye");
		pq.add("Kudiyal");
		pq.add("OK");
	//	pq.add(3);
		
		System.out.println(pq);	
		
		Iterator itr=pq.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n"+pq.poll()); //returns element with highest Priority (or) pq.peek	
	//	pq.remove("Bye");//remove element and reshuffles the Priority
		Boolean bool = pq.contains("Kudiyal");//return if element is present or not
		
		Object[] arr=pq.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].toString());
		}
	}
}