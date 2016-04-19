package testrepo;
import java.io.*;
public class Zeromatrix {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of your array");
		
		int len=Integer.parseInt(buff.readLine());
		int zeromatrx[][]=new int[len][len];
		
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				zeromatrx[i][j]=Integer.parseInt(buff.readLine());
			}
		}
		
		int rowz[]=new int[len];
		int colz[]=new int[len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(zeromatrx[i][j]==0){
					rowz[i]=1;
					colz[j]=1;
				}
			}
		}
		
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(rowz[i]==1 || colz[j]==1){
					zeromatrx[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				System.out.println(zeromatrx[i][j]);
			}
		}
	}

}
