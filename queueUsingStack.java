import java.util.Stack;
import java.util.Scanner;

public class queueUsingStack{
	class queue{
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		void enqueue(int d){
			while(!s1.empty()){
				s2.push(s1.pop());
			}
			s1.push(d);
			while(!s2.empty()){
				s1.push(s2.pop());
			}
		}
		int dequeue(){
			if(s1.peek()==null){
				System.out.println("Queue is Empty");
				return -1;
			}
			else{
				return s1.pop();
			}
		}
		void show(){
			while(!s1.empty()){
				System.out.print(s1.pop()+" ");
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		queueUsingStack qus=new queueUsingStack();
		queue q=qus.new queue();
		int n=sc.nextInt();
		while(n-->0){
			q.enqueue(sc.nextInt());
		}
		System.out.println(q.dequeue());
		q.show();
	}
}