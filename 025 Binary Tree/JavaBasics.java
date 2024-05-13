import java.util.*;

// //pre order sequence given

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

// 	// build binary tree with pre order

// 	static class BinaryTree{
// 		static int idx = -1;
// 		public static Node buildTree(int nodes[]){
// 			idx++;
// 			if(nodes[idx] == -1){
// 				return null;
// 			}

// 			Node newNode = new Node(nodes[idx]);
// 			newNode.left = buildTree(nodes);
// 			newNode.right = buildTree(nodes);

// 			return newNode;
// 		}

// 		// tree travesals 0(n) DFS deapth first search

// 		// 1. preorder travesals

// 		public static void preOrder(Node root){
// 			if(root == null){
// 				return;
// 			}
// 			System.out.print(root.data + " ");
// 			preOrder(root.left);
// 			preOrder(root.right);
// 		}

// 		// 2. inorder travesals

// 		public static void inOrder(Node root){
// 			if(root == null){
// 				return;
// 			}
// 			inOrder(root.left);
// 			System.out.print(root.data + " ");
// 			inOrder(root.right);
// 		}

// 		// 3. postorder travesals 0(n))

// 		public static void postOrder(Node root){
// 			if(root == null){
// 				return;
// 			}
// 			postOrder(root.left);
// 			postOrder(root.right);
// 			System.out.print(root.data + " ");
// 		}

// 		// 4.level of order travesals  0(n))   BFS breath first search

		public static void levelOrder(Node root){
			if(root == null){
				return;
			}

			Queue<Node> q = new LinkedList<>();
			q.add(root); 
			q.add(null); 

			while(! q.isEmpty()){
				Node currNode = q.remove();
				if(currNode == null){
					System.out.println();
					if(q.isEmpty()){
						break;
					}else{
						q.add(null);
					}
				}else{
					System.out.print(currNode.data + " ");
					if(currNode.left != null){
						q.add(currNode.left);
					}
					if(currNode.right != null){
						q.add(currNode.right);
					}
				}
			}
		}


// 		// Height of tree  = root to leaf maximum distance
// 		public static int heightOftree(Node root){
// 			if(root == null){
// 				return 0; 
// 			}

// 			int lH = heightOftree(root.left);
// 			int rH = heightOftree(root.right);
// 			return Math.max(lH,rH) + 1;
// 		}
// 	}

// 	public static void main(String args[]){
// 		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

// 		BinaryTree tree = new BinaryTree();

// 		Node root = tree.buildTree(nodes);
// 		System.out.println("Root : " + root.data);
// 		System.out.println("preOrder: ");
// 		tree.preOrder(root);
// 		System.out.println();
// 		System.out.println("inOrder: ");
// 		tree.inOrder(root);
// 		System.out.println();
// 		System.out.println("postOrder: ");
// 		tree.postOrder(root);
// 		System.out.println("levelOrder: ");
// 		tree.levelOrder(root);
// 		System.out.println("Height: ");
// 		System.out.println(tree.heightOftree(root));
// 	}
// }










// new node new tree

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

// 	public static int height(Node root){
// 		if(root == null){
// 			return 0;
// 		}

// 		int lH = height(root.left);
// 		int rH = height(root.right);	

// 		return Math.max(lH,rH)+1;
// 	}

// 	public static int countNodes(Node root){
// 		if(root == null){
// 			return 0;
// 		}

// 		int lCount = countNodes(root.left);
// 		int rCount = countNodes(root.right);

// 		return lCount + rCount + 1;
// 	}

// 	public static int sumNodes(Node root){
// 		if(root == null){
// 			return 0;
// 		}

// 		int lSum = sumNodes(root.left);
// 		int rSum = sumNodes(root.right);

// 		return lSum + rSum + root.data;
// 	}

// 	// Brute force approach for diameter  0(n 2)
// 	public static int diameter(Node root){
// 		if(root == null){
// 			return 0;
// 		}

// 		int lDia = diameter(root.left);
// 		int lH = height(root.left);
// 		int rDia = diameter(root.right);
// 		int rH = height(root.right);

// 		int selfDia = lH + rH + 1;

// 		return Math.max(selfDia,Math.max(lDia,rDia));
// 	}



