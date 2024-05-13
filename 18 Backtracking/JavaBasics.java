import java.util.*;


//Back tracking on arrays - just for undersatanding

// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i=0;i<s.length;i++){
// 			System.out.print(s[i]+" ");
// 		}
// 		System.out.println();
// 	}
// 	public static void changeArray(int s[],int i,int val){
// 		//BASE CASE
// 		if(i==s.length){
// 			print(s);
// 			return;
// 		}
// 		//KAAM(recursion)
// 		s[i]=val;
// 		changeArray(s,i+1,val+1); //function call
// 		s[i]=s[i]-2; // Backtracking steps
// 	}
// 	public static void main(String args[]){
// 		int s[] = new int[5];
// 		changeArray(s,0,1);
// 		print(s);
// 	}
// }


// Subset of string  fromulas n = 2^n subsets  n*2^n time complesity

// public class JavaBasics{

// 	public static void subSet(String s,String ans,int i){
// 		//BASE CASE
// 		if(i==s.length()){
// 			System.out.println(ans);
// 			return;
// 		}
// 		//KAAM(recursion)
// 		//Yes choice
// 		subSet(s,ans+s.charAt(i),i+1);
// 		//no choice
// 		subSet(s,ans,i+1);
// 	}
// 	public static void main(String args[]){
// 		String s= "abc";
// 		subSet(s,"",0);
// 	}
// }


//permutations n*n! time complesity

// public class JavaBasics{
// 	public static void permutations(String s,String ans){
// 		//base
// 		if(s.length()==0){
// 			System.out.println(ans);
// 			return;
// 		}
// 		//kaam
// 		for(int i = 0; i<s.length();i++){
// 			char curr = s.charAt(i);
// 			String newStr = s.substring(0,i) + s.substring(i+1);
// 			permutations(newStr, ans+curr);
// 		}
// 	}
// 	public static void main(String args[]){
// 		String s = "abc";
// 		permutations(s,"");
// 	}
// }


// N Queens  __ Imp Time complexity = o(n!)


// public class JavaBasics{
// 	public static void printBoard(char board[][]){
// 		System.out.println("--------Board---------");
// 		for(int i=0;i<board.length;i++){
// 			for(int j=0;j<board.length;j++){
// 				System.out.print(board[i][j]+" ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(char board[][], int row, int col){
// 		// vertical up
// 		for(int i=row-1;i>=0;i--){
// 			if(board[i][col]=='Q'){
// 				return false;
// 			}
// 		}
// 		//diag left up
// 		for(int i=row-1,j=col-1; i>=0 && j>=0 ;i--,j--){
// 			if(board[i][j]=='Q'){
// 				return false;
// 			}
// 		}
// 		//diag right up
// 		for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
// 			if(board[i][j]=='Q'){
// 				return false;
// 			}
// 		}
// 		return true;
// 	}

// 	public static void Nqueens(char board[][], int row){
// 		if(row==board.length){
// 			printBoard(board);
// 			count++;
// 			return;
// 		}
// 		//kaam
// 		//Column loop
// 		for(int j=0;j<board.length;j++){
// 			if(isSafe(board,row,j)){
// 				board[row][j] = 'Q';
// 				Nqueens(board,row+1); // functionn call
// 				board[row][j] = 'X'; // backtracking step
// 			}
// 		}
// 	}
// 	static int count = 0;

// 	public static void main(String args[]){
// 		int n = 4;
// 		char board[][] = new char[n][n];
// 		// initialize
// 		for(int i=0;i<n;i++){
// 			for(int j=0;j<n;j++){
// 				board[i][j] = 'X';
// 			}
// 		}
// 		Nqueens(board,0);
// 		System.out.println("Number of ways to place Queen" + count );
// 	}
// }



// Grid ways  time complexity  = o(2 ^ n X m)


