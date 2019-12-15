import java.util.Scanner;

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
		{
			System.out.println("**** StackUnderflow ****");
			return;
		}	
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
		{
			System.out.println("**** StackUnderflow ****");
			return;
		}	
		else
		{
			t=top;
			for(int i=1;i<=size;i++)
			{
				System.out.print(t.getData()+" ");
				t=t.getNext();
			}
		}
		System.out.println();	
	}
	public int peek()
	{
		if(!isEmpty())
	     return top.getData();
	    else
	     System.out.println("Stack is Empty");
	     return -1;	
	}
}	
public class STACKusingLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinkedListStack s=new LinkedListStack();
		boolean flag=true;
		while(flag)
		{
			System.out.println();
		    System.out.println("1. Add Item to STACK");
		    System.out.println("2. Remove Item From STACK");
	     	System.out.println("3. Get Top element of STACK");
	  	    System.out.println("4. Show STACK size");
	    	System.out.println("5. View List");
	    	System.out.println("6. Exit");
	     	System.out.print("Enter your Choice : \n");
	    	int choice=sc.nextInt();
	    	int v;
	    	switch(choice)
	    	{
		    	case 1:
		    		   System.out.print("Enter Value of Item : ");
		               v=sc.nextInt();
		               s.push(v);
		               break;
	     	    case 2:
	     	    	   s.pop();
		               break;
		        case 3:
		        	   System.out.print(s.peek());
		               break;
		        case 4:
		        	   System.out.print("Size : "+s.getListSize());
		               break;
		        case 5:
		        	   s.viewList();
		               break;
		        case 6:
		        	   flag=false;
		               break;
		        default:
		        	   System.out.print("Invalid choice");	
	    	}	
		}		
        
  }				
}