// 	// better approach by creating Info class  0(n)

	// static class Info{
	// 	int dia;
	// 	int ht;

	// 	Info(int dia, int ht){
	// 		this.dia = dia;
	// 		this.ht = ht;
	// 	}
	// }

	// public static Info dia(Node root){
	// 	if(root == null){
	// 		return new Info(0,0);
	// 	}

	// 	Info lInfo = dia(root.left);
	// 	Info rInfo = dia(root.right);

	// 	int dia = Math.max(Math.max(lInfo.dia , rInfo.dia), lInfo.ht + rInfo.ht + 1);
	// 	int ht = Math.max(lInfo.ht , rInfo.ht) + 1;

	// 	return new Info(dia, ht);
	// }

// 	public static void main(String args[]){
// 		// new tree

// 		/* 
// 				 1
// 			   /   \ 
// 			  2     3
// 			 / \   /  \
// 			4   5 6    7
// 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);
// 		System.out.println("Height: "+ height(root));
// 		System.out.println("Node count: "+ countNodes(root));
// 		System.out.println("Node sum: "+ sumNodes(root));
// 		System.out.println("Max Dia: "+ diameter(root));	
// 		System.out.println("Max Dia: "+ dia(root).dia);
// 	}
// }







// Subtree Question


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

// 	public static boolean isIndentical(Node node, Node subRoot){
// 		if(node == null && subRoot==null){
// 			return true;
// 		}else if (node == null || subRoot == null || node.data != subRoot.data){
// 			return false;
// 		}

// 		if(! isIndentical(node.left,subRoot.left)){
// 			return false;
// 		}

// 		if(! isIndentical(node.right,subRoot.right)){
// 			return false;
// 		}

// 		return true;
// 	}

// 	public static boolean isSubtree(Node root, Node subRoot){
// 		if(root == null){
// 			return false;
// 		}
// 		if(root.data == subRoot.data){
// 			if(isIndentical(root,subRoot)){
// 				return true;
// 			}
// 		}

// 		boolean leftAns = isSubtree(root.left, subRoot);
// 		boolean rightAns = isSubtree(root.right, subRoot);

// 		return leftAns || rightAns;
// 	}

// 	public static void main(String args[]){
// 		// new tree

// 		/* 
// 				 1
// 			   /   \ 
// 			  2     3
// 			 / \   /  \
// 			4   5 6    7
// 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		/* 
// 			  2 
// 			 / \  
// 			4   5 
// 		*/
// 		Node subRoot = new Node(2);
// 		subRoot.left = new Node(4);
// 		subRoot.right = new Node(5);
	
// 		System.out.print(isSubtree(root, subRoot));
		

// 	}
// }




// Top View



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

// 	static class Info{
// 		Node node;
// 		int hd;
// 		public Info(Node node, int hd){
// 			this.node = node;
// 			this.hd = hd;
// 		}
// 	}
// 	public static void topView(Node root){

// 		// level order
// 		Queue<Info> q = new LinkedList<>();
// 		HashMap<Integer, Node> map = new HashMap<>();

// 		int min = 0 , max = 0 ;
// 		q.add(new Info(root,0));
// 		q.add(null);

// 		while( ! q.isEmpty()){
// 			Info curr = q.remove();
// 			if(curr == null){
// 				if(q.isEmpty()){
// 					break;
// 				}else{
// 					q.add(null);
// 				}
// 			}else{
// 				if(!map.containsKey(curr.hd)){ // first time hd came
// 					map.put(curr.hd, curr.node);
// 				}	

// 				if(curr.node.left != null){
// 					q.add(new Info(curr.node.left, curr.hd-1));
// 					min = Math.min(min, curr.hd-1);
// 				}

// 				if(curr.node.right != null){
// 					q.add(new Info(curr.node.right, curr.hd+1));
// 					max = Math.max(max, curr.hd+1);
// 				}
// 			}
// 		}

// 		for(int i = min ; i<= max; i++){
// 			System.out.print(map.get(i).data + " ");
// 		}
// 		System.out.println();
// 	}

// 	public static void main(String args[]){
// // 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		topView(root);	
// 	}
// }




// k level of tree print


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

// 	public static void kthLevel(Node root, int level ,int k){
// 		if(root == null){
// 			return;
// 		}

