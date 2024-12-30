import java.util.*;


// HashMap // LinkedHashMap // TreeMap 
	// Syntax

// put (key, value)  0(1)                    *for tree map 0(logn)
// get (key)         0(1)					 *for tree map 0(logn)
// containsKey(key)  0(1)					 *for tree map 0(logn)
// remove(key)       0(1)				 	 *for tree map 0(logn)

//  from util librabry
// HashMap<String,Integer> hm = new HashMap<>();


// Basics 

// public class JavaBasics{

// 	public static void main(String args[]){
// 		HashMap<String,Integer> hm = new HashMap<>();
// 		// LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
// 		// TreeMap<String,Integer> hm = new TreeMap<>();

// 		// put
// 		hm.put("India", 120);
// 		hm.put("China", 110);
// 		hm.put("Canada", 100);
// 		hm.put("US", 543);
// 		hm.put("Mexico", 106);
// 		// print
// 		System.out.print( hm );
// 		System.out.println();
// 		//get
// 		System.out.print(hm.get("India") + " ");
// 		System.out.println();
// 		// contains key
// 		System.out.print(hm.containsKey("India"));
// 		System.out.println();
// 		System.out.print(hm.containsKey("UK"));
// 		// remove
// 		hm.remove("China");
// 		System.out.println();
// 		System.out.print( hm );

// 		System.out.println();
// 		// get of default
// 		int value = hm.getOrDefault("uk", 1) + 20;
//         System.out.println("Value for 'uk': " + value);

// 		// size
// 		System.out.print("Size: " +  hm.size() );

// 		System.out.println();
// 		// is empty
// 		System.out.print("is empty ? : " +  hm.isEmpty() );
// 		System.out.println();

// 		//clear
// 		hm.clear();
// 		System.out.print("Size: " +  hm.size() );
// 	}
// }



// Iteration in HashMap

// public class JavaBasics{
// 	public static void main(String args[]){
// 		HashMap<String,Integer> map = new HashMap<>();
// 		// LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
// 		// TreeMap<String,Integer> map = new TreeMap<>();

// 		map.put("India", 120);
// 		map.put("China", 110);
// 		map.put("Canada", 100);
// 		map.put("US", 543);
// 		map.put("Mexico", 106);
// 		map.put("India", 130);

// 		// iterate
// 		Set<String> keys = map.keySet();

// 		// print key
// 		System.out.print(keys);
// 		System.out.println();

// 		// for each loop

// 		for(String k : keys){
// 			System.out.print("key = "+ k + ", Value : " + map.get(k) );
// 			System.out.println();
// 		}
// 		System.out.println();

// 	}
// }






// Implementation of hashmap

// public class JavaBasics{
// 	static class HashMap<K,V> {
// 		private class Node{
// 			K key;
// 			V value;

// 			public Node(K key, V value){
// 				this.key = key;
// 				this.value = value;
// 			}
// 		}

// 		private int n; // n
// 		private int N; // n
// 		private LinkedList<Node> buckets[]; // N 

// 		@SuppressWarnings("unchecked")
// 		public HashMap(){
// 			this.N = 4;
// 			this.buckets = new LinkedList[4];
// 			for(int i = 0; i <4 ; i++){
// 				this.buckets[i] = new LinkedList<>();
// 			}
// 		}

// 		private int hashFunction(K key){
// 			int hc = key.hashCode();
// 			//12435678
// 			return Math.abs(hc) % N;
// 		}

// 		private int SearchInLL(K key, int bi){
// 			LinkedList<Node> ll = buckets[bi];
// 			int di = 0;
// 			for(int i = 0; i<ll.size(); i++){
// 				Node node = ll.get(i);
// 				if(node.key == key){
// 					return di;
// 				}
// 				di++;
// 			}
// 			return -1;
// 		}

// 		@SuppressWarnings("unchecked")
// 		private void rehash(){
// 			LinkedList<Node> oldBuck[] = buckets;
// 			buckets = new LinkedList[N*2];
// 			N = 2*N;
// 			for(int i = 0 ; i<buckets.length; i++){
// 				buckets[i]  = new LinkedList<>();
// 			}
// 			// Node add to the bucket
// 			for(int i = 0; i<oldBuck.length; i++){
// 				LinkedList<Node> ll = oldBuck[i];
// 				for(int j = 0; j<ll.size() ; j++){
// 					Node node = ll.remove();
// 					put(node.key, node.value);
// 				}
// 			}
// 		}

// 		// put 
// 		public void put(K key, V value){   // 0(lambda)
// 			int bi = hashFunction(key);
// 			int di = SearchInLL(key,bi); // valid or -1

// 			if(di != -1){
// 				Node node = buckets[bi].get(di);
// 				node.value = value;
// 			}	else{
// 				buckets[bi].add(new Node (key, value));
// 				n++;
// 			}

// 			double lamda = (double) n/N;

// 			if(lamda > 2.0){
// 				rehash();
// 			}
// 		}
		
