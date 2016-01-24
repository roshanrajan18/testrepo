package testrepo;
import java.io.*;
public class WiggleSort {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many Digits ?");
		int digi=Integer.parseInt(buff.readLine());
		
		int num[]=new int [digi];
		
		for(int i=0;i<num.length;i++){
			System.out.println("Enter the Number ");
			num[i]=Integer.parseInt(buff.readLine());
		}
		Wiggle(num);
	}
	
	public static void Wiggle(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			if((i%2==1 && (arr[i]<arr[i+1]))||(i%2==0 && (arr[i]>arr[i+1]))){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("The following is the Wiggle Sort ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
