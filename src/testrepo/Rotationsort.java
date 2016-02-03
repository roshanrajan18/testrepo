package testrepo;
import java.io.*;
public class Rotationsort {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the length of ur array ");
		int n=Integer.parseInt(buff.readLine());
		
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the nos");
			a[i]=Integer.parseInt(buff.readLine());
		}
		
		System.out.println("Enter the no to search");
		int data=Integer.parseInt(buff.readLine());
		
		int pivot=findPivot(a, a.length);
		int index=-1;
		if (pivot==a[0])
			index=binsearch(a, 0, a.length-1, data);
		else{
			if(data>a[0])
				index=binsearch(a, 0,pivot-1, data);
			else
				index=binsearch(a, pivot,a.length-1, data);
		}
		if(index!=-1)
		System.out.println("We found the no, at the location "+(index+1));
	}
	
	public static int findPivot(int arr[],int size){
		if(arr[0]<arr[size-1])
			return 0;
		
		int start=0;
		int finish=size-1;
		int mid=0;
		while(start<finish){
			mid=start+(finish-start)/2;
			if(arr[start]<arr[mid])
				start=mid;
			else
				finish=mid;
		}
		
		return (mid+1);
	}
	
	public static int binsearch(int test[],int start,int end,int data){
		int mid;
		while(start<=end){
			mid=start+(end-start)/2;
			if(test[mid]==data)
				return mid;
			else{
				if(test[mid]<data)
					start=mid+1;
				else
					end=mid-1;
			}
		}
		return -1;
	}
	

}
