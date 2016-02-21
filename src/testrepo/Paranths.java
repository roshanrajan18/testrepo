package testrepo;
import java.io.*;
public class Paranths {
	
	
	public static void printParanth(int count){
		char str[]=new char[2*count];
		printParanth(count, count, str, 0);
	}
	
	public static void printParanth(int l,int r, char str[], int count){
		if(l<0 || r<0)return;
		if(l==0 && r==0)
			System.out.println(str);
		else{
			if(l>0){
				str[count]='(';
				printParanth(l-1, r, str, count+1);
			}
			if(r>0){
				str[count]=')';
				printParanth(l, r-1, str, count+1);
			}
		}
	}
	
	public static void main(String args[])throws IOException{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many pairs of Paranthesis ? ");
		int n=Integer.parseInt(buff.readLine());
		printParanth(n);
	}
}