// 		if(level == k){
// 			System.out.print(root.data + " ");
// 			return;
// 		}

// 		kthLevel(root.left,level+1,k);
// 		kthLevel(root.right,level+1,k);
		
// 	}

// 	public static void main(String args[]){
// 		// 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		kthLevel(root, 1, 2 );
// 	}
// }






// Lowest common ancenstor approach 1



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

// 	public static boolean getPath(Node root, int n, ArrayList<Node> path ){
// 		if(root == null){
// 			return false;
// 		}
// 		path.add(root);

// 		if(root.data == n){
// 			return true;
// 		}

// 		boolean foundLeft = getPath(root.left, n , path);
// 		boolean foundRight = getPath(root.right, n , path);

// 		if(foundLeft || foundRight){
// 			return true;
// 		}

// 		path.remove(path.size() -1);

// 		return false;
// 	}


// 	public static Node lca(Node root, int n1, int n2){
// 		ArrayList<Node> path1 = new ArrayList<>();
// 		ArrayList<Node> path2 = new ArrayList<>();

// 		getPath(root, n1, path1);
// 		getPath(root, n2, path2);

// 		//last common ancest0r
// 		int i = 0;
// 		for(; i <path1.size() && i<path2.size(); i++){
// 			if(path1.get(i) != path2.get(i)){
// 				break;
// 			}
// 		}

// 		// last equal node
// 		Node lca = path1.get(i-1);

// 		return lca;

// 	}


// 	public static void main(String args[]){
// 		// 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/
// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		System.out.println(lca(root, 4 ,5).data);
	
// 	}	
// }




// Lowest common ancenstor approach 2 // imp


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



// 	public static Node lca2(Node root, int n1, int n2){
// 		if(root == null || root.data == n1 || root.data == n2){
// 			return root;
// 		}
// 		Node leftLca = lca2(root.left, n1,n2);
// 		Node rightLca = lca2(root.right, n1,n2);
// 		// left LCA valid
// 		if(rightLca == null){
// 			return leftLca;
// 		}
// 		// right LCA valid
// 		if(leftLca == null){
// 			return rightLca;
// 		}
// 		return root;
// 	}


// 	public static void main(String args[]){
// 		// 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/
// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);
// 		System.out.println(lca2(root, 4 ,7).data);
// 	}	
// }




// Minimum possible distance

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

// 	public static Node lca(Node root, int n1, int n2){
// 		if(root == null || root.data == n1 || root.data == n2 ){
// 			return root;
// 		}	

// 		Node leftLca = lca(root.left , n1, n2);
// 		Node rightLca = lca(root.right , n1, n2);

// 		if(leftLca == null){
// 			return rightLca;
// 		}
// 		if(rightLca == null){
// 			return leftLca;
// 		}

// 		return root;
// 	}

// 	public static int lcaDistance(Node root, int n){
// 		if(root == null){
// 			return -1;
// 		}

// 		if(root.data == n){
// 			return 0;
// 		}

// 		int leftdis = lcaDistance(root.left,n);
// 		int rightdis = lcaDistance(root.right,n);

// 		if(leftdis == -1 && rightdis == -1){
// 			return -1;
// 		} else if(leftdis == -1){
// 			return rightdis+1;
// 		}else{
// 			return leftdis+1;
// 		}

// 	}

// 	public static int minDistanceofNode(Node root, int n1, int n2){

// 		Node lcance = lca(root,n1,n2);

// 		int dist1 = lcaDistance(lcance, n1);
// 		int dist2 = lcaDistance(lcance, n2);

// 		return dist1 + dist2;
// 	}

// 	public static void main(String args[]){
// 		// 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/
// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);
// 		// System.out.println(lca(root, 4 ,5).data);
// 		System.out.println(minDistanceofNode(root, 4 ,7));
		
// 	}	
// }







// kth ancestor

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

// 	public static int kAncestor(Node root ,  int n , int k){
// 		if(root == null){
// 			return -1;
// 		}
// 		if(root.data == n){
// 			return 0;
// 		}

// 		int leftdis = kAncestor(root.left, n , k);
// 		int rightdis = kAncestor(root.right, n , k);

// 		if(leftdis == -1 && rightdis == -1){
// 			return -1;
// 		}

