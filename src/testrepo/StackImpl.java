package testrepo;

import java.util.NoSuchElementException;
import java.io.*;
 class StackImpl {
	
	int arr[];
	int size=0;
	int len,top;
	
	StackImpl(int n){
		size=n;
		top=-1;
		len=0;
		arr=new int[size];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top==size -1;
	}
	
	public int getSize(){
		return len;
	}
	
	
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Empty Stack");
			return 0;
		}else
			return arr[top];
	}
	
	public void push(int x){
		if (isFull()){
			System.out.println("Stack is full");
		}else{
			arr[++top]=x;
			len++;
		}
	}
	
	public int pop(){
		if (isEmpty()){
			System.out.println("Empty Stack");
			return 0;
		}else{
			len--;
			return arr[top--];
		}
	}
	
	public void displayStack(){
		if (isEmpty()){
			System.out.println("Empty Stack");
			return;
		}
	
	for (int i=top;i>=0;i--){
		System.out.println(arr[i]);
	}
	
}

	public static void main(String args[])throws IOException{
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("Enter the Size of the Stack");
		int n=Integer.parseInt(buff.readLine());
		StackImpl stk=new StackImpl(n);
		do{
		System.out.println("Stack Implenmentation Options");
		System.out.println("1)Push");
		System.out.println("2)Pop");
		System.out.println("3)Peek");
		System.out.println("4)Empty ?");
		System.out.println("5)Full ?");
		System.out.println("6)Size ?");
		
		int ch = Integer.parseInt(buff.readLine());
		switch(ch){
		case 1:
			System.out.println("Enter the element to be pushed");
			int a=Integer.parseInt(buff.readLine());
			stk.push(a);
		break;
		case 2:
			int pop=stk.pop();
			if (pop==0)
				System.out.println("Stack empty already");
			else
			System.out.println("Top of Stack Popped"+pop);
		break;
		case 3:
			int peek=stk.peek();
			System.out.println("PEEK IS"+peek);
		break;
		case 4:
			if(stk.isEmpty())System.out.println("Stack is Empty");
			else 
				System.out.println("Not Empty");
			break;
		case 5:
			if(stk.isFull())System.out.println("Stack is Full");
			else 
				System.out.println("Not Full");
			break;
		case 6:
				System.out.println("Size is"+ stk.getSize());
			break;
				
		}
		stk.displayStack();
		System.out.println("Do you want to continue ? 1/0");
		 choice=Integer.parseInt(buff.readLine());
		}while(choice==1);		
		}
		
 }

