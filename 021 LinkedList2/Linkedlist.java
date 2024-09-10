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
	public static int size;

	public void addFirst(int data){
		Node newNode = new Node(data);
		size++;
		if(head == null){
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}	

	public void addLast(int data){
		Node newNode = new Node(data);
		size++;
		if(head == null){
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public void add(int idx, int data){
		if(idx == 0){
			addFirst(data);
			return;				
		}
		Node newNode = new Node(data);
		size++;
		Node prev = head;
		int i = 0;
		while(i < idx -1 ){
			prev = prev.next;
			i++;
		}
		newNode.next = prev.next;
		prev.next = newNode;
	}

	public static void print(){
		if(head == null){
			System.out.println("empty!");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print( temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}


	// Floyd cycle finding algo
	public static boolean isCycle(){  

		if(head == null){
			return false;
		}
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
		} 
		return false;
	}

	// remove a loop or cycle from link list
	// Step  1 find last node
	// step 2 last.node. next  = null;


	// public static void removeCycle(){

	// 	// detect cycle	
	// 	Node slow = head;
	// 	Node fast = head;
	// 	boolean cycle = false;
	// 	while(fast != null && fast.next != null){
	// 		slow = slow.next;
	// 		fast = fast.next.next;
	// 		if(slow == fast){
	// 			cycle = true;
	// 			break;
	// 		}
	// 	}

	// 	if(cycle == false){
	// 		return;
	// 	}
	// 	// find the meet point
	// 	slow = head;
	// 	Node prev = fast;
	// 	while(slow == fast){
	// 		prev = fast;
	// 		slow = slow.next;
	// 		fast = fast.next;
	// 	}
	// 	// remove cycle
	// 	prev.next = null;
	// }

	// // public static void main(String args[]){

	// 	// for cycle break

	// 	// // LinkedList ll = new LinkedList();
	// 	// // ll.addFirst(1);
	// 	// // ll.addFirst(2);
	// 	// // ll.addLast(2);
	// 	// // ll.add(2,4);
	// 	// // ll.print();

	// 	// head = new Node(1);
	// 	// Node temp = new Node(2);
	// 	// head.next = temp;
	// 	// head.next.next = new Node(3);
	// 	// head.next.next.next = temp;

	// 	// System.out.println(isCycle());
	// 	// removeCycle();
	// 	// System.out.println(isCycle());
	// // }



	// // merge sort
	// private Node getMidNode(Node head){
	// 	Node slow = head;
	// 	Node fast = head.next;
	// 	while(fast != null && fast.next != null){
	// 		slow = slow.next;
	// 		fast = fast.next.next;
	// 	}
	// 	return slow;
	// }

	// private Node merge(Node head1, Node head2){
		
	// 	Node mergedLL = new Node(-1);
	// 	Node temp = mergedLL;

	// 	while(head1 !=null && head2!= null){
	// 		if(head1.data <= head2.data){
	// 			temp.next = head1;
	// 			head1 = head1.next;
	// 			temp = temp.next;
	// 		}else{
	// 			temp.next = head2;
	// 			head2 = head2.next;
	// 			temp = temp.next;				
	// 		}
	// 	}

	// 	while(head1!=null){
	// 		temp.next = head1;
	// 		head1 = head1.next;
	// 		temp = temp.next;			
	// 	}

	// 	while(head2!=null){
	// 		temp.next = head2;
	// 		head2 = head2.next;
	// 		temp = temp.next;				
	// 	}

	// 	return mergedLL.next;
	// }


	// 	public Node mergeSort(Node head){
	// 	// base 
	// 	if(head == null || head.next == null){
	// 		return head;
	// 	}	

	// 	// kaam	
	// 	// find mid
	// 	Node mid = getMidNode(head);
	// 	Node rightHead = mid.next;
	// 	mid.next = null;
	// 	// left & right merge sort
	// 	Node newLeft = mergeSort(head);
	// 	Node newRight = mergeSort(rightHead);

	// 	// merge
	// 	return merge(newLeft,newRight);
	// }

	// // public static void main(String args[]){
	// // 	// merge sort
	// // 	LinkedList ll = new LinkedList();
	// // 	ll.addFirst(1);
	// // 	ll.addLast(3);
	// // 	ll.addFirst(6);
	// // 	ll.add(1,5);
	// // 	ll.addFirst(9);
	// // 	ll.print();
	// // 	ll.head = ll.mergeSort(ll.head);
	// // 	ll.print();
	// // }





// Zig zag

	// public void zigzag(){
	// 	// find mid
	// 	Node slow = head;
	// 	Node fast = head.next;
	// 	while(fast != null && fast.next != null){
	// 		slow = slow.next;
	// 		fast = fast.next.next;
	// 	}
	// 	Node mid = slow;
		

	// 	// reverse 2nd half
	// 	Node prev= null;
	// 	Node curr= mid.next;
	// 	mid.next = null;
	// 	Node next;
	// 	while(curr!= null){
	// 		next = curr.next;
	// 		curr.next = prev; 
	// 		prev = curr;
	// 		curr = next;
	// 	}

	// 	// update
	// 	Node left = head;
	// 	Node right = prev;
	// 	Node nextL, nextR;

	// 	// alt zig zag
	// 	while(left != null && right != null){
	// 		nextL = left.next;
	// 		left.next = right;
	// 		nextR = right.next;
	// 		right.next = nextL;

	// 		left = nextL;
	// 		right = nextR;
	// 	}
	// }


// // Practice zigzag
// 	public void zigzag(){

// 		// find mid
// 		Node slow = head;
// 		Node fast = head.next;
// 		while(fast != null && fast.next != null){
// 			slow = slow.next;
// 			fast = fast.next.next;
// 		}
// 		Node mid = slow;
		
// 		// reverse second half
// 		Node prev = null;
// 		Node curr =  mid.next; 
// 		mid.next = null;
// 		Node next;
// 		while(curr != null){
// 			next = curr.next;
// 			curr.next = prev;

// 			prev = curr;
// 			curr = next;
// 		}

// 		// update
// 		Node left = head;
// 		Node right = prev;
// 		Node nextL, nextR; 

// 		// zigzag
// 		while(left != null && right != null){
// 			nextL = left.next;
// 			left.next = right;
// 			nextR = right.next;
// 			right.next = nextL;

// 			left = nextL;
// 			right = nextR;
// 		}	
// 	}


	public void zigzag(){

		// find mid
		Node slow = head;
		Node fast = head.next;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}	
		Node mid = slow;

		// revrse
		Node prev = null;
		Node curr = mid.next;
		mid.next = null;
		Node next;

		while(curr != null){
			next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		Node left = head;
		Node right = prev;
		Node nextL , nextR;
		// update
	
		while(left != null && right != null){
			nextL = left.next;
			left.next = right;
			nextR = right.next;
			right.next = nextL;

			left = nextL;
			right = nextR ;
		}
	}

	public static void main(String args[]){
		LinkedList ll = new LinkedList();

		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.print();
		ll.zigzag();
		ll.print();
	}

}


// Notes


// Detect Loop

// Floyd cycle finding algorhythm






// import java.util.*;

// Java Collection framework  - > optimized

// public class Classroom{
// 	public static void main(String args[]){
// 		// create
// 		LinkedList<Integer> ll = new LinkedList<>();

// 		//add
// 		ll.addFirst(1);
// 		ll.addLast(3);
// 		ll.add(1,2);

// 		System.out.println(ll);
// 		// remove

// 		ll.removeFirst();
// 		System.out.println(ll);
// 		ll.removeLast();
// 		System.out.println(ll);

// 	}
// }
