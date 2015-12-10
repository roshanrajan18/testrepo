package testrepo;

import java.io.*;
public class AddingDigits {
	public static void main(String args[])throws IOException {
		
		int sum=0;
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number");
		
		int n = Integer.parseInt(buff.readLine());
		
		while(n!=0){
			sum+=(n%10);
			n=n/10;
		}
		
		System.out.print(sum);
		
	}
}
