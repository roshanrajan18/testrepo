package testrepo;
import java.io.*;
public class Findinsorted {
	
	public static boolean findele(int [][]M,int no,int r,int c){
		int row=0;
		int col=c-1;
		while(row<r && col>=0){
			if(M[row][col]==no)
				return true;
			else if(M[row][col]>no)
				col--;
			else 
				row++;
		}
		return false;
	}
	
	
	
	public static void main(String args[])throws IOException{
		int a[][] = {{1,2,3},{4,5,6}};
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the element to be searched ?");
		int n=Integer.parseInt(buff.readLine());
		if(findele(a, n, a.length, a[0].length))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
	}
}
