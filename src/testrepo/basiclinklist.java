package testrepo;
import java.io.*;
public class basiclinklist {
	
	private Node head;
	int listcount =0;
	
	basiclinklist(){
		head = new Node(null);
		listcount=0;
	}
	
	
	public void add(String data){
		Node tmp=new Node(data);
		
		if (head==null){
			head =new Node(null);
		}
		if (head.getData()==null){
			head=tmp;
			listcount++;
		}
		else{
		Node current=head;
		
		while(current.getNext()!=null){
			current = current.getNext();
		}
		current.setNext(tmp);
		listcount++;
	}
		
	
	}
	
	public void add(String data,int index){
		Node tmp=new Node(data);
		
		if (index == 1){
			tmp.setNext(head);
			head=tmp;
		}else{
		Node before = getatIndex(index-1);
		tmp.setNext(before.getNext());
		before.setNext(tmp);
		}
		listcount++;
	}
	
	public Node getatIndex(int index){
		Node tmp=head;
		for(int i=1;i<index;i++)
		{
			tmp=tmp.getNext();
		}
		return tmp;
	}
	
	public int size(){
		return listcount;
	}
	
	public boolean remove(int index){
		
		if (head==null){
			head=head.getNext();
		}
		else if(index==1){
		head=head.getNext();	
		}else{
		Node before = getatIndex(index-1);
		before.setNext(before.getNext().getNext());}
		
		listcount--;
		return true;
	}
	public void printit(){
		Node current=head;
		while(current!=null){
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	
	public void removeduplis(){
		if(head==null)return;
		Node previous =head;
		Node current=head.getNext();
		while (current!=null){
			Node runner=head;
			while(runner!=current){
				if(current.getData()==runner.getData()){
					Node tmp= current.getNext();
					previous.setNext(tmp);
					current=tmp;
					break;
				}runner=runner.getNext();
			}
			if(runner==current){
				previous=current;
				current=current.getNext();
			}
		}
		printit();
	}
	
	public static void main(String args[])throws IOException{
		char ch;
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of elements");
		int n=Integer.parseInt(buf.readLine());
		basiclinklist test= new basiclinklist();
		for (int i=1;i<=n;i++){
			System.out.println("Enter the link value");
			String x=buf.readLine();
			
			test.add(x);
		}

		do{
			System.out.println("Here are your choices");
			System.out.println("A)Add");
			System.out.println("B)Remove");
			System.out.println("C)Add at index");
			System.out.println("D)Get Size");
			System.out.println("E)Print It");
			System.out.println("Choice ?");
			
			char c=(char)buf.readLine().charAt(0);
			
			
			switch(c){
			case 'A' : 
                System.out.println("Enter integer element to insert");
                test.add(buf.readLine());
                break;                          
            case 'B' : 
            	 System.out.println("Enter index of removal");
            	 test.remove(Integer.parseInt(buf.readLine())); 
                 break; 
            case 'C' : 
                System.out.println("Enter integer element to insert");
                String x=buf.readLine();
                System.out.println("Enter index of element to insert");
                int y=Integer.parseInt(buf.readLine());
                test.add(x, y);  
                break;                          
            case 'D' : 
            	 System.out.println("Size of List");
            	 System.out.println(test.size());                
                 break;  
            case 'E' : 
           	 System.out.println("The List is");               
                break;  
			}
			test.printit();
			System.out.println("Do you want to continue ? Y/N");
            ch=(char) buf.readLine().charAt(0);
			
		}while(ch=='Y'||ch=='y');
	}
	
	private class Node{
		Node next;
		String data;
		public Node(String _data){
			next=null;
			data=_data;
		}
		public Node(Node setNext,String _data){
			next=setNext;
			data=_data;
		}
		public String getData(){
			return data;
		}
		public void setData(String _data){
			data=_data;
		}
		public void setNext(Node setNext){
			next=setNext;
		}
		public Node getNext(){
			return next;
		}
	}
	
}
