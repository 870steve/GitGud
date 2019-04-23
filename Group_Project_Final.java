import java.util.Scanner;
public class Group_Project_Final
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
	
	public static void PrintMagicSquare(int [] columnOne,int [] columnTwo,int [] columnThree, int [][] twoDimArray) {
		
		System.out.println ("     --------------    ");
		System.out.println ("0<: "+twoDimArray[0][1]+" : "+twoDimArray[0][2]+" : "+twoDimArray[0][3]+" :> "+twoDimArray[0][4]);
		System.out.println ("     --------------    ");
		System.out.println ("0<: "+twoDimArray[1][1]+" : "+twoDimArray[1][2]+" : "+twoDimArray[1][3]+" :> "+twoDimArray[1][4]);
		System.out.println ("     --------------    ");
		System.out.println ("0<: "+twoDimArray[2][1]+" : "+twoDimArray[2][2]+" : "+twoDimArray[2][3]+" :> "+twoDimArray[2][4]);
		System.out.println ("     --------------    ");
		System.out.println (twoDimArray[3][0]+"<: "+twoDimArray[3][1]+" : "+twoDimArray[3][2]+" : "+twoDimArray[3][3]+" :> "+twoDimArray[3][4]);
		System.out.println ("     --------------    ");
		System.out.println ("Enter a number between 1 and 9 to continue: ");
		System.out.println ("Enter 0 to exit");
		System.out.println ("     --------------    ");		
		
	}

	public static void ReplaceValue(int input, int[][] arr){

		for (int i = 0; i<arr.length; i++){
     		for (int j = 0; j<arr[i].length; j++){
        	if(input == arr[i][j]){
				arr[i][j] = input;
			} 
			}
		}
	}
	
	
	public static void main(String [ ] args) {

		Scanner sc = new Scanner(System.in);
		
			
		int [] columnOne = {twoDimArray[0][1], twoDimArray[1][1], twoDimArray[2][1]};
		int [] columnTwo = {twoDimArray[0][2], twoDimArray[1][2], twoDimArray[2][2]};
		int [] columnThree = {twoDimArray[0][3], twoDimArray[1][3], twoDimArray[2][3]};
		int [] rowOne = {twoDimArray[0][1], twoDimArray[0][2], twoDimArray[0][3]};
		int [] rowTwo = {twoDimArray[1][1], twoDimArray[1][2], twoDimArray[1][3]};
		int [] rowThree = {twoDimArray[2][1], twoDimArray[2][2], twoDimArray[2][3]};
		int [] diagonalOne = {twoDimArray[2][1], twoDimArray[1][2], twoDimArray[0][3]};
		int [] diagonalTwo = {twoDimArray[2][3], twoDimArray[1][2], twoDimArray[0][1]};
		int twoDimArray[][] = {
			{0, 1, 2, 3, SumOfArray(rowOne)},
			{0, 4, 5, 6, SumOfArray(rowTwo)},
			{0, 7, 8, 9, SumOfArray(rowThree)},
			{SumOfArray(diagonalOne), SumOfArray(columnOne), SumOfArray(columnOne), SumOfArray(columnOne), SumOfArray(diagonalTwo)}
	};
				
		int i = 0;
        while (!Terminator(i) && NumCheck(i)) {
            PrintMagicSquare(columnOne, columnTwo, columnThree, twoDimArray);
			i = sc.nextInt();
            ReplaceValue(i, twoDimArray);		
			
			
		}
		
		
		
		
	}
	
	
	
	
	
}