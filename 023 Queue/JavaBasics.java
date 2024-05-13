import java.util.*;


// Queue using array  

// public class JavaBasics{
// 	static class Queue{
// 		static int arr[];
// 		static int size;
// 		static int rear;
		
// 			Queue(int n){
// 				arr = new int[n];
// 				size = n;
// 				rear = -1;
// 			}

// 		public static boolean isEmpty(){
// 			return rear == -1;
// 		}

// 		// add 
// 		public static void add(int data){
// 			if(rear == size-1){
// 				System.out.println("Queue is full");
// 				return;
// 			}

// 			rear = rear + 1;
// 			arr[rear] = data;
// 		}


// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue is empty");
// 				return -1;
// 			}

// 			int front = arr[0];
// 			for(int i = 0; i<rear; i++){
// 				arr[i] = arr[i+1];
// 			}
// 			rear = rear - 1;
// 			return front;
// 		}

// 		//peek

// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue is empty");
// 				return -1;
// 			}

// 			return arr[0];
// 		}

// 	}

// 	public static void main(String args[]){
// 		Queue q = new Queue(5);

// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);

// 		while(!q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}	
// }




//  Circular Queue using array

// public class JavaBasics{
// 	static class Queue{

// 		static int arr[];
// 		static int size;
// 		static int rear; 
// 		static int front; 

// 		Queue(int n){
// 			arr = new int[n];
// 			size = n;
// 			rear = -1;
// 			front = -1;
// 		}
// 		//isempty
// 		public static boolean isEmpty(){
// 			return rear == -1 && front == -1;
// 		}
// 		// is full
// 		public static boolean isFull(){
// 			return (rear+1) % size == front;
// 		}

// 		//add
// 		public static void add(int data){
// 			if(isFull()){
// 				System.out.println("Queue full");
// 				return ;
// 			}

// 			if(front == -1){
// 				front = 0;
// 			}
// 			rear = (rear+1) % size;
// 			arr[rear] = data;
// 		}

// 		// remove	
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue empty");
// 				return -1;
// 			}

// 			int top = arr[front];
// 			if(rear == front){
// 				rear = front = -1;
// 			}else{
// 				front = (front+1)%size;
// 			}
// 			return top;
// 		}

// 		//peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue empty");
// 				return -1;
// 			}

// 			int top = arr[front];
// 			return top;
// 		}
// 	}
// 	public static void main(String args[]){
// 		Queue q = new Queue(5);

// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);

// 		q.remove();

// 		q.add(2);

// 		while(! q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }



// Question 1
// Queue using Linkedlist

// public class JavaBasics{
// 	static class Node{
// 			int data;
// 			Node next;
// 			Node(int data){
// 				this.data = data;
// 				this.next = null;
// 			}
// 		}
// 	static class Queue{
// 		static Node head = null;
// 		static Node tail = null;
// 		// is empty
// 		public static boolean isEmpty(){
// 			return head == null && tail == null;
// 		}
// 		// add
// 		public static void add(int data){
// 			Node newNode = new Node(data);
// 			if(head == null){
// 				head = tail = newNode;
// 			}	
// 			tail.next = newNode;
// 			tail = newNode; 
// 		}
// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
// 				return -1;
// 			}

// 			int top = head.data;
// 			// Single element
// 			if(tail == head){
// 				tail = head = null;
// 			}else{
// 				head = head.next;
// 			}
// 			return top;
// 		}

// 		// peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
// 				return -1;
// 			}

// 			int top = head.data;
// 			return top;
// 		}
// 	}

// 	public static void main(String args[]){
// 		Queue q = new Queue();
// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);
// 		q.remove();
// 		while(! q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }



// Queue with JCF

// public class JavaBasics{
// 	public static void main(String args[]){
// 		Queue<Integer> q = new LinkedList<>();
// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);
// 		// q.remove();
// 		while(! q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }




// Question 2
// Queue using 2 Stacks using add 0(1) : 

// public class JavaBasics{
// 	static class Queue{
// 		static Stack<Integer> s1 = new Stack<>();
// 		static Stack<Integer> s2 = new Stack<>();

// 		// is empty
// 		public static boolean isEmpty(){
// 			return s1.isEmpty() && s2.isEmpty();
// 		}
// 		//add
// 		public static void add(int data){
// 			s1.push(data);
// 		}
// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue is empty!");
// 				return -1;
// 			}
// 			while(!s1.isEmpty()){
// 				s2.push(s1.pop());
// 			}
// 			return s2.pop();
// 		}
// 		// peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue is empty!");
// 				return -1;
// 			}
// 			while(!s1.isEmpty()){
// 				s2.add(s1.pop());
// 			}

