package testrepo;
import java.io.*;
public class MakingChange {
	
	
	public static int changepermutations(int amount,int denomination){
		
		int new_denomination=0;
		switch(denomination){
		case 25:
			new_denomination=10;
			break;
		case 10:
			new_denomination=5;
			break;
		case 5:
			new_denomination=1;
			break;
		case 1:
			return 1;
			
		}
		
		int ways=0;
		for(int i=0;i*denomination <amount;i++){
			ways +=changepermutations(amount-i*denomination, new_denomination);	
			}
		return ways;
	}
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the amount for finding change permutations ?");
		
		int amnt=Integer.parseInt(buff.readLine());
		System.out.println("The no of Permutations are "+changepermutations(amnt, 25));
	}

}
