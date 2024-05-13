import java.util.*;

// public class JavaBasics {
// 	public static void main(String args[]){
		

// 		// String str = "abcd";
// 		// String str1 = new String("xyz");
// 		// System.out.println(str + str1);

// 		// Scanner sc = new Scanner(System.in);
// 		// String name = sc.next();
// 		// System.out.println(name);
// 		// System.out.println();
// 		// String name1 = sc.nextLine();
// 		// System.out.println(name1);


// 		//length

// 		// String fullname = "Tony stark";
// 		// System.out.println(fullname.length());


// 		//concatenation

// 		// String firstName = "tony";
// 		// String lastName = "Stark";
// 		// String fullname = firstName + " " + lastName;
// 		// System.out.println(fullname);

// 		//char at

// 		// String firstName = "tony";
// 		// String lastName = "Stark";
// 		// String fullname = firstName + " " + lastName;
// 		// System.out.println(fullname);
// 		// System.out.println("First letter: " +fullname.charAt(0));
// 	}
// }


// print laters  function

// public class JavaBasics{
// 	public static void printEachlater(String s){
// 		for(int i = 0; i<s.length() ;i++){
// 			System.out.print(s.charAt(i) + " ");
// 		}
// 	}
// 	public static void main(String args[]){
// 		String sam = "Success Ambaliya";
// 		printEachlater(sam);
// 	}
// }



//palindrome

// public class JavaBasics{
// 	public static boolean palindrome(String s){	
// 		int n = s.length();
// 		for(int i = 0; i<n/2 ;i++){
// 			if (s.charAt(i) != s.charAt(n-1-i)){
// 				// not a palindrome
// 				return false;
// 			}
// 		}
// 		return true;
// 	}
// 	public static void main(String args[]){
// 		String sam = "racecar";
// 		String sam1 = "noon";
// 		String sam2 = "madam";
// 		String sam3 = "Success";
		
// 		System.out.println(palindrome(sam));
// 		System.out.println(palindrome(sam1));
// 		System.out.println(palindrome(sam2));
// 		System.out.println(palindrome(sam3));
// 	}
// }


//Shortest path

// public class JavaBasics{
// 	public static float shortPath(String s){
// 		int x = 0;
// 		int y = 0;
// 		for(int i = 0; i<s.length() ;i++){
// 			char dir = s.charAt(i);
// 			if(dir== 'N'){
// 				y++;
// 			} else if(dir == 'E'){
// 				x++;
// 			} else if(dir == 'S'){
// 				y--;
// 			} else if(dir == 'W'){
// 				x--;
// 			}
// 		}
// 		// int x2= x*x;
// 		// int y2= y*y;
		
// 		return (float)Math.sqrt(x*x+y*y);
// 	}
// 	public static void main(String arg[]){
// 		String sam = "WNEENESENNN";
// 		System.out.println(shortPath(sam));
// 	}
// }


// comaprison:

// public class JavaBasics{

// 	public static void main(String args[]){
// 		String s1 = "tony";
// 		String s2 = "tony";
// 		String s3 = new String("tony");

// 		if (s1==s2){
// 			System.out.println("String is equal");
// 		} else{ System.out.println("String is not equal");
// 		}

// 		if (s1==s3){
// 			System.out.println("String is equal");
// 		} else{ System.out.println("String is not equal");
// 		}

// 		//s1.equals
// 		if (s1.equals(s3)){
// 			System.out.println("String is equal");
// 		} else{ System.out.println("String is not equal");
// 		}
// 	}
// }


//Substring
// Manual
// public class JavaBasics{

// 	public static String Substring(String s, int si, int ei){
// 		String substr = "";

// 		for(int i = si; i<ei; i++){
// 			substr += s.charAt(i);
// 		}
// 		return substr;
// 	}

// 	public static void main(String args[]){
// 		String sam = "Hello World!";
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Start index: ");
// 		int start = sc.nextInt();
// 		System.out.print("End index: ");
// 		int end = sc.nextInt();
// 		System.out.println(Substring(sam,start,end));

// 	// Auto function
// 		System.out.println();

// 		System.out.println(sam.substring(start,end));
// 	}
// }



// Largest String print lexicographics order

//compare to function 
//  comparetoIgnoreCase

// public class JavaBasics{
// 	public static void main(String args[]){

// 		String fruit[] = {"apple","mango", "Banana"};

// 		String largest = fruit[0];
// 		for(int i=0;i<fruit.length;i++){
// 			if (largest.compareTo(fruit[i])<0){
// 				largest = fruit[i];
// 			}
// 		}
// 		System.out.println(largest);

// 	}
// }




// String Builder

// public class JavaBasics{
// 	public static void main(String args[]){

