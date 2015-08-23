package testrepo;
import java.io.*;

public class Unique {
	public static void main(String args[])throws IOException{
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter String");
		
		String str= buffer.readLine();
		
		if (isUnique(str))
		System.out.println("Unique");
		else 
		System.out.println("Not Unique");	
	}
	
	public static boolean isUnique(String word){
		boolean chars[] = new boolean [256];
		
		for (int i=0;i<word.length();i++){
			int index=word.charAt(i);
			if (chars[index])
				return false;
			chars[index]=true;}
				return true;		
	}
}
