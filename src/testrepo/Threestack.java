package testrepo;
import java.io.*;
public class Threestack {
	int stacksize=300;
	int buffer[]=new int[stacksize*3];
	int stackptr[]={0,0,0};
	
	void Push(int stacknum,int value){
		int index=stacknum*stacksize+stackptr[stacknum]+1;
		stackptr[stacknum]++;
		buffer[index]=value;
	}
	
	int Pop(int stacknum){
		int index=stacknum*stacksize+stackptr[stacknum];
		stackptr[stacknum]--;
		int value=buffer[index];
		buffer[index]=0;
		return value;
	}
	int Peek(int stacknum){
		int index=stacknum*stacksize+stackptr[stacknum];
		return buffer[index];
	}
	boolean isEmpty(int stacknum){
		return stackptr[stacknum]==0;
	}
	
	void Display(){
		System.out.println("The First Stack");
		for (int a=0;a<=stackptr[0];a++){
			System.out.println(buffer[a]);
		}
		System.out.println("The Second Stack");
		for (int a=300;a<=300+stackptr[1];a++){
			System.out.println(buffer[a]);
		}
		System.out.println("The Third Stack");
		for (int a=600;a<=600+stackptr[2];a++){
			System.out.println(buffer[a]);
		}
	}
	
	public static void main(String args[])throws IOException{
		
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		Threestack stk= new Threestack();
		int choice;
		do{
		System.out.println("1)Push");
		System.out.println("2)Pop");
		System.out.println("3)Peek");
		System.out.println("4)Empty ?");
		
		int ch = Integer.parseInt(buff.readLine());
		
		switch(ch){
		case 1:
			System.out.println("Enter the stack no");
			int a=Integer.parseInt(buff.readLine());
			System.out.println("Enter the value");
			int b=Integer.parseInt(buff.readLine());
			stk.Push(a,b);
		break;
		case 2:
			System.out.println("Enter the stack no");
			int apop=Integer.parseInt(buff.readLine());
			int pop=stk.Pop(apop);
			System.out.println("Top of Stack Popped"+pop);
		break;
		case 3:
			System.out.println("Enter the stack no");
			int apeek=Integer.parseInt(buff.readLine());
			int peek=stk.Peek(apeek);
			System.out.println("Peek is "+peek);
		break;
		case 4:
			System.out.println("Enter the stack no");
			int aempty=Integer.parseInt(buff.readLine());
			if(stk.isEmpty(aempty))System.out.println("Stack is Empty");
			else 
				System.out.println("Not Empty");
			break;
		
		}
		stk.Display();
		System.out.println("Do you want to continue ? 1/0");
		 choice=Integer.parseInt(buff.readLine());
		
		}while(choice==1);
		
	}
	
}
