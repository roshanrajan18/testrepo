package testrepo;

import java.util.Stack;

public class Tower {
	public Stack<Integer> disks;
	int index;
	
	public Tower(int i){
		disks=new Stack<Integer>();
		index = i;
	}
	
	public int index(){
		return index;
	}
	
	public void push(int d){
		if (!disks.isEmpty() && disks.peek()<=d)
			System.out.println("Cannot Place this disk here");
		else
			disks.push(d);
	}
	
	public void moveTop(Tower t){
		int top=disks.pop();
		t.push(top);
		System.out.println("Moving Disk" + top + "from" +index()+ "to" +t.index );
	}
	
	public void printtower(){
		System.out.println("Contents of Tower"+index());
		for(int i=disks.size()-1;i>=0;i--)
			System.out.println(disks.get(i));
	}
	public void moveDisks(int n,Tower destination, Tower buffer){
		if (n>0){
			moveDisks(n-1, buffer, destination);
			moveTop(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
	
	public static void main(String args[]){
		int n=5;
		Tower[] towers=new Tower[n];
		for(int i=0;i<3;i++)towers[i]=new Tower(i);
		for(int i=5;i>0;i--)towers[0].push(i);
		towers[0].moveDisks(5, towers[1], towers[2]);
	}
}
