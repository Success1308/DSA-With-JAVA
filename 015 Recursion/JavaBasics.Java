import java.util.*;


//Self Practice
// Question 3
// public class JavaBasics{
// 	public static int Factorial(int a){
// 		if(a==0){
// 			return 1;
// 		}
// 		a = a * Factorial(a-1);
// 		return a;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int a = sc.nextInt();
// 		System.out.println(Factorial(a));
// 	}
// }


// Question 1  print number to n to 1:

// public class JavaBasics{
// 	public static void printNumber(int a){
// 		if(a==1){
// 			System.out.print(a + " ");
// 			return;
// 		}
// 		System.out.print(a + " ");
// 		printNumber(a-1);	
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int a = sc.nextInt();
// 		printNumber(a);
// 	}
// }


// Question 2 increasing order
// public class JavaBasics{
// 	public static void printNumber(int a){
// 		if(a==1){
// 			System.out.print(1 + " ");
// 			return;
// 		}
		
// 		printNumber(a-1);
// 		System.out.print(a + " ");
		
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int a = sc.nextInt();
// 		printNumber(a);
// 	}
// }


// Q4 print sum of first natural number

// public class JavaBasics{
// 	public static int sumNatural(int a){
// 		if(a==0){
// 			return a;
// 		}
// 		a = a + sumNatural(a-1);
// 		return a;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int a = sc.nextInt();
// 		System.out.println(sumNatural(a));
// 	}
// }


// Q5 Nth Fibonacchi number

// public class JavaBasics{
// 	public static int fiboNacchi(int a){
// 		if(a==0 || a==1 ){
// 			return a;
// 		}
// 		a = fiboNacchi(a-1) + fiboNacchi(a-2);
// 		return a;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("Nth fibonachhi number . add Number: ");
// 		int a = sc.nextInt();
// 		System.out.println(fiboNacchi(a));
// 	}
// }



// Question 6 CHehck if array is sorted or not

// public class JavaBasics{
// 	public static boolean sortOrnot(int arr[], int i){
// 		if(i == arr.length-1){
// 			return true;
// 		}
// 		if(arr[i]>arr[i+1]){
// 			return false;
// 		}

// 		return sortOrnot(arr,i+1);
// 	}
// 	public static void main(String args[]){

// 		int arr[] = {1,2,3,4,5};
// 		Scanner sc= new Scanner(System.in);
// 		// System.out.print(" add Number: ");
// 		// int a = sc.nextInt();
// 		System.out.println(sortOrnot(arr,0));
// 	}
// }


// Question 7 First occurance

// public class JavaBasics{
// 	public static int firstOccurance(int arr[], int key,int i){
// 		if(i==arr.length){
// 			return -1;
// 		}
// 		if(arr[i]==key){
// 			return i; 
// 		}	
// 		return firstOccurance(arr,key,i+1);
		
// 	}
// 	public static void main(String args[]){

// 		int arr[] = {8,3,6,9,5,10,2,5,3};
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print(" add Number: ");
// 		int a = sc.nextInt();
// 		System.out.println(firstOccurance(arr,a,0));
// 	}
// }

// Question 8 Last occurance

// public class JavaBasics{
// 	public static int firstOccurance(int arr[], int key,int i){
// 		if(i<0){
// 			return -1;
// 		}
// 		if(arr[i]==key){
// 			return i; 
// 		}	
// 		return firstOccurance(arr,key,i-1);
		
// 	}
// 	public static void main(String args[]){

// 		int arr[] = {8,3,6,9,5,10,2,5,3};
// 		Scanner sc= new Scanner(System.in);
// 		int i = arr.length-1;
// 		System.out.print(" add Number: ");
// 		int a = sc.nextInt();
// 		System.out.println(firstOccurance(arr,a,i));
// 	}
// }



// Question 9 print x^n

// public class JavaBasics{
// 	public static int xresttoN(int x,int n){

// 		if(n == 1){
// 			return x;
// 		}
// 		return x * xresttoN(x,n-1);
		
// 	}
// 	public static void main(String args[]){

// 		Scanner sc= new Scanner(System.in);
// 		System.out.print(" add Number: ");
// 		int a = sc.nextInt();
// 		System.out.print(" Power: ");
// 		int n = sc.nextInt();
// 		System.out.println(xresttoN(a,n));
// 	}
// }


// Question 10 print x^n (optimized)

// public class JavaBasics{
// 	public static int xresttoN(int x,int n){

// 		if(n == 0){
// 			return 1;
// 		}
// 		if(n%2 != 0){
// 			return x*xresttoN(x,n/2)*xresttoN(x,n/2);
// 		}

