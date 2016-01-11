package testrepo;
import java.util.*;
import java.io.*;
public class SquareDance {
	public static void main(String args[])throws IOException{
		
	
		String text="C:\\Users\\Roshan Rajan\\Desktop\\squaredance.txt";
		String gender="";
		PriorityQueue<String> men= new PriorityQueue<String>();
		PriorityQueue<String> women= new PriorityQueue<String>();
		BufferedReader input = new BufferedReader(new FileReader(text));
		String line=null;
		while((line = input.readLine())!=null){
			gender=line.substring(0, 1);
			if(gender.equals("M"))
				men.add(line.substring(2));
			else
				women.add(line.substring(2));
		}input.close();
		
		
		while (!men.isEmpty() && !women.isEmpty()){
			System.out.println("The couples are ");
			System.out.println(men.poll()+" is Dancing with "+women.poll());
		
		}
		if(men.isEmpty()){
			System.out.println(women.size() + " girls are Waiting to Dance");
			System.out.println(women.peek() + " is the first one waiting");
		}
		if(women.isEmpty()){
			System.out.println(men.size() + " guys are Waiting to Dance");
			System.out.println(men.peek() + " is the first one waiting");
		}
		
	}
}
