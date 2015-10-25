package testrepo;

import java.util.Stack;
import java.io.*;

public class MiniStack extends Stack<Integer>{
	
	Stack <Integer> s2;
	
	public MiniStack(){
		s2=new Stack<Integer>();
	}
	
	public void push(int value){
		if(value<min())
			s2.push(value);
		super.push(value);
		
	}
	
	public int pops(){
		int popped=super.pop();
		if (popped==min()){
			s2.pop();}
		return popped;
	}
	
	public int min(){
		if(s2.isEmpty())
			return Integer.MAX_VALUE;
		else
		return s2.peek();
	}
	
	public void Display(){
		int head =0;
		do{
			System.out.println(super.get(head));
			head++;
		}while(head<super.size());
	}
	public static void main(String args[])throws IOException{
		
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		MiniStack x=new MiniStack();
		char decision;
		
				
		do{
			System.out.println(" Choices for Stack ");
			System.out.println(" A)Push ");
			System.out.println(" B)Pop ");
			System.out.println(" C)Minimum ");
			System.out.println(" Please Enter Your Choice ");
			char ch=buff.readLine().charAt(0);
			switch(ch){
			case 'A':
				System.out.println("Enter the Element to be pushed");
				int enter=Integer.parseInt(buff.readLine());
				x.push(enter);
				break;
			case 'B':
				System.out.println("Popping Stack "+ x.pops());
				break;
			case 'C':
				System.out.println("Minimum Stack Value "+ x.min());
				break;
			}
			x.Display();
			System.out.println("Do you want to continue ? y/n");
			 decision=buff.readLine().charAt(0);
		}while(decision=='y');
			
	}
	
	
}
