import java.util.Scanner;
public class Final_Group_Project
{
	
	public static boolean Terminator (int g) {
	    if (g==0){
	        return true;
	    }
	    else
	    {
	       	return false;     
	    }
	}
	
	public static boolean  NumCheck (int h) {
	    if (h > 0 && h < 9){
	        return true;
	    }
	    else
	    {
	       	return false;     
	    }
	}
	
	public static int SumOfArray(int[] array) {
	    int sum = 0;
	    for (int value : array) {
	        sum += value;
	    }
	    return sum;
	}
	
	
	
	
	
	public static void main(String[] args){
    
		
		int[][] twoDimArray = new int[5][5];
		int [] columnOne = new int [3];
		int [] columnTwo = new int [3];
		int [] columnThree = new int [3];
		int [] rowOne = new int [3];
		int [] rowTwo = new int [3];
		int [] rowThree = new int [3];
		int [] diagonalOne = new int [3];
		int [] diagonalTwo = new int [3];
		
		System.out.println ("     --------------    ");
		System.out.println ("0<:"+columnOne[1]+":"+columnTwo[1]+":"+columnThree[1]+":>"+twoDimArray[5][1]);
		System.out.println ("     --------------    ");
		System.out.println ("0<:"+columnOne[2]+":"+columnTwo[2]+":"+columnThree[2]+":>"+twoDimArray[5][2]);
		System.out.println ("     --------------    ");
		System.out.println ("0<:"+columnOne[3]+":"+columnTwo[3]+":"+columnThree[3]+":>"+twoDimArray[5][3]);
		System.out.println ("     --------------    ");
		System.out.println (twoDimArray[1][4]+":"+twoDimArray[2][5]+":"+twoDimArray[3][5]+":"+twoDimArray[4][5]+":"+twoDimArray[5][5]);
		System.out.println ("     --------------    ");
		System.out.println ("Enter a number between 1 and 9 to continue: ");
		System.out.println ("Enter 0 to exit");
		System.out.println ("     --------------    ");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		
		
	}
	
	
	
	
	
}
