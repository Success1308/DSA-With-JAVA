import java.util.*;



//pq in  JCF

// public class JavaBasics{
// 	public static void main(String args[]){
// 		// PriorityQueue<Integer> pq = new PriorityQueue<>();
// 		// pq.add(7);
// 		// pq.add(0);
// 		// pq.add(1);
// 		// pq.add(5);
// 		// pq.add(2);
// 		// pq.add(8);

// 		// while(! pq.isEmpty()){
// 		// 	System.out.println( pq.remove() );
// 		// }

// 		// rervse order using comparator
// 		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
// 		pq.add(7);
// 		pq.add(0);
// 		pq.add(1);
// 		pq.add(5);
// 		pq.add(2);
// 		pq.add(8);

// 		while(! pq.isEmpty()){
// 			System.out.println( pq.remove() );
// 		}
// 	}
// }





// comparator for objects

// public class JavaBasics{

// 	static class Student implements Comparable<Student>{
// 		String name;
// 		int rank;
// 		public Student(String name, int rank){
// 			this.name = name;
// 			this.rank = rank;
// 		}

// 		@Override
// 		public int compareTo(Student s2){
// 			return this.rank - s2.rank;
// 		}
// 	}

// 	public static void main(String args[]){
// 		PriorityQueue<Student> pq = new PriorityQueue<>();

// 		pq.add(new Student("s", 5));
// 		pq.add(new Student("e", 1));
// 		pq.add(new Student("a", 2));
// 		pq.add(new Student("y", 9));

// 		while( ! pq.isEmpty()){
// 			System.out.println(pq.peek().rank + " - " + pq.peek().name);
// 			pq.remove();
// 		}
// 	}
// }






// Heap


	// max heap 
	// 	    10
	//     /  \
	//    4    5
	//   / \ 
	//  1   2 


// min heap 
	// 	    1
	//     /  \
	//    2    4
	//   / \ 
	//  5   10 
	


// binary tree
// at most 2 children

// complete binary tree
// CBT is a BT in which all the levels are completly filled except
// possibly the last one which is filled from the left to right


// Heap order property

// children >= parent(min heap)
// children <= parent(max heap)


// parent node idx = i 
// left child = 2i+1;
// right child = 2i+2;

// i,2i+1,2i+2 
// 2,3,4,5,10

// child x -> parent
// x  -> (x-1)/2


public class JavaBasics{
	static class Heap{
		ArrayList<Integer> arr = new ArrayList<>();
		// insert in heap 
		public void add(int data){ // 0(log n) 
			// step 1 add at last index
			arr.add(data);
			// step 2 fix heap
			int x = arr.size() - 1;
			int par = (x-1)/ 2;
			while(arr.get(x) < arr.get(par)){ // 0(log n) 
				int temp = arr.get(x);
				arr.set(x,arr.get(par));
				arr.set(par,temp);

				x = par;
				par = (x-1)/ 2;
			}
		}

		// get min heap
		public int peek(){ // 0(1)
			return arr.get(0);
		}

		private void heapify(int i ){
			int left = 2*i+1;
			int right = 2*i+2;
			int minIdx = i;
			if(left < arr.size() && arr.get(minIdx) > arr.get(left) ){
				minIdx = left;
			}
			if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
				minIdx = right;
			}
			if(minIdx != i ){
				// swap
				int temp = arr.get(i);
				arr.set(i,arr.get(minIdx));
				arr.set(minIdx,temp);

				heapify(minIdx);
			}
		}

		// delete 
		public int remove(){ 
			int data = arr.get(0);
			//step 1 swap send min index in back
			int temp = arr.get(0);
			arr.set(0,arr.get(arr.size()-1));
			arr.set(arr.size()-1, temp);

			// step 2 remove last idx
			arr.remove(arr.size()-1);

			// step 3 heapify
			heapify(0);

			return data;
		}

		public boolean isEmpty(){
			return arr.size() == 0;
		}

	}
	public static void main(String args[]){

		Heap h = new Heap();

		h.add(4);
		h.add(1);
		h.add(5);

		while(! h.isEmpty()){
			System.out.print(h.peek() + " ");
			h.remove();
		}

	}
}





// // heap implementation
// public class JavaBasics{
	
// 	public static class Heap{
// 		ArrayList<Integer> arr = new ArrayList<>();
// 		// add
// 		public void add(int data){
// 			// add data at end
// 			arr.add(data);
// 			// swap with parent
// 			int x = arr.size() - 1;
// 			int par = (x-1)/2;

