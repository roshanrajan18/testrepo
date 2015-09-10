package testrepo;
import java.io.*;
public class replacespace {
	public static void main(String args[])throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your String");
		String x=buffer.readLine();
		
		char [] test=x.toCharArray();
		System.out.println(replaceSpaces(test));
	}
	public static char[] replaceSpaces(char str[]){
		int spaces=0;
		int newlength=0;
		for (int i=0;i<str.length;i++){
			if(str[i]==' '){
				spaces++;
			}
		}
		int newspaces=0;
		newlength=str.length+spaces*2;
		char newstr[]=new char[newlength];
		for (int i=0;i<newstr.length;i++){
			int index=i-newspaces*2;
			if(str[index]==' '){
				newstr[i]='%';
				newstr[++i]='2';
				newstr[++i]='0';
				newspaces++;
			}else {newstr[i]=str[index];}
		}
		
		
		return newstr;
		
	}
}
