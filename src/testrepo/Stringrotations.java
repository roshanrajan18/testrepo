package testrepo;
import java.io.*;
public class Stringrotations {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first string ");
		String str1=buff.readLine();
		
		System.out.println("Enter the second string ");
		String str2=buff.readLine();
		
		String rotation=str1+str1;
		
		if(rotation.contains(str2))
			System.out.println("Rotation confirmed");
		else
			System.out.println("Not a rotation");
		
	}

}
