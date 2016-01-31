package testrepo;
import java.io.*;
import java.util.*;
public class Mergearrays {

	public static void main(String args[])throws IOException{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of your first array ?");
		
		int len=Integer.parseInt(buff.readLine());
		int a[]=new int[20];
		int b[]=new int[20];
		for (int i=0;i<len;i++){
			System.out.println("Enter the number ");
			a[i]=Integer.parseInt(buff.readLine());
		}
		
		System.out.println("Enter the length of the second array ");
		int len2=Integer.parseInt(buff.readLine());
		for (int i=0;i<len2;i++){
			System.out.println("Enter the number ");
			b[i]=Integer.parseInt(buff.readLine());
		}
		
		mergearr(a,b,len,len2);
	}
	
	public static void mergearr(int x[],int y[],int xlen, int ylen){
		int tot= (xlen+ylen)-1;
		int a=xlen-1;
		int b=ylen-1;
		
		while(a >=0 && b>=0){
			if(x[a]>y[b]){
				x[tot--]=x[a--];
			}else {
				x[tot--]=y[b--];
			}
		}
	
	for(int i=0;i<(xlen+ylen);i++){
		System.out.println(x[i]);
	}
	}
}
