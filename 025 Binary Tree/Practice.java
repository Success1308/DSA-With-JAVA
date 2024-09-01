import java.util.*;


// public class Practice{

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
	
// 	static class BinaryTree{
// 		static int idx = -1;
// 		public static Node BinaryTree(int nodes[]){
// 			idx++;
// 			if(nodes[idx] == -1){
// 				return null;
// 			}

// 			Node newNode = new Node(nodes[idx]);

// 			newNode.left = BinaryTree(nodes);
// 			newNode.right = BinaryTree(nodes);

// 			return newNode;
// 		}

// 		public static void preOrder(Node root){
// 			if(root == null){
// 				return;
// 			}

// 			System.out.print(root.data + " ");
// 			preOrder(root.left);
// 			preOrder(root.right);

// 		}

// 		public static void inOrder(Node root){
// 			if(root == null){
// 				return;
// 			}

// 			inOrder(root.left);
// 			System.out.print(root.data + " ");
// 			inOrder(root.right);

// 		}


// 		public static void postOrder(Node root){
// 			if(root == null){
// 				return;
// 			}

// 			postOrder(root.left);
// 			postOrder(root.right);
// 			System.out.print(root.data + " ");
// 		}

// 		public static void levelOrder(Node root){
// 			if(root == null){
// 				return;
// 			}

// 			Queue<Node> q = new LinkedList<>();
// 			q.add(root);
// 			q.add(null);

// 			while(! q.isEmpty()){
// 				Node currNode = q.remove();
// 				if(currNode == null){
// 					System.out.println();
// 					if(q.isEmpty()){
// 						break;
// 					}else{
// 						q.add(null);
// 					}
// 				} else{
// 					System.out.print(currNode.data + " ");

// 					if(currNode.left != null){
// 						q.add(currNode.left);
// 					}
// 					if(currNode.right != null){
// 						q.add(currNode.right);
// 					}
// 				}
// 			} 
// 		}


// 		public static int height(Node root){
// 			if(root == null){
// 				return 0;
// 			}

// 			int lH = height(root.left);
// 			int rH = height(root.right);
			
// 			return Math.max(lH,rH) + 1;
// 		}
// 	}

// 	public static void main(String args[]){
// 		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

// 		BinaryTree tree = new BinaryTree();
// 		Node root = tree.BinaryTree(nodes);

// 		System.out.print("Root : " + root.data);

// 		System.out.println();
// 		tree.preOrder(root);
// 		System.out.println();
// 		tree.inOrder(root);
// 		System.out.println();
// 		tree.postOrder(root);
// 		System.out.println();
// 		tree.levelOrder(root);
// 		System.out.println();
// 		System.out.print("Height:"+tree.height(root));
		
// 	}
// }

		





// 	// better appraoch for diamweter 0(n)

// public class Practice{
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
// 		int dia;
// 		int ht;
// 		Info(int dia, int ht){
// 			this.dia = dia;
// 			this.ht = ht;
// 		}
// 	}

// 	public static Info dia(Node root){
// 		if(root == null){
// 		return new Info(0,0);
// 		}

// 		Info lInfo =  dia(root.left);
// 		Info rInfo =  dia(root.right);

// 		int dia = Math.max(Math.max(lInfo.dia, rInfo.dia) , lInfo.ht + rInfo.ht + 1);
// 		int ht = Math.max(lInfo.ht , rInfo.ht) + 1;

// 		return new Info(dia,ht);
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

		
// 		System.out.println("Max Dia: "+ dia(root).dia);

// 	}
// }








/// Sub root identical

// public class Practice {
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

// 	public static boolean isIndentical(Node node , Node subRoot){

// 		if(node == null && subRoot == null){
// 			return true;
// 		} else if(node == null || subRoot == null || node.data != subRoot.data	){
// 			return false;
// 		}
// 		if(!isIndentical(node.left , subRoot.left)){
// 			return false;
// 		}
// 		if(!isIndentical(node.right , subRoot.right)){
// 			return false;
// 		}
// 		return true;
// 	}

	
// 	public static boolean isSubtree( Node root , Node subRoot){
// 		if(root == null){
// 			return false;
// 		}

