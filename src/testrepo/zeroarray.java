package testrepo;
import java.io.*;
public class zeroarray {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of the array");
		int x= Integer.parseInt(buffer.readLine());
		System.out.println("Elements are ?");
		int arra[][]=new int [x][x];
		for (int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				arra[i][j]=Integer.parseInt(buffer.readLine());
			}
		}

		int result[][]=setzero(arra,x);
		System.out.println("Your new array is");
		for (int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.println(result[i][j]);
			}
		}
	}
	
	public static int[][] setzero(int tes[][],int len){
		int []col= new int [len];
		int []row= new int [len];
		for (int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if (tes[i][j]==0){
					col[i]=1;
					row[j]=1;
				}
			}
		}
		for (int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if (col[i]==1||row[j]==1){
					tes[i][j]=0;
				}
			}
		}
		
		return tes;
		
	}
}
