package testrepo;

import java.io.*;
public class PaintHouse {
	
	public static void main(String args[])throws IOException{
		int cost [][]={{7,5,10},{3,6,1},{8,7,4},{6,2,9},{1,4,7},{2,3,6}};
		System.out.println("Minimum cost is "+costColouringHouse(cost));
		
	}

	public static int costColouringHouse(int [][]M){
		int r=M.length+1;
		int c=M[0].length;
		int C[][]=new int[r][c];
		for(int i=0;i<c;i++){
			C[0][i]=0;
		}
		
		for(int i=1;i<r;i++){
			C[i][0]=Math.min(C[i-1][1], C[i-1][2])+M[i-1][0];
			C[i][1]=Math.min(C[i-1][0], C[i-1][2])+M[i-1][1];
			C[i][2]=Math.min(C[i-1][1], C[i-1][0])+M[i-1][2];
		}
		
		int mincost=Math.min(C[r-1][0],Math.min(C[r-1][1],C[r-1][2]));
		return mincost;
	}
}