// 		return xresttoN(x,n/2) * xresttoN(x,n/2);
		
// 	}
// 	public static void main(String args[]){

// 		Scanner sc= new Scanner(System.in);
// 		System.out.print(" add Number: ");
// 		int a = sc.nextInt();
// 		System.out.print(" Power: ");
// 		int n = sc.nextInt();
// 		System.out.println(xresttoN(a,n));
// 	}
// }



// Q11 Tiling problem


// public class JavaBasics{
// 	public static int tilingProblem(int a){
// 		//Base case
// 		if(a==0 || a ==1){
// 			return 1;
// 		}
// 		//kaam
// 		//Vertical choice
// 		int fnm1= tilingProblem(a-1);
// 		//Horizontol choice
// 		int fnm2= tilingProblem(a-2);
// 		int totWays = fnm1 + fnm2;
// 		return totWays;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int a = sc.nextInt();
// 		System.out.print("Total Ways : ");
// 		System.out.println(tilingProblem(a));
// 	}
// }


// Q12 Remove duplicate in string

// public class JavaBasics{
// 	public static void removeDup(String str,int idx, StringBuilder newstr,boolean map[]){
// 		if(idx == str.length()){
// 			System.out.println(newstr);
// 			return;
// 		}

// 		char currChar = str.charAt(idx);
// 		if(map[currChar - 'a'] == true){
// 			//duplicate
// 			removeDup(str,idx+1,newstr, map);
// 		} else {
// 			map[currChar-'a'] = true;
// 			removeDup(str,idx+1,newstr.append(currChar), map);
// 		}

// 	}
// 	public static void main(String args[]){

// 		System.out.print("add string: ");
// 		String a = "appnnacollege";
// 		System.out.print("Result : ");
// 		removeDup(a,0,new StringBuilder(""),new boolean[26] );
// 	}
// }



// Q13 Friends pairing problem

// public class JavaBasics{
// 	public static int pairingProblem(int a){
// 		if(a==1 || a == 2){
// 			return a;
// 		}
// 		//choice
// 		//single
// 		int fnm1 = pairingProblem(a-1);
// 		//pair
// 		int fnm2 = pairingProblem(a-2);
// 		int pairWays = (a-1)*fnm2;
// 		//totways
// 		int totWays = fnm1 +pairWays;
// 		return totWays;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number of friends: ");
// 		int a = sc.nextInt();
// 		System.out.print("Total Ways : ");
// 		System.out.println(pairingProblem(a));
// 	}
// }



// Q14 Binary string problem

// public class JavaBasics{
// 	public static void printBinarystring(int a, int lastplace, String str){
// 		// base
// 		if(a==0){
// 			System.out.println(str);
// 			return;
// 		}
// 		//kaam
// 		//sit 0 0n chair n
// 		printBinarystring(a-1,0,str+"0");

// 		if(lastplace == 0){
// 			printBinarystring(a-1,1,str+"1");
// 		}

// 	}
// 	public static void main(String args[]){
// 		Scanner sc= new Scanner(System.in);
// 		System.out.print("add Number Place: ");
// 		int a = sc.nextInt();
// 		System.out.println("Result : ");
// 		printBinarystring(a,0,"");
// 	}
// }





// Notes:

// Recursion

// using maths

// f(f(x));

// factorial

// 5!
// f(n) = n X f(n-1);
// f(5) = 5 X f(4)

// recursive

// recuresion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem.


// 1.base Case define
// 2. kaam krna hai
// 3. f(n-1) (inner call)






// 1 number in decreasing order


// public class JavaBasics{
// 	public static void decreasingOrder(int n){
// 		//base
// 		if(n==0){
// 			return;
// 		}
// 		//kaam
// 		System.out.print(n + " ");
// 		decreasingOrder(n-1);

// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number n : ");
// 		int a = sc.nextInt();
// 		System.out.println("result: ");
// 		decreasingOrder(a);
// 	}
// }


// 2 number in increasing order

// public class JavaBasics{
// 	public static void IncreasingOrder(int n){
// 		//base
// 		if(n==0){
// 			return;
// 		}
// 		//kaam
// 		IncreasingOrder(n-1);
// 		System.out.print(n + " ");
		

// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number n : ");
// 		int a = sc.nextInt();
// 		System.out.println("result: ");
// 		IncreasingOrder(a);
// 	}
// }


// 3 factorial


// public class JavaBasics{
// 	public static int Factorial(int n){
// 		//base
// 		if(n==1){
// 			return n;
// 		}
// 		//kaam
// 		return n*Factorial(n-1);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number n : ");
// 		int a = sc.nextInt();
// 		System.out.println("result: ");
// 		System.out.print(Factorial(a));
// 	}
// }


