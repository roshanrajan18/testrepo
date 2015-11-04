package testrepo;



public class StacksImpl {
	
	private int capacity;
	public Node top,bottom;
	public int size=0;
	public StacksImpl(int capacity){
		this.capacity=capacity;
	}
	
	public boolean isFull(){
		return capacity==size;
	}
	
	public void join (Node above,Node below){
		if (above!=null)above.below=below;
		if (below!=null)below.above=above;
	}
	
	public boolean push(int v){
		if (size>=capacity)return false;
		size++;
		Node n=new Node(v);
		if (size == 1) bottom=n;
		join(n,top);
		top=n;
		return true;
	}
	
	public int pop(){
		Node t= top;
		top= top.below;
		size--;
		return t.data;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int removeBottom(){
		Node b= bottom;
		bottom=bottom.above;
		if (bottom!=null) bottom.below=null;
		size --;
		return b.data;
	}
	
	public void Display(){
		Node current=top;
		int counter=0;
		for (int i=0;i<size;i++){
			System.out.println(current.data);
			if(current.below!=null)
			current=current.below;
			else break;
		}
//			do{
//				System.out.println(current.data);
////				if (current.below!=null)
//			 current=current.below;
//			counter++;
//			if (current.below==null)break;}
//			while(counter<=size);
		
	}
	
	private class Node{
		Node above,below;
		int data;
		public Node(int _data){
			above=null;
			below=null;
			data=_data;
		}
//		public Node(Node setNext,String _data){
//			above=setNext;
//			data=_data;
//		}
//		public int getData(){
//			return data;
//		}
//		public void setData(int _data){
//			data=_data;
//		}
//		public void setNext(Node setNext){
//			above=setNext;
//		}
//		public Node getNext(){
//			return above;
//		}
	}
}
