package testrepo;
import java.io.*;
public class SingleNumber {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many numbers ?");
		int digi=Integer.parseInt(buff.readLine());
		int arr[]=new int [digi];
		for(int i=0;i<digi;i++){
			System.out.println("Enter the Number");
			arr[i]=Integer.parseInt(buff.readLine());
		}
		single(arr);
		
	}
	
	public static void single(int num[]){
		
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]!=num[j] && j==num.length-1)
					System.out.println("Single no is "+num[i]);
			}
		}
	}

}