// 		public boolean containsKey(K key) {  // 0(lambda)
// 			int bi = hashFunction(key);
// 			int di = SearchInLL(key,bi); // valid or -1
// 			if(di != -1){
// 				return true;
// 			}else{
// 				return false;
// 			}
// 		}

// 		public V remove(K key){   // 0(lambda)
// 			int bi = hashFunction(key);
// 			int di = SearchInLL(key,bi); // valid or -1

// 			if(di != -1){
// 				Node node = buckets[bi].remove(di);
// 				n--;
// 				return node.value;
// 			}	else{
// 				return null;
// 			}
// 		}

// 		public V get(K key){   // 0(lambda)
// 			int bi = hashFunction(key);
// 			int di = SearchInLL(key,bi); // valid or -1

// 			if(di != -1){
// 				Node node = buckets[bi].get(di);
// 				return node.value;
// 			}	else{
// 				return null;
// 			}
// 		}

// 		public ArrayList<K> keySet(){
// 			ArrayList<K> keys = new ArrayList<>();

// 			for(int i = 0; i<buckets.length; i++){
// 				LinkedList<Node> ll = buckets[i];
// 				for(Node node : ll){
// 					keys.add(node.key);
// 				}
// 			}
// 			return keys;
// 		}

// 		public boolean isEmpty(){
// 			return n == 0;
// 		}

// 	}

// 	public static void main(String args[]){
// 		HashMap<String, Integer> hm = new HashMap<>();
// 		hm.put("sam", 20);
// 		hm.put("sam1", 20);
// 		hm.put("sam2", 20);
// 		ArrayList<String> keys = hm.keySet();
// 		for(String key : keys){
// 			System.out.println(key);
// 		}
// 	}
// }






// Majority element sum Question


// public class JavaBasics{
// 	public static void main(String args[]){

// 		int nums[] = { 1,3,3,3,3,3,2,5,1,3,1,5,1 };

// 		HashMap<Integer,Integer> map = new HashMap<>();

// 		for(int i = 0 ; i< nums.length ; i++){
// 			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
// 		}

// 		Set<Integer> keySet = map.keySet();

// 		for(Integer key : keySet){
// 			if(map.get(key) > nums.length/3){
// 				System.out.println(key  + " with " + map.get(key));
// 			}
// 		}
// 	}
// }






// Valid Anagram

// public class JavaBasics{

// 	public static boolean isAnagram(String s, String t){
// 		HashMap<Character, Integer> map = new  HashMap<>();
// 		if(s.length() !=t.length()){
// 			return false;
// 		}
// 		for(int i = 0 ; i < s.length() ; i++ ){
// 			char ch = s.charAt(i);
// 			map.put(ch,map.getOrDefault(ch, 0) + 1);
// 		}
// 		for(int i = 0 ; i < t.length() ; i++ ){
// 			char ch = t.charAt(i);
// 			if(map.containsKey(ch)){
// 				if(map.get(ch) == 1){
// 					map.remove(ch);
// 				}else{
// 					map.put(ch,map.get(ch) - 1 );
// 				}
// 			}else{
// 				return false;
// 			}
// 		}
// 		return true;
// 	}

// 	public static void main(String args[]){
// 		String s = "racee";
// 		String t = "caere";
// 		System.out.println(isAnagram(s,t));
// 	}
// }




// HashSet

// public class JavaBasics{
// 	public static void main(String args[]){
// 		// HashSet<Integer> set= new HashSet<>();
// 		// LinkedHashSet<Integer> set= new LinkedHashSet<>();
// 		TreeSet<Integer> set= new TreeSet<>();
// // 		// add
// 		set.add(1);
// 		set.add(5);
// 		set.add(9);
// 		set.add(4);
// 		set.add(3);
// 		set.add(2);
// 		set.add(8);
// 		set.add(55);
// 		set.add(33);
// 		set.add(11);
// // 		// print
// 		System.out.print(set);
// 		System.out.println();
// // 		// contains
// 		System.out.print(set.contains(1));
// 		System.out.println();
// // 		// remove
// 		set.remove(3);
// 		System.out.print(set.contains(3));
// 		System.out.println();
// 		System.out.print(set);
// 		System.out.println();
// // 		// size
// 		System.out.print(set.size());
// 		System.out.println();
// // 		// is empty
// 		System.out.print(set.isEmpty());
// // 		//clear
// 		set.clear();
// 		System.out.println();
// 		System.out.print(set.size());
// 		System.out.println();
// 		System.out.print(set.isEmpty());
// 	}
// }



// Iteration in HashSet

// public class JavaBasics{
// 	public static void main(String args[]){
// 		HashSet<String> set= new HashSet<>();
// // 		// LinkedHashSet<Integer> set= new LinkedHashSet<>();
// // 		// TreeSet<Integer> set= new TreeSet<>();

// 		set.add("Delhi");
// 		set.add("Mumbai");
// 		set.add("Navsaro");
// 		set.add("gurgao");
// 		set.add("rajesthan");
// 		set.add("Ahemdavad");
// 		// iterate // method 1
// 		// Iterator it = set.iterator(); 
// 		// while(it.hasNext()){
// 		// 	System.out.println(it.next());
// 		// }
// 		for(String city : set){
// 			System.out.print(city + " ");
// 		}
// 	}
// }




