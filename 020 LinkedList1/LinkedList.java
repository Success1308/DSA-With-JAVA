import java.util.*;

public class LinkedList{
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static Node head;
	public static Node tail;
	// Size of a linked list
	public static int size; 
	// methods
	// add first  method  o(n)

	public void addFirst(int data){
		//step 1 create new node
		Node newNode = new Node(data);
		size++;
		if(head==null){
			head = tail = newNode;
			return;
		}
		// step 2 newNode next =head
		newNode.next = head; //link
		// step 3 head =newNode
		head = newNode;
	}

	// add Last method  o(n)

	public void addLast(int data){
		//step 1 create new node
		Node newNode = new Node(data);
		size++;
		if(head == null){
			head = tail = newNode; 
		}
		// step 2 newNode next =head
		tail.next = newNode;
		// step 3 head =newNode
		tail = newNode;
	}

	// print method

	public void print(){ // 0(n)
		if(head == null){
			System.out.println( "LL is empty. ");
			return;
		}
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}	
		System.out.println( "null");
	}

	// add in middle

	public void add (int idx,int data){
		if(idx == 0){
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head; 
		int i = 0;

		while(i<idx-1){
			temp = temp.next;
			i++;
		}

		// i = idx-1 ; temp -> prev
		newNode.next  = temp.next;
		temp.next = newNode;
	}

	// Remove

	// Remove first

	public int removeFirst(){
		if(size == 0){
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}else if(size == 1){
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = head.data;
		head = head.next;
		size --;
		return val;
	}

	// Remove last

	public int removeLast(){
		if(size == 0){
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		} else if(size == 1){
			int val = head.data;
			head = tail = null;
			size = 0; 
			return val;
		}
		// 1 prev.next = null;  
		// to go to previous : i = size -2
		Node prev = head; 
		for(int i = 0 ; i<size-2; i++){
			prev = prev.next;
		}

		// 2  tail = prev 

		int val = prev.next.data; //tail data
		prev.next  =null;
		tail = prev;
		size--;
		return val;
	}


	// search key Iterative method 

	public int search(int key){
		Node temp = head;
		int i = 0;
		while(temp != null){
			if(temp.data == key){
				return i;
			}
			temp = temp.next;
			i++;
		}

		return -1;
	}


	// search key recursive method  b(0) = n
	public int helper(Node head, int key){
		if(head == null){
			return -1;
		}
		if(head.data == key){
			return 0;
		}
		int idx = helper(head.next,key);
		if(idx == -1){
			return -1;
		}
		return idx+1;
	}

	public int recSearch(int key){
		return helper(head, key);
	}


	// revrse link list // iterative approach  0(n);
	public void reverse(){
		Node prev = null;
		Node curr = tail = head;
		Node next;

		while(curr != null){
			next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		head = prev;
	}

	// delete Nth node from last N  (Important) o(n)

	public void deleteNthfromend(int n){
		// calculate size
		int sz = 0;
		Node temp = head;
		while( temp != null){
			temp = temp.next;
			sz++;
		}

		if(n == sz){
			head = head.next; // remove first
			return;
		}
		
		//sz - n
		int i = 1;
		int iToFind = sz-n;
		Node prev = head;
		while(i<iToFind){
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return;
	}

	// chehck if palindrome  // Slow fast concept // half revrse (learning important)
	public Node findMid(Node head){
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next; // +1 turtle
			fast = fast.next.next; // +2 rabit
		}
		return slow;  // slow is mid node
	}

	public boolean isPalindrome(){
		if(head == null || head.next == null){
			return true;
		}
		// step 1 find mid
		Node midNode = findMid(head);
		// step 2 revrse 2nd half
		Node prev = null;
		Node curr = midNode;
		Node next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev; // right half head
		Node left = head;
		// step 3 chehck left and right
		while(right != null){
			if(left.data != right.data){
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}

	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addLast(2);
		ll.addLast(5);
		ll.add(2,3);
		ll.print();  // 1-> 2-> 3-> 4-> 5-> null

		System.out.println("LinkedList size :  " + ll.size);

		// ll.removeFirst();
		// ll.print();
		// ll.removeLast();
		// ll.print();
		// System.out.println("LinkedList size :  " + ll.size);
		// System.out.println(ll.search(4)); 
		// System.out.println(ll.search(10)); 

		// System.out.println(ll.recSearch(2)); 
		// System.out.println(ll.recSearch(10)); 

		ll.reverse();
		ll.print();

		ll.deleteNthfromend(3);
		ll.print();
		System.out.println(ll.isPalindrome());
		
	}
}

// Notes

// Naya data Structures

// Linked list

// node and link

// linked list structure
	//  node1   node2   node3  node4   node5
//       __      __      __      __
//      |__| -> |__| -> |__| -> |__| -> null 
//		|__| -> |__| -> |__| -> |__|
//	head node	 				tail node

// blue print 

// data & next reference

// go up now


// class node{
// 	int data;
// 	node next;
// }
// public node(int data){
// 	this.data =data;
// 	this.next = null;
// }




// import java.util.*;

// public class LinkedList{

// 	public class Node{
// 		int data;
// 		Node next;
// 		public Node(int data){
// 			this.data = data;
// 			this.next = null;
// 		}
// 	}
// 	public static Node head;
// 	public static Node tail;
// 	public static int size;


// 	// add first

// 	public void addFirst(int data){
// 		// create new node
// 		Node newNode = new Node(data);
// 		size++;
// 		// base case
// 		if(head == null){
// 			head = tail=newNode;
// 			return;
// 		}
// 		// point next node pointing to head
// 		newNode.next = head;
// 		// change head
// 		head = newNode;
// 	}

// 	// add last

// 	public void addLast(int data){
// 		// create new node
// 		Node newNode = new Node(data);
// 		size++;
// 		// base case
// 		if(tail == null){
// 			head = tail = newNode;
// 			return;
// 		}
// 		// point next node pointing to head
// 		tail.next = newNode;
// 		// change tail
// 		tail = newNode;
// 	}


// 	// print
// 	public void print(){
// 		if(head == null){
// 			System.out.println("Head is empty");
// 		}
// 		Node temp = head;
// 		while(temp != null){
// 			System.out.print(temp.data + "->");
// 			temp = temp.next;
// 		}
// 		System.out.println("null");
// 	}


// 	// Add in middle
// 	public void add(int idx, int data){
// 		if(idx == 0){
// 			addFirst(data);
// 			return;
// 		}
// 		Node newNode = new Node(data);
// 		size++;
// 		Node temp = head;
// 		int i = 0;
// 		while(i < idx-1){
// 			temp = temp.next;
// 			i++;
// 		} 
// 		// i = idx -1 ->prev
// 		newNode.next = temp.next;
// 		temp.next = newNode;
// 	}

// 	public int removeFirst(){
// 		if(size == 0){
// 			System.out.println("LL is empty");
// 			return Integer.MIN_VALUE;
// 		}else if(size == 1){
// 			int val = head.data;
// 			head = tail = null;
// 			size = 0;
// 			return val;	
// 		}
// 		int val = head.data;
// 		head = head.next;
// 		size--;
// 		return val;	
// 	}

// 	public int removeLast(){
// 		if(size == 0){
// 			System.out.println("LL is empty");
// 			return Integer.MIN_VALUE;
// 		}else if(size == 1){
// 			int val = head.data;
// 			head = tail = null;
// 			size = 0;
// 			return val;	
// 		}
// 		// prev = size -2
// 		Node prev = head;
// 		for(int i = 0; i<size-2;i++){
// 			prev = prev.next;
// 		}
// 		int val = prev.next.data; //tail data
// 		prev.next =null;
// 		tail = prev;
// 		size--;
// 		return val;
// 	}


// 	public static void main(String args[]){
// 		LinkedList ll = new LinkedList();
// 		ll.addFirst(1);
// 		ll.print();
// 		ll.addFirst(2);
// 		ll.print();
// 		ll.addLast(3);
// 		ll.print();
// 		ll.addLast(4);
// 		ll.print();
// 		ll.add(2,9);
// 		ll.print();
// 		System.out.println(ll.size); 
// 		ll.removeFirst();
// 		ll.print();
// 		ll.removeLast();
// 		ll.print();

// 	}
// }





// // Practice



// // import java.util.*;


// // public class LinkedList{
// // 	public class Node{	
// // 		int data;
// // 		Node next;
// // 		public Node(int data){
// // 			this.data = data;
// // 			this.next = null;
// // 		}
// // 	}
// // 	public static Node head;
// // 	public static Node tail;

// // 	//add first	
// // 	public void addFirst(int data){
// // 		Node newNode = new Node(data);
// // 		if(head == null){
// // 			head = tail = newNode;
// // 			return;
// // 		}
// // 		newNode.next = head;
// // 		head = newNode;
// // 	}

// // 	//add last
// // 	public void addLast(int data){
// // 		Node newNode = new Node(data);
// // 		if(head == null){
// // 			head = tail = newNode;
// // 			return;
// // 		}
// // 		tail.next = newNode;
// // 		tail = newNode;
// // 	}

// // 	// print
// // 	public void print(){
// // 		if(head == null){
// // 			System.out.println("LinkedList is empty!");
// // 			return;
// // 		}
// // 		Node temp = head;
// // 		while(temp != null){
// // 			System.out.print(temp.data + " -> ");
// // 			temp = temp.next ;
// // 		}	
// // 		System.out.println("null");
// // 	}

// // 	// add in middle

// // 	public void add(int idx, int data){
// // 		if(idx == 0 ){
// // 			addFirst(data);
// // 			return;
// // 		}
// // 		Node newNode = new Node(data);
// // 		Node temp = head;
// // 		int i = 0;
// // 		while(i<idx-1){
// // 			temp = temp.next;
// // 			i++;
// // 		}
// // 		newNode.next = temp.next;
// // 		temp.next = newNode;
// // 	}



// // 	public static void main (String args[]){
// // 		LinkedList ll = new LinkedList(); 
// // 		ll.addFirst(2);
// // 		ll.print();
// // 		ll.addFirst(1);
// // 		ll.print();
// // 		ll.addLast(3);
// // 		ll.print();
// // 		ll.addLast(4);
// // 		ll.print();
// // 		ll.add(1,9);
// // 		ll.print();
// // 	}
// // }




// public class LinkedList{
// 	public class Node{
// 		int data;
// 		Node next;
// 		public Node(int data){
// 			this.data = data;
// 			this.next = null;
// 		}
// 	}

// 	public static Node head;
// 	public static Node tail;
// 	public static int size;

// 	// add first

// 	public void addFirst(int data){
// 		Node newNode = new Node(data);
// 		size++;
// 		if(head == null){
// 			head = tail = newNode;
// 			return;
// 		}
// 		newNode.next = head;
// 		head = newNode;
// 	}

// 	// add last
// 	public void addLast(int data){
// 		Node newNode = new Node(data);
// 		size++;
// 		if(head == null){
// 			head = tail = newNode;
// 			return;
// 		}
// 		tail.next = newNode;
// 		tail = newNode;
// 	}

// 	// print
// 	public void print(){
// 		if(head == null){
// 			System.out.println("LinkedList is empty!");
// 			return;
// 		}
// 		Node temp = head;
// 		while(temp != null){
// 			System.out.print(temp.data + "->");
// 			temp = temp.next;
// 		}
// 		System.out.println("null");
// 	}

// 	// add in middle

// 	public void add(int idx, int data){
// 		if(idx == 0){
// 			addFirst(data);
// 			return;
// 		}
// 		Node newNode = new Node(data);
// 		size++;
// 		Node temp = head; 
// 		int i = 0;

// 		while(i<idx-1){
// 			temp = temp.next;
// 			i++;
// 		}
// 		newNode.next = temp.next;
// 		temp.next = newNode;	
// 	}

// 	// remove first

// 	public int removeFirst(){
// 		if(size == 0){
// 			System.out.println("empty!");
// 			return Integer.MIN_VALUE;
// 		}else if(size ==1){
// 			int val = head.data;
// 			head = tail = null;
// 			size = 0;
// 			return val;
// 		}
// 		int val = head.data;
// 		head = head.next;
// 		size--;
// 		return val;
// 	}

// 	// remove last




// 	public static void main(String args[]){
// 		LinkedList ll = new LinkedList();

// 		ll.addFirst(2);
// 		ll.print();
// 		ll.addFirst(1);
// 		ll.print();

// 		ll.addLast(3);
// 		ll.print();
// 		ll.addLast(4);
// 		ll.print();
// 		ll.addLast(5);
// 		ll.print();

// 		ll.removeFirst();
// 		ll.print();

// 		System.out.println(ll.size);
// 	}
// }














// public class LinkedList{
// 	public class Node{
// 		int data;
// 		Node next;
// 		public Node(int data){
// 			this.data = data;
// 			this.next = null;
// 		}
// 	}

// 	public static Node head;
// 	public static Node tail;
// 	public static int size;

// 	// add first

// 	public void addFirst(int data){
// 		Node newNode = new Node(data);
// 		size++;
// 		if(head == null){
// 			head = tail = newNode;
// 			return;
// 		}
// 		newNode.next = head;
// 		head = newNode;
// 	}

// 	// add last
// 	public void addLast(int data){
// 		Node newNode = new Node(data);
// 		size++;
// 		if(head == null){
// 			head = tail = newNode;
// 			return;
// 		}
// 		tail.next = newNode;
// 		tail = newNode;
// 	}
// 	// print
// 	public void print(){
// 		if(head == null){
// 			System.out.println("Empty!");
// 			return;
// 		}
// 		Node temp = head;
// 		while(temp != null){
// 			System.out.print(temp.data + " -> ");
// 			temp = temp.next;
// 		}
// 		System.out.println("null");
// 	}

// 	// add in between

// 	public void add(int idx, int data){
// 		Node newNode = new Node(data);
// 		if(idx == 0){
// 			head = tail = newNode;
// 			size++;
// 			return;
// 		}

// 		Node prev = head;
// 		int i = 0;
// 		while(i<idx-1){
// 			prev = prev.next;
// 			i++;
// 		}
// 		newNode.next = prev.next;
// 		prev.next = newNode;
// 		size++;
// 	}

// 	// remove first
// 	public int  removeFirst(){
// 		if(size == 0 ){
// 			System.out.println("Empty!");
// 			return Integer.MIN_VALUE;
// 		} else if(size == 1){
// 			int val = head.data;
// 			head = tail = null;
// 			return val;
// 		}
// 		int val = head.data;
// 		head = head.next;
// 		size--;
// 		return val;
// 	}

// 	// remove last
// 	public int  removeLast(){
// 		if(size == 0 ){
// 			System.out.println("Empty!");
// 			return Integer.MIN_VALUE;
// 		} else if(size == 1){
// 			int val = head.data;
// 			head = tail = null;
// 			return val;
// 		}
// 		Node prev = head;
// 		for(int i = 0; i<size-2;i++){
// 			prev = prev.next;
// 		}

// 		int val = tail.data;
// 		prev.next = null;
// 		tail = prev;
// 		size--;
// 		return val;
// 	}


// 	public static void main(String args[]){
// 		LinkedList ll = new LinkedList();
// 		ll.addFirst(1);
// 		ll.print();
// 		ll.addFirst(2);
// 		ll.print();
// 		ll.addLast(3);
// 		ll.print();
// 		ll.addLast(4);
// 		ll.print();
// 		ll.add(2,9);
// 		ll.print();
// 		ll.removeFirst();
// 		ll.print();
// 		ll.removeLast();
// 		ll.print();		

// 		System.out.println(ll.size);
// 	}
// }

























