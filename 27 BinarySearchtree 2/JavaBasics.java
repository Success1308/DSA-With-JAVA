import java.util.*;


// Sorted array to bst

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

// 	public static void preorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		System.out.print( root.data + " ");
// 		preorder(root.left);
// 		preorder(root.right);
// 	}
// 	public static Node balanceBst( int arr[] , int st, int end){
// 		if(st>end){
// 			return null;
// 		}
// 		int mid = (st+end)/2;
// 		Node root = new Node(arr[mid]);
// 		root.left = balanceBst(arr, st, mid-1);
// 		root.right = balanceBst(arr, mid+1, end);
// 		return root;
// 	}

// 	public static void main(String args[]){
// 		int arr[] = {3,5,6,8,10,11,12};

// 		/*		
// // 				 8
// // 			   /   \ 
// // 			  5     11
// // 			 / \   /  \
// // 			3   6 10   12
// 		 */


// 		Node root = balanceBst(arr, 0, arr.length-1 );
// 		preorder(root);
// 	}
// }






// COnvert BST to Balanced BST

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

// 	public static void getinorder(Node root, ArrayList<Integer> inorderarray ){
// 		if(root == null){
// 			return;
// 		}
// 		getinorder(root.left,inorderarray);
// 		inorderarray.add(root.data);
// 		getinorder(root.right,inorderarray);
// 	}

// 	public static Node createBST(ArrayList<Integer> inorder,int st , int end ){
// 		if(st > end){
// 			return null;
// 		}

// 		int mid = (st+ end)/2;

// 		Node root = new Node(inorder.get(mid));
// 		root.left = createBST(inorder, st, mid-1);
// 		root.right = createBST(inorder, mid+1, end);
// 		return root;
// 	}

// 	public static Node createBalancedBST(Node root){
// 		ArrayList<Integer> inorder = new ArrayList<>();
// 		getinorder(root, inorder);

// 		// sorted inorder -> balanced
// 		root  = createBST(inorder, 0 , inorder.size()-1);
// 		return root;
// 	}


// 	public static void pre(Node root) {
// 		if(root == null){
// 			return;
// 		}
// 		System.out.print(root.data + " ");
// 		pre(root.left);
// 		pre(root.right);
// 	}

// 	public static void main(String args[]){

// 		Node root = new Node(8);
// 		root.left = new Node(6);
// 		root.left.left =  new Node(5);
// 		root.left.left.left  =  new Node(3);

// 		root.right = new Node(10);
// 		root.right.right =  new Node(11);
// 		root.right.right.right  =  new Node(12);
// /*		
// // 				 8
// // 			   /   \ 
// // 			  6     10
// // 			 /        \
// // 			5          11
// // 		   /             \
// // 		  3               12

// // 				 8
// // 			   /   \ 
// // 			  5     11
// // 			 / \   /  \
// // 			3   6 10    12
// 		 */


// 		Node root1  = createBalancedBST(root); 

// 		pre(root1);


// 	}
// }






// sorted array to balanced BST

// public class JavaBasics{

// 	public static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}

// 	public static void inorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		inorder(root.left);
// 		System.out.print(root.data + " ");
// 		inorder(root.right);
// 	}

// 	public static void preorder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		System.out.print(root.data + " ");
// 		preorder(root.left);
// 		preorder(root.right);
// 	}

// 	public static Node balanceBst(int arr[], int st, int end){
// 		if(st > end){
// 			return null;
// 		}
// 		int mid = (st + end) / 2;
// 		Node root = new Node(arr[mid]);
// 		root.left = balanceBst(arr, st, mid - 1);
// 		root.right = balanceBst(arr, mid+1, end);
// 		return root;
// 	}


// 	public static void main(String args[]){
// 		int arr[] = {3,5,6,8,10,11,12};

// 		Node root = balanceBst(arr,0,arr.length-1); 

// 		preorder(root);
// 		System.out.println();
// 		inorder(root);
// 	}
// }




// Convert Bst to Balanced BSt


// public class JavaBasics{
// 	public static class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int data){
// 			this.data = data;
// 			this.left = null;
// 			this.right = null;
// 		}
// 	}

// 	public static void preOrder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		System.out.print( root.data + " ");
// 		preOrder(root.left);
// 		preOrder(root.right);
// 	}

// 	public static void getInorder(Node root, ArrayList<Integer> arr){
// 		if(root == null){
// 			return;
// 		}
// 		getInorder(root.left,arr);
// 		arr.add(root.data);
// 		getInorder(root.right,arr);
// 	}

// 	public static Node createBalancedBST(ArrayList<Integer> arr, int st, int end){
// 		if(st > end){
// 			return null;
// 		}
// 		int mid = (st + end )/2;
// 		Node root = new Node(arr.get(mid));
// 		root.left = createBalancedBST(arr, st, mid-1);
// 		root.right = createBalancedBST(arr, mid+1 ,end);
// 		return root;
// 	}

// 	public static Node convertBalancedBst(Node root){
// 		ArrayList<Integer> arr = new ArrayList<>();
// 		getInorder(root, arr);

// 		root = createBalancedBST( arr, 0 , arr.size()-1);

// 		return root;
// 	}


// 	public static void main(String args[]){

// 		Node root = new Node(8);
// 		root.left = new Node(6);
// 		root.left.left = new Node(5); 
// 		root.left.left.left =  new Node(3); 
// 		root.right = new Node(10); 
// 		root.right.right =  new Node(11); 
// 		root.right.right.right =  new Node(12); 

