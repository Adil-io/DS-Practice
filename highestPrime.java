import java.util.Scanner;

public class highestPrime{
	static boolean isPrime(int x){
		if(x<=1)
			return false;
		for(int i=2;i<x;i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int hp=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				if(isPrime(i)){
					hp=i;
				}
			}
		}
		System.out.println(hp);
	}
}