import java.util.*;

// public class JavaBasics{
// 	public static void main(String args[]){
		
	// Binary AND - &

		// System.out.print("& operator of 5 and 6: " );
		// System.out.println(5&6);
		// System.out.print("& operator of 0 and 0: " );
		// System.out.println(0&0);
		// System.out.print("& operator of 1 and 0: " );
		// System.out.println(1&0);
		// System.out.print("& operator of 0 and 1: " );
		// System.out.println(0&1);
		// System.out.print("& operator of 1 and 1: " );
		// System.out.println(1&1);


// 	// // Binary OR - |

		// System.out.print( "| operator of 5 or 6: ");
		// System.out.println(5|6);
		// System.out.print( "| operator of 0 or 0: ");
		// System.out.println(0|0);
		// System.out.print( "| operator of 0 or 1: ");
		// System.out.println(0|1);
		// System.out.print( "| operator of 1 or 0: ");
		// System.out.println(1|0);
		// System.out.print( "| operator of 1 or 1: ");
		// System.out.println(1|1);
		
// 	// // Binary XOR - ^

		// System.out.print("^ Xor operator of 5 Xor 6: " );
		// System.out.println(5^6);
		// System.out.print("^ Xor operator of 0 Xor 0: " );
		// System.out.println(0^0);
		// System.out.print("^ Xor operator of 1 Xor 0: " );
		// System.out.println(1^0);
		// System.out.print("^ Xor operator of 0 Xor 1: " );
		// System.out.println(0^1);
		// System.out.print("^ Xor operator of 1 Xor 1: " );
		// System.out.println(1^1);


// 	// // Binary One'complement (not) operator- ~   ~x = -(x+1):
		// System.out.print("~ not operator of 0 : "  );
		// System.out.println(~(0));
		// System.out.print("~ not operator of 1 : "  );
		// System.out.println(~1);
		// System.out.print("~ not operator of 5 : "  );
		// System.out.println(~5);

// 	// // Binary Left Shift - << // a<<b = a*2^b
// 		System.out.print("2 left shift operator of 5 = 5*2^2 :  "  );
// 		System.out.println(5<<2);

// // 	// // Binary Right SHift - >> a<<b = a/2^b
// 		System.out.print("2 Right shift operator of 6 = 6/2^1 :  "  );
// 		System.out.println(6>>1);
// 	}
// }



// Q1 Even or odd 
//use of bitmask
// public class JavaBasics{
// 	public static void oddEven(int a){
// 		int bitmask=1;
// 		if((a & bitmask /* Also can use 1 directly */) == 1){
// 			System.out.print("Number is odd");
// 		}else{
// 			System.out.print("Number is even");
// 		}
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		oddEven(sam);
// 	}
// }



//get I th number 
// public class JavaBasics{
// 	public static int getIthbit(int a, int i){
// 		int bitmask= 1<<i;
// 		if((a & bitmask) == 0){
// 			return 0;
// 		}else{
// 			return 1;
// 		}
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("add index: ");
// 		int i = sc.nextInt();
// 		System.out.print("Result: "+ getIthbit(sam,i));;
// 	}
// }


//set I th number 
// public class JavaBasics{
// 	public static int setIthbit(int a, int i){
// 		int bitmask= 1<<i;
// 		return a | bitmask;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("add index: ");
// 		int i = sc.nextInt();
// 		System.out.print("Set ith index: "+ setIthbit(sam,i));;
// 	}
// }



//clear I th number 
// public class JavaBasics{
// 	public static int clearIthbit(int a, int i){
// 		int bitmask= ~(1<<i);
// 		return a & bitmask;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("add index: ");
// 		int i = sc.nextInt();
// 		System.out.print("Set ith index: "+ clearIthbit(sam,i));;
// 	}
// }


// // Update I th number 
// public class JavaBasics{
// 	// public static int setIthbit(int a, int i){
// 	// 	int bitmask= 1<<i;
// 	// 	return a | bitmask;
// 	// }
// 	public static int clearIthbit(int a, int i){
// 		int bitmask= ~(1<<i);
// 		return a & bitmask;
// 	}
// 	public static int updateIthbit(int a, int i,int newbit){
// 		//simple approach
// 		// if(newbit == 0){
// 		// 	return clearIthbit(a,i);
// 		// }else{
// 		// 	return setIthbit(a,i);
// 		// }

// 		// differnet logic
// 		a = clearIthbit(a,i);
// 		int bitmask = newbit<<i;
// 		return a|bitmask;
	
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("add index: ");
// 		int i = sc.nextInt();
// 		System.out.print("add new bit: ");
// 		int newbit = sc.nextInt();
// 		System.out.print("Set ith index: "+ updateIthbit(sam,i,newbit));;
// 	}
// }



// // clear last i bit

// public class JavaBasics{
// 	public static int clearlastIthbit(int a, int i){
// 		int bitmask= (~0)<<i; /* ~0 is -1 can use -1 as well */
// 		return a & bitmask;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("clear last given index: ");
// 		int i = sc.nextInt();
// 		System.out.print("Set ith index: "+ clearlastIthbit(sam,i));;
// 	}
// }



// clear range of  bit

// public class JavaBasics{
// 	public static int clearRangebit(int a, int i, int j){
// 		int x= (~0)<<(j+1);
// 		int y= (1<<i)-1;
// 		int bitmask= x|y; 
// 		return a & bitmask;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("clear start index: ");
// 		int i = sc.nextInt();
// 		System.out.print("clear end index: ");
// 		int j = sc.nextInt();
// 		System.out.print("Set ith index: "+ clearRangebit(sam,i,j));
// 	}
// }


// Q2 Check if number is power of 2 or not

