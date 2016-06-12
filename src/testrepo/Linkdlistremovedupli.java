package testrepo;
import java.io.*;
public class Linkdlistremovedupli {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		Linkdlist temp=new Linkdlist();
		
		System.out.println("Enter the size of your LLst ");
		int n=Integer.parseInt(buff.readLine());
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the number");
			temp.insertAtEnd(Integer.parseInt(buff.readLine()));
		}
		
		temp.removeDupes();
		
		temp.displayList();
	}

}
