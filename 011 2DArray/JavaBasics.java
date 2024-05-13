import java.util.*;

// public class JavaBasics {
// 	// public static void 

// 	public static void main(String args[]){

// //input of 2d array

// 		int matrix[] [] = new int [3] [3];
// 		int n=matrix.length, m=matrix[0].length;

// 		System.out.println( " add 2d elements : ");
// 		Scanner sc = new Scanner(System.in);
// 		for (int i = 0; i<n; i++){
// 			for (int j = 0; j<m; j++){
// 				matrix[i][j] = sc.nextInt();
// 			}
// 		}
// 		System.out.println( " Result : ");
// 		//output
// 		for (int i = 0; i<n; i++){
// 			for (int j = 0; j<m; j++){
// 				System.out.print(matrix[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }




// search element:

// public class JavaBasics {

// 	public static boolean search (int matrix[][], int key){

// 		for (int i = 0; i<matrix.length; i++){
// 			for (int j = 0; j<matrix[0].length; j++){
// 				if (matrix[i] [j] == key){
// 					System.out.println("found at cell (" + i + ","+ j + ")");
// 					return true;
// 				}	
// 			}
// 		}
// 		System.out.println("key not found");
// 		return false;

// 	}

// 	public static void main(String args[]){

//input of 2d array

// 		int matrix[] [] = new int [3] [3];
// 		int n=matrix.length, m=matrix[0].length;

// 		System.out.println( " add 2d elements : ");
// 		Scanner sc = new Scanner(System.in);
// 		for (int i = 0; i<n; i++){
// 			for (int j = 0; j<m; j++){
// 				matrix[i][j] = sc.nextInt();
// 			}
// 		}
// 		System.out.println( " Result : ");
// 		//output
// 		for (int i = 0; i<n; i++){
// 			for (int j = 0; j<m; j++){
// 				System.out.print(matrix[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println();
// 		int key = sc.nextInt();
// 		System.out.println();
// 		search(matrix,key);
// 	}
// }



// Spiral matrix:


// public class JavaBasics{
// 	public static void sprialSearch(int matrix[][]){
// 		int startrow = 0;
// 		int startcol = 0;
// 		int endrow = matrix.length - 1;
// 		int endcol = matrix[0].length - 1;

// 		while (startrow <= endrow && startcol<=endcol){
// 			//top
// 			for(int j = startcol; j<=endcol; j++){
// 				System.out.print(matrix[startrow][j]+" ");
// 			}
// 			//right
// 			for(int i = startrow+1; i<=endrow; i++){
// 				System.out.print(matrix[i][endcol]+" ");
// 			}
// 			//botom
// 			for(int j = endcol-1; j>=startcol; j--){
// 				if (startrow==endrow){
// 					break;
// 				}
// 				System.out.print(matrix[endrow][j]+" ");
// 			}
// 			//left
// 			for(int i = endcol-1; i>=startrow+1; i--){
// 				if (startcol==endcol){
// 					break;
// 				}
// 				System.out.print(matrix[i][startcol]+" ");
				
// 			}

// 			startrow++;
// 			startcol++;
// 			endrow--;
// 			endcol--;
// 		}
// 		System.out.println();
// 	}

// 	public static void main(String args[]){
// 		int matrixSpiral[][] = {{1,2,3,4},
// 							{5,6,7,8},
// 							{9,10,11,12},
// 							{13,14,15,16}};

// 		sprialSearch(matrixSpiral);
// 	}
// }





//Diagonal Search

//brute force: //0(n2)
// public class JavaBasics{
// 	public static int sumDiagonal(int matrix[][]){
// 		int sum = 0;

// 		for(int i = 0; i<=matrix.length-1; i++){
// 			for(int j = 0; j<=matrix[0].length-1; j++){
// 				if(i==j){
// 					sum += matrix[i][j];
// 				}
// 				else if(i+j == matrix.length-1){
// 					sum += matrix[i][j];
// 				}
// 			}
// 		}
// 		return sum;
// 	}

