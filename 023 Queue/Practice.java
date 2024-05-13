import java.util.*;


// // Queue using array 

// // public class Practice{

// // 	static class Queue{
// // 		static int arr[];
// // 		static int size;
// // 		static int rear;

// // 		Queue(int n) {
// // 			arr = new int[n];
// // 			size = n;
// // 			rear = -1;
// // 		}

// // 		// is empty
// // 		public static boolean isEmpty(){
// // 			return rear == -1;
// // 		}

// // 		// add 
// // 		public static void add(int data){
// // 			if(rear == size-1){
// // 				System.out.println("Queue is Full!");
// // 				return;
// // 			}

// // 			rear = rear + 1;
// // 			arr[rear] = data;
// // 		}

// // 		// remove
// // 		public static int remove(){
// // 			if(isEmpty()){
// // 				System.out.println("Queue is empty!");
// // 				return -1;
// // 			}
// // 			int top = arr[0];
// // 			for(int i = 0; i < rear ; i++){
// // 				arr[i] = arr[i+1];
// // 			}
// // 			rear = rear -1;
// // 			return top;
// // 		}

// // 		// peek

// // 		public static int peek(){
// // 			if(isEmpty()){
// // 				System.out.println("Queue is empty!");
// // 				return -1;
// // 			}	
// // 			int top = arr[0];
// // 			return top;
// // 		}

// // 	}
// // 	public static void main(String args[]){
// // 		Queue q = new Queue(5);

// // 		q.add(1);
// // 		q.add(2);
// // 		q.add(3);
// // 		q.add(4);
// // 		q.add(5);


// // 		q.remove();

// // 		while(!q.isEmpty()){
// // 			System.out.println(q.peek());
// // 			q.remove();
// // 		}
// // 	}
// // }







// public class Practice{

// 	static class Queue{
// 		static int arr[];
// 		static int size;
// 		static int rear;
// 		static int front;

// 		Queue(int n) {
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
// 				System.out.println("Queue full!");
// 				return;
// 			}
// 			if(front == -1	){	
// 				front = 0;
// 			}
// 			rear = (rear+1)%size;
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
// 			}else{
// 				front = (front + 1 ) % size;
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
// 		q.add(5);


// 		q.remove();

// 		q.add(6);


// 		while(!q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}

// 	}
// }






// Queue using array


// public class Practice{
// 	static class Queue{
// 		static int arr[];
// 		static int rear;
// 		static int size;
// 		Queue(int n){
// 			arr = new int[n];
// 			size = n;
// 			rear = -1;
// 		}

// 		// is empty
// 		public static boolean isEmpty(){
// 			return rear == -1;
// 		}
// 		// add
// 		public static void add(int data){
// 			if(rear == size - 1){
// 				System.out.println("Queue is FUll!");
// 				return;
// 			}
// 			rear = rear + 1;
// 			arr[rear] = data;
// 		}
// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
// 				return -1;
// 			}
// 			int top = arr[0];
// 			for(int i = 0; i<rear ; i++){
// 				arr[i] = arr[i+1];
// 			}
// 			rear = rear - 1;
// 			return top;
// 		}
// 		// peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
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

// 		while(!q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }


// Queue using circular array


// public class Practice{
// 	static class Queue{
// 		static int arr[];
// 		static int rear;
// 		static int front;
// 		static int size;
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
// 		// add
// 		public static void add(int data){
// 			if(isFull()){
// 				System.out.println("Queue is FUll!");
// 				return;
// 			}
// 			if(front == -1){
// 				front = 0;
// 			}	
// 			rear = (rear + 1)%size;
// 			arr[rear] = data;
// 		}
// 		// remove
// 		public static int remove(){
// 			if(isEmpty()){
// 				System.out.println("Queue is Empty!");
// 				return -1;
// 			}
// 			int top = arr[front];
// 			if(rear  == front){
// 				front = rear  = -1;
// 			}else{
// 				front = (front + 1)%size;
// 			}
// 			return top;
// 		}
// 		// peek
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
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);

// 		while(!q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
// }


// // Queue using link list

// public class Practice{
// 	static class Node{
// 		int data;
// 		Node next;
// 		Node(int data){
// 			this.data = data;
// 			this.next = null;
// 		}
// 	}
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
// 				System.out.println("Queue Empty!");
// 				return -1;
// 			}
// 			int top = head.data;
// 			if(head == tail){
// 				head = tail = null;
// 			}else{
// 				head = head.next;
// 			}
			
// 			return top;
// 		}
// 		// peek
// 		public static int peek(){
// 			if(isEmpty()){
// 				System.out.println("Queue Empty!");
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

// 		while(!q.isEmpty()){
// 			System.out.println(q.peek());
// 			q.remove();
// 		}
// 	}
	
// }