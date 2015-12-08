package testrepo;
import java.io.*;
public class Nimgame {

	public static void main(String args[])throws IOException{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the no of stones in this NIM GAME");
		int n= Integer.parseInt(buff.readLine());
		Nimgame x= new Nimgame();
		x.human(n);
	}
	
	public void human(int n){
		int a=n-3;
		int b=n-2;
		int c=n-1;
		
		if(a>3){
			n=a;
			comp(n);}
		else if(b>3){
			n=b;
			comp(n);
		}
		else if (c>3){
			n=c;
			comp(n);
		}
		else System.out.println("Computer wins");
		
	}
	
	public void comp(int n){
		int a=n-3;
		int b=n-2;
		int c=n-1;
		
		if(a>3){
			n=a;
			human(n);}
		else if(b>3){
			n=b;
			human(n);
		}
		else if (c>3){
			n=c;
			human(n);
		}
		else System.out.println("Human wins");
		
	}
}