// public class JavaBasics{
// 	public static int gridWays(int i,int j, int n,int m){
// 		//base
// 		if(i==n-1 && j ==m-1){
// 			return 1;
// 		} else if(i==n || j==m){
// 			return 0;
// 		}
// 		//kaam
// 		int w1 = gridWays(i+1,j,n,m);
// 		int w2 = gridWays(i,j+1,n,m);
// 		int w = w1+w2;
// 		return w;
// 	}
// 	public static void main(String args[]){
// 		int n=3,m=3;
		
// 		System.out.println(gridWays(0,0,n,m));
// 	}
// }








// notes

// backtracking

// Decision
// optimization
// enumeration



// Practice

//array

// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i = 0;i<s.length;i++){
// 			System.out.print(s[i]+" ");
// 		}
// 		System.out.println();
// 	}
// 	public static void changeArray(int s[],int i,int val){
// 		//base
// 		if(i==s.length){
// 			print(s);
// 			return;
// 		}
// 		//kaam
// 		s[i] = val;
// 		changeArray(s,i+1,val+1);
// 		s[i]= s[i]-2;
// 	}
// 	public static void main(String args[]){
// 		int s[]= new int[5];
// 		changeArray(s,0,1);
// 		print(s);

// 	}
// }



//subset

// public class JavaBasics{
// 	public static void subset(String s, String ans, int i ){
// 		//base
// 		if(i==s.length()){
// 			System.out.println(ans + "");
// 			return;
// 		}
// 		//kaam	recursion;
// 		//yes
// 		subset(s,ans+s.charAt(i),i+1);
// 		//no
// 		subset(s,ans,i+1);
		

// 	}
// 	public static void main(String args[]){
// 		String s = "abc";
// 		subset(s,"",0);
// 	}
// }


// Permutation

// public class JavaBasics{
// 	public static void permutation(String s,String ans){
// 		//base
// 		if(s.length()==0){
// 			System.out.println(ans);
// 			return;
// 		}
// 		//kaam
// 		for(int i=0;i<s.length();i++){
// 			char curr = s.charAt(i);
// 			String newStr = s.substring(0,i) + s.substring(i+1);
// 			permutation(newStr,ans+curr);
// 		}
// 	}
// 	public static void main(String args[]){
// 		String s = "abc";
// 		permutation(s,"");
// 	}
// }




// public class JavaBasics{
// 	public static void per(String s,String ans){
// 		//base
// 		if(s.length()==0){
// 			System.out.println(ans+" ");
// 			return;
// 		}

// 		//kaam
// 		for(int i=0;i<s.length();i++){
// 			char curr = s.charAt(i); 
// 			String newStr = s.substring(0,i) + s.substring(i+1);
// 			per(newStr,ans+curr);
// 		}

// 	}
// 	public static void main(String args[]){
// 		String s = "abc";
// 		per(s,"");
// 	}
// }









// N-Queens practice


// public class JavaBasics{
// 	public static void print(char board[][]){
// 		System.out.println("--------Board---------");
// 		for(int i = 0; i<board.length;i++){
// 			for(int j = 0; j<board.length;j++){
// 			System.out.print(board[i][j]+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}

// 	public static boolean isSafe(char board[][], int row, int col){
// 		//vertical up
// 		for(int i=row;i>=0;i--){
// 			if(board[i][col] == 'Q'){
// 			return false;	
// 			}
// 		}
// 		//diagonal left up
// 		for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--){
// 			if(board[i][j] == 'Q'){
// 			return false;	
// 			}
// 		}
// 		//diagonal right up
// 		for(int i=row-1,j=col+1;i>=0 && j<board.length;j++,i--){
// 			if(board[i][j] == 'Q'){
// 			return false;	
// 			}
// 		}
// 		return true;
// 	}

