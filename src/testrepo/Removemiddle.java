package testrepo;

import java.io.*;
public class Removemiddle {
	public static void main(String args[])throws IOException{
		basiclinklist x=new basiclinklist();
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of elements");
		int n= Integer.parseInt(buff.readLine());
		for (int i=1;i<=n;i++){
			System.out.println("Enter the Link");
			String a = buff.readLine();
			x.add(a);
		}
		if (n%2==0)
		x.remove(n/2);
		else x.remove((n/2)+1);
		x.printit();
		
	}

}
