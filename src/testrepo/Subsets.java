package testrepo;
import java.util.*;
import java.io.*;
public class Subsets {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array ?");
		int x=Integer.parseInt(buff.readLine());
		ArrayList<Integer> test=new ArrayList<Integer>(x);
		for(int i=0;i<x;i++){
			test.add(Integer.parseInt(buff.readLine()));
		}
		System.out.println(getList(test,0).toString());
	}
	
	public static ArrayList<ArrayList<Integer>> getList(ArrayList<Integer> set,int index){
		ArrayList<ArrayList<Integer>> getAllLists;
		
		if(set.size()==index){
			getAllLists=new ArrayList<ArrayList<Integer>>();
			getAllLists.add(new ArrayList<Integer>());
		}
		else{
			getAllLists=getList(set,index+1);
			int item=set.get(index);
			ArrayList<ArrayList<Integer>> moreSubsets=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:getAllLists){
				ArrayList<Integer> newsubset=new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moreSubsets.add(newsubset);
			}
			getAllLists.addAll(moreSubsets);
		}
		
		return getAllLists;
		
	}
	
}
