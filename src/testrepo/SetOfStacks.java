package testrepo;

import java.util.ArrayList;
import java.io.*;
public class SetOfStacks {
	
	ArrayList<StacksImpl> stacks=new ArrayList<StacksImpl>();
	public int capacity;
	public SetOfStacks(int capacity){
		this.capacity=capacity;
	}
	
	public StacksImpl getLast(){
		if (stacks.size()==0)return null;
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int v){
		StacksImpl pussh = getLast();
		
		if (pussh!=null && pussh.size<capacity)pussh.push(v);
		else{
			StacksImpl newstack= new StacksImpl(capacity);
			newstack.push(v);
			stacks.add(newstack);
		}
	}
	
	public int pop(){
		StacksImpl last=getLast();
		int v= last.pop();
		if (last.size == 0)stacks.remove(stacks.size()-1);
		return v;
	}
	
	public int popAt(int index){
		return leftShift(index, true);
	}
	
	public int leftShift(int index,boolean isTop){
		StacksImpl stack=stacks.get(index);
		int removedItem;
		if(isTop)removedItem=stack.pop();
		else removedItem=stack.removeBottom();
		if (stack.isEmpty()){
			stacks.remove(index);
		}else if(stacks.size()>index+1){
			int value=leftShift(index+1,false);
			stack.push(value);
		}
		return removedItem;	
	}
	
	public static void main(String args[])throws IOException{
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the capacity of the stacks");
		int capa=Integer.parseInt(buff.readLine());
		SetOfStacks test= new SetOfStacks(capa);
		int cho;
		do{
		System.out.println("1) Push");
		System.out.println("2) Pop Top Of");
		
		int ch = Integer.parseInt(buff.readLine());
		switch (ch) {
		case 1:
			System.out.println("Enter the element to be pushed");
			int push=Integer.parseInt(buff.readLine());
			test.push(push);
			break;
		case 2:
			System.out.println("Enter the Index to be popped");
			int popp=Integer.parseInt(buff.readLine());
			test.popAt(popp);
			break;
		}
		
		for (int i=0;i<test.stacks.size();i++){
			StacksImpl ack=test.stacks.get(i);
			ack.Display();
//			for(int j=0;j<ack.size;j++){
//				ack.Display();
//			}
			
		}
		System.out.println("Continue");
		 cho = Integer.parseInt(buff.readLine());
		}while(cho==1);	
	}
		
}


