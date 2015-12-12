package testrepo;

import java.io.*;
public class Fizzbuzz {
	public static void main(String args[])throws IOException{
		
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the last no you want to do the sequence till ?");
		
		int n= Integer.parseInt(buff.readLine());
		
		System.out.println("The Fizz Buzz Sequence is :-");
		for (int i=1;i<=n;i++){
			if(i%3==0 && i%5==0)
				System.out.println("Fizz Buzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else 
				System.out.println(i);
				
		}
		
	}
}
