package testrepo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addinglists {
	public static void main(String args[])throws IOException{
		basiclinklist x=new basiclinklist();
		basiclinklist y=new basiclinklist();
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of elements");
		int n= Integer.parseInt(buff.readLine());
		for (int i=1;i<=n;i++){
			System.out.println("Enter the Link");
			String a = buff.readLine();
			x.add(a);
		}
		System.out.println("Enter the no of elements");
		int m= Integer.parseInt(buff.readLine());
		for (int i=1;i<=m;i++){
			System.out.println("Enter the Link");
			String a = buff.readLine();
			y.add(a);
		}
		x.printit();
		y.printit();
}
}