// 		StringBuilder sb = new StringBuilder("");
// 		for(char ch='a'; ch<='z';ch++){
// 			sb.append(ch + " ");
// 		}
// 		System.out.println(sb);
// 	}
// }



// Each first word as upper case

//str


// public class JavaBasics{
// 	public static String toUpperCase(String str){
// 		StringBuilder sb = new StringBuilder("");
// 		char ch = Character.toUpperCase(str.charAt(0));
// 		sb.append(ch);
// 		for (int i =1; i<str.length();i++){
// 			if(str.charAt(i)== ' ' && i<str.length()-1){
// 				sb.append(str.charAt(i));
// 				i++;
// 				sb.append(Character.toUpperCase(str.charAt(i)));
// 			} else{
// 				sb.append(str.charAt(i));
// 			}
// 		}
// 		return sb.toString();
// 	}

// 	public static void main(String args[]){
// 		String str = "hi, my name is success ambaliya.";
// 		System.out.println(toUpperCase(str));
// 	}
// }



// practice

// public class JavaBasics{
// 	public static String toUpperCase(String str){
// 		StringBuilder sb = new StringBuilder(); 
// 		char ch = Character.toUpperCase(str.charAt(0));
// 		sb.append(ch);
// 		for(int i = 1 ; i<str.length();i++){
// 			if(str.charAt(i) == ' ' && i<str.length()-1){
// 				sb.append(str.charAt(i));
// 				i++;
// 				sb.append(Character.toUpperCase(str.charAt(i)));
// 			}else{
// 				sb.append(str.charAt(i));
// 			}
// 		}
// 		return sb.toString();
// 	}
// 	public static void main(String args[]){
// 		String str = "hi, my name is success ambaliya.";
// 		System.out.println(toUpperCase(str));
// 	}
// }






// Comrpress

//without string builder

// public class JavaBasics{
// 	public static String compress(String sam){
// 		String newstr = "";

// 		for(int i=0; i<sam.length();i++){
// 			Integer count=1;
// 			while(i<sam.length()-1 && sam.charAt(i)== sam.charAt(i+1)){
// 				count++;
// 				i++;
// 			}

// 			newstr += sam.charAt(i);

// 			if(count >1) {
// 				newstr += count.toString();
// 			}
// 		}
// 		return newstr;
// 	}
// 	public static void main(String args[]){
// 		String s = "aaabbcccdd";
// 		System.out.println(compress(s));
// 	}
// }


// with string builder

// public class JavaBasics{
// 	public static String compress(String sam){

// 		StringBuilder sb = new StringBuilder("");
// 		// sb.append();

// 		for(int i = 0; i<sam.length() ; i++){
// 			Integer count = 1;
// 			while(i< sam.length()-1 &&  sam.charAt(i) == sam.charAt(i+1) ){
// 				count++;
// 				i++;
// 			}
// 			sb.append(sam.charAt(i));
// 			if(count>1){
// 				sb.append(count);
// 			}
// 		}
// 		return sb.toString();

// 	}
// 	public static void main(String args[]){
// 		String s = "aaabbcccdd";
// 		System.out.println(compress(s));
// 	}
// }


// practice

// public class JavaBasics{
// 	public static String compress(String str){
// 		StringBuilder sb = new StringBuilder("");
		
// 		for(int i = 0; i<str.length(); i++){
// 			Integer count= 1;
// 			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
// 				count++;
// 				i++;
// 			}

// 			sb.append(str.charAt(i));

// 			if(count>1){
// 				sb.append(count);
// 			}
// 		}
// 		return sb.toString();

// 	}
// 	public static void main(String args[]){
// 		String str = "aaaaaabbbbbbcccccc";
// 		System.out.print(compress(str));
// 	}
// }







// Notes

// String 

// String are immutable

// Syntax 

// String str ={"Hello World!"};
// String str2 = new String("Hello World!") 
// str.substring(Start index,End index); // auto

// // chartacter at 

// str.charAt(0);

// //length
// str.length();

// //Equals
// str.equals(str2);

//compare to function 
//  comparetoIgnoreCase

// Math.sqrt


// sb.append(ch);

// // sb.toString();

// char ch = Character.toUpperCase(str.charAt(0));






//Assignment


//Q1

// public class JavaBasics{

// 	public static String count(String sam1){
// 		Integer count = 0;
// 		for(int i = 0; i<sam1.length() ; i++){
// 			if(sam1.charAt(i)=='a' || sam1.charAt(i)=='e'|| sam1.charAt(i)=='i'|| sam1.charAt(i)=='o'|| sam1.charAt(i)=='u'){
// 				count++;
// 			}
// 		}
// 		return count.toString();
// 	}

// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Name: ");
// 		String sam = sc.nextLine();
// 		System.out.print("Result: " + count(sam) );
// 	}
// }






//Q2

// false true

//Q3

//ApnaCoege


// Q4



// Q5

// reading pending