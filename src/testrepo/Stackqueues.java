package testrepo;

import java.util.Stack;
import java.io.*;

public class Stackqueues<T> {

	Stack<T> s1;
	Stack<T> s2;
	int count;

	public Stackqueues(int x){
		s1=new Stack();
		s2=new Stack();
		count=0;
		s1.setSize(x);
		s2.setSize(x);
	}
	
	public int Size(){
		return s1.size()+s2.size();
	}
	
	public void Push(T value){
		if(!s1.isEmpty())
		s1.push(value);
		else {
			while(!s1.isEmpty()) 
				{s2.push(s1.pop());}
			
			s1.push(value);
		}
		
		count++;
	}
	
	public T peek(){
		if (!s2.isEmpty())return s2.peek();
		while(!s1.isEmpty()) s2.push(s1.pop());
		return s2.peek();
	}
	
	public T remove(){
		if (!s2.isEmpty())return s2.pop();
		while(!s1.isEmpty()) s2.push(s1.pop());
		return s2.pop();
	}
	
	public void getQueue(){
		if(count<=s1.size()){
			for(int i=0;i<s1.size();i++)
				System.out.println(s1.get(i));
		}else{
			for(int i=0;i<s1.size();i++)
				System.out.println(s1.get(i));
			for(int i=0;i<count - s1.size();i++)
				System.out.println(s2.get(i));
		}
	}
	
	public static void main(String args[])throws IOException{
		
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		Stackqueues test= new Stackqueues(5);
		
		Object testt= new Object();
		
		//test.s1.Push((T) buff.readLine());
		
		test.getQueue();
		
	}
	
}