// 	public static void Nqueen(char board[][],int row){
// 		//base
// 		if(row==board.length){
// 			print(board);
// 			count++;
// 			return;
// 		}
// 		//kaam
// 		for(int j = 0; j<board.length;j++){
// 			if(isSafe(board,row,j)){
// 				//Column loop
// 				board[row][j] = 'Q';
// 				Nqueen(board,row+1);
// 				board[row][j] = 'X';
// 			}
// 		}
// 	}
// 	static int count = 0;
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add N for N X N board size: ");
// 		int n = sc.nextInt();
// 		char board[][] = new char[n][n];
// 		//Initalize
// 		for(int i = 0; i<n;i++){
// 			for(int j = 0; j<n;j++){
// 			board[i][j]= 'X';
// 			}
// 		}
// 		Nqueen(board,0);
// 		System.out.println();
// 		System.out.println("Total ways  :" +count);
// 	}	
// }


//N Queens

// public class JavaBasics{
// 	public static void print(char board[][]){
// 		System.out.println("-------Board-------------");
// 		for(int i = 0; i<board.length;i++){
// 			for(int j = 0; j<board.length;j++){
// 			System.out.print(board[i][j]+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(char board[][],int row,int col){

// 		//vertically up
// 		for(int i = row-1; i>=0;i--){
// 			if(board[i][col] == 'Q'){
// 				return false;
// 			}
// 		}
// 		// dia right
// 		for(int i = row-1, j=col-1; i>=0 && j>=0;j--,i--){
// 			if(board[i][j] == 'Q'){
// 			return false;
// 			}
// 		}
// 		// dia left
// 		for(int i = row-1, j=col+1; i>=0 && j<board.length;j++,i--){
// 			if(board[i][j] == 'Q'){
// 			return false;
// 			}
// 		}
// 		return true;
// 	}
// 	public static void nQueens(char board[][],int s,int row){
// 		//base
// 		if(row==s){
// 			print(board);
// 			return;
// 		}

// 		//kaam
// 		for(int j = 0; j<board.length;j++){
// 			if(isSafe(board,row,j)){
// 				board[row][j] = 'Q';
// 				nQueens(board,s,row+1);
// 				board[row][j] = 'X';
// 			}
// 		}

// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print( "Add N in NXN board : ");
// 		int n = sc.nextInt();
// 		char board[][] = new char[n][n];

// 		for(int i = 0; i<n;i++){
// 			for(int j = 0; j<n;j++){
// 				board[i][j] = 'X';
// 			}
// 		}
// 		nQueens(board,n,0);
		
// 	}
// }


// N Queens


