package testrepo;
import java.io.*;

public class Linkdlist {

	public Linkdlistnode start;
	public Linkdlistnode end;
	int size=0;
	
	public Linkdlist() {
		start=null;
		end=null;
		size=0;
	}
	
	public void insertAtStart(int value){
		Linkdlistnode newone= new Linkdlistnode(value, null);
		size++;
		if(start == null){
			start=newone;
			end=start;
		}else{
			newone.setLink(start);
			start=newone;
		}
	}
	
	public void insertAtEnd(int value){
		Linkdlistnode newone= new Linkdlistnode(value, null);
		size++;
		if(start == null){
			start=newone;
			end=start;
		}else{
			end.setLink(newone);
			end=newone;
		}
	}
	
	public void insertAtPos(int val,int pos){
		
		Linkdlistnode insertednode=new Linkdlistnode(val,null);
		size++;
		pos--;
		Linkdlistnode ptr=start;
		for(int i=0;i<size;i++){
			if(i==pos){
				Linkdlistnode tmp=ptr.getLink();
				ptr.setLink(insertednode);
				insertednode.setLink(tmp);
				break;
			}
			ptr=ptr.getLink();
		}
	}
	
	public void removeAtPos(int pos){
		
		if(pos==1){
			start=start.getLink();
			size--;
			return;
		}
		
		if(pos==size){
			Linkdlistnode s=start,t=start;
			while(s!=end){
				t=s;
				s=s.getLink();
			}
			end=t;
			t.setLink(null);		
			size--;
			return;
		}
		
		Linkdlistnode ptr=start;
		pos--;
		for(int i=0;i<size;i++){
			if(i==pos-1){
				Linkdlistnode tmp=ptr.getLink();
				tmp=tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr=ptr.getLink();
		}
		size--;
	}
	
	public void displayList (){
		
		if(size==0){
			System.out.println("Empty List");
			return;
		}
			
		if(start.getLink()==null){
			System.out.println(start.getData());
			return;
		}
			
		
		Linkdlistnode ptr=start;
		while(ptr.getLink()!=null){
			System.out.println(ptr.getData());
			ptr=ptr.getLink();
		}
		System.out.println(ptr.getData());
	}
	
	public void removeDupes(){
		Linkdlistnode previous=start;
		Linkdlistnode current=previous.getLink();
		
		while(current!=null){
			Linkdlistnode runner=start;
			while(runner!=current){
				if(runner.data==current.data){
					Linkdlistnode tmp=current.getLink();
					previous.link=tmp;
					current=current.getLink();
					break;
				}
				runner=runner.getLink();
			}
			if(runner==current){
				previous=current;
				current=current.getLink();
			}
		}
		
	}
	
	public void nthlast(int n){
		Linkdlistnode p1=start;
		Linkdlistnode p2=start;
		
		for(int i=0;i<n-1;i++){
			p2=p2.getLink();
		}
		while(p2.getLink()!=null){
			p1=p1.getLink();
			p2=p2.getLink();
		}
		System.out.println("Data is "+p1.getData());
	}
	
	public static void main(String args[])throws IOException{
				
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			Linkdlist test = new Linkdlist();
			int choice;
			do{
				System.out.println("\nSingly Linked List Operations\n");
	            System.out.println("1. insert at begining");
	            System.out.println("2. insert at end");
	            System.out.println("3. insert at position");
	            System.out.println("4. delete at position");
	            System.out.println("5. check empty");
	            System.out.println("6. get size");    
	           choice = Integer.parseInt(buff.readLine());
	            
	           if(choice==1)
	        	   test.insertAtStart(Integer.parseInt(buff.readLine()));
	           else if (choice==2)
	        	   test.insertAtEnd(Integer.parseInt(buff.readLine()));
	           else if(choice==3){
	        	   int val=Integer.parseInt(buff.readLine());
	        	   int pos=Integer.parseInt(buff.readLine());
	        	   test.insertAtPos(val, pos);
	           } else if(choice==4){
	        	   int pos=Integer.parseInt(buff.readLine());
	        	   test.removeAtPos(pos);
	           } else if(choice==5){
	        	   if(test.size==0)
	        		   System.out.println("List is empty");
	        	   else
	        		   System.out.println("List is not empty");
	           } else if(choice==6)
	        	   System.out.println("Size is " + test.size);
	        	   
	           	test.displayList();
	            System.out.println("Wanna continue ?");
	            choice=Integer.parseInt(buff.readLine());
			} while(choice==9);
			
		}
	}
	

