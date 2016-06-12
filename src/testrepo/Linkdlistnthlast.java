package testrepo;
import java.io.*;
public class Linkdlistnthlast {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of the array ?");
		int x=Integer.parseInt(buff.readLine());
		Linkdlist test=new Linkdlist();
		for(int i=0;i<x;i++){
			System.out.println("Enter the number ");
			test.insertAtEnd(Integer.parseInt(buff.readLine()));
		}
		
		System.out.println("Enter the digit from the end, you want to find ?");
		int y=Integer.parseInt(buff.readLine());
		
		test.nthlast(y);
	}

}