// public class JavaBasics{
// 	public static void print(char board[][]){
// 		System.out.println("------Board------");
// 		for(int i = 0; i<board.length ; i++){
// 			for(int j = 0; j<board.length ; j++){
// 				System.out.print(" " +board[i][j]+ " ");	
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(char board[][],int row,int col){
// 		// up
// 		for(int i = row-1; i>=0; i--){
// 			if(board[i][col]=='Q'){
// 				return false;
// 			}
// 		}
// 		//dia left
// 		for(int i = row-1,j=col-1; i>=0 && j>=0 ; j--,i--){
// 			if(board[i][j]=='Q'){
// 				return false;
// 			}
// 		}
// 		//dia right
// 		for(int i = row-1,j=col+1; i>=0 && j<board.length ; j++,i--){
// 			if(board[i][j]=='Q'){
// 				return false;
// 			}
// 		}
// 		return true;
// 	}
	
// 	public static void nQueens(char board[][],int row){
// 		//Base 
// 		if(row==board.length){
// 			print(board);
// 			return;
// 		}
// 		//Kaam
// 		for(int j = 0; j<board.length ; j++){
// 			if(isSafe(board,row,j)){
// 				board[row][j]='Q';
// 				nQueens(board,row+1);
// 				board[row][j]='X';
// 			}
// 		}
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add N for NXN Board : ");
// 		int n = sc.nextInt();
// 		char board[][] = new char[n][n];
// 		// Initialize
// 		for(int i = 0; i<board.length ; i++){
// 			for(int j = 0; j<board.length ; j++){
// 				board[i][j]='X';
// 			}
// 		}
// 		nQueens(board,0);
// 	}
// }




// Knight tour

public class Practice{

	public static void print(int s[][]){
		System.out.println("------- Board --------");
		for(int i = 0; i < s.length ; i++){
			for(int j = 0; j < s[0].length ; j++){
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
	}	

	public static boolean isSafe(int board[][], int i , int j){
		return (i >= 0 && j >= 0 && i < board.length  && j < board.length && board[i][j] == -1);
	}

	public static boolean nKnights(int board[][], int count, int i , int j ){
		if(count == board.length *  board.length){
			return true;
		}

		int movei[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int movej[] = {1, 2, 2, 1, -1, -2, -2, -1};

		for (int k = 0 ; k < 8 ; k++) {
			int movenewi = i + movei[k];
			int movenewj = j + movej[k];
			
			if(isSafe(board,movenewi,movenewj)){

				board[movenewi][movenewj] = count;
				if(nKnights(board,count+1,movenewi,movenewj)){
					return true;
				}
				board[movenewi][movenewj] = -1;
			}
		}
		
		return false;
	}

	public static void main(String args[]){
		int n = 8 ; 

		int board[][] = new int[n][n];
		for(int i = 0; i < board.length ; i++){
			for(int j = 0; j < board[0].length ; j++){
				board[i][j] = -1;
			}
			System.out.println();
		}
		nKnights(board,1,0,0);
		print(board);
	}
}



// Grid Ways


// public class JavaBasics{
// 	public static int gridWays(int n[][],int i,int j,String s){
// 		// Base
// 		if((i==n.length-1 && j==n.length-1)){
// 			System.out.print(" ways : ");
// 			System.out.println(s);
// 			return 1;
// 		} else if(i==n.length || j==n.length){
// 			return 0;
// 		}

// 		int w1 = gridWays(n,i+1,j,s+"D");
// 		int w2 =gridWays(n,i,j+1,s+"R");

// 		return w1+w2;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add N for NXN Board : ");
// 		int n = sc.nextInt();
// 		int s[][] = new int[n][n];
		
// 		System.out.print(gridWays(s,0,0,""));
// 		System.out.print(" :  Total ways ");
// 	}
// }



// Rat maze Question


// public class JavaBasics{
// 	// public static void
// 	public static void ratMAze(int s[][],int i,int j,int n,int count,boolean visited[][],String way){
// 		if(i<0 || j<0 || i>=n || j>=n){
// 			return;
// 		}

// 		if(s[i][j]!=1 || visited[i][j]==true){
// 			return;
// 		}

// 		if(i==n-1 && j==n-1){
// 			System.out.println("___path___");
// 			System.out.println("Reached using path : " + way);
// 			System.out.println("Count  : " + count);
// 			ways++;
// 			return;
// 		}	
		
// 		visited[i][j]=true;

// 		ratMAze(s,i-1,j,s.length,count+1,visited,way+"U");
// 		ratMAze(s,i+1,j,s.length,count+1,visited,way+"D");
// 		ratMAze(s,i,j-1,s.length,count+1,visited,way+"L");
// 		ratMAze(s,i,j+1,s.length,count+1,visited,way+"R");

// 		visited[i][j]=false; // back tracking
// 	}

// 	static int ways = 0;

// 	public static void main(String args[]){
// 		int s[][] = {{1,1,1,1},
// 					{0,1,0,1},
// 					{1,1,1,1},
// 					{1,0,1,1}};
// 		int n= s.length;
// 		boolean visited[][] = new boolean[n][n];
// 		int ct = 0;
// 		ratMAze(s,0,0,n,ct,visited,"");
	
// 		System.out.println("Total ways : " + ways);
// 	}
// }










// // Rat maze

// public class JavaBasics{
// 	public static void ratMAze(int s[][],int i,int j,int n,int count,boolean visited[][],String path){
// 		if(i<0 || j<0 || i>=n || j>=n){
// 			return;
// 		}
// 		if(s[i][j] == 0 || visited[i][j] == true){
// 			return;
// 		}
// 		if(i==n-1 && j==n-1){
// 			ways++;
// 			System.out.println("____Path____");
// 			System.out.println("Path : "+ path);
// 			System.out.println("total Steps : "+ count);
// 			System.out.println("Total way : "+ ways);
// 			return;
// 		}
// 		visited[i][j] = true;
// 		ratMAze(s,i-1,j,n,count+1,visited,path+"U" );
// 		ratMAze(s,i+1,j,n,count+1,visited,path+"D");
// 		ratMAze(s,i,j-1,n,count+1,visited,path+"L");
// 		ratMAze(s,i,j+1,n,count+1,visited,path+"R");
// 		visited[i][j] = false;
// 	}
// 	static int ways = 0;
// 	public static void main(String args[]){
// 		int s[][]= {{1,1,0,1},
// 					{0,1,1,1},
// 					{1,0,1,1},
// 					{1,1,1,1}};
// 		int n = s.length;
// 		boolean visited[][] = new boolean[n][n];
// 		ratMAze(s,0,0,n,0,visited,"");
// 	}
// }








// nQueens

// public class JavaBasics{
// 	public static void print(char board[][]){
// 		System.out.println("_____-Board-_____");
// 		for(int i = 0; i<board.length ; i++){
// 			for(int j = 0; j<board.length ; j++){
// 				System.out.print(board[i][j]+ " "); 
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(char board[][], int row , int col){
// 		//vertical up
// 		for(int i = row-1; i>=0 ; i--){
// 				if(board[i][col]=='Q'){
// 				return false;
// 			}
// 		}
// 		//diagonal left
// 		for(int i = row-1, j =col-1; i>=0 && j>=0 ;j--, i--){
// 				if(board[i][j]=='Q'){
// 				return false;
// 			}
// 		}
// 		//diagonal right
// 		for(int i = row-1, j =col+1; i>=0 && j<board.length ;j++, i--){
// 				if(board[i][j]=='Q'){
// 				return false;
// 			}
// 		}
// 		return true;
// 	}

// 	public static void nQueens(char board[][], int row){
// 		//base
// 		if(row==board.length){
// 			print(board);
// 			return;
// 		}
		
// 		//kaam
// 		for(int j = 0; j<board.length ; j++){
// 			if(isSafe(board,row,j)){
// 				board[row][j]= 'Q';
// 				nQueens(board,row+1);
// 				board[row][j]= 'X';
// 			}
// 		}
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print( "Add Numebr for N for NXN number board:  ");
// 		int n = sc.nextInt();
// 		char board[][] = new  char[n][n];
// 		//initialize
// 		for(int i = 0; i<board.length ; i++){
// 			for(int j = 0; j<board.length ; j++){
// 				board[i][j]= 'X';
// 			}
// 		}
// 		nQueens(board,0);
// 	}
// }



	




// rat maze


// public class JavaBasics{
// 	public static void print(int maze[][]){
// 		System.out.println("solution");
// 		for(int i = 0 ;i<maze.length ; i++){
// 			for(int j = 0 ;j<maze.length ; j++){
// 				System.out.print(maze[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(int maze[][],int i, int j, int n){	
// 			return (i >=0 && j>=0 && i<maze.length && j<maze.length && maze[i][j] == 1);
// 		}

// 	public static boolean ratMAze(int maze[][],int i, int j, int n){
// 		//base
// 		if(i==maze.length-1 && j==maze.length-1){
// 			maze[i][j] = 2;
// 			print(maze);
// 			return true;
// 		}

// 		//kaam
// 		if(isSafe(maze,i,j,n)){
// 			maze[i][j] = 2;
// 			ratMAze(maze,i+1,j,n);
// 			ratMAze(maze,i-1,j,n);
// 			ratMAze(maze,i,j-1,n);
// 			ratMAze(maze,i,j+1,n);
// 			maze[i][j] = 1;
// 		return false;
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		int maze[][] = {{1,0,0,0},
// 						{1,1,0,1},
// 						{0,1,0,0},
// 						{1,1,1,1}};
// 		int n = maze.length;
// 		ratMAze(maze,0,0,n);	
	
// 	}
// }





// Sudoku

// public class JavaBasics{
// 	public static void print(int sudoku[][]){
// 		System.out.println("solution");
// 		for(int i = 0 ;i<sudoku.length ; i++){
// 			for(int j = 0 ;j<sudoku.length ; j++){
// 				System.out.print(sudoku[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}

// 	public static boolean isSafe(int sudoku[][],int row, int col,int digit){
// 		// row
// 		for(int i = 0 ;i<8 ; i++){
// 			if(sudoku[i][col]==digit){
// 				return false;
// 			}
// 		}
// 		//col
// 		for(int j = 0 ;j<8 ; j++){
// 			if(sudoku[row][j]==digit){
// 				return false;
// 			}
// 		}
// 		//grid
// 		int sr = (row/3) * 3;
// 		int sc = (col/3) * 3;

// 		for(int i = sr ;i<sr+3 ; i++){
// 			for(int j = sc ;j<sc+3  ; j++){
// 				if(sudoku[i][j]==digit){
// 					return false;
// 				}
// 			}
// 		}
// 		return true;
// 	}
// 	public static boolean sudokuSolver(int sudoku[][],int row, int col){
// 		//base
// 		if(row == 9){
// 			return true;
// 		}
// 		//kaam
// 		//row col
// 		int newRow = row, newCol = col+1;
// 		if(col+1 == 9){
// 			newRow = row+1;
// 			newCol = 0;
// 		}

// 		if(sudoku[row][col] != 0){
// 			return sudokuSolver(sudoku,newRow,newCol);
// 		}

// 		for(int digit = 0; digit<=9; digit++){
// 			if(isSafe(sudoku,row,col,digit)){
// 				sudoku[row][col] = digit;
// 				if(sudokuSolver(sudoku,newRow,newCol)){ //solution exist
// 					return true;
// 				}
// 				sudoku[row][col] = 0;
// 			}
			
// 		}
// 		return false;

// 	}

// 	public static void main(String args[]){
// 		int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
// 						  {4,9,0,1,5,7,0,0,2},
// 						  {0,0,3,0,0,4,1,9,0},
// 						  {1,8,5,0,6,0,0,2,0},
// 						  {0,0,0,0,2,0,0,6,0},
// 						  {9,6,0,4,0,5,3,0,0},
// 						  {0,3,0,0,7,2,0,0,4},
// 						  {0,4,9,0,3,0,0,5,7},
// 						  {8,2,7,0,0,9,0,1,3}};


// 		if(sudokuSolver(sudoku,0,0)){
// 			System.out.println( "Solution exist: ");
// 			print(sudoku);
// 		}else{
// 			System.out.println( "Solution doesn't exist: ");
// 		}
		
	
// 	}
// }



// sudoku practice


// public class JavaBasics{
// 	public static void print(int sudoku[][]){
// 		System.out.println("Solution: ");
// 		for(int i = 0; i<9; i++){
// 			for(int j = 0; j<9; j++){
// 				System.out.print(sudoku[i][j]+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(int sudoku[][], int row, int col, int digit){
// 		//	row
// 		for(int i = 0; i<=8; i++){
// 			if(sudoku[i][col] == digit){
// 				return false;
// 			}
// 		}
// 		// col
// 		for(int j = 0; j<=8; j++){
// 			if(sudoku[row][j] == digit){
// 				return false;
// 			}
// 		}
// 		// grid
// 		int sr = (row/3)*3;
// 		int sc = (col/3)*3;
// 		for(int i = sr; i<sr+3; i++){
// 			for(int j = sc; j<sc+3; j++){
// 				if(sudoku[row][j] == digit){
// 					return false;
// 				}
// 			}
// 		}
// 		return true;
// 	}
// 	public static boolean sudokuSolver(int sudoku[][], int row, int col){
// 		//base
// 		if(row==9){
// 			return true;
// 		}
// 		// kaam
// 		int newRow = row, newCol= col+1;
// 		if(col+1 == 9){
// 			newRow = row +1;
// 			newCol = 0;
// 		}
// 		if(sudoku[row][col] != 0){
// 			return sudokuSolver(sudoku,newRow,newCol);
// 		}

// 		for(int digit = 0; digit<=9; digit++){
// 			if(isSafe(sudoku,row,col,digit)){
// 				sudoku[row][col] = digit;
// 				if(sudokuSolver(sudoku,newRow,newCol)){
// 					return true;
// 				}
// 				sudoku[row][col] = 0;
// 			}
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		int sudoku[][] ={
//             {5, 3, 0, 0, 7, 0, 0, 0, 0},
//             {6, 0, 0, 1, 9, 5, 0, 0, 0},
//             {0, 9, 8, 0, 0, 0, 0, 6, 0},
//             {8, 0, 0, 0, 6, 0, 0, 0, 3},
//             {4, 0, 0, 8, 0, 3, 0, 0, 1},
//             {7, 0, 0, 0, 2, 0, 0, 0, 6},
//             {0, 6, 0, 0, 0, 0, 2, 8, 0},
//             {0, 0, 0, 4, 1, 9, 0, 0, 5},
//             {0, 0, 0, 0, 8, 0, 0, 7, 9}
//         };
// 		if(sudokuSolver(sudoku,0,0)){
// 			System.out.println("solution exist");
// 			print(sudoku);
// 		}else{
// 			System.out.println("solution doesnt exist");
// 		}
// 	}
// }








// knight tour  // Finally


// public class JavaBasics{
// 	public static void print(int board[][]){
// 		System.out.println("Solution: ");
// 		for(int i = 0; i<board.length; i++){
// 			for(int j = 0; j<board.length; j++){
// 				System.out.print(board[i][j]+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(int board[][], int row, int col){
// 		if((row<0 || col<0 || row>=8 || col>=8 || board[row][col] != 0)){
// 			return false;
// 		}
// 		 return true;
// 	}
// 	public static boolean knightTour(int board[][], int row, int col, int count){
// 		// base
// 		if(count > 64){
// 			return true;
// 		}
// 		// kaam
		
// 		if(isSafe(board,row,col)){	
// 			board[row][col] = count;

// 			if(knightTour(board,row+2,col+1,count+1)||
// 				knightTour(board,row+2,col-1,count+1)||
// 				knightTour(board,row+1,col+2,count+1)||
// 				knightTour(board,row+1,col-2,count+1)||
// 				knightTour(board,row-2,col+1,count+1)||
// 				knightTour(board,row-2,col-1,count+1)||
// 				knightTour(board,row-1,col+2,count+1)||
// 				knightTour(board,row-1,col-2,count+1)){
	
// 				return true;
// 			}
// 			board[row][col] = 0; //backtracking
// 		}
		
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		int board[][] = new int[8][8];
// 		for(int i = 0; i<board.length; i++){
// 			for(int j = 0; j<board.length; j++){
// 				board[i][j] = 0;
// 			}
// 		}
// 		if(knightTour(board,0,0,1)){
// 			System.out.println("exist");
// 			print(board);
// 		}else{
// 			System.out.println("nope");
// 		}
// 	}
// }










// public class JavaBasics{

// 	public static void print(int sudoku[][]){
// 		System.out.println("Solution : " + " ");
// 		for(int i = 0; i<9; i++){
// 			for(int j = 0; j<9; j++){
// 				System.out.print(sudoku[i][j]+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}	

// 	public static boolean isSafe(int sudoku[][],int i,int j, int digit){
// 		// row
// 		for(int row = 0 ; row<8; row++){
// 			if(sudoku[row][j]== digit){
// 				return false;
// 			}	
// 		}
// 		//col
// 		for(int col = 0 ; col<8; col++){
// 			if(sudoku[i][col]== digit){
// 				return false;
// 			}	
// 		}
// 		// grid
// 		int sr = (i/3)*3;
// 		int sc = (j/3)*3;

// 		for(int x = sr ; x<sr+3; x++){
// 			for(int y = sc ; y<sc+3; y++){
// 				if(sudoku[x][y]== digit){
// 					return false;
// 				}
// 			}	
// 		}
// 		return true;
// 	}


// 	public static boolean sudokuSolver(int sudoku[][],int i,int j){

// 		// base 
// 		if(i==9){
// 			print(sudoku);
// 			return true;
// 		}
// 		// kaam

// 		int newi = i , newj= j+1;
// 		if(j+1 == 9){
// 			newi = i+1;
// 			newj = 0;
// 		}

// 		if(sudoku[i][j] != 0){
// 			return sudokuSolver(sudoku,newi,newj);	
// 		}

// 		for(int digit = 0; digit<=9; digit++){
// 			if(isSafe(sudoku,i,j,digit)){
// 				sudoku[i][j] = digit;
// 				if(sudokuSolver(sudoku,newi,newj)){
// 					return true;
// 				}	
// 				sudoku[i][j] = 0;
// 			}
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		int sudoku[][] ={
//             {5, 3, 0, 0, 7, 0, 0, 0, 0},
//             {6, 0, 0, 1, 9, 5, 0, 0, 0},
//             {0, 9, 8, 0, 0, 0, 0, 6, 0},
//             {8, 0, 0, 0, 6, 0, 0, 0, 3},
//             {4, 0, 0, 8, 0, 3, 0, 0, 1},
//             {7, 0, 0, 0, 2, 0, 0, 0, 6},
//             {0, 6, 0, 0, 0, 0, 2, 8, 0},
//             {0, 0, 0, 4, 1, 9, 0, 0, 5},
//             {0, 0, 0, 0, 8, 0, 0, 7, 9}
//         };
// 		if(sudokuSolver(sudoku,0,0)){
// 			System.out.println("solution exist");
// 		}else{
// 			System.out.println("solution not exist");
// 		}
		
// 	}
// }




// n Queens



// public class JavaBasics{

// 	public static void print(char board[][]){
// 		System.out.println("---Board---");
// 		for(int i = 0; i<board.length ; i++){
// 			for(int j = 0; j<board.length ; j++){
// 				System.out.print(board[i][j]+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static boolean isSafe(char board[][],int row,int col){
		
// 		//row
		
// 		for(int i = row; i>= 0 ; i--){
// 			if(board[i][col] == 'Q'){
// 				return false;
// 			}
// 		}

// 		//dia left
// 		for(int i = row , j= col; i>= 0 && j>=0  ; i--,j--){
// 			if(board[i][j] == 'Q'){
// 				return false;
// 			}
// 		}
// 		//dia right
// 		for(int i = row , j= col; i>= 0 && j<board.length  ; i--,j++){
// 			if(board[i][j] == 'Q'){
// 				return false;
// 			}
// 		}

// 		return true;
// 	}
// 	public static boolean nQueens(char board[][],int row,int col){
// 		//base
// 		if(row==board.length){
// 			print(board);
// 			return true;
// 		}	

// 		//kaam
// 		for(int j = 0; j<board.length ; j++){
// 			if(isSafe(board,row,j)){
// 				board[row][j] = 'Q';
// 				nQueens(board,row+1,col);
// 				board[row][j] = 'X';
// 			}
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Add Board Size:  ");
// 		int n = sc.nextInt();
// 		char board[][]= new char[n][n];

// 		for(int i = 0; i<n ; i++){
// 			for(int j = 0; j<n ; j++){
// 				board[i][j] = 'X';
// 			}
// 		}
// 		nQueens(board,0,0);
// 	}
// }


// Phone keypad type



// public class JavaBasics{
// 	public static void combination(String input, String letter, int idx, String[] keypad ){
// 		if(idx == input.length()){
// 			System.out.println(letter + " ");
// 			return;
// 		}

// 		char digit = input.charAt(idx);
// 		for(char digitchar : keypad[digit - '0'].toCharArray()){
// 			combination(input,letter + digitchar ,idx+1,keypad);
// 		}
// 	}
// 	public static void main(String args[]){
// 		String input = "23";
// 		String[] keypad ={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
// 		combination(input,"",0,keypad);
// 	}
// }