// 			while(arr.get(x) > arr.get(par)){
// 				int temp = arr.get(x);
// 				arr.set(x, arr.get(par));
// 				arr.set(par, temp);

// 				x = par;
// 				par = (x-1)/2;
// 			}
// 		}
// 		// peek
// 		public int peek(){
// 			return arr.get(0);
// 		}
		
// 		// heapify
// 		private void heapify(int i){
// 			int left = 2*i+1;
// 			int right = 2*i+2;
// 			int minIdx = i;

// 			if( left < arr.size() && arr.get(minIdx) < arr.get(left)){
// 				minIdx = left;
// 			}
// 			if( right < arr.size() && arr.get(minIdx) < arr.get(right)){
// 				minIdx = right;
// 			}

// 			if(minIdx != i){
// 				int temp = arr.get(i);
// 				arr.set(i, arr.get(minIdx));
// 				arr.set(minIdx, temp);
// 				heapify(minIdx);
// 			}

// 		}
// 		//remove
// 		public int remove(){
// 			// save data 
// 			int data = 	arr.get(0);

// 			// swap first to last
// 			int temp = arr.get(0);
// 			arr.set(0, arr.get(arr.size()-1));
// 			arr.set((arr.size()-1), temp);
// 			// delete 
// 			arr.remove(arr.size()-1);
// 			// heapify
// 			heapify(0);
// 			// return data;
// 			return data;
// 		}
// 		// is empty
// 		public boolean isEmpty(){
// 			return arr.size() == 0;
// 		}

// 	}
// 	public static void main(String args[]){
// 		Heap h = new Heap();
// 		h.add(6);
// 		h.add(2);
// 		h.add(1);
// 		h.add(7);


// 		while(! h.isEmpty()){
// 			System.out.print(h.peek() + " ");
// 			h.remove();
// 		}

// 	}
// }




// Heap sort

// public class JavaBasics{

// 	private static void heapify(int i, int n, int arr[] ){
// 		int left = 2*i+1;
// 		int right = 2*i+2;
// 		int maxIdx = i;

// 		if(left < n && arr[maxIdx] < arr[left] ){
// 			maxIdx = left;
// 		}
// 		if(right < n && arr[maxIdx] < arr[right] ){
// 			maxIdx = right;
// 		}
// 		if(maxIdx != i){
// 			int temp = arr[i];
// 			arr[i] = arr[maxIdx];
// 			arr[maxIdx] = temp;

// 			heapify(maxIdx,n,arr);
// 		}
// 	}

// 	public static void heapSort(int arr[]){
		
// 		int n = arr.length;
// 		// build max heap
// 		for(int i = n/2; i>=0 ;i--){
// 			heapify(i,n, arr);
// 		}

// 		// push largest at end

// 		for(int i = n-1; i>0 ;i--){
// 			int temp = arr[0];
// 			arr[0] = arr[i];
// 			arr[i] = temp;

// 			heapify(0,i, arr);
// 		}

// 	}

// 	public static void main(String args[]){

// 		int arr[] = {4,9,1,2,6,8};

// 		heapSort(arr);

// 		for(int i = 0; i < arr.length ; i++){
// 			System.out.print(arr[i] + "  ");
// 		}
		
// 	}
// }




// heap sort

// practice

// public class JavaBasics{

// 	public static void heapify(int i, int size,int arr[]){
// 		int left = 2*i + 1;
// 		int right = 2*i + 2;
// 		int maxIdx = i;
// 		if(left < size && arr[left] > arr[maxIdx]){
// 			maxIdx = left;
// 		}
// 		if(right < size && arr[right] > arr[maxIdx]){
// 			maxIdx = right;
// 		}
// 		if(maxIdx != i){
// 			int temp = arr[maxIdx];
// 			arr[maxIdx] = arr[i];
// 			arr[i] = temp;

// 			heapify(maxIdx,size,arr);
// 		}
// 	}

// 	public static void heapSort(int arr[]){
// 		int n =arr.length;

// 		// prepar max heapify
// 		for(int i = n/2; i >= 0 ; i--){
// 			heapify(i,n,arr);
// 		}
// 		// push at  last
// 		for(int i = n-1; i >= 0 ; i--){
// 			int temp = arr[0];
// 			arr[0] = arr[i];
// 			arr[i] = temp;
// 			heapify(0,i,arr );
// 		}
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {7,2,9,3,4,1,0};
// 		heapSort(arr);
// 		for(int i = 0 ; i <arr.length ; i ++ ){
// 			System.out.print(arr[i] + " ");
// 		}
// 	}
// }



