package testrepo;
import java.io.*;
import java.util.Scanner;
public class removedupli {
	
	public static void main(String args[])throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String whose Duplicates you want to remove");
		char []test = sc.next().toCharArray();
		System.out.println(duplis(test));
	}
	
	public static char[] duplis(char []x){
		if(x.length==0)return null;
		if(x.length<2)return x;
		int tail =1;
		int j;
		for (int i=1;i<x.length;++i){
			for ( j=0;j<tail;++j){
				if (x[i]==x[j])break;
				}
			
			if (j == tail) {
				 x[tail] = x[i];
				 ++tail;
				 }
			}
		x[tail] = 0;
		return x ;
	}
}
