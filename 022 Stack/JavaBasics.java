import java.util.*;


// Stack using arraylist

// public class JavaBasics{
// 	static class Stack{
// 		static ArrayList<Integer> list = new ArrayList<>();

// 		public static boolean isEmpty(){
// 			return list.size() == 0;
// 		}

// 		public static void push(int data){
// 			list.add(data);
// 		}

// 		public static int pop(){
// 			if(! s.isEmpty()){
// 				return -1;
// 			}
// 			int top = list.get(list.size()-1);
// 			list.remove(list.size()-1);
// 			return top;
// 		}
// 		public static int peek(){
// 			if(! s.isEmpty()){
// 				return -1;
// 			}
// 			return list.get(list.size()-1);
// 		}
// 	}
// 	public static void main(String args[]){
// 		Stack s = new Stack();
// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(5);
// 		s.push(4);

// 		while(! s.isEmpty()){
// 			System.out.println(s.peek());
// 			s.pop();
// 		}	
// 	}
// }



// Stack using Linked List

// public class JavaBasics{
// 	static class Node{
// 		int data;
// 		Node next;
// 		Node(int data){
// 			this.data = data;
// 			this.next = null;
// 		}
// 	}
// 	static class Stack{
// 		static Node head = null;
// 		public static boolean isEmpty(){
// 			return head == null;
// 		}
// 		public static void push(int data){
// 			Node newNode = new Node(data);
// 			if(isEmpty()){
// 				head = newNode;
// 				return;
// 			}
// 			newNode.next = head;
// 			head = newNode;
// 		}
// 		public static int pop(){
// 			if(isEmpty()){
// 				return -1;
// 			}
// 			int top = head.data;
// 			head = head.next; 
// 			return top;
// 		}
// 		public static int peek(){
// 			if(isEmpty()){
// 				return -1;
// 			}
// 			return head.data;
// 		}
// 	}

// 	public static void main(String args[]){
// 		Stack s = new Stack();
// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(5);
// 		s.push(4);
// 		s.pop();
// 		while(! s.isEmpty()){
// 			System.out.println(s.peek());
// 			s.pop();
// 		}	
// 	}
// }




// directly using JCF(Java collection frame work)

// public class JavaBasics{

// 	public static void main(String args[]){
// 		// Stack s = new Stack();
// 		Stack<Integer> s = new Stack<>();
// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(5);
// 		s.push(4);
// 		s.pop();
// 		while(! s.isEmpty()){
// 			System.out.println(s.peek());
// 			s.pop();
// 		}	
// 	}
// }






// Q1 push at bottom of stack


// public class JavaBasics{

// 	public static void pushAtBottom(Stack<Integer> s, int data){
// 		if(s.isEmpty()){
// 			s.push(data);
// 			return;
// 		}

// 		int top = s.pop();
// 		pushAtBottom(s,data);
// 		s.push(top);
// 	}

// 	public static void main(String args[]){
// 		Stack<Integer> s = new Stack<>();

// 		s.push(1);
// 		s.push(2);
// 		s.push(3);

// 		pushAtBottom(s,4);

// 		while(! s.isEmpty()){
// 			System.out.println(s.peek());
// 			s.pop();
// 		}
// 	}
// }


// Q3  Reverse stack (String)  (self easy method)


// public class JavaBasics{

// 	public static void pushAtBottom(Stack<String> s, String str){
// 		//base
// 		if(s.isEmpty()){
// 			s.push(str);
// 			return;
// 		}
// 		// kaam
// 		String top = s.pop();
// 		pushAtBottom(s,str);
// 		s.push(top);
// 	}
// 	public static void reverseString(Stack<String> s){
// 		// base 
// 		if(s.isEmpty()){
// 			return;
// 		}
// 		// kaam
// 		String top = s.pop();
// 		reverseString(s);
// 		pushAtBottom(s, top);
// 	}
// 	public static void main(String args[]){

// 		Stack<String> s = new Stack<>();

// 		s.push("s");
// 		s.push("a");
// 		s.push("m");
// 		pushAtBottom(s," cool ");
// 		reverseString(s);

// 		while(! s.isEmpty()){
// 			System.out.print(s.pop());
// 		}
// 	}
// }