// 	public static void main(String args[]){
// 		int matrixSpiral[][] = {{1,2,3,4},
// 							{5,6,7,8},
// 							{9,10,11,12},
// 							{13,14,15,16}};
// 		System.out.println(sumDiagonal(matrixSpiral));
// 	}
// }



// optimize

// public class JavaBasics{
// 	public static int sumDiagonal(int matrix[][]){
// 		int sum = 0;
// 		for(int i = 0; i<=matrix.length-1; i++){
// 			//pd
// 			sum += matrix[i][i];
// 			//sd
// 			if(i != matrix.length-i-1)
// 			sum += matrix[i][matrix.length-i-1];

// 		}
// 		return sum;
// 	}

// 	public static void main(String args[]){
// 		int matrixSpiral[][] = {{1,2,3,4},
// 							{5,6,7,8},
// 							{9,10,11,12},
// 							{13,14,15,16}};
// 		System.out.println(sumDiagonal(matrixSpiral));
// 	}
// }



// Stair case search

// public class JavaBasics{
// 	public static boolean stairSearch(int matrix[][], int key){
// 		int row = 0, col =matrix[0].length-1;

// 		while(row<matrix.length && col>=0){
// 			if(matrix[row][col]==key){
// 				System.out.println("found key at (" + row + ","+col+")");
// 				return true;
// 			} else if(key <matrix[row][col]){
// 				col--;
// 			}
// 			else{
// 				row++;
// 			}
// 		}
// 		System.out.println("key not found!");
// 		return false;
// 	}

// 	public static void main(String args[]){
// 		int matrixSearch[][] = {{10,20,30,40},
// 							{15,25,35,45},
// 							{27,29,37,48},
// 							{32,33,39,50}};
// 		int key = 33;
// 		stairSearch(matrixSearch,key);
// 	}
// }





// Notes: 

// // 2D array:

// Matrix (column and row)

// representation

// row and column 

// o,o  o,1  o,2
// 2,o  2,1  2,2




// Self Practice (search) (spiral) Jate kryu


// public class JavaBasics{
	// public static void Search(int s[][]){

	// 	for (int i = 0 ; i <s.length ;i++){
	// 		for (int j = 0 ; j <s[0].length ;j++){
	// 			System.out.print(s[i][j] + " ");
	// 		}
	// 		System.out.println();
	// 	}
	// }


// 	public static void Spiral(int s[][]){
// 		int sr = 0;
// 		int sc = 0;
// 		int er = s.length -1 ;
// 		int ec = s[0].length-1;


// 		while(sr<=er && sc<=ec){

// 			for (int i = sc ; i <= ec ;i++){
// 				System.out.print(s[sr][i]+" ");
// 			}

// 			for (int j = sr + 1 ; j <= er ;j++){
// 				System.out.print(s[j][ec]+" ");
// 			}

// 			for (int i = ec-1 ; i >= sc ;i--){
// 				if(sr==er){
// 					break;
// 				}
// 				System.out.print(s[er][i]+" ");
// 			}

// 			for (int j = er-1 ; j > sr ;j--){	
// 				if(sc==ec){
// 					break;
// 				}
// 				System.out.print(s[j][sc]+" ");
// 			}
// 			sr++;
// 			sc++;
// 			er--;
// 			ec--;
// 		}
// 		System.out.println();
// 	}


// 	public static void main(String args[]){

// 		int sam[][] = {{1,2,3,4,5},
// 					   {6,7,8,9,10},
// 					   {11,12,13,14,15},
// 					   {16,17,18,19,20},
// 					   {21,22,23,24,25}};
// 		Spiral(sam);
// 	}
// }




// diagonal sum

// brute force 

// public class JavaBasics{

// 	public static void diaSum(int s[][]){
// 		int sum = 0;

