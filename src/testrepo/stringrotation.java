package testrepo;
import java.io.*;
public class stringrotation {
	public static void main(String args[])throws IOException{
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Original String");
		
		String x=buffer.readLine();
		
		System.out.println("Enter the New String");
		
		String y=buffer.readLine();
		
		System.out.println("Is String is a rotation -"+rotation(x,y));
	}
	
	public static Boolean rotation(String a,String b){
		if(a.length()==b.length()&&a.length()>1){
		String test=a+a;
		return test.contains(b);
		}
		return false;
	}
}