// Question  Count unique number


// public class JavaBasics{
// 	public static void main(String args[]){
// 		int nums[] = {4,3,2,5,6,7,3,4,2,1};
// 		HashSet<Integer> set = new HashSet<>();
// 		for(int i = 0 ; i < nums.length ; i++ ){
// 			set.add(nums[i]);
// 		}
// 		System.out.print(" Total Unique numbers : " + set.size() + "  " + set );
// 	}
// }





// Union and Intersection of 2 array

// 	public class JavaBasics{
// 	public static void main(String args[]){

// 		int arr1[] = {7,3,9};
// 		int arr2[] = {6,3,2,9,4};

// 		HashSet<Integer> set = new HashSet<>();

// 		for(int i = 0 ; i < arr1.length ; i++ ){
// 			set.add(arr1[i]);
// 		}
// 		for(int i = 0 ; i < arr2.length ; i++ ){
// 			set.add(arr2[i]);
// 		}
// 		System.out.println();
// 		System.out.print("Union is : " + set + "  "+  "Size: " +  set.size());
// 		System.out.println();
// 		set.clear();
// 		for(int i = 0 ; i < arr1.length ; i++ ){
// 			set.add(arr1[i]);
// 		}
// 		int count = 0 ; 
// 		for(int i = 0 ; i < arr2.length ; i++ ){
// 			if(set.contains(arr2[i])){
// 				count ++;
// 				System.out.print(arr2[i] +" ");
// 				set.remove(arr2[i]);
// 			}
// 		}
// 		System.out.println();
// 		System.out.print("Intersection Size: " +  count);
// 	}
// }






// Itinery from tickets


// public class JavaBasics{

// 	public static String getStart(HashMap<String, String> tickets ){
// 		HashMap<String, String> revMap = new HashMap<>();
// 		for (String key : tickets.keySet()){
// 			revMap.put(tickets.get(key) , key);
// 		}
// 		for (String key : tickets.keySet()){
// 			if(!revMap.containsKey(key)){
// 				return key;
// 			}
// 		}
// 		return null;
// 	}

// 	public static void main(String args[]){
// 		HashMap<String, String> tickets = new HashMap<>();
// 		tickets.put("Chennai", "Benglore");
// 		tickets.put("Mumbai", "Delhi");
// 		tickets.put("Goa", "Chennai");
// 		tickets.put("Delhi", "Goa");

// 		String start = getStart(tickets);
// 		System.out.print(start);
// 		for(String key : tickets.keySet()){
// 			System.out.print( "->" + tickets.get(start));
// 			start = tickets.get(start);
// 		}
// 		System.out.println();
// 	}
// }





// Largest sum of the subarray
// maskabun question good logic


// public class JavaBasics{
// 	public static void main(String args[]){
// 		int arr[] = {15,-2,2,-8,1,7,10,23};
// 		HashMap<Integer, Integer> map = new HashMap<>();
// 		// sum and indx
// 		int sum = 0; 
// 		int len = 0;
// 		for(int j = 0; j<arr.length ; j++){
// 			sum += arr[j];
// 			if(map.containsKey(sum)){
// 				len = Math.max(len, j - map.get(sum));
// 			}else{
// 				map.put(sum,j);
// 			}
// 		}
// 		System.out.print( "Largest length of subarray: " + len);
// 	}
// }



// Subarray sum Equals to k  //0(n)
// // hard

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int arr[] = {10,2,-2,-20,10};
// 		int k = -10;

// 		HashMap<Integer, Integer> map = new HashMap<>();
// 		map.put(0,1);
// 		int sum = 0;
// 		int ans = 0;
// 		for(int j = 0; j <arr.length; j++){
// 			sum += arr[j];
// 			if(map.containsKey(sum-k)){
// 				ans += map.get(sum-k);
// 			}
// 			map.put(sum, map.getOrDefault(sum,0)+1);
// 		}
// 		System.out.print(ans);
// 	}
// }




// Q1 bottom view of binary tree





// Notes


// Hashing
//              ____________
// Input  --->  | Blackbox |  ---> output
//               ----------


// 						       -----> HashMap 
// 							  |
// 				----->map --->|-----> LinkedHashMap
// 				|		      |
// 				|	     	  -----> TreeMap
// Hashing	----->  
// 				|	           -----> HashSet
// 				|		       |
// 				-----> Set --->|-----> LinkedHashSet
// 							   |
// 							   -----> TreeSet



// Map :


// 			-----> HashMap   Structure ->    (Key, value)     |->   Time Complexity 0(1) for insert remove peek
// 		   |												  |
// map --->|-----> LinkedHashMap Structure ->   (Key, value)  |___>  Unique Value only    Time Complexity 0(1)
// 		   |												  |
//          -----> TreeMap	 Structure ->    (Key, value)     | -> Time Complexity 0(logn)



// 			         -----> HashSet
// 				    |
// 			Set --->|-----> LinkedHashSet
// 					|
// 				     -----> TreeSet

