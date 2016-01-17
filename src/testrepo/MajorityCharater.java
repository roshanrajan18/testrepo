package testrepo;
import java.io.*;
public class MajorityCharater {
	public static void main(String args[])throws IOException{
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the word of your choice");
		String word=buff.readLine();
		
		int[]x=new int[256];
		
		for(int i=0;i<word.length();i++){
			x[word.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++){
			if(x[i]>(word.length()/2)){
				System.out.println("There is a majority");
				System.exit(0);
			}
		}
		System.out.println("Nope");
		
	}
}