// 		if(root.data == subRoot.data){
// 			if(isIndentical(root,subRoot)){
// 				return true;
// 			}	
// 		}

// 		boolean lAns =  isSubtree(root.left, subRoot);
// 		boolean rAns =  isSubtree(root.right, subRoot);

// 		return lAns || rAns;
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
// 		public Info (Node root, int hd){
// 			this.node = root;
// 			this.hd = hd;
// 		}
// 	}

// 	public static void topView(Node root){
		
// 		Queue<Info> q = new LinkedList<>();
// 		HashMap<Integer, Node> map = new HashMap<>();
// 		int min = 0, max = 0;
// 		q.add(new Info(root,0));
// 		q.add(null);

// 		while( !q.isEmpty()){
// 			Info curr = q.remove();

// 			if(curr == null){
// 				if(q.isEmpty()){
// 					break;
// 				}else{
// 					q.add(null);
// 				}
// 			}else{
// 				if(! map.containsKey(curr.hd)){
// 					map.put(curr.hd, curr.node);
// 				}

// 				if(curr.node.left != null){
// 					q.add(new Info(curr.node.left,curr.hd-1));
// 					min = Math.min(curr.hd-1,min);
// 				}

// 				if(curr.node.right != null){
// 					q.add(new Info(curr.node.right,curr.hd+1));
// 					max = Math.max(curr.hd+1,max);
// 				}
// 			}
// 		}

// 		for(int i = min; i<=max ; i++){
// 			System.out.print( map.get(i).data + " " );
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







// public class Practice{
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
	
// 	static class BinaryTree{
// 		static int idx = -1;
// 		public static Node buildTree(int node[]){
// 			idx++;
// 			if(node[idx] == -1){
// 				return null;
// 			}

// 			Node newNode = new Node(node[idx]);
// 			newNode.left = buildTree(node);
// 			newNode.right = buildTree(node);
// 			return newNode;
// 		}

// 		public static void preOrder(Node root){
// 			if(root == null){
// 				return;
// 			}	

// 			System.out.print(root.data + " ");
// 			preOrder(root.left);
// 			preOrder(root.right);
// 		}

// 		public static void inOrder(Node root){
// 			if(root == null){
// 				return;
// 			}	

// 			inOrder(root.left);
// 			System.out.print(root.data + " ");
// 			inOrder(root.right);
// 		}

// 		public static void postOrder(Node root){
// 			if(root == null){
// 				return;
// 			}	

// 			postOrder(root.left);
// 			postOrder(root.right);
// 			System.out.print(root.data + " ");
// 		}

// 	}

// 	public static void main(String args[]){
// 		int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

// 		BinaryTree tree = new BinaryTree();

// 		Node root = tree.buildTree(node);
// 		System.out.print(root.data);
// 		System.out.println();
// 		tree.preOrder(root);	
// 		System.out.println();
// 		tree.inOrder(root);
// 		System.out.println();
// 		tree.postOrder(root);
// 	}
// }



// public class Practice{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			Node left = null;
// 			Node right = null;
// 		}
// 	}

// 	public static void levelOrder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		Queue<Node> q = new LinkedList<>();
// 		q.add(root);
// 		q.add(null);

// 		while(! q.isEmpty()){
// 			Node currNode = q.remove();
// 			if(currNode == null){
// 				System.out.println();
// 				if(q.isEmpty()){
// 					break;
// 				}else{
// 					q.add(null);
// 				}
// 			}else{
// 				System.out.print(currNode.data + " ");
// 				if(currNode.left != null){
// 					q.add(currNode.left);
// 				}

// 				if(currNode.right != null){
// 					q.add(currNode.right);
// 				}
// 			}
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


// 	public static int nodeCount(Node root){
// 		if(root == null){
// 			return 0;
// 		}

// 		int lC = nodeCount(root.left);
// 		int rC = nodeCount(root.right);

// 		return lC+rC+1;
// 	}

// 	public static int sumCount(Node root){
// 		if(root == null){
// 			return 0;
// 		}