// 		int max = Math.max(leftdis,rightdis); 
// 		if(max+1 == k){
// 			System.out.println(root.data);
// 		}

// 		return max+1;
// 	}

// 	public static void main(String args[]){
// 		// 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/
// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);
// 		// System.out.println(lca(root, 4 ,5).data);
// 		// System.out.println(minDistanceofNode(root, 4 ,7));
// 		kAncestor(root, 4 ,1);
		
// 	}	
// }





// // transform of tree

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

// 	public static int transformOftree(Node root){

// 		if(root == null){
// 			return 0;
// 		}
// 		int leftSum = transformOftree(root.left);
// 		int rightSum = transformOftree(root.right);
// 		int data = root.data;
// 		int newLeft = root.left == null ? 0 : root.left.data; 
// 		int newRight = root.right == null ? 0 : root.right.data; 
// 		root.data = newLeft+ leftSum + newRight + rightSum;
// 		return data;
// 	}

// 	public static void inOrder(Node root){
// 		if(root == null){
// 			return;
// 		}

// 		inOrder(root.left);
// 		System.out.print(root.data+" ");
// 		inOrder(root.right);
// 	}

// 	public static void main(String args[]){
// 		// 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/
// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);


// 		transformOftree(root);
// 		inOrder(root);
// 	}		
// }




// Binary  Tree

// Heirachial data Structure


	// 	   1
	//    /  \
	//   2	   3
	//  / \  / \
	// 4  5 6   7


// tree travesals

// 1. preorder travesals

	// root 
	// left subtree
	// right subtree

// 2. inorder travesals

	// left subtree
	// root 
	// right subtree

// 3. postorder travesals

	// left subtree
	// right subtree
	// root 

// 4.level of order travesals

// LEVEL wise print




































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
	static class Info{
		Node root;
		int hd;
		Info(Node root, int hd){
			this.root = root;
			this.hd = hd;
		}
	}
	public static void topView(Node root){

		if(root == null){

		}

		Queue<Info> q = new LinkedList<>();
		HashMap<Integer, Node> map = new HashMap<>();

		int min = 0 , max = 0; 
		q.add(new Info(root, 0));
		q.add(null);

		while(!q.isEmpty()){
			Info currNode = q.remove();
			if(currNode == null){
				if(q.isEmpty()){
					break;
				}else{
					q.add(null);
				}
			}else{

				if(! map.containsKey(currNode.hd)){
					map.put(currNode.hd,currNode.root);
				}

				if(currNode.root.left != null){
					q.add(new Info(currNode.root.left, currNode.hd-1));
					min = Math.min(min,currNode.hd-1);
				}

				if(currNode.root.right != null){
					q.add(new Info(currNode.root.right, currNode.hd+1));
					max = Math.max(max,currNode.hd+1);
				}

			}
		}

		for(int i = min; i<=max; i++){
			System.out.print( map.get(i).data + " ");
		}	
		System.out.println();

	}

	public static Node lca(Node root, int n1, int n2 ){
		if(root == null || root.data == n1 || root.data == n2){
			return root;
		}
		Node leftLca = lca(root.left, n1,n2);
		Node rightLca = lca(root.right, n1,n2);
		if(leftLca == null){
			return rightLca;
		}
		if(rightLca == null){
			return leftLca;
		}
		return root;
	}

	public static int dis(Node root, int n){

		if(root == null){
			return -1;
		}

		if(root.data == n){
			return 0;
		}

		int left = dis(root.left , n); 
		int right = dis(root.right , n); 

		if(left == -1 && right == -1){
			return -1;
		}else if (left == -1 ) {
			return right+1;
		} else{
			return left+1;
		}

	}

	public static int totaldis(Node root, int n1, int n2 ){
		Node lanc = lca(root, n1, n2);

		int leftdis = dis(lanc,n1);
		int rightdis = dis(lanc,n2);

		return leftdis + rightdis;
	}


	public static void main(String args[]){
// 		/* 
// 				 1
// 			   /   \ 
// 			  2     3
// 			 / \   /  \
// 			4   5 6    7
// 		*/

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		topView(root);	


		System.out.println(lca(root, 4,7).data);
		System.out.println(totaldis(root, 4,5));
	}
}