// 		for (int i = 0 ; i < s.length ;i++){
// 			for (int j = 0 ; j < s[0].length ;j++){
// 				if(i==j){
// 					sum += s[i][j];
// 				} else if(i+j == s.length-1){
// 					sum += s[i][j];
// 				}
// 			}
// 		}
// 		System.out.println(sum);
// 	}
// 	public static void main(String args[]){
// 		int sam[][] = {{1,2,3,4},
// 					   {5,6,7,8},
// 					   {9,10,11,12},
// 					   {13,14,15,16}};
// 		diaSum(sam);
// 	}
// }


// optimized

// public class JavaBasics{

// 	public static void diaSum(int s[][]){
// 		int sum = 0;

// 		for (int i = 0 ; i < s.length ;i++){
				
// 			sum += s[i][i];
// 			if(i != s.length-1-i){
// 				sum += s[i][s.length-1-i];
// 			}
			
// 		}
// 		System.out.println(sum);
// 	}
// 	public static void main(String args[]){
// 		int sam[][] = {{1,2,3,4},
// 					   {5,6,7,8},
// 					   {9,10,11,12},
// 					   {13,14,15,16}};
// 		diaSum(sam);
// 	}
// }




// Assignment Question :


// Q1

// public class JavaBasics{
// 	public static void numseven(int s[][]){
// 		for(int i=0; i <s.length ; i++){
// 			for(int j=0; j <s[0].length ; j++){
// 				if(s[i][j]==7){
// 					System.out.print("address : ("+i+","+j+")");
// 				}
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static void main(String args[]){
// 		int arr[][] = {{4,7,8},
// 					{8,8,7},
// 					{7,4,0}};
// 		numseven(arr);
// 	}
// }




// Q2


// public class JavaBasics{
// 	public static int sumSec(int s[][], int row){
// 		int sum = 0;
// 		for(int i=0; i <s.length ; i++){
// 			for(int j=0; j <s[0].length ; j++){
// 				if (i == row -1){
// 					sum += s[i][j];
// 				}
// 			}
// 		}

// 		return sum;
// 	}
// 	public static void main(String args[]){
// 		int arr[][] = {{1,4,9},
// 					{11,4,3},
// 					{2,2,03}};
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Sum of which row: ");
// 		int key = sc.nextInt();
		
// 		System.out.print("Result: ");
// 		System.out.print(sumSec(arr,key));	
// 	}
// }



// Q3


// public class JavaBasics{
// 	public static void TransPose(int s[][]){
// 		for(int i=0; i <s[0].length ; i++){
// 			for(int j=0; j <s.length ; j++){
// 				System.out.print(s[j][i] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static void main(String args[]){
// 		int arr[][] = {{11,12,13},
// 					{21,22,23}};

		
// 		System.out.println("Result: ");
// 		TransPose(arr);	
// 	}
// }



public class JavaBasics{
	public static void Spiral(int s[][]){
		int startcol = 0;
		int startrow = 0;
		int endcol = s.length-1;
		int endrow= s[0].length-1;

		while(startcol<=endcol && startrow<=endrow){
		//top
		for(int i = startcol ; i<=endcol; i++){
			System.out.print(s[startrow][i] + " ");
		}
		//right
		for(int j = startrow +1 ; j <= endrow; j++){
			System.out.print(s[j][endcol] + " ");
		}

		//bottom
		for(int i = endcol-1 ; i>=startcol ; i--){
			if(endcol==startcol){
				break;
			}
			System.out.print(s[endrow][i] + " ");
		}

		//left
		for(int j = endrow-1 ; j>startrow ; j--){
			if(endrow==startrow){
				break;
			}
			System.out.print(s[j][startcol] + " ");
		}

		startcol++;
		startrow++;
		endcol--;
		endrow--;
		}
	}
	public static void main(String args[]){
		int sam[][] = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		Spiral(sam);
	}
}