// 		int lC = sumCount(root.left);
// 		int rC = sumCount(root.right);

// 		return lC+rC+root.data;
// 	}

// 	static class Info{
// 		int dia;
// 		int ht;
// 		Info(int dia, int ht){
// 			this.dia = dia;
// 			this.ht = ht;
// 		}
// 	}

// 	public static Info diameter(Node root){
// 		if(root == null){
// 			return new Info(0,0);
// 		}

// 		Info lInfo = diameter(root.left);
// 		Info rInfo = diameter(root.right);

// 		int dia = Math.max(Math.max(lInfo.dia, rInfo.dia), lInfo.ht +  rInfo.ht + 1);
// 		int ht = Math.max(lInfo.ht, lInfo.ht) + 1;

// 		return new Info(dia, ht);
// 	}



// 	public static boolean isIndentical(Node node, Node subRoot){
// 		if(node == null && subRoot == null ){
// 			return true;
// 		}else if(node == null || subRoot == null || node.data != subRoot.data){	
// 			return false;
// 		}
// 		if(!isIndentical(node.left, subRoot.left)){
// 			return false;
// 		}
// 		if(!isIndentical(node.right, subRoot.right)){
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

// 		Boolean lAns = isSubtree(root.left, subRoot);
// 		Boolean rAns = isSubtree(root.right, subRoot);

// 		return lAns || rAns;
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

// // 		/* 		
// // 			  2  
// // 			 / \   
// // 			4   5 
// // 		*/

// 		Node subRoot = new Node(2);
// 		subRoot.left = new Node(4);
// 		subRoot.right = new Node(5);


// 		levelOrder(root);

// 		System.out.println("Height: " + height(root));
// 		System.out.println("node Count: " + nodeCount(root));
// 		System.out.println("node sum: " + sumCount(root));
// 		System.out.println("Dia: " + diameter(root).dia);

// 		System.out.println("subtree? : " + isSubtree(root, subRoot));
		
// 	}
// }



// public class Practice{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = left;
// 			this.right = right;
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
// 		if(root == null){
// 			return;
// 		}

// 		int min = 0 , max = 0;
// 		Queue<Info> q = new LinkedList<>();
// 		HashMap<Integer	, Node> map = new HashMap<>();

// 		q.add(new Info(root, 0));
// 		q.add(null);

// 		while ( ! q.isEmpty()) {
// 			Info curr = q.remove();
// 			if (curr == null){
// 				if(q.isEmpty()){
// 					break;
// 				}else{	
// 					q.add(null);
// 				}	
// 			} else{
// 				if( ! map.containsKey(curr.hd)){
// 					map.put(curr.hd , curr.node);
// 				}

// 				if(curr.node.left != null ){
// 					q.add(new Info( curr.node.left, curr.hd-1));
// 					min = Math.min(min, curr.hd-1);
// 				}
				
// 				if(curr.node.right != null ){
// 					q.add(new Info( curr.node.right ,curr.hd+1));
// 					max = Math.max(max, curr.hd+1);
// 				}
// 			}
// 		}

// 		for(int i = min; i <=max ; i++){
// 			System.out.print(map.get(i).data + " ");
// 		}
// 		System.out.println();

// 	}

// 	public static void main(String args[]){
// // // 		/* 
// // // 				 1
// // // 			   /   \ 
// // // 			  2     3
// // // 			 / \   /  \
// // // 			4   5 6    7
// // // 		*/

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







// Min distance between 2



// public class Practice{
// 	static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = left;
// 			this.right = right;
// 		}
// 	}

// 	public static Node lca(Node root, int n1, int n2){

// 		if(root == null || root.data == n1 || root.data == n2){
// 			return root;
// 		}

// 		Node leftLca = lca(root.left , n1, n2);
// 		Node rightLca = lca(root.right , n1, n2);

// 		if(rightLca == null){
// 			return leftLca;
// 		}

// 		if(leftLca == null){
// 			return rightLca;
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

// 		int leftdis = lcaDistance(root.left, n);
// 		int rightdis = lcaDistance(root.right, n);