// 4 print sum of n number

// public class JavaBasics{
// 	public static int Factorial(int n){
// 		//base
// 		if(n==1){
// 			return n;
// 		}
// 		//kaam
// 		return n+Factorial(n-1);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number n : ");
// 		int a = sc.nextInt();
// 		System.out.println("result: ");
// 		System.out.print(Factorial(a));
// 	}
// }


// 5 print nth fibonacci number (0112358 )

// public class JavaBasics{
// 	public static int fibonacci(int n){
// 		//base
// 		if(n==0 || n==1){
// 			return n;
// 		}
// 		//kaam
// 		return n= fibonacci(n-2)+fibonacci(n-1);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number n : ");
// 		int a = sc.nextInt();
// 		System.out.println("result: ");
// 		System.out.print(fibonacci(a));
// 	}
// }


// 6 check if array is sorted

// public class JavaBasics{
// 	public static boolean arraySort(int n[],int idx){
// 		//base
// 		if(idx == n.length-1){
// 			return true;
// 		}
// 		//kaam
// 		if(n[idx]>n[idx+1]){
// 			return false;
// 		}
// 		return arraySort(n,idx+1);
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {1,2,3,7,5,6,7,8};
// 		System.out.println("result: ");
// 		System.out.print(arraySort(arr,0));
// 	}
// }



// 7 first occurance

// public class JavaBasics{
// 	public static int firstOccurance(int n[],int idx, int key){
// 		//base
// 		if(idx == n.length-1){
// 			return -1;
// 		}
// 		//kaam
// 		if(n[idx]==key){
// 			return idx;
// 		}
// 		return firstOccurance(n,idx+1,key);
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {4,6,2,5,6,8,9,3,2,6};
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("What you looking for ?  :  ");
// 		int a = sc.nextInt();
// 		System.out.print("result: ");
// 		System.out.print(firstOccurance(arr,0,a));
// 	}
// }


// 8 last occurance 


// public class JavaBasics{
// 	public static int lastOccurance(int n[],int idx, int key){
// 		//base
// 		if(idx < 0){
// 			return -1;
// 		}
// 		//kaam
// 		if(n[idx]==key){
// 			return idx;
// 		}
// 		return lastOccurance(n,idx-1,key);
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {4,6,2,5,6,8,9,3,2,6};
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("What you looking for ?  :  ");
// 		int a = sc.nextInt();
// 		System.out.print("result: ");
// 		System.out.print(lastOccurance(arr,arr.length-1,a));
// 	}
// }


// 9 print x to the power n

// public class JavaBasics{
// 	public static int powerofN(int s, int pow){
// 		if(pow == 0){
// 			return 1;
// 		}
// 		return s*powerofN(s,pow-1);
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add number :  ");
// 		int s = sc.nextInt();
// 		System.out.print("power :  ");
// 		int pow = sc.nextInt();
// 		System.out.print("result :  ");
// 		System.out.print(powerofN(s,pow));
// 	}
// }



// 10 print x to the power n optimized

// public class JavaBasics{
// 	public static int powerofN(int s, int pow){
// 		if(pow == 0){
// 			return 1;
// 		}
// 		if(pow%2 != 0){
// 			return s*(powerofN(s,pow/2)*powerofN(s,pow/2));
// 		}
// 		return powerofN(s,pow/2)*powerofN(s,pow/2); 
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add number :  ");
// 		int s = sc.nextInt();
// 		System.out.print("power :  ");
// 		int pow = sc.nextInt();
// 		System.out.print("result :  ");
// 		System.out.print(powerofN(s,pow));
// 	}
// }

// 11 tiling problem for 4 height

// public class JavaBasics{
// 	public static int tilingProblem(int a){
// 		//base
// 		if(a==0 || a==1 || a==2 || a==3){
// 			return 1;
// 		}
// 		//kaam
// 		int ways = tilingProblem(a-1) + tilingProblem(a-4);
// 		return ways;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("length  :  ");
// 		int a = sc.nextInt();
// 		System.out.print("result: ");
// 		System.out.println(tilingProblem(a));
		
// 	}
// }


// 12 remove duplicate