// 			return s2.peek();
// 		}
// 	}
// 	public static void main(String args[]){
// 		Queue q = new Queue();
// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);
// 		q.remove();
// 		while(! q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }



// Queestion 3
// Stack using Queues push o(n);

// public class JavaBasics{
// 	static class Stack{	
// 		static Queue<Integer> q1 = new LinkedList<>();
// 		static Queue<Integer> q2 = new LinkedList<>();

// 		// is empty
// 		public static boolean isEmpty(){
// 			return q1.isEmpty() && q2.isEmpty();
// 		}
// 		// push
// 		public static void push(int data){
// 			while(!q1.isEmpty()){
// 				q2.add(q1.remove());
// 			}
// 			q1.add(data);
// 			while(!q2.isEmpty()){
// 				q1.add(q2.remove());
// 			}
// 		}
// 		// pop
// 		public static int pop(){
// 			if(isEmpty()){
// 				System.out.println("Queue is empty");
// 				return -1;
// 			}
// 			return q1.remove();
// 		}
// 		//peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue is empty");
// 				return -1;
// 			}
// 			return q1.peek();
// 		}
// 	}
// 	public static void main(String args[]){
// 		Stack s = new Stack();

// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(4);
// 		s.push(5);
// 		s.pop();
// 		while(!s.isEmpty()){
// 			System.out.println(s.peek());
// 			s.pop();
// 		}
// 	}
// }




// Questiuon 4
// First Non repeating letter

// public class JavaBasics{
// 	public static void nonRepeatingletter(String str){
		
// 		int freq[] = new int[26];
// 		Queue<Character> q = new LinkedList<>();

// 		for(int i = 0; i <str.length() ; i++){
// 			char ch = str.charAt(i);
// 			q.add(ch);
// 			freq[ ch -'a']++ ;

// 			while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
// 				q.remove();
// 			}

// 			if(q.isEmpty()){
// 				System.out.print(-1 + " ");
// 			}else{
// 				System.out.print(q.peek() + " ");
// 			}
// 		}
// 		System.out.println();

// 	}
// 	public static void main(String args[]){
// 		String str = "aabccxb";
// 		nonRepeatingletter(str);
// 	}
// }


// Questions 5
// Interleave half of the QUeue

// public class JavaBasics{
// 	public static void interHalves(Queue<Integer> q){
// 		Queue<Integer> q2 = new LinkedList<>();
// 		int size = q.size();
// 		while(q2.size() < size/2 ){
// 			q2.add(q.remove());
// 		}

// 		while(!q2.isEmpty()){
// 			q.add(q2.remove());
// 			q.add(q.remove());
// 		}
// 	}
// 	public static void main(String args[]){
// 		Queue<Integer> q = new LinkedList<>(); 

// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);
// 		q.add(6);
// 		q.add(7);
// 		q.add(8);
// 		q.add(9);
// 		q.add(10);
// 		interHalves(q);

// 		while(!q.isEmpty()){
// 			System.out.print( q.peek() + " ");
// 			q.remove();
// 		}
// 	}
// }






// Question 6
// Queue reversal

public class JavaBasics{
	public static void rervse(Queue<Integer> q ){
		Stack<Integer> s = new Stack<>();

		while(!q.isEmpty()){
			s.push(q.remove());
		}

		while(!s.isEmpty()){
			q.add(s.pop());
		}
	} 
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		rervse(q);

		while(!q.isEmpty()){
			System.out.print( q.peek() + " ");
			q.remove();
		}
	}
}




// Deque (Double ended Queue) ( not De queue : remove element) it is interface
//addFirst();
//addLast();
//removeFirst();
//removeLast();
//getFirst();
//getLast();

// using Java collection framework

// public class JavaBasics{
// 	public static void main(String args[]){
// 		Deque<Integer> deque = new LinkedList<>();

// 		deque.addFirst(1);
// 		deque.addFirst(2);
// 		deque.addLast(3);
// 		deque.addLast(4);
// 		System.out.println(deque);
// 		deque.removeFirst();
// 		deque.removeLast();

// 		System.out.println(deque);
// 	}
//  }


// Question  7 
// stack & Queue using Deque;


// // Stack 
// public class JavaBasics{
// 	static class Stack{
// 		static Deque<Integer> deque = new LinkedList<>();

// 		// push
// 		public void push(int data){
// 			deque.addFirst(data);
// 		}
// 		// pop 
// 		public int pop(){

