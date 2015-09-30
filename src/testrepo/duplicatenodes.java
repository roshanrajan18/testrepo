package testrepo;
import java.io.*;
public class duplicatenodes {
	public static void main(String args[])throws IOException{
		basiclinklist x= new basiclinklist();
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of Elements");
		int n = Integer.parseInt(buff.readLine());
		for (int i=1;i<=n;i++){
			System.out.println("Enter the Link");
			String a = buff.readLine();
			x.add(a);
		}
		x.removeduplis();	
	}
	
}
