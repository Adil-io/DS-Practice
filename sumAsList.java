public class sumAsList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static sumAsList insert(sumAsList li,int data)
	{
		Node n1 =new Node(data);
		n1.next=null;
		if(li.head==null)
		{
			li.head=n1;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n1;
		}
		return li;
	}
	public static void display(sumAsList l1)
	{
		Node currNode=l1.head;
		while(currNode.next!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
	}
	public static void add(sumAsList li,sumAsList obj) {
		Node current = li.head;
		Node c = obj.head; 
		int carry=0;
		int a=0;
		while(c!=null) {
			 a=current.data+c.data+carry;
			carry=0;
			
			System.out.print(a%10+" ");
			carry=a/10;
			current=current.next;
			c=c.next;
		}
		while(current!=null) {
			a=current.data+carry;
			System.out.print(a%10+" ");
			current=current.next;
		}
		if(carry!=0) {
			System.out.print(carry);
		}
		
	}
	

	public static void main(String[] args) {
		
		sumAsList li=new sumAsList();
		sumAsList obj=new sumAsList();
		
		obj.insert(obj, 1);
		obj.insert(obj, 1);
		obj.insert(obj, 1);
				
		li.insert(li, 9);
		li.insert(li, 8);
		li.insert(li, 8);
		
		add(obj, li);
	}

}