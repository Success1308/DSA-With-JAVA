import java.util.*;

// // segment tree construction

// public class JavaBasics{
// 	static int tree[];

// 	public static void init(int n){
// 		tree = new int[4*n];
// 	}

// 	public static int buildST(int arr[], int i, int start, int end){
// 		if(start == end){
// 			tree[i] = arr[start];
// 			return arr[start];
// 		}
// 		int mid = (start+end)/2;
// 		buildST(arr, 2*i+1, start, mid); // left subtree
// 		buildST(arr, 2*i+2, mid+1, end); // right subtree
// 		tree[i] = tree[2*i+1] + tree[2*i+2];
// 		return tree[i];
// 	}

// 	public static int getSumUtil(int i, int si, int sj, int qi, int qj){
// 		if(qj <= si || qi>= sj ){ // non overlap
// 			return 0;
// 		}else if(si >= qi && sj <=qj){ // complete overlap
// 			return tree[i];
// 		}else{ // partial overlap
// 			int mid = (si+sj)/2;
// 			int left = getSumUtil(2*i+1, si, mid, qi, qj);
// 			int right = getSumUtil(2*i+2, mid+1 , sj, qi, qj);
// 			return left + right;
// 		}
// 	}

// 	public static int getSum(int arr[] , int qi, int qj){
// 		int n = arr.length;
// 		return getSumUtil(0,0,n-1,qi,qj);
// 	}

// 	public static void updateUtil(int i, int si, int sj,int idx, int diff){
// 		if(idx > sj || idx < si){ //not included 
// 			return;
// 		}

// 		tree[i] += diff;
// 		if(si != sj){
// 			int mid = (si+sj) / 2;
// 			updateUtil(2*i+1, si, mid, idx, diff); //left
// 			updateUtil(2*i+2,mid + 1, sj , idx, diff); //right
// 		}	
// 	}
	

// 	public static void update(int arr[], int idx, int newValue){
// 		int n = arr.length;
// 		int diff =  newValue - arr[idx] ;
// 		arr[idx] = newValue;
// 		updateUtil(0,0,n-1,idx,diff);
// 	}


// 	public static void main(String args[]){
// 		int arr[] = {1,2,3,4,5,6,7,8};
// 		int n = arr.length;
// 		init(n);
// 		buildST(arr, 0, 0 , n-1);
// 		System.out.println(Arrays.toString(tree));
// 		System.out.println(getSum(arr, 2 ,5));
// 		update(arr, 2, 2);
// 		System.out.println(getSum(arr, 2 ,5));
// 	}
// }








// // practice

// public class JavaBasics{
// 	static int tree[];

// 	public static void init(int n){
// 		tree = new int[4*n];
// 	}
// 	// buildST
// 	public static int buildST(int arr[], int i, int start, int end){
// 		if(start == end){
// 			tree[i] = arr[start];
// 			return arr[start];
// 		}
// 		int mid = (start + end) / 2 ;
// 		buildST(arr, 2*i+1, start, mid ); //left
// 		buildST(arr, 2*i+2,  mid+1 , end ); //left
// 		tree[i] = tree[2*i+1] + tree[2*i+2] ;
// 		return tree[i];
// 	}
	
// 	// getSum
// 	public static int getSumUtil(int i, int si, int sj , int qi, int qj ){
//  		if(si >= qj || sj <= qi ){ // no overlap
// 			return 0;
// 		}else if(si >= qi && sj <= qj ){ // full overlap
// 			return tree[i];
// 		}else{ // partial overlap
// 			int mid = (si + sj) / 2;
// 			int left = getSumUtil(2*i+1, si, mid, qi,qj); //left
// 			int right = getSumUtil(2*i+2, mid+1, sj, qi,qj); //right
// 			return left + right;
// 		}
// 	}

// 	public static int getSum(int arr[], int qi, int qj){
// 		int n = arr.length;
// 		return getSumUtil(0, 0, n-1, qi, qj);
// 	}
// 	// update
// 	public static void updateUtil(int i, int si, int sj , int idx, int diff ){
// 		if(idx < si || idx > sj ){ // not included
// 			return ;
// 		}

// 		tree[i] += diff;

// 		if(si != sj){
// 			int mid = (si+sj)/2;
// 			updateUtil(2*i+1, si, mid, idx,diff);
// 			updateUtil(2*i+2, mid+1 , sj,  idx,diff);
// 		}
// 	}

// 	public static void update(int arr[], int idx, int value){
// 		int n = arr.length;
// 		int diff = value - arr[idx];
// 		arr[idx] = arr[idx] - diff;
// 		updateUtil(0,0,n-1, idx,diff);
// 	}

// 	public static void main(String args[]){
// 		int arr[] = {1,2,3,4,5,6,7,8};
// 		int n = arr.length;
// 		init(n);
// 		buildST(arr, 0, 0 , n-1);
// 		System.out.println(Arrays.toString(tree));
// 		System.out.println(getSum(arr, 2 ,5));
// 		update(arr, 2, 2);
// 		System.out.println(getSum(arr, 2 ,5));
// 	}
// }



// max min element Query 

public class JavaBasics{
	static int tree[];

	public static void init(int n){
		tree = new int[4*n]; 
	}

	//build max tree

	public static void buildMaxST(int arr[], int i, int start, int end){
		if(start == end){
			tree[i] = arr[start];
			return ;
		}

		int mid = (start+end)/2;
		buildMaxST(arr,2*i+1,start,mid);
		buildMaxST(arr,2*i+2,mid+1,end);
		tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
	}

	// Query

	public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
		if(si > qj || sj < qi  ){ // no overlap
			return Integer.MIN_VALUE;
		}else if(si >= qi && sj <= qj ){//  overlap
			return tree[i];
		}else{//partial overlap
			int mid = (si+sj)/2;
			int left = getMaxUtil(2*i+1, si, mid,qi,qj);
			int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
			return Math.max(left, right);
		}
	}

	public static int getMax(int arr[], int qi, int qj){
		int n = arr.length;
		return getMaxUtil(0,0,n-1,qi,qj);
	}

	// update
	public static void updateUtil(int i, int si, int sj, int idx, int newVal){
		if(idx < si || idx > sj){
			return;
		}
		tree[i] = Math.max(tree[i],newVal);

		if(si != sj){
			int mid = (si+sj)/2;
			updateUtil(2*i+1, si, mid, idx, newVal);
			updateUtil(2*i+2, mid+1, sj, idx, newVal);
		}
	}

	public static void update(int arr[], int idx, int val){
		int n = arr.length;
		arr[idx] = val;
		updateUtil(0,0,n-1,idx,val);
	}


	public static void main(String args[]){
		int arr[] = {6,8,-1,2,17,1,3,2,4};
		int n = arr.length;
		init(n);
		buildMaxST(arr,0,0,n-1);
		System.out.println(Arrays.toString(tree));

		System.out.println(getMax(arr,2,5));

		update(arr, 2 , 20);
		System.out.println(Arrays.toString(tree));
	}	
}







// Notes

// segment tree


// use to solve range Query
// divide and conquer


//  level = log2n
// nodes = 2n-1;