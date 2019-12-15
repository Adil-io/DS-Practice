import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class stackUsingQueue{
	class stack{
		Queue<Integer> q1=new LinkedList<>();
		Queue<Integer> q2=new LinkedList<>();
		void push(int d){
			if(q1.peek()==null){
				q1.add(d);
			}
			else{
				for(int i=q1.size();i>0;i--){
					q2.add(q1.remove());
				}
				q1.add(d);
				for(int i=q2.size();i>0;i--){
					q1.add(q2.remove());
				}
			}
		
		}
		int pop(){
			if(q1.peek()==null){
				System.out.println("Stack is Empty");
				return -1;
			}
			else{
				return q1.remove();
			}
		}
		int peek(){
			return q1.peek();
		}
		void show(){
			for(int i:q1){
				System.out.print(i+" ");
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		stackUsingQueue suq=new stackUsingQueue();
		stack s=suq.new stack();
		int n=sc.nextInt();
		while(n-->0){
			s.push(sc.nextInt());
		}
		System.out.println(s.pop());
		s.show();
	}
}