// Q3  Shradha method reverse string

// public class JavaBasics{
// 	// public static void 
// 	public static String reverseString(String s ){
// 		Stack<Character> st = new Stack<>();

// 		for(int i = 0; i<s.length() ; i++){
// 			st.push(s.charAt(i));
// 		} 

// 		StringBuilder sb = new StringBuilder();
// 		while(!st.isEmpty()){
// 			sb.append(st.peek());	
// 			st.pop();
// 		}	

// 		return sb.toString();
// 	}
// 	public static void main(String agrs[]){
// 		String s = "Success";
// 		reverseString(s);

// 		System.out.print(reverseString(s));
// 	}
// }








// Q4 Reverse stack


// public class JavaBasics{
// 	public static void pushAtBottom(Stack<Integer> s, int data ){
// 		// Base
// 		if(s.isEmpty()){
// 			s.push(data);
// 			return;
// 		}
// 		//kaam
// 		int top = s.pop();
// 		pushAtBottom(s,data);
// 		s.push(top);
// 	}

// 	public static void reverseStack(Stack<Integer> s){
// 		//base
// 		if(s.isEmpty()){
// 			return;
// 		}
// 		//kaam
// 		int top = s.pop();
// 		reverseStack(s);
// 		pushAtBottom(s,top);
// 	}

// 	public static void main(String args[]){
// 		Stack<Integer> s = new Stack<>();

// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(4);
// 		s.push(5);
// 		pushAtBottom(s,0);
// 		while(! s.isEmpty()){
// 			System.out.println(s.pop());
// 		}
// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(4);
// 		s.push(5);

// 		reverseStack(s);
// 		System.out.println("ReverseStack :  ");
// 		while(! s.isEmpty()){
// 			System.out.println(s.pop());
// 		}
// 	}
// }



// Q4 Stock span problem

// public class JavaBasics{
// 	public static void stockSpan(int stock[], int span[]){
// 		Stack<Integer> s = new Stack<>();
// 		span[0] = 1;
// 		s.push(0);

// 		for(int i = 1; i<stock.length; i++){
// 			int currPrice = stock[i];
// 			while(!s.isEmpty() && currPrice > stock[s.peek()]){
// 				s.pop();
// 			}
// 			if(s.isEmpty()){
// 				span[i] = i+1;
// 			}else{
// 				int prevHigh = s.peek();
// 				span[i] = i - prevHigh;
// 			}
// 			s.push(i);
// 		}
// 	}
// 	public static void main(String args[]){
// 		int stock[] = {100,80,60,70,60,85,100};
// 		int span[] = new int[stock.length];
// 		stockSpan(stock,span);

// 		for(int i = 0; i<span.length; i++){
// 			System.out.print (span[i] + " ");
// 		}
// 	}
// }



// Q5 Next greater element 


// public class JavaBasics{
// 	public static void nextGretaer(int arr[], int nextBig[]){

// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length -1 ; i >= 0 ; i--){
// 			// while
// 			while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
// 				s.pop();
// 			}	
// 			// if else
// 			if(s.isEmpty()){
// 				nextBig[i] = -1;
// 			}else{
// 				nextBig[i] = arr[s.peek()] ;
// 			}

// 			//push	
// 			s.push(i);

// 		} 	
// 	}

// 	public static void main(String args[]){
// 		int arr[] = {6,8,0,1,3};
// 		int nextBig[] = new int[arr.length];

// 		nextGretaer(arr, nextBig);
// 		for(int i = 0; i<nextBig.length; i++){
// 			System.out.print(nextBig[i] + " ");
// 		}
// 	}
// }




// practice

// public class JavaBasics{

