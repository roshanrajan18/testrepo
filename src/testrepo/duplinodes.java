package testrepo;
import java.io.*;
import java.util.LinkedList;
public class duplinodes {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of the list");
		int len=Integer.parseInt(buffer.readLine());
		LinkedList x= new LinkedList();
		for (int i=0;i<len;i++){
			System.out.println("Enter Element");
			int nd=Integer.parseInt(buffer.readLine());
			x.add(nd);
		}
		System.out.println(x);		
	}

}