// public class JavaBasics{
// 	public static void removeDup(String str, StringBuilder newstr, boolean map[], int idx){	
// 		// base
// 		if(idx == str.length()){
// 			System.out.println(newstr);
// 			return;
// 		}
// 		// kaam
// 		char ch = str.charAt(idx);
// 		if(map[ch - 'a'] == true){
// 			//duplicate
// 			removeDup(str,newstr, map ,idx+1);
// 		} else {
// 			map[ch-'a'] = true;
// 			removeDup(str,newstr.append(ch), map ,idx+1);
// 		}
// 	}
// 	public static void main(String args[]){
// 		String s = "appnnaacollegge";
// 		removeDup(s,new StringBuilder(""),new boolean[26],0);
// 	}
// }


//13 pairing friends problem


// public class JavaBasics{
// 	public static int pairFriend(int n){
// 		//base
// 		if(n <= 2){
// 			return n;
// 		}
// 		//kaam
// 		return (pairFriend(n-1)+( (n-1)*pairFriend(n-2)));
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("How many friends you are ? : ");
// 		int a = sc.nextInt();
// 		System.out.print(pairFriend(a));
// 		System.out.print(" ways for pairing.");
// 	}
// }


// 13 binary strings problem ( 000 010 001 101 )

// public class JavaBasics{
// 	public static void binString(int n, int lastplace, String str){
// 		// base
// 		if(n == 0){
// 			System.out.println(str);
// 			return;
// 		}
// 		//kaam
// 		binString(n-1,0,str +'0');
// 		if(lastplace == 0){
// 			binString(n-1,1,str +'1');
// 		}
// 	} 
// 	public static  void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("How many chair? : ");
// 		int s = sc.nextInt();
// 		binString(s, 0,"");
// 	}
// }



// Assignment

// Q1
// 14 array print all index for key

// public class JavaBasics{
// 	public static void searchArr(int n[],int idx, int key){
// 		//base
// 		if(idx == n.length-1){
// 			return;
// 		}
// 		//kaam
// 		if(n[idx]==key){
// 			System.out.print(idx + " ");
// 		}
		
// 		searchArr(n,idx+1,key);
		
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {3,6,2,5,6,8,9,3,2,6};
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("What you looking for ?  :  ");
// 		int a = sc.nextInt();
// 		System.out.print("result: ");
// 		searchArr(arr,0,a);
// 	}
// }




// 15 string to english later 2019  two zero one nine

// public class JavaBasics{
// 	public static void printNumbtostring(int n){	
// 		String a[] = {"zero", "one" , "two", "three", "four", "five" , "six", "seven", "eight","nine"};
// 		// base
// 		if(n == 0){
// 			return;
// 		}
// 		//kaam
// 		int lastDigit = n%10; 
// 		printNumbtostring(n/10);
// 		System.out.print(a[lastDigit] + " ");
// 	}  
// 	public static  void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("which year? : ");
// 		int s = sc.nextInt();
// 		printNumbtostring(s);
// 	}
// }




// Remove Duplicate

// public class JavaBasics{
// 	public static void removedup(String str, StringBuilder newstr, int idx, boolean map[]){
// 		// base
// 		if(idx == str.length()){
// 			System.out.println(newstr);
// 			return;
// 		}
// 		// kaam
// 		char ch = str.charAt(idx);
// 		if(map[ch - 'a'] == true){
// 			removedup(str, newstr,idx+1,map);
// 		}else{
// 			map[ch - 'a'] = true;
// 			removedup(str,newstr.append(ch),idx+1,map);
// 		}
 
// 	}
// 	public static void main(String args[]){
// 		String s = "succccceeeeeess";
// 		removedup(s,new StringBuilder("") ,0,new boolean[26]);
// 	}
// }



// find length of string

// public class JavaBasics{
// 	public static int lengthStr(String n){
// 		// base
// 		if(n.length()==0){
// 			return 0;
// 		}
// 		// kaam
// 		return lengthStr(n.substring(1)) + 1;

// 	}
// 	public static void main(String args[]){
// 		String s = "success";
// 		System.out.println(lengthStr(s));
// 	}
// }



// tower of hanoi


// public class JavaBasics{
// 	public static void towerOfhanoi(int n, String src, String helper, String destination){
// 		//base
// 		if(n==1){
// 			System.out.println(" transfer " + n +" from src "+src+" to destination " + destination);
// 			return;
// 		}
// 		//kaam
// 		towerOfhanoi(n-1,src,destination,helper);
// 		System.out.println(" transfer " + n +" from src "+src+" to destination " + destination);
// 		towerOfhanoi(n-1,helper,src,destination);
// 	}	
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("how many disk ? : ");
// 		int s = sc.nextInt();
// 		String tower1 = "A";
// 		String tower2 = "B";
// 		String tower3 = "C";
// 		towerOfhanoi(s,tower1,tower2,tower3);
// 	}
// }