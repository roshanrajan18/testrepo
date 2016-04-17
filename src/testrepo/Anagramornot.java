package testrepo;
import java.io.*;
public class Anagramornot {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first String ");
		String str1=buff.readLine();
		System.out.println("Enter the first String ");
		String str2=buff.readLine();
		if(isAnagram(str1, str2))
			System.out.println("Yes, they are anagrams");
		else
			System.out.println("no, they are not anagrams");
	}
	
	public static boolean isAnagram(String str1,String str2){
		
		int uniqchar1=0,compltd2=0;
		int unique1[]= new int[256];
		char stra[]=str1.toCharArray();
		char strb[]=str2.toCharArray();
		for(int i=0;i<stra.length;i++){
			if(unique1[stra[i]]==0)uniqchar1++;
				unique1[stra[i]]++;
		}
		
		for(int j=0;j<strb.length;j++){
			if(unique1[strb[j]]==0)
				return false;
			else
			{	unique1[strb[j]]--;
				if(unique1[strb[j]]==0)
					compltd2++;
			}
		}
		if(compltd2==uniqchar1)
			return true;
		else
			return false;
	}

}
