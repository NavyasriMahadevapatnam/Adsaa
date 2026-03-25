//N Queens problem using backtracking
public class Nqueens{
	static void solved(int n){
		int[] board=new int[n];
		placeQueen(board,0,n);
	}
	static void placeQueen(int[] board,int row,int n){
		if(row==n){
			printBoard(board,n);
			return;
		}
		for(int col=0;col<n;col++){
			if(isSafe(board,row,col)){
				board[row]=col;
				placeQueen(board,row+1,n);
			}
		}
	}
	static boolean isSafe(int[] board,int row,int col){
		for(int i=0;i<row;i++){
			int placedCol=board[i];
			if(placedCol==col ||Math.abs(row-i)==Math.abs(col-placedCol)){
				return false;
			}
		}
		return true;
	}
	static void printBoard(int[] board,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(board[i]==j)
					System.out.println("Q ");
				else
					System.out.println(". ");
			}
			System.out.println();
		}System.out.println();
	}
	public static void main(String[] args){
		int N=4;
		solved(N);
	}
}
	
