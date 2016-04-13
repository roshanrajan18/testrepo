package testrepo;
import java.io.*;
public class Reversecstylestring {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String to be C style reversed ");
		String str=buff.readLine();
		
		StringBuilder cstring=new StringBuilder();
		
		cstring.append("#");
		
		for(int i=str.length()-1;i>=0;i--){
			cstring.append(str.charAt(i));
		}
		
		System.out.println(cstring.toString());
	}

}
