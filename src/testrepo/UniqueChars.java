package testrepo;
import java.io.*;
public class UniqueChars {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String");
		String str= buff.readLine();
		boolean chars[]=new boolean[256];
		
		for(int i=0;i<str.length();i++){
			int c=str.charAt(i);
			if(chars[c]){
				System.out.println("Not Unique");
				System.exit(0);
			}
			else
				chars[c]=true;
		}
		
		System.out.println("Unique");
	}	
	
}