package testrepo;
import java.io.*;
public class Spacepattern {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string ");
		String str=buff.readLine();
		int spacecount=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				spacecount++;
		}
		
		int newlength=str.length()+(2*spacecount);
		char newstr[]=new char[newlength];
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)==' '){
				newstr[newlength-1]='0';
				newstr[newlength-2]='2';
				newstr[newlength-3]='%';
				newlength=newlength-3;
			} else {
				newstr[newlength-1]=str.charAt(i);
				newlength--;
			}
		}
		
		System.out.println(new String(newstr));
	}

}
