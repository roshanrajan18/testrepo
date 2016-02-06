package testrepo;

import java.io.*;
public class BinSearchString {
	
	public static int binsearch(String []list,String str,int first,int last){
		while(first<=last){
			while(first<=last && list[last]==""){
				last--;
			}
			
			if(last<first)
				return -1;
			
			int mid=(last+first)>>1;
			while(list[mid]=="")
				++mid;
			int r=list[mid].compareTo(str);
			if(r==0)
				return mid;
			if(r<0)
				first=mid+1;
			else
				last=mid-1;
			
		}
		return -1;
	}
	
	public static int searchstrings(String []stringlist,String str){
		if(stringlist==null||str==null)return -1;
		if(str==""){
			for(int i=0;i<stringlist.length;i++){
				if(stringlist[i]=="")
					return i;
			}
		}
		return binsearch(stringlist, str, 0, stringlist.length-1);
	}
	
	public static void main (String args[])throws IOException{
		
		String list[]={"at","","","","ball","","","car","","","dad","",""};
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the word you want to search ?");
		String str=buff.readLine();
		System.out.println(searchstrings(list, str));
	}
}
