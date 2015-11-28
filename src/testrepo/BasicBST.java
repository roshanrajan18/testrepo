package testrepo;

import java.io.*;
public class BasicBST {

	public static void main(String args[])throws IOException{
		
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		
		Bsttreeimpl bst=new Bsttreeimpl();
		System.out.println("Basic Binary Tree Implementation");
		
		int ch;
		int cont;
		do{
			 System.out.println(" Binary Search Tree Operations ");
			 System.out.println("1. insert ");
	         System.out.println("2. delete ");
	         System.out.println("3. search ");
	         System.out.println("4. count nodes ");
	         System.out.println("5. check empty "); 
	         System.out.println("6. Is tree balanced ? ");
	         System.out.println("7 Build tree from Array");
	         System.out.println("Enter your Choice ?");
	         
	         ch=Integer.parseInt(buff.readLine());
	         
	         switch(ch){
	         case 1:
	        	 
	        	 System.out.println("Enter Node value");
	        	 int val=Integer.parseInt(buff.readLine());
	        	 bst.insert(val);
	        	 break;
	         case 2:
	        	 System.out.println("Enter the value you want to delete");
	        	 int delval=Integer.parseInt(buff.readLine());
	        	 bst.Delete(delval);
	        	 break;
	         case 3:
	        	 System.out.println("Enter the element to be searched for.");
	        	 int srch=Integer.parseInt(buff.readLine());
	        	 if(bst.search(srch))
	        		System.out.println("Found"); 
	        	 else
	        		 System.out.println("Not Found");
	       
	        	 break;
	         case 4:
	        	 System.out.println("No of nodes is " + bst.countnodes());
	        	 
	        	 break;
	         case 5:
	        	 if(bst.isEmpty())
	        		 System.out.println("Yup, Empty");
	        	 else
	        		 System.out.println("Nope not emplty");
	        	 break;
	         case 6:
	        	 if (bst.isBalanced(bst.root))
	        		 System.out.println("Yes the tree is balanced");
	        	 else 
	        		 System.out.println("No, its not");
	        	 break;
	         case 7:
	        	 System.out.println("Enter the length of the array");
	        	 int len=Integer.parseInt(buff.readLine());
	        	 int arr[]=new int[len];
	        	 for(int i=0;i<len;i++){
	        		 System.out.println("Enter the element");
	        		  arr[i]=Integer.parseInt(buff.readLine());
	        	 }
	        	 bst.createTreefromArray(arr);
	        	 
	         }
	         System.out.println("inorder");
        	 bst.inorder();
        	 System.out.println("Preorder");
        	 bst.preorder();
        	 System.out.println("Postorder");
        	 bst.postorder();
        	 
        	 System.out.println("Continue ? 1/0");
        	 cont= Integer.parseInt(buff.readLine());
	            
		}while(cont==1);
	}
}