// 	public static void nextGretaer(int arr[], int nextBig[]){
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length -1; i>= 0; i--){
// 			while(! s.isEmpty() && arr[s.peek()] <  arr[i]){
// 				s.pop();
// 			}

// 			if(s.isEmpty()){
// 				nextBig[i] = -1;
// 			}else{
// 				nextBig[i] = arr[s.peek()];
// 			}

// 			s.push(i);
// 		}
// 	}

// 	public static void main(String args[]){
// 		int arr[] = {6,8,0,1,3};
// 		int nextBig[] = new int[arr.length];

// 		nextGretaer(arr, nextBig);
// 		for(int i = 0; i<nextBig.length; i++){
// 			System.out.print(nextBig[i] + " ");
// 		}
// 	}
// }


// practice

// public class JavaBasics{
// 	public static void nextGretaer(int arr[], int nextBig[]){
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length-1; i>= 0 ; i--){
// 			//while
// 			while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
// 				s.pop();
// 			}
// 			//ifelse
// 			if(s.isEmpty()){
// 				nextBig[i] = -1;
// 			}else{
// 				nextBig[i] = arr[s.peek()];
// 			}
// 			//push at s
// 			s.push(i);
// 		}
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {6,8,0,1,3};	
// 		int nextBig[] = new int[arr.length];

// 		nextGretaer(arr,nextBig);

// 		for(int i = 0; i<nextBig.length ; i++){
// 			System.out.print(nextBig[i]+" ");
// 		}
// 	}
// }



// Practice

// public class JavaBasics{

// 	public static void nextGretaer(int arr[], int nextBig[]){

// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length-1; i >= 0 ; i--){
// 			// while
// 			while(! s.isEmpty() && arr[s.peek()] <= arr[i]){
// 				s.pop();
// 			}
// 			// if else
// 			if(s.isEmpty()){
// 				nextBig[i] = -1;
// 			}else{
// 				nextBig[i] = arr[s.peek()];
// 			}
// 			// push s
// 			s.push(i);
// 		}	
// 	}


// 	public static void main(String args[]){
// 		int arr[] = {6,8,0,1,3};	
// 		int nextBig[] = new int[arr.length];

// 		nextGretaer(arr,nextBig);

// 		for(int i = 0; i<nextBig.length ; i++){
// 			System.out.print(nextBig[i]+" ");
// 		}
// 	}
// }






// Valid parantheses


// public class JavaBasics{
// 	public static boolean validParatheses(String s){
// 		Stack<Character> st = new Stack<>();

// 		for(int i = 0 ; i < s.length(); i++){
// 			if((s.charAt(i)) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) {
// 				st.push(s.charAt(i));
// 			} else{
// 				if(st.isEmpty()){
// 					return false;
// 				}
// 				if(st.peek() == '(' && s.charAt(i) == ')' 
// 					|| st.peek() == '[' && s.charAt(i) == ']' 
// 					||  st.peek() == '{' && s.charAt(i) == '}'){
// 					st.pop();
// 				} else{ 
// 					return false;
// 				}
// 			}
// 		}
// 		if(st.isEmpty()){
// 			return true;
// 		} else{
// 			return false;
// 		}
		
// 	}
// 	public static void main(String args[]){
// 		String s = "({})" ; 

// 		System.out.println(validParatheses(s));
// 	}	
// }

// Practice

// public class JavaBasics{
// 	public static boolean validParatheses(String str){
// 		Stack<Character> s = new Stack<>();

// 		for(int i = 0 ; i <  str.length(); i++ ){
// 			char ch = str.charAt(i);
// 			if(ch == '(' || ch == '{' || ch == '[' ){
// 				s.push(ch);
// 			} else{
// 				if(s.isEmpty()){
// 					return false;
// 				}
// 				if( s.peek() == '(' && ch == ')'  || s.peek() == '{' && ch == '}' || s.peek() == '[' && ch == ']' ){
// 					s.pop();
// 				}else{
// 					return false;
// 				}
// 			}
// 		}

// 		if(s.isEmpty()){
// 			return true;
// 		} else{
// 			return false;
// 		}
// 	}
// 	public static void main(String args[]){
// 		String str = "[{[()]}]";
// 		System.out.println(validParatheses(str));
		
// 	}
// }



// Duplicate parathesses  O(n)


// public class JavaBasics{
// 	public static boolean duplicateParathesses(String str){
// 		Stack<Character> s = new Stack<>();

// 		for(int i = 0 ; i < str.length() ; i++){
// 			char ch = str.charAt(i);

// 			// closing
// 			if(ch == ')'){
// 				int count = 0;
// 				while(s.peek() != '('){
// 					s.pop();
// 					count++;
// 				}
// 				if(count < 1){
// 					return true; // duplicate
// 				}else{ 
// 					s.pop(); // opening pair
// 				}
// 			} else{
// 				// opening 
// 				s.push(ch);
// 			}
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		String str = "(((a+(b)))+(c+d))";
// 		String str1 = "((a+(b)))";
// 		String str2 = "(a-b)";
// 		System.out.println(duplicateParathesses(str));
// 		System.out.println(duplicateParathesses(str1));
// 		System.out.println(duplicateParathesses(str2));
// 	}
// }
 



// practice different

// public class JavaBasics{
// 	public static boolean duplicateParathesses(String str){
// 		Stack<Character> s = new Stack<>();

// 		for(int i = 0; i < str.length() ; i++){
// 			char ch = str.charAt(i);
// 			if(ch != ')'){
// 				s.push(ch);
// 			}else{
// 				int count = 0;
// 				while(s.pop() != '('){
// 					count++;
// 				}
// 				if(count <1){
// 					return true;
// 				} 
// 			}
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		String str = "(((a+(b)))+(c+d))";
// 		String str1 = "((a+(b)))";
// 		String str2 = "(sa-b)";
// 		System.out.println(duplicateParathesses(str));
// 		System.out.println(duplicateParathesses(str1));
// 		System.out.println(duplicateParathesses(str2));
// 	}
// }



// Practice


// public class JavaBasics{
// 	public static boolean duplicateParathesses(String str){
// 		Stack<Character> s = new Stack<>();
// 		for(int i = 0 ; i < str.length() ; i++){
// 			char ch = str.charAt(i);
// 			// closing
// 			if(ch == ')'){
// 				// while loop and count
// 				int count = 0;
// 				while( s.pop() != '(' ){
// 					count++;
// 				}
// 				if(count<1){
// 					return true;
// 				}
// 			} else{
// 				s.push(ch);
// 			}
// 		}
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		String str = "((a+b))"; 
// 		String str1 = "(a-b)";
// 		String str2 = "((((a)-(b))+ (a+b)))";

// 		System.out.println(duplicateParathesses(str));
// 		System.out.println(duplicateParathesses(str1));
// 		System.out.println(duplicateParathesses(str2));
// 	}
// }



// Max area in histogram

// for understanding code (j-i-1)

// public class JavaBasics{
// 	public static void prevSmaller(int arr[], int prevSmaller[]){
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = 0 ; i< arr.length ; i++ ){
// 			// while
// 			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			// if else
// 			if(s.isEmpty()){
// 				prevSmaller[i] = -1;
// 			}else{
// 				prevSmaller[i] = s.peek();
// 			}
// 			// s push
// 			s.push(i);
// 		}
// 	}
// 	public static void nextSmaller(int arr[], int nextSmaller[]){
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length - 1 ; i>=0 ; i-- ){
// 			// while
// 			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			// if else
// 			if(s.isEmpty()){
// 				nextSmaller[i] = arr.length;
// 			}else{
// 				nextSmaller[i] = s.peek();
// 			}
// 			// s push
// 			s.push(i);
// 		}
// 	}



// 	public static void main(String args[]){
// 		int arr[] = {2,1,5,6,2,3};
// 		int nextSmaller[] = new int[arr.length]; 
// 		int prevSmaller[] = new int[arr.length]; 
// 		prevSmaller(arr,prevSmaller);
// 		nextSmaller(arr, nextSmaller);

// 		for(int i = 0 ; i <arr.length; i++){
// 			System.out.print(arr[i] + " "); 
// 		}
// 		System.out.println();

// 		for(int i = 0 ; i <arr.length; i++){
// 			System.out.print(nextSmaller[i] + " "); 
// 		}
// 		System.out.println();

// 		for(int i = 0 ; i <arr.length; i++){
// 			System.out.print(prevSmaller[i] + " "); 
// 		}
// 		System.out.println();
// 	}
// }



// Main code


// public class JavaBasics{
// 	public static void maxArea(int arr[]){
// 		int maxarea = 0;
		
// 		int nextSmaller[] = new int[arr.length];
// 		int prevSmaller[] = new int[arr.length];

// 		// next smaller index
		
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length - 1 ; i>=0 ; i--){
// 			//while
// 			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			// if else
// 			if(s.isEmpty()){
// 				nextSmaller[i] = arr.length;
// 			} else{
// 				nextSmaller[i] = s.peek() ;
// 			}
// 			// push
// 			s.push(i);
// 		}

// 		// prev smaller index
// 		s = new Stack<>();
// 		for(int i = 0; i< arr.length ; i++){
// 			//while
// 			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			// if else
// 			if(s.isEmpty()){
// 				prevSmaller[i] = -1 ;
// 			} else{
// 				prevSmaller[i] = s.peek() ;
// 			}
// 			// push
// 			s.push(i);
// 		}

// 		// area

// 		for(int i = 0; i< arr.length ; i++){
// 			int height = arr[i];
// 			int width = nextSmaller[i] - prevSmaller[i] - 1;
// 			int area = height * width;
// 			maxarea = Math.max(maxarea,area);
// 		}

// 		System.out.print( "Maximum area :  "  + maxarea );
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {2,1,5,6,2,3};
// 		maxArea(arr);
// 	}
// }



// Practice


// public class JavaBasics{

// 	public static void maxArea(int arr[]){
// 		int maxarea = 0; 

// 		int nextSmaller[] = new int[arr.length]; 
// 		int prevSmaller[] = new int[arr.length]; 

// 		// next smaller
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = arr.length - 1 ; i >= 0 ; i-- ){
// 			// while
// 			while( !s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			//  if else
// 			if(s.isEmpty()){
// 				nextSmaller[i] = arr.length; 
// 			}else{
// 				nextSmaller[i] = s.peek();
// 			}
// 			// s push
// 			s.push(i);
// 		}
// 		// prev smaller
// 		s = new Stack<>();

// 		for(int i = 0 ; i < arr.length; i++ ){
// 			// while
// 			while( !s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			//  if else
// 			if(s.isEmpty()){
// 				prevSmaller[i] = -1; 
// 			}else{
// 				prevSmaller[i] = s.peek();
// 			}
// 			// s push
// 			s.push(i);
// 		}
// 		// area
// 		for(int i = 0 ; i < arr.length; i++ ){
// 			int height = arr[i]; 
// 			int width = nextSmaller[i] - prevSmaller[i] - 1 ;
// 			int area = height * width;

// 			maxarea = Math.max(maxarea,area);
// 		}

// 		System.out.print( "Maximum area would be: " + maxarea);
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {2,1,5,6,2,3};
// 		maxArea(arr);
// 	}
// }







// Practice

// public class JavaBasics{
// 	public static void maxArea(int arr[]){
// 		int maxarea = 0; 
// 		int nextSmaller[] = new int[arr.length];
// 		int prevSmaller[] = new int[arr.length];

// 		// nextsmallaer
// 		Stack<Integer> s = new Stack<>();
// 		for(int i = arr.length - 1 ; i >= 0 ; i-- ){
// 			//while
// 			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			//if else
// 			if(s.isEmpty()) {
// 				nextSmaller[i] = arr.length;
// 			} else {
// 				nextSmaller[i] = s.peek();
// 			}
// 			// push
// 			s.push(i);
// 		}
// 		// prev smaller
// 		s = new Stack<>();
// 		for(int i = 0 ; i <  arr.length  ; i++ ){
// 			//while
// 			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
// 				s.pop();
// 			}
// 			//if else
// 			if(s.isEmpty()) {
// 				prevSmaller[i] = -1;
// 			} else {
// 				prevSmaller[i] = s.peek();
// 			}
// 			// push
// 			s.push(i);
// 		}
// 		// area
// 		for(int i = 0 ; i <  arr.length  ; i++ ){
// 			int height = arr[i];
// 			int width = nextSmaller[i] - prevSmaller[i] - 1;

// 			int area = height * width;

// 			maxarea = Math.max(maxarea,area);
// 		}
// 		System.out.println("Maximum area is: " + maxarea );
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {2,1,5,6,2,3};
// 		maxArea(arr);
// 	}
// }








// Notes

// push operation 0(1)

// push(); 

// pop operations 0(1)

// pop();

// peek operations 0(1)

// peek();


// LIFO
//  LAst in first out


// Stack can be made in

// Array (Limited)
// ArrayList (useful)
// LinkedList (useful)