// 		if(leftdis == -1 && rightdis == -1 ){
// 			return -1;
// 		}else if(leftdis == -1){
// 			return rightdis + 1 ;
// 		}else{
// 			return leftdis  + 1 ;
// 		}
// 	}

// 	public static int minDistanceofNode(Node root, int n1, int n2){

// 		Node lowestAnc = lca(root , n1, n2);

// 		int dist1 = lcaDistance(lowestAnc,n1);
// 		int dist2 = lcaDistance(lowestAnc,n2);

// 		return dist1 + dist2;
// 	}

// 	public static void main(String args[]){
// // // 		/* 
// // // 				 1
// // // 			   /   \ 
// // // 			  2     3
// // // 			 / \   /  \
// // // 			4   5 6    7
// // // 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		System.out.println(lca(root,4,6).data);
// 		System.out.println(minDistanceofNode(root,4,6));
		
// 	}
// }







// public class Practice{
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


// 	public static Node lca(Node root , int n1, int n2){
// 		if(root == null || root.data == n1 || root.data == n2){
// 			return root;
// 		}

// 		Node leftLca = lca(root.left, n1,n2);
// 		Node rightLca = lca(root.right, n1,n2);

// 		if(rightLca == null){
// 			return leftLca;
// 		}
// 		if(leftLca == null){
// 			return rightLca;
// 		}

// 		return root;
// 	}

// 	public static int lcaDistance(Node root , int n){
// 		if(root == null){
// 			return -1;
// 		}

// 		if(root.data == n){
// 			return 0;
// 		}

// 		int leftdis = lcaDistance(root.left, n);
// 		int rightdis = lcaDistance(root.right, n);

// 		if(leftdis == -1 && rightdis == -1 ){
// 			return -1;
// 		}else if(leftdis == -1){
// 			return rightdis + 1;
// 		}else{
// 			return leftdis + 1;
// 		}
// 	}

// 	public static int minDistanceofNode(Node root , int n1, int n2){

// 		Node lowestAnc = lca(root, n1,n2);

// 		int leftdis = lcaDistance(lowestAnc,n1);
// 		int rightdis = lcaDistance(lowestAnc,n2);

// 		return leftdis + rightdis;
// 	}

// 	public static void main(String args[]){
// // // 		/* 
// // // 				 1
// // // 			   /   \ 
// // // 			  2     3
// // // 			 / \   /  \
// // // 			4   5 6    7
// // // 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		System.out.println(lca(root,4,6).data);
// 		System.out.println(minDistanceofNode(root,4,6));
		
// 	}
// }



//lth ancestior

// public class Practice{
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

// 	public static int kAncestor(Node root , int n, int k){
// 		if(root == null){
// 			return -1;
// 		}

// 		if(root.data == n){
// 			return 0;
// 		}

// 		int lAns = kAncestor(root.left , n ,k);
// 		int rAns = kAncestor(root.right , n ,k);

// 		if(lAns == -1 && rAns == -1){
// 			return -1;
// 		}

// 		int max = Math.max(lAns, rAns);

// 		if(max+1 == k){
// 			System.out.println(root.data + " " );
// 		}

// 		return max + 1;
// 	}	

// 	public static void main(String args[]){
// // // 		/* 
// // // 				 1
// // // 			   /   \ 
// // // 			  2     3
// // // 			 / \   /  \
// // // 			4   5 6    7
// // // 		*/

// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		kAncestor(root,4,1);
		
// 	}
// }





public class Practice{
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

	public static int transform(Node root){
		if(root == null){
			return 0;
		}

		int leftSum = transform(root.left);
		int rightSum = transform(root.right);

		int data = root.data;

		int newLeft = root.left == null ? 0 : root.left.data;
		int newRight = root.right == null ? 0 : root.right.data;

		root.data = newLeft+ leftSum  +  newRight+ rightSum;

		return data;
	}

	public static void inOrder(Node root){
		if(root == null){
			return;
		}

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public static void main(String args[]){
// // 		/* 
// // 				 1
// // 			   /   \ 
// // 			  2     3
// // 			 / \   /  \
// // 			4   5 6    7
// // 		*/

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		transform(root);

		inOrder(root);

	}
}