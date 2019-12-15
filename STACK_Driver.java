import java.util.*;

class Node{
	private int data;
	private Node next;
	
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int d,Node n)
	{
		data=d;
		next=n;
	}
  	public void setData(int d)   
  	{
  		data=d;
  	}
  	public void setNext(Node n)   //Setter
  	{
  		next=n;
  	}
  	public int getData()
  	{
  		return(data);
  	}
  	public Node getNext()        //Getter
  	{
  		return(next);
  	}
}

class LinkedListStack{
	private int size;
	private Node top;
	public LinkedListStack()
	{
		size=0;
		top=null;
	}
	public void push(int val)
	{
		Node n=new Node();
		if(n==null)
		{
			System.out.println("**** StackOverflow ****");
			return ;
		}
		n.setData(val);
		n.setNext(top);
		top=n;
		size++;
	}
	public void pop()
	{
		if(top==null)
			System.out.println("**** StackUnderflow ****");
		else
		{
			top=top.getNext();
			size--;
		}	
	}
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;	
	}
	public int getListSize()
	{
		return size;
	}
	public void viewList()
	{
		Node t;
		if(isEmpty()==true)
			System.out.println("**** StackUnderflow ****");
		else
		{
			t=top;
			for(int i=1;i<=size;i++)
			{
				System.out.print(t.getData()+" ");
				t=t.getNext();
			}
		}	
	}
	public int peek()
	{
	    return top.getData();	
	}
}	
public class STACKusingLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinkedListStack s=new LinkedListStack();
		s.push(20);
		s.push(30);
		s.push(5);
        s.viewList();
        s.pop();
        s.pop();
        s.pop();
        s.viewList();
        System.out.println(s.peek());
        
  }				
}