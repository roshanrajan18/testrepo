package testrepo;
import java.io.*;
import java.util.*;
public class RobotPaths {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of the array");
		int x=Integer.parseInt(buff.readLine());
		
		int a[][]=new int [x][x];
		System.out.println("Enter the numbers");
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				a[i][j]=Integer.parseInt(buff.readLine());
			}
		}
		
		ArrayList<String> path=new ArrayList<String>();
		robopath(x,1,1,"",path);
		System.out.println(path.toString());
		
	}
	
	public static void robopath(int n,int i, int j, String path, ArrayList<String> list){
		
		path+=String.format(" (%d,%d)",i,j);
		if(i==n&&j==n){
			list.add(path);
		}
		else if(i >n || j> n)
			return;
		else {
			robopath(n,i+1,j,path,list);
			robopath(n,i,j+1,path,list);
		}
	}

}
