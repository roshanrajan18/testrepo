package testrepo;

public class Bsttreeimpl {

	Bsttree root;
	
	public Bsttreeimpl(){
		root=null;
	}
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public void insert(int data){
		insert(root,data);
	}
	
	public Bsttree insert(Bsttree node,int data){
		
		
		if(node == null)
		{
		if (root==null){
			node= new Bsttree(data);
			root = node;
			
		}
		else
		node= new Bsttree(data);
		}
		else {
			if(data<=node.getData())
				node.left=insert(node.getLeft(),data);
			else
				node.right=insert(node.getRight(),data);
		}
		return node;
	}
	
	public boolean search(int value){
		return search(root,value);
	}
	
	public boolean search(Bsttree node,int val){
		boolean isFound=false;
		
		while(node!=null && isFound==false){
			if (val < node.getData())
				node=node.getLeft();
			else if(val>node.getData())
				node=node.getRight();
			else{
				isFound=true;
				break;
			}
			isFound=search(node,val);
		}
		
		return isFound;
		
	}
	
	public Bsttree Delete(Bsttree node, int value){
		Bsttree p,p2,n;
		
		if(node.getData() == value){
			Bsttree lt=node.getLeft();
			Bsttree rt=node.getRight();
			
			if(lt==null && rt==null)
				return null;
			else if(lt==null){
				p=rt;
				return p;
			}
			else if(rt==null){
				p=rt;
				return p;
			}
			
			else{
				p2=rt;
				p=rt;
				while(p.getLeft()!=null)
					p=p.getLeft();
				p.setLeft(lt);
				return p;
			}
			
		}
		
		if(value<node.getData()){
			n=Delete(node.getLeft(),value);
			node.setLeft(n);
		}
		if(value>node.getData()){
			n=Delete(node.getRight(),value);
			node.setRight(n);
		}
		return node;
	}
	
	public void Delete(int val){
		if(isEmpty())
			System.out.println("Empty Tree");
		else if (search(val)==false)
			System.out.println("Not found");
		else{
			Delete(root, val);
			System.out.println("Value Deleted "+val);
		}
	}
	
	public int countnodes(){
		return countnodes(root);
	}
	
	public int countnodes(Bsttree node){
		int l=1;
		if (node==null)
			return 0;
		
		while(node.getLeft()!=null){
			l++;
			node=node.getLeft();
		}
		Bsttree node2=root;
		while(node2.getRight()!=null){
			l++;
			node2=node2.getRight();
		}
		return l;
	}
	
	public void inorder(){
		inorder(root);
	}
	
	public void inorder(Bsttree node){
		if (node!=null){
			inorder(node.getLeft());
			System.out.println(node.getData());
			inorder(node.getRight());
		}
	}
	
	public void preorder(){
		preorder(root);
	}
	
	public void preorder(Bsttree node){
		if (node!=null){
			
			System.out.println(node.getData());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	public void postorder(){
		postorder(root);
	}
	
	public void postorder(Bsttree node){
		if (node!=null){
			
			preorder(node.getLeft());
			preorder(node.getRight());
			System.out.println(node.getData());
		}
	}
	}
	
	

