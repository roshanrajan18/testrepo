package testrepo;
import java.io.*;
public class RemoveDupliChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a String");
		String str=buff.readLine();
		//System.out.println(str.length);
		System.out.println(removeDuplis(str));
	}
	
	public static String removeDuplis(String dupli){
		
		for(int i=0;i<dupli.length();i++){
			for(int j=i+1;j<dupli.length();j++){
				if(dupli.charAt(i)==dupli.charAt(j)){
					dupli = dupli.substring(0, j) + dupli.substring(j + 1); 
					//i--; 
					break; 
					}
				
				}
			
			}
		
		
		return dupli;
	}
}
