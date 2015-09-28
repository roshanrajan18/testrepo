package testrepo;

import java.io.*;
public class anagram {	
	
	public static void main(String args[])throws IOException{
		
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 1st word");
		String a= buffer.readLine();
		System.out.println("Enter 2nd word");
		String b= buffer.readLine();
		if(isAnagram(a,b))System.out.println("Yup");
		else 
			System.out.println("Nope");
	}

	public static boolean isAnagram(String s1, String s2){
		if (s1.length()==0 || s2.length()==0)
			return false;
		if (s1.length()!=s2.length())
			return false;
		
		int letters []= new int[256];
		int uniques1=0;
		int compltds2=0;
		char c1[]=s1.toCharArray();
		
		for(char i:c1){
			if (letters[i]==0)uniques1++;
			++letters[i];
		}
		
		for (int j=0;j<s2.length();j++){
			int c=s2.charAt(j);
			if (letters[c]==0)return false;
			
			--letters[c];
			if(letters[c]==0)
			{compltds2++;
			if(compltds2==uniques1){
				return j==s2.length()-1;
			}
			}
			}
		return false;		
	}	
}
