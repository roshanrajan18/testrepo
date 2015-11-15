package testrepo;

public class Bsttree {
	Bsttree left;
	Bsttree right;
	int data;
	
	public Bsttree() {
		// TODO Auto-generated constructor stub
		
		left=null;
		right=null;
		data=0;
	}
	
	public Bsttree(int value){
		data=value;
		left=null;
		right=null;
	}
	
	public void setLeft(Bsttree leftnode){
		left=leftnode;
	}
	
	public void setRight(Bsttree rightnode){
		right=rightnode;
	}
	
	public void setData(int value){
		data=value;
	}
	
	public int getData(){
		return data;
	}
	public Bsttree getLeft(){
		return left;
	}
	public Bsttree getRight(){
		return right;
	}
	
	
}
