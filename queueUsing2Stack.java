class Node{
	int data;
	Node link;
	Node(){
		link=null;
	}
}
public class queueUsing2Stack
{
	public Node top;
	queueUsing2Stack(){
		top=null;
	}
	public void push(int data)
	{
		Node n=new Node();
		n.data=data;
		n.link=top;
		top=n;
	}
	public int pop()
	{
		int x=top.data;
		top=top.link;
		return x;
		
	}
	public void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
		System.out.println();
	}
    public static void main(String args[]) {
    	queueUsing2Stack q1=new queueUsing2Stack();
    	q1.push(10);q1.push(20);q1.push(30);
    	System.out.println("Stack formed is :");
    	q1.display();
    	queueUsing2Stack q2=new queueUsing2Stack();
    	q2.push(q1.pop());q2.push(q1.pop());q2.push(q1.pop());
    	System.out.println("Queue formed is :");
    //	q2.pop();
    	q2.display();
    }
}