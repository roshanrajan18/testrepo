package testrepo;
import java.io.*;

public class Reversecstyle {	
	
	public static void main(String args[])throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Sting you want to reverse");
		String x=buffer.readLine();
		System.out.println(reverse(x));
		
	}

	public static String reverse(String s){
		StringBuilder cb=new StringBuilder();
		cb.append("#");
		for (int i=s.length()-1;i>=0;i--){
			char x=s.charAt(i);
			cb.append(x);
		}
		return cb.toString();
	}
}