// 			return deque.removeFirst();
// 		}
// 		// peek
// 		public int peek(){
// 			return deque.getFirst();
// 		}

// 	}
// 	public static void main(String args[]){
// 		Stack s = new Stack();

// 		s.push(1);
// 		s.push(2);
// 		s.push(3);
// 		s.push(4);
// 		s.push(5);

// 		System.out.println(s.pop());
// 		System.out.println(s.pop());
// 		System.out.println(s.pop());
// 		System.out.println(s.pop());
// 		System.out.println(s.pop());
// 	}
// }






// Notes


// Queue
// Queue means FIFO (First in first out)
// it is interface

// Practice 

// // using array

// public class JavaBasics{
// 	static class Queue{
// 		static int arr[];
// 		static int size;
// 		static int rear;
// 		Queue(int n){
// 			arr =  new int[n];
// 			size = n;
// 			rear = -1;
// 		}
// 		// is empty
// 		public static boolean isEmpty(){
// 			return rear == -1;
// 		}
// 		//add
// 		public static void add(int data){
// 			if(rear == size -1){
// 				System.out.println( "array is full");
// 				return ;
// 			}
// 			rear = rear + 1;
// 			arr[rear] = data;

// 		}

// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println( "array is Empty!");
// 				return -1;
// 			}
// 			int top = arr[0];
// 			for(int i = 0; i< rear; i++){
// 				arr[i] = arr[i+1];
// 			}
// 			rear = rear -1;
// 			return top;
// 		}
// 		// peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println( "array is Empty!");
// 				return -1;
// 			}	
// 			int top = arr[0];
// 			return top;		
// 		}
// 	}

// 	public static void main(String args[]){
// 		Queue q = new Queue(5);

// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);

// 		while(! q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }





// // Circular 



// public class JavaBasics{
// 	static class Queue{
// 		static int arr[];
// 		static int size;
// 		static int rear;
// 		static int front;


// 		Queue(int n){
// 			arr = new int[n];
// 			size = n;
// 			rear = -1;
// 			front = -1;
// 		}
// 		// is empty
// 		public static boolean isEmpty(){
// 			return rear == -1 &&  front == -1;
// 		}
// 		// is full
// 		public static boolean isFull(){
// 			return (rear+1)%size == front;
// 		}
// 		//add
// 		public static void add(int data){
// 			if(isFull()){
// 				System.out.println("Queue Full!");
// 				return;
// 			}

// 			if(front == -1){
// 				front = 0;
// 			}	
// 			rear = (rear +1)% size;
// 			arr[rear] = data;		
// 		}
// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue Empty!");
// 				return -1;
// 			}

// 			int top = arr[front];
// 			if(rear == front){
// 				rear = front = -1;
// 			} else{
// 				front  = (front + 1 )% size;
// 			}
// 			return top;

// 		}
// 		// peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue Empty!");
// 				return -1; 
// 			}

// 			int top = arr[front];
// 			return top;
// 		}
// 	}

// 	public static void main(String args[]){
// 		Queue q = new Queue(5);

// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// // 		q.add(5);

// // 		while(! q.isEmpty()){
// // 			System.out.println(q.peek());
// // 			q.remove();
// // 		}
// // 	}
// // }]















// public class JavaBasics{

// 	static class Queue{
// 		static int arr[];
// 		static int size;
// 		static int rear;
// 		static int front;

// 		Queue(int n){
// 			arr = new int[n];
// 			size = n;
// 			rear = -1;
// 			front = -1;
// 		}

// 		// is empty

// 		public static boolean isEmpty(){
// 			return rear == -1 && front == -1;
// 		}

// 		// is full

// 		public static boolean isFull(){
// 			return (rear+1)%size == front;
// 		}

// 		// add

// 		public static void add(int data){
// 			if(isFull()){
// 				System.out.println("Queue is Full");
// 				return ;
// 			}	

// 			if(front == -1){
// 				front = 0;
// 			}
// 			rear = (rear + 1) % size;
// 			arr[rear] = data;
// 		}

// 		// remove

// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
// 				return -1;
// 			}	

// 			int top = arr[front];
// 			if(front == rear ){
// 				rear = front = -1;
// 			}else{
// 				front = (front +1)% size;
// 			}
// 			return top;
// 		}	

// 		//peek

// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
// 				return -1;
// 			}	

// 			int top = arr[front];
// 			return top;
// 		}

// 	}

// 	public static void main(String args[]){
// 		Queue q = new Queue(5);


// 		q.add(1);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);
// 		q.add(6);

// 		q.remove();
// 		q.add(2);


// 		while(!q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}	
// }