// public class JavaBasics{
// 	public static boolean isPoweroftwo(int n){
// 		return ((n&(n-1))==0);
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("is power of 2? : "+ isPoweroftwo(sam));;
// 	}
// }


// Q3 Count set bits:

// public class JavaBasics{
// 	public static int countSetbits(int n){
// 		int count = 0;
// 		while(n>0){
// 			if((n&1) != 0){
// 				count++;
// 			}
// 			n= n>>1;
// 		}
// 		return count;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("result : "+ countSetbits(sam));;
// 	}
// }




// Fast Exponentation

// public class JavaBasics{
// 	public static int Exponentation(int a, int n){
// 		int ans = 1;
// 		while(n>0){
// 			if((n&1) != 0){
// 				ans = ans*a;
// 			}
// 			a=a*a;
// 			n= n>>1;
// 		}
// 		return ans;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int sam = sc.nextInt();
// 		System.out.print("Power: ");
// 		int s = sc.nextInt();
// 		System.out.print("result : "+ Exponentation(sam,s));;
// 	}
// }



// Notes


// Bitwise operator

// 0&1 Binary number-Everything get store in binary number in computer

// 0 1 2 3 4 5 6 7 8 9 - Decimal system


// Binary to decimle : divide by 2
// decimay to binary multiply by 2 rest to number


// 0 - 000
// 1 - 001
// 2 - 010
// 3 - 011
// 4 - 100
// 5 - 101
// 6 - 110
// 7 - 111
// 8 - 1000
// 9 - 1001


// Bitwise operator

// Binary AND - &
// Binary OR - |
// Binary XOR - ^
// Binary One'complement - ~ 
// Binary Left Shift - <<
// Binary Right SHift - >>

// // Binary AND - &
	// 	0 & 0 = 0
	// 	0 & 1 = 0
	// 	1 & 0 = 0
	// 	1 & 1 = 1

// // Binary OR - |
	// 	0 | 0 = 0
	// 	0 | 1 = 1
	// 	1 | 0 = 1
	// 	1 | 1 = 1

// // Binary XOR - ^
	//  0 ^ 0 = 0
	//  0 ^ 1 = 1
	//  1 ^ 0 = 1
	//  1 ^ 1 = 0

// // Binary One'complement not operator - ~ 
	// single bit operator

		// ~0 = 1
		// ~1 = 0

// Binary Left Shift - <<


// Binary Right SHift - >>




// Assignment:

// Q1 x^x 
// answer = 0;

// Q2 Swap 2 number without using 3rd variable


// public class JavaBasics{
// 	public static void Swap(int a, int b){
// 		a= a^b;
// 		b= a^b;
// 		a= a^b;
// 		System.out.println("a :" + a + " "+ "b : " + b) ;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc =new Scanner(System.in);
// 		System.out.print("Add first number:  ");
// 		int s = sc.nextInt();
// 		System.out.print("Add second number:  ");
// 		int s1 = sc.nextInt();
// 		Swap(s,s1);
// 	}
// }






// Practice:

// Check if odd or even

// public class JavaBasics{
// 	public static void oddEven(int a){
// 		if((a&1) == 0){
// 			System.out.println("Number is even");
// 		}else{
// 			System.out.println("Number is odd");
// 		}
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		oddEven(s);
// 	}
// }


// Get ith bit

// public class JavaBasics{
// 	public static int getIthbit(int a,int i){
// 		if(((a)&(1<<i)) == 0){
// 			return 0;
// 		}
// 		return 1;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Add index : ");
// 		int key = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(getIthbit(s,key));
// 	}
// }


// set ith bit

// public class JavaBasics{
// 	public static int setIthbit(int a,int i){
// 		return (a|(1<<i));
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Add index : ");
// 		int key = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(setIthbit(s,key));
// 	}
// }


// clear ith bit

// public class JavaBasics{
// 	public static int clearIthbit(int a,int i){
// 		int bitmask = ~(1<<i);
// 		return (a&bitmask);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Add index : ");
// 		int key = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(clearIthbit(s,key));
// 	}
// }



// update ith bit


// public class JavaBasics{
// 	public static int clearIthbit(int a,int i){
// 		int bitmask = ~(1<<i);
// 		return (a&bitmask);
// 	}
// 	public static int updateIthbit(int a,int i, int replace){
// 		clearIthbit(a,i);
// 		return a|(replace<<i);
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Add index : ");
// 		int key = sc.nextInt();
// 		System.out.print("replace: ");
// 		int replace = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(updateIthbit(s,key,replace));
// 	}
// }

// clear last i bits

// public class JavaBasics{
// 	public static int clearlastIthbit(int a,int i){
// 		return a&((~0)<<i);
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Add index : ");
// 		int key = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(clearlastIthbit(s,key));
// 	}
// }


// clear range of ith bit

// public class JavaBasics{
// 	public static int clearlastIthbit(int a,int i,int j){
// 		int x=((~0)<<(j+1));
// 		int y= (1<<i)-1 ;
// 		return a&(x|y);
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Add i : ");
// 		int i = sc.nextInt();
// 		System.out.print("Add j : ");
// 		int j = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(clearlastIthbit(s,i,j));
// 	}
// }


// check if power of 2 or not

// public class JavaBasics{
// 	public static boolean isPoweroftwo(int a){
// 		if(((a)&(a-1))==0){
// 			return true;
// 		}
// 		return false;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(isPoweroftwo(s));
// 	}
// }


// count set bits

// public class JavaBasics{
// 	public static int countSetbit(int a){
// 		int count = 0;
// 		while(a>0){
// 			if((a&1)!=0){
// 				count++;
// 			}
// 			a=a>>1;
// 		}
		
// 		return count;
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number : ");
// 		int s = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.println(countSetbit(s));
// 	}
// }

