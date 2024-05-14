import java.util.*;

// //creation of trie

// public class JavaBasics{
// 	static class Node{
// 		Node children[] = new Node[26];
// 		boolean eow = false;
// 		Node(){
// 			for(int i = 0 ; i < 26 ; i++){
// 				children[i] = null;
// 			}
// 		}
// 	}

// static Node root = new Node();
// 	//insert

// 	public static void insert(String word){
// 		Node curr = root;
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				curr.children[idx] = new Node();
// 			}
// 			curr = curr.children[idx];
// 		}
// 		curr.eow = true;
// 	}

// 	// Search
// 	public static boolean search(String key){
// 		Node curr = root;
// 		for(int level = 0; level < key.length() ; level++){
// 			int idx = key.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				return false;
// 			}else{
// 				curr = curr.children[idx];
// 			}
// 		}
// 		return curr.eow == true;
// 	}

// 	public static void main(String args[]){
// 		String words[] = {"the" , "a" , "there", "their", "any" , "three"};

// 		for(int i = 0 ; i < words.length ; i++){
// 			insert(words[i]);
// 		}

// 		System.out.println(search("anys"));
// 	}
// }




// Question word break problem


// public class JavaBasics{

// 	static class Node {	
// 		Node children[] = new Node[26];
// 		boolean eow = false;
// 		public Node(){
// 			for(int i = 0 ; i < 26 ; i++){
// 				children[i] = null;
// 			}
// 		} 
// 	} 
// 	public static Node root = new Node();

// 	public static void insert(String word){
// 		Node curr = root;	
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				curr.children[idx] = new Node();
// 			}
// 			curr = curr.children[idx];
// 		}
// 		curr.eow = true;
// 	}

// 	public static boolean search(String word){
// 		Node curr = root;
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				return false;
// 			}
// 			curr = curr.children[idx];
			
// 		}
// 		return curr.eow == true;
// 	}

// 	public static boolean wordBreak(String key){
// 		// base case
// 		if(key.length() == 0){
// 			return true;
// 		}

// 		//kaam
// 		for(int i  = 1 ; i <= key.length() ; i++){
// 			if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
// 				return true;
// 			}
// 		}
// 		return false;
// 	}


// 	public static void main (String args[]){
// 		String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

// 		for(int i = 0 ; i < words.length ; i++){
// 			insert(words[i]);
// 		}

// 		String key = "ilikesam";

// 		System.out.print(wordBreak(key));
// 	}
// }


// Question (hard)

// prefix problem


// public class JavaBasics{
// 	static class Node{
// 		Node children[] = new Node[26];
// 		boolean eow = false;
// 		int freq;
// 		Node(){
// 			for(int i = 0 ; i < 26 ; i++){
// 				children[i] = null;
// 			}
// 			freq = 1;
// 		}
// 	}
// 	static Node root = new Node();
// 	//insert
// 	public static void insert(String word){
// 		Node curr = root;
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				curr.children[idx] = new Node();
// 			}else{
// 				curr.children[idx].freq++;
// 			}
// 			curr = curr.children[idx];
// 		}
// 		curr.eow = true;
// 	}

// 	public static void findPrefix(Node root, String ans){
// 		if(root == null){
// 			return;
// 		}

// 		if(root.freq == 1){
// 			System.out.print(ans + " ");
// 			return;
// 		}
// 		for(int i = 0 ; i < 26 ; i++){
// 			if(root.children[i] != null){
// 				findPrefix(root.children[i], ans+(char)(i+'a'));
// 			}
// 		}
// 	}

// 	public static void main(String args[]){
// 		String words[] = {"zebra" , "dog" , "duck", "dove"};

// 		for(int i = 0 ; i < words.length ; i++){
// 			insert(words[i]);
// 		}
// 		root.freq = -1;
// 		findPrefix(root,"");

// 	}
// }




// question 
// startsWith

// public class JavaBasics{
// 	static class Node{
// 		Node children[] = new Node[26];
// 		boolean eow = false;
// 		Node(){
// 			for(int i = 0 ; i < 26 ; i++){
// 				children[i] = null;
// 			}
// 		}
// 	}

// static Node root = new Node();
// 	//insert

// 	public static void insert(String word){
// 		Node curr = root;
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				curr.children[idx] = new Node();
// 			}
// 			curr = curr.children[idx];
// 		}
// 		curr.eow = true;
// 	}

// 	// 
// 	public static boolean startsWith(String prefix){
// 		Node curr = root;
// 		for(int level = 0; level < prefix.length() ; level++){
// 			int idx = prefix.charAt(level) - 'a';
// 			if(curr.children[idx] == null){
// 				return false;
// 			}else{
// 				curr = curr.children[idx];
// 			}
// 		}
// 		return true;
// 	}

