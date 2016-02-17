package testrepo;
import java.util.*;
import java.io.*;
public class StringPermutation {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string");
		String enter=buff.readLine();
		System.out.println(getPerms(enter).toString());
	}
	
	public static ArrayList<String> getPerms(String s){
		ArrayList<String> permutations=new ArrayList<String>();
		if(s==null)
			return null;
		else if(s.length()==0){
			permutations.add("");
			return permutations; 
		}
		
		
		char first=s.charAt(0);
		String remaining=s.substring(1);
		ArrayList<String> words=getPerms(remaining);
		for(String word:words){
			for(int i=0;i<=word.length();i++){
				permutations.add(insertAt(word,first,i));
			}
		}
		return permutations;
	}
	
	public static String insertAt(String word,char c,int i){
		String start=word.substring(0,i);
		String end=word.substring(i);
		return start+c+end;
	}

}
