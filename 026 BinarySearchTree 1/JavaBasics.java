import java.util.*;




// // build BST

// public class JavaBasics{

// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}


// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}

// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}

// 	public static void main(String args[]){
// 		int val[] = {5,1,3,4,2,7};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		inorder(root);
// 	}
// }





// Search in BST

// public class JavaBasics{

// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}


// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}

// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}

// 	public static boolean searchBST(Node root, int key ){
// 		if(root == null){
// 			return false;
// 		}
// 		if(key == root.data){
// 			return true;
// 		} else if(key < root.data){
// 			return searchBST(root.left, key);
// 		}else{
// 			return searchBST(root.right, key);
// 		}
// 	}
// 	public static void main(String args[]){
// 		int val[] = {5,1,3,4,2,7};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		// inorder(root);

// 		System.out.println(searchBST(root, 8));
// 	}
// }




// delete a node BST


// case 1 leaf node = delete node and return null to parent
// case 2  one child = delete Node & replace with child Node
// case 3 two child = replace value with inorder successor the delete the node for inorder successor
//  INORDER SUCCESSOR MEAN  left most Node innright s

// public class JavaBasics{

// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}
// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}


// 	public static Node delete(Node root, int val){
// 		if(root.data < val){
// 			root.right = delete(root.right, val);
// 		}else if(root.data > val){
// 			root.left = delete(root.left, val);
// 		}else{ // voila
// 		// case 1  leaf node
// 			if(root.left == null && root.right== null){
// 				return null;
// 			} 
// 		// case 2 single child
// 			if(root.left == null){
// 				return root.right;
// 			} else if(root.right == null){
// 				return root.left;
// 			}
// 		// case 3 double child
// 			Node IS = findInordersuccessor(root.right);
// 			root.data  = IS.data;
// 			root.right =  delete(root.right, IS.data);;
// 		}
// 		return root;
// 	}

// 	public static Node findInordersuccessor(Node root){
// 		while(root.left != null){
// 			root = root.left;
// 		}
// 		return root;
// 	}

// 	public static void main(String args[]){
// 		int val[] = {8,5,3,1,4,6,10,11,14};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		inorder(root);
// 		root = delete(root, 5);
// 		System.out.println();
// 		inorder(root);
// 	}
// }






// print in range

// public class JavaBasics{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}
// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}


// 	public static void printInrange(Node root, int k1, int k2){
// 		if(root == null){
// 			return;
// 		}
// 		if(root.data >= k1 && root.data <= k2 ){
// 			printInrange(root.left, k1, k2); 
// 			System.out.print( root.data + " ");
// 			printInrange(root.right, k1, k2); 
// 		} else if(root.data >= k2){
// 			printInrange(root.left, k1, k2); 
// 		}else{ // root.data < k2
// 			printInrange(root.right, k1, k2); 
// 		}
// 	}

// 	public static void main(String args[]){
// 		int val[] = {8,5,3,1,4,6,10,11,14};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		// inorder(root);
// 		printInrange(root, 10,15);
// 	}
// }







// Root to leaf path

// public class JavaBasics{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}
// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}

// 	public static void printPath(ArrayList<Integer> path){
// 		for(int i = 0 ; i < path.size(); i++ ){
// 			System.out.print(path.get(i) + " ");
// 		}
// 		System.out.println(  " null ");
// 	}

// 	public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
// 		if(root == null){
// 			return ;
// 		}

// 		path.add(root.data);
// 		if(root.left == null && root.right == null){
// 			printPath(path);
// 		}
// 		printRoot2Leaf(root.left,path);
// 		printRoot2Leaf(root.right,path);

// 		path.remove(path.size() - 1);
// 	}


// 	public static void main(String args[]){
// 		int val[] = {8,5,3,6,10,11,14};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		// inorder(root);
// 		printRoot2Leaf(root, new ArrayList<>());
// 	}
// }





// Valid BST 


// public class JavaBasics{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}
// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}

// 	public static boolean isValidBST(Node root, Node min, Node max){
// 		if(root == null){
// 			return true;
// 		}
// 		if(min != null && root.data <= min.data){
// 			return false;
// 		} else if(max != null && root.data >= max.data){
// 			return false;
// 		}
// 		return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
// 	} 

// 	public static void main(String args[]){
// 		int val[] = {8,5,3,6,10,11,14};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		// inorder(root);
// 		System.out.println(isValidBST(root, null, null));
// 	}
// }





// // mirror of BST tree

// public class JavaBasics{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}
// 	public static Node buildBST(Node root, int val){
// 		if(root == null){
// 			root = new Node(val);
// 			return root;
// 		}
// 		if(root.data > val){
// 			root.left = buildBST(root.left,val);
// 		} else{
// 			root.right = buildBST(root.right,val);
// 		}
// 		return root;
// 	}
// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print( root.data +" ");
// 		inorder(root.right);
// 	}

// 	public static Node mirror(Node root){
// 		if(root == null){
// 			return null;
// 		}
// 		Node left = mirror(root.left);
// 		Node right = mirror(root.right);
// 		root.left = right;
// 		root.right = left;
// 		return root;
// 	}

// 	public static void main(String args[]){
// 		int val[] = {8,5,3,6,10,11,14};
// 		Node root = null;
// 		for( int i = 0; i < val.length ; i++ ){
// 			root = buildBST(root, val[i]);
// 		}
// 		mirror(root);
// 		inorder(root);
// 	}
// }
















// Binary search tree 

//     s
//    / \
//   B	 T

// a. left subtree nodes < root
// b. right subtree nodes > root
// c. left subtree & right subtree are also BST with no duplicates


	// example

	// 	     4
	// 	   /   \
	// 	  2     5
	// 	 / \     \
	// 	1   3     6

	// in order
	// 1 2 3 4 5 6

	// inorder traversal will give always sorted sequence


// BST Search 

// to seach key (Simillar to bianry search)
// time complexity

// 0(Height) -> not 0(n)


// Strategy
// recursion subproblems













public class JavaBasics{

	static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node buildBst(Node root, int val){
		if(root == null){
			root = new Node(val);
			return root;
		}
		if(root.data > val){
			root.left =  buildBst(root.left,val);
		}else{
			root.right =  buildBst(root.right,val);
		}
		return root;
	}

	public static void inorder(Node root){
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}	

	public static boolean search(Node root, int key){
		if(root == null){
			return false;
		}

		if(root.data == key){
			return true;
		} else if(root.data > key){
	 		return search(root.left,key);
		}else{
			return search(root.right,key);
		}
	}

	public static Node delete(Node root, int key){
		if(key > root.data){
			root.right = delete(root.right, key);
		}else if(key < root.data){
			root.left = delete(root.left, key);
		}else{
			// case 1
			if(root.left == null && root.right == null){
				return null;
			}	
			// case 2
			if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}
			// case 3 // inorder 

			Node iS = inordersuccessor(root.right);
			root.data = iS.data;
			root.right = delete(root.right, iS.data); 
		}
		return root;
	}
	public static Node inordersuccessor(Node root){
		while(root.left != null){
			root = root.left;	
		}
		return root;
	}


	public static void main(String args[]){
		int val[] = {5,1,3,4,2,7};
		Node root = null;

		for(int i = 0 ; i < val.length; i++){
			root = buildBst(root,val[i]);
		}

		inorder(root);

		System.out.print(search(root, 8));
		System.out.println();
		root = delete(root, 7);
		inorder(root);
	}
}