// 			// 		8
// 			// 	   / \
// 			// 	  6   10
// 			// 	 /      \
// 			// 	5        11
// 			// /           \
// 			//3             12 

// 		Node newroot = convertBalancedBst(root);
// 		preOrder(newroot);

// 	}
// }





// 


// public class JavaBasics{
// 	public static class Node{
// 		int data;
// 		Node left;
// 		Node right;

// 		Node(int data){
// 			this.data = data;
// 			this.left = this.right = null;
// 		}
// 	}

// 	public static class Info{
// 		int dif;
// 		int nodedata;
// 		Info(int dif, int nodedata){
// 			this.dif = dif;
// 			this.nodedata = nodedata;
// 		}
// 	}

// 	public static void preOrder(Node root){
// 		if(root == null){
// 			return;
// 		}
// 		System.out.print(root.data + " ");
// 		preOrder(root.left);
		
// 		preOrder(root.right);

// 	}

// 	public static Info closestEle(Node root , int key){
// 		if(root == null){
// 			return new Info(difference, root.data);
// 		}

// 		int difference = Math.abs(root.data - key);

// 		if(root.data > key){
// 			Info leftInfo = closestEle(root.left, key);
// 			if(leftInfo.dif == -1 && leftInfo.dif < difference){
// 				return leftInfo;
// 			}
// 		}else if(root.data < key){
// 			Info rightInfo = closestEle(root.right, key);
// 			if(rightInfo.dif == -1 && rightInfo.dif < difference){
// 				return rightInfo;
// 			}
// 		}else{
// 			return new Info(0,root.data);
// 		}
// 		return new Info(difference, root.data);
// 	}

// 	public static void main(String args[]){

// 		Node root = new Node(8);
// 		 root.left = new Node(5);
// 		 root.left.left = new Node(3);
// 		 root.left.right = new Node(6);
// 		 root.right = new Node(11);
// 		 root.right.left = new Node(20);

		
// 		System.out.println(closestEle(root, 19).dif + " and data " + closestEle(root, 19).nodedata);
		

// 	}
// }




// Merge 2 BST



public class JavaBasics{
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node createBST(int arr[], int st, int ed){
		if(st > ed){
			return null;
		}
		int mid = (st + ed) / 2;
		Node root = new Node(arr[mid]);
		root.left = createBST(arr, st, mid-1 );
		root.right = createBST(arr, mid+1 , ed);
		return root;
	}

	public static void preOrder(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(Node root){
		if(root == null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void postOrder(Node root){
		if(root == null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void levelOrder(Node root){
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while( ! q.isEmpty()){
			Node curr = q.remove();
			if(curr == null){
				System.out.println();
				if(q.isEmpty()){
					break;
				}else{
					q.add(null);	
				}
			}else{
				System.out.print(" " + curr.data + " " );
				if(curr.left != null ){
					q.add(curr.left);
				}
				if(curr.right != null ){
					q.add(curr.right);
				}
			}
		}
	}

	public static Node lca(Node root, int n1, int n2){
		if(root == null || root.data == n1 || root.data == n2){
			return root;
		}
		Node rightLca = lca(root.right,n1,n2);
		Node leftLca = lca(root.left,n1,n2);
		if(rightLca == null ){
			return leftLca;
		}else if(leftLca == null ){
			return rightLca;
		}
		return root;
	}






// Merge BST

	public static void inorderArr(Node root , ArrayList<Integer> list){
		if(root == null){
			return ;
		}

		inorderArr(root.left,list);
		list.add(root.data);
		inorderArr(root.right,list);
		
	}


	public static Node createBalancedBST(ArrayList<Integer> finalList, int si, int ei){
		if(si > ei){
			return null;
		}

		int mid = (si + ei) / 2;
		Node root = new Node(finalList.get(mid));
		root.left = createBalancedBST(finalList,si,mid-1);
		root.right = createBalancedBST(finalList,mid+1,ei);
		return root;
	}

	public static Node mergeBst(Node root1, Node root2){

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> finalList = new ArrayList<>();

		inorderArr(root1,list1);
		inorderArr(root2,list2);

		// merge
		int i = 0 , j = 0;
		while(i <  list1.size() && j < list2.size()){
			if(list1.get(i) <= list2.get(j)){
				finalList.add(list1.get(i));
				i++;
			}else{
				finalList.add(list2.get(j));
				j++;
			}
		}
		while(i <  list1.size()){
			finalList.add(list1.get(i));
			i++;
		}
		while(j < list2.size()){
			finalList.add(list2.get(j));
			j++;
		}

			// create 
	
		return createBalancedBST(finalList, 0, finalList.size() - 1);
	}

	public static void main(String args[]){
		// int arr[] = {3,5,6,8,10,11,12};

		// Node root = createBST(arr, 0, arr.length - 1);
		
		// System.out.print(root.data);
		// System.out.println();

		// preOrder(root);
		// System.out.println();
		// inOrder(root);
		// System.out.println();
		// postOrder(root);

		// System.out.println();
		// levelOrder(root);

		// System.out.println();
		// System.out.print(lca(root, 3, 12).data);


		Node root1 = new Node(2);
		root1.left = new Node(1);
		root1.right = new Node(4);


		Node root2 = new Node(9);
		root2.left = new Node(3);
		root2.right = new Node(12);


		Node newroot = mergeBst(root1,root2);

		System.out.println();
		levelOrder(newroot);
		
	}
}

