package testrepo;

import java.io.*;
public class Movingzero {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of the array");
		
		int n= Integer.parseInt(buff.readLine());
		
		int arr[]=new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(buff.readLine());
		}
		
		
		int pos=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[pos]=arr[i];
				pos++;
			}
		}
		for(int i=n-1;i>=pos;i--)
			arr[i]=0;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}

}
