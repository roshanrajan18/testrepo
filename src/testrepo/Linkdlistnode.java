package testrepo;

public class Linkdlistnode {

	protected int data;
	protected Linkdlistnode link;
	
	
	public Linkdlistnode(){
		data=0;
		link=null;
	}
	
	public Linkdlistnode(int val, Linkdlistnode next){
		data=val;
		link=next;
	}
	
	public void setData(int val){
		data=val;
	}
	
	public void setLink(Linkdlistnode node){
		link=node;
	}
	
	public int getData(){
		return data;
	}
	
	public Linkdlistnode getLink(){
		return link;
	}
}