// nearby car Question


// public class JavaBasics{
// 	static class Info implements Comparable<Info>{
// 		int sq;
// 		int idx;
// 		public Info(int sq,int idx){
// 			this.sq = sq;
// 			this.idx = idx;
// 		}

// 		@Override 
// 		public int compareTo(Info s2){
// 			return this.sq - s2.sq;
// 		}
// 	}

// 	public static void main(String args[]){
// 		int arr[][] = {{3,3},{5,-1},{-2,4},{1,1}};
// 		PriorityQueue<Info> pq = new PriorityQueue<>();
// 		for(int i = 0; i<arr.length ; i++){
// 			int sq =  arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
// 			pq.add(new Info(sq, i));
// 		}
// 		int k = 2;
// 		for(int i = 0; i<k ; i++){
// 			System.out.println("C - " + pq.remove().idx);
// 		}

// 	}
// }



// Connect ropes Question

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int ropes[] = {4,3,2,6};

// 		PriorityQueue<Integer> pq = new PriorityQueue<>();
// 		for(int i = 0; i<ropes.length ; i++){
// 			pq.add(ropes[i]);
// 		}
// 		int cost = 0;
// 		while(pq.size() > 1){ 
// 			int min1 = pq.remove();
// 			int min2 = pq.remove();
// 			cost += min1 + min2;
// 			pq.add(min1 + min2);
// 		}
// 		System.out.println(cost);
// 	}
// }

// Weakst soldier

// public class JavaBasics{

	// static class Row implements Comparable<Row>{
	// 	int soldier;
	// 	int index;
	// 	public Row(int soldier, int index){
	// 		this.soldier = soldier;
	// 		this.index = index;
	// 	}

	// 	@Override
	// 	public int compareTo(Row r2){
	// 		if(this.soldier == r2.soldier){
	// 			return this.index - r2.index;
	// 		}else{
	// 			return this.soldier - r2.soldier;
	// 		}
	// 	}
	// }
// 	public static void main(String args[]){
// 		int army[][] = {{1,0,0,0},
// 						   {1,1,1,1},
// 						   {1,0,0,0},
// 						   {1,0,0,0}};
// 		int k = 2;
// 		PriorityQueue<Row> pq = new PriorityQueue<>();
// 		for(int i = 0; i < army.length; i++){
// 			int count = 0;
// 			for(int j = 0; j < army.length; j++){
// 				count += army[i][j] == 1 ? 1 : 0; ;
// 			}
// 			pq.add(new Row(count, i));
// 		}
// 		for(int i = 0; i < k; i++){
// 			System.out.println(" Row - "+ pq.remove().index);
// 		}
// 	}
// }





// Sliding window

// public class JavaBasics{
// 	static class Pair implements Comparable<Pair>{
// 		int val;
// 		int idx;
// 		public Pair(int val, int idx){
// 			this.val = val;
// 			this.idx = idx;
// 		}
// 		@Override
// 		public int compareTo(Pair p2){
// 			return p2.val - this.val;
// 		}
// 	}

// 	public static void main(String args[]){
// 		int slidingwindow[]  = {1,3,-1,-3,5,3,6,7};
// 		int k = 3; // window size
// 		int res[] = new int[slidingwindow.length - k + 1 ];  // n-k+1
// 		PriorityQueue<Pair> pq = new PriorityQueue<>();
// 		for(int i = 0; i < k; i++ ){
// 			pq.add(new Pair(slidingwindow[i],i));
// 		}
// 		res[0] = pq.peek().val;
// 		for(int i = k; i < slidingwindow.length ; i++ ){
// 			while(pq.size() > 0 && pq.peek().idx<= (i-k)){
// 				pq.remove();
// 			}
// 			pq.add(new Pair(slidingwindow[i],i));
// 			res[i-k+1] = pq.peek().val;
// 		}
// 		for(int i = 0; i < res.length ; i++ ){
// 			System.out.print(res[i] + " ");
// 		}
// 		System.out.println();
// 	}
// }









// Priority Queue

// give  result according to priority

// Priority Queue in JCF

// Add() 0(logn)
// remove() 0(logn)
// peek() 0(1)