// 	public static void main(String args[]){
// 		String words[] = {"the" , "a" , "there", "their", "any" , "three"};

// 		for(int i = 0 ; i < words.length ; i++){
// 			insert(words[i]);
// 		}

// 		System.out.println(startsWith("moon"));
// 	}
// }







// unique substring

// public class JavaBasics{
// 	static class Node{
// 		Node children[] = new Node[26];
// 		boolean eow = false;
// 		public Node (){
// 			for(int i = 0 ; i < 26 ; i++  ){
// 				children[i] = null;
// 			}
// 		}
// 	}
// 	public static Node root = new Node();

// 	//insert
// 	public static void insert(String word){
// 		Node curr = root;
// 		for(int i = 0 ; i < word.length() ; i++){
// 			int idx = word.charAt(i) - 'a';
// 			if(curr.children[idx] == null){
// 				curr.children[idx] = new Node();
// 			}
// 			curr = curr.children[idx];			
// 		}
// 		curr.eow = true;
// 	}
	
// 	// unique string

// 	public static int uniqueString(Node root){
// 		if(root == null){
// 			return 0;
// 		}
// 		int count = 0;
// 		for(int i = 0; i< 26 ; i++){
// 			if(root.children[i] != null){
// 				count += uniqueString(root.children[i]);
// 			}
// 		}
// 		return count + 1;
// 	}
// 	public static void main(String args[]){
// 		String s = "ababa";

// 		for(int i = 0 ; i < s.length() ; i++){
// 			String suffix = s.substring(i);
// 			insert(suffix);
// 		}
// 		System.out.print(uniqueString(root));		
// 	}
// }



// Longest word with  prefix


public class JavaBasics{
	static class Node{
		Node children[] = new Node[26];
		boolean eow = false;
		public Node (){
			for(int i = 0 ; i < 26 ; i++  ){
				children[i] = null;
			}
		}
	}
	public static Node root = new Node();

	//insert
	public static void insert(String word){
		Node curr = root;
		for(int i = 0 ; i < word.length() ; i++){
			int idx = word.charAt(i) - 'a';
			if(curr.children[idx] == null){
				curr.children[idx] = new Node();
			}
			curr = curr.children[idx];			
		}
		curr.eow = true;
	}
	
	public static String ans = "";

	// Longest prefix
	public static void longestPrefix(Node root, StringBuilder temp){
		if(root == null){
			return;
		}

		for(int i = 0; i < 26; i++ ){
			if(root.children[i] != null && root.children[i].eow == true){
				char ch = (char)(i+'a');
				temp.append(ch);
				if(temp.length() > ans.length()){
					ans = temp.toString();
				}
				longestPrefix(root.children[i] , temp);
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}	

	public static void main(String args[]){
		String words[] = {"a", "banana", "app", "appl","ap", "apply", "apple"};

		for(int i = 0 ; i < words.length ; i++){
			insert(words[i]);
		}

		
		longestPrefix(root,new StringBuilder(""));
		System.out.print(ans);


	}
}










// Notes

// Trie tree type data structure
// prefix tree
// retrieval tree

// k-ary tree  (simillar to bianry tree)
// 26 children

// 0(logn)











// practice


// import java.util.*;



// public class JavaBasics{

// 	static class Node{
// 		Node children[] = new Node[26];
// 		boolean eow = false;
// 		Node(){
// 			for(int i = 0 ; i < 26 ; i++ ){
// 				children[i] = null;
// 			}
// 		}
// 	}

// 	static Node root = new Node();

// 	// insert
// 	public static void insert(String word){
// 		Node curr = root;
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null ){
// 				curr.children[idx] = new Node();
// 			}
// 			curr = curr.children[idx];
// 		}
// 		curr.eow = true;

// 	}
// 	// search
// 	public static boolean search(String word){
// 		Node curr = root;
// 		for(int level = 0 ; level < word.length() ; level++){
// 			int idx = word.charAt(level) - 'a';
// 			if(curr.children[idx] == null ){
// 				return false;
// 			}else{
// 				curr = curr.children[idx];
// 			}
			
// 		}
// 		return curr.eow == true;
// 	}

// 	public static void main(String args[]){
// 		String words[] = {"answer", "anwer" , "tower", "town" ,"towetruck", "tow" ,"answered", "any"};

// 		for(int i = 0 ; i < words.length ; i++){
// 			insert(words[i]);
// 		}

// 		System.out.println(search("tower"));
// 		System.out.println(search("janawer"));

// 	}
// }










