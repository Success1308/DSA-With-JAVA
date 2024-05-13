import java.util.*;



// 1 merge sort:  

// public class JavaBasics{

// 	public static void Printarray(int arr[]){
// 		for(int i = 0; i<arr.length; i++){
// 			System.out.print(arr[i] + " ");
// 		}	
// 	}
// 	public static void mergeSort(int arr[], int si, int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		//kaam
// 		int mid = si+(ei-si)/2; // si+ei/2
// 		mergeSort(arr,si,mid); //left part
// 		mergeSort(arr,mid+1,ei); // right part
// 		merge(arr,si,mid,ei);
// 	}
// 	public static void merge(int arr[], int si,int mid, int ei){
// 		int temp[] = new int[ei-si+1];
// 		int i = si;  // iterator for left part
// 		int j = mid+1; //iterator for right part
// 		int k = 0;  // iterator for temp arry

// 		while (i<=mid && j<=ei){
// 			if(arr[i] < arr[j]){
// 				temp[k] = arr[i];
// 				i++;
// 			} else{
// 				temp[k] = arr[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		// for leftover element on 1st part
// 		while(i<=mid){
// 			temp[k++] = arr[i++];
// 		}
// 		// for leftover element on 2nd part
// 		while(j<=ei){
// 			temp[k++] = arr[j++];
// 		}
// 		//copy to orignal arry
// 		for(k= 0, i = si; k<temp.length ; k++, i++){
// 			arr[i] = temp[k];
// 		}
// 	}

// 	public static void main(String args[]){
// 		int s[] = {7,6,5,8,4,2,9};
// 		mergeSort(s,0,s.length-1);
// 		Printarray(s);
// 	} 
// }


// Quick Sort

//pivot and partition
// 1. pivot last element
// 2.partition(parts)
// 3. Quick sort for left part 
// 	Quick sort for right part 


// public class JavaBasics{
// 	public static void quickSort(int s[], int si, int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		// last element
// 		int pidx = partition(s,si,ei);
// 		quickSort(s,si,pidx-1); // left part
// 		quickSort(s,pidx+1,ei); // right part
// 	}
// 	public static int partition(int s[], int si, int ei){
// 		int pivot = s[ei];
// 		int i = si-1; // to make place smaller than pivot
// 		for(int j = si; j<ei; j++){
// 			if(s[j]<=pivot){
// 			i++;
// 			int temp = s[j];
// 			s[j] = s[i];
// 			s[i] = temp;
// 			}
// 		}
// 		i++;
// 		int temp = pivot;
// 		s[ei] = s[i];
// 		s[i] = temp;
// 		return i;
// 	}
// 	public static void Printarray(int arr[]){
// 		for(int i = 0; i<arr.length; i++){
// 			System.out.print(arr[i] + " ");
// 		}	
// 		System.out.println();
// 	}
// 	public static void main(String args[]){
// 		int s[] = {6,3,9,8,2,5};
// 		quickSort(s,0,s.length-1);
// 		Printarray(s);
// 	}
// }




// Search Rotated sorted array 


// public class JavaBasics{
// 	public static int search(int arr[],int tar,int si, int ei){
// 		if(si>ei){
// 			return -1;
// 		}
// 		//kaam
// 		int mid = si+(ei-si)/2;
// 		//case found
// 		if(arr[mid]==tar){
// 			return mid;
// 		}
// 		//mid on L1
// 		if(arr[si]<=arr[mid]){
// 			//case a left
// 			if(arr[si]<=tar && tar<=arr[mid]){
// 				return search(arr,tar,si,mid-1);
// 			} else{
// 			//case b right
// 				return search(arr,tar,mid+1,ei);
// 			}
// 		}
// 		//mid on L2
// 		else{
// 			//case c : right
// 			if(arr[mid]<=tar && tar<=arr[ei]){
// 				return search(arr,tar,mid+1,ei);
// 			} else{
// 			//case b left
// 				return search(arr,tar,si,mid-1);
// 			}
// 		}

// 	}
// 	public static void main(String args[]){
// 		int s[] = {4,5,6,7,0,1,2};
// 		int target = 0; // -> out put 4
// 		int targetidx = search(s,target,0,s.length-1);
// 		System.out.println(targetidx);
// 	}
// }









// Notes

// Divide and conquer

// Approach

// 1. divide (mid)
// 2. Recursion 
// 	mergeSort(left)
// 	mergeSort(right)

// 3. merge 














// Practice

// mergeSort


// public class JavaBasics{
// 	public static void printarr(int arr[]){
// 		for(int i = 0; i<arr.length;i++){
// 			System.out.print(arr[i] + " ");
// 		}
// 	}

// 	public static void mergeSort(int n[], int si, int ei ){
// 		//base
// 		if(si>=ei){
// 			return;
// 		}
// 		//kaam
// 		int mid = si +(ei-si)/2;
// 		mergeSort(n,si,mid);
// 		mergeSort(n,mid+1,ei);
// 		merge(n,si,mid,ei);
// 	}
// 	public static void merge(int n[], int si,int mid, int ei ){
// 		int temp[] = new int[ei-si+1];
// 		int i = si;
// 		int j = mid+1;
// 		int k = 0;
// 		while(i<=mid && j<=ei){
// 			if(n[i]<n[j]){
// 				temp[k]=n[i];
// 				i++;
// 			}else{
// 				temp[k]=n[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while(i<=mid){
// 			temp[k++]=n[i++];
// 		}
// 		while(j<=ei){
// 			temp[k++]=n[j++];
// 		}
// 		for(k=0 ,i = si; k<temp.length;k++,i++){
// 			n[i] = temp[k] ;
// 		}
// 	}

// 	public static void main(String args[]){
// 		int s[] = {7,6,5,8,4,2,5,2,3,4,6,9};
// 		mergeSort(s,0,s.length-1);
// 		printarr(s);
// 	}
// }



	
// public class JavaBasics{
// 	public static void printArr(int n[]){
// 		for( int i = 0; i<n.length; i++){
// 			System.out.print(n[i] + " ");
// 		}
// 	}
// 	public static void mergeSort(int n[],int si, int ei){
// 		//base
// 		if(si>=ei){
// 			return;
// 		}
// 		//kaam
// 		int mid = si + (ei-si)/2;
// 		mergeSort(n,si,mid);
// 		mergeSort(n,mid+1,ei);
// 		merge(n,si,mid,ei);
// 	}
// 	public static void merge(int n[],int si,int mid ,int ei){
// 		int temp[] = new int[ei-si+1];
// 		int i = si;
// 		int j = mid+1;
// 		int k = 0;

// 		while(i<=mid && j<=ei){
// 			if(n[i]<n[j]){
// 				temp[k] = n[i];
// 				i++;
// 			}else{
// 				temp[k] = n[j];
// 				j++;
// 			}
// 			k++;
// 		}

// 		while(i<=mid){
// 			temp[k++] = n[i++];
// 		}
// 		while(j<=ei){
// 			temp[k++] = n[j++];
// 		}

// 		for(k=0,i=si; k<temp.length ; k++,i++){
// 			n[i]=temp[k];
// 		}
// 	}
// 	public static void main(String args[]){
// 		int s[] = {6,4,8,3,7,2,0,1,};
// 		mergeSort(s,0,s.length-1);
// 		printArr(s);
// 	}
// }










// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i = 0; i< s.length ;i++){
// 			System.out.print(s[i] + " ");
// 		}
// 	}
// 	public static void mergeSort(int n[],int si, int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		int mid = si + (ei-si)/2;
// 		mergeSort(n,si,mid);
// 		mergeSort(n,mid+1,ei);
// 		merge(n,si,mid,ei);
// 	}
// 	public static void merge(int n[],int si, int mid, int ei){
// 		int temp[] = new int[ei-si+1];
// 		int i = si;
// 		int j = mid+1;
// 		int k = 0;

// 		while(i<=mid && j<=ei){
// 			if(n[i]<=n[j]){
// 				temp[k] = n[i];
// 				i++;
// 			}else{
// 				temp[k] = n[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while(i<=mid){
// 			temp[k++] = n[i++];
// 		}
// 		while(j<=ei){
// 			temp[k++] = n[j++];
// 		}
// 		for(k=0,i=si; k<temp.length; i++, k++){
// 			n[i]=temp[k];
// 		}
// 	}
// 	public static void main(String args[]){
// 		int s[] = {4,3,8,2,9,1,0,5};
// 		mergeSort(s,0,s.length-1);
// 		print(s);
// 	}
// }









// public class JavaBasics{
// 	public static void print(int a[]){
// 		for(int i = 0 ; i<a.length;i++){
// 		System.out.print(a[i] + " ");
// 		}
// 	}
// 	public static void mergeSort(int s[], int si, int ei){
// 		//base
// 		if(si>=ei){
// 			return;
// 		} 
// 		//kaam
// 		int mid = si +(ei-si)/2;
// 		mergeSort(s,si,mid);
// 		mergeSort(s,mid+1,ei);
// 		merge(s,si,mid,ei);
// 	}
// 	public static void merge(int s[], int si, int mid, int ei){
// 		int temp[] = new int[ei-si+1];
// 		int i = si;
// 		int j = mid+1;
// 		int k = 0;
// 		while(i<=mid && j<=ei){
// 			if(s[i]>=s[j]){
// 				temp[k]=s[i];
// 				i++;
// 			}else{
// 				temp[k]=s[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while(i<=mid){
// 			temp[k++]=s[i++];
// 		}
// 		while(j<=ei){
// 			temp[k++]=s[j++];
// 		}
// 		for(k=0,i=si; k<temp.length; k++,i++){
// 			s[i] = temp[k];
// 		}
// 	}
// 	public static void main(String args[]){
// 		int s[] = {3,2,6,8,9,1,2,9,3,2,1};
// 		mergeSort(s,0,s.length-1);
// 		print(s);
// 	}
// }




































// Practice


// 1 print number in decreasing order


// public class JavaBasics{
// 	public static void decreasing(int s){
// 		//base
// 		if(s<=0){
// 			System.out.print(s + " ");
// 			return;
// 		}
// 		//kaam
// 		System.out.print(s+ " ");
// 		decreasing(s-1);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add number: ");
// 		int s = sc.nextInt();
// 		decreasing(s);
// 	}
// }



// 2 print number in inreasing order

// public class JavaBasics{
// 	public static void increasing(int s){
// 		if(s<=0){
// 			return;
// 		}
// 		increasing(s-1);
// 		System.out.print(s + " ");
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add number: ");
// 		int s = sc.nextInt();
// 		System.out.print("result: ");
// 		increasing(s);
// 	}
// }



// 3 factorial of n

// public class JavaBasics{
// 	public static int facto(int s){
// 		if(s<=1){
// 			return s;
// 		}
// 		return s*facto(s-1);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add number: ");
// 		int s = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.print(facto(s)); 
// 	}
// }



// // 4 print sum of natural number

// public class JavaBasics{
// 	public static int sum(int s){
// 		if(s<=0){
// 			return s;
// 		}
// 		return s+sum(s-1);
// 	} 
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int s = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.print(sum(s));
		
// 	}
// }


// 5 print n fibonacchi number

// public class JavaBasics{
// 	public static int fibo(int s){
// 		if(s==0 || s==1){
// 			return s;
// 		}
// 		return fibo(s-1)+fibo(s-2);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add number: ");
// 		int s = sc.nextInt();
// 		System.out.print("Result: ");
// 		System.out.print(fibo(s));
// 	}
// }


// 6 chehck if array is sorted or No

// public class JavaBasics{
// 	public static boolean sortorNot(int s[],int idx, int ei){	
// 		if(idx==ei){
// 			return true;
// 		}

// 		if(s[idx]>=s[idx+1]){
// 			return false;
// 		}
// 		return sortorNot(s,idx+1,ei);
// 	} 
// 	public static void main(String args[]){
// 		int s[] = {1,2,6,4,5,6};
// 		System.out.print(sortorNot(s,0,s.length-1));
// 	}
// }



// 7 first occurance
// public class JavaBasics{
// 	public static int fO(int s[],int idx, int key){
// 		if(idx==s.length-1){
// 			return -1;
// 		}
// 		int address = 0;
// 		if(s[idx]==key){
// 			return idx;
// 		}
// 		return fO(s,idx+1,key);

// 	}
// 	public static void main(String args[]){
// 		int s[] = {1,2,6,4,5,6};
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add key : ");
// 		int key = sc.nextInt();
// 		System.out.print(fO(s,0,key));
// 	}
// }



// 8 last occurance

// public class JavaBasics{
// 	public static int lO(int n[], int idx ,int key){
// 		// base
// 		if(idx<0){
// 			return -1;
// 		}

// 		if(n[idx]==key){
// 			return idx;
// 		}
// 		return lO(n,idx-1,key);

// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		int s[] = {1,2,4,6,8,4,8,3,4,7,9,2};
// 		System.out.print("add Key: ");
// 		int key = sc.nextInt();
// 		System.out.print("address: ");
// 		System.out.print(lO(s,s.length-1,key));
// 	}
// }


// 9 print power of n

// public class JavaBasics{
// 	public static int powN(int n, int pow){
// 		if(pow==1){
// 			return n;
// 		}
		
// 		n = n*powN(n,pow-1);
// 		return n;

// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add Number: ");
// 		int n = sc.nextInt();
// 		System.out.print("power: ");
// 		int power = sc.nextInt();
// 		System.out.print("Result : ");
// 		System.out.print(powN(n,power));
// 	}
// }



// // 10 tiling problem

// public class JavaBasics{
// 	public static int tilingProblem(int a){
// 		//base
// 		if(a==0 || a==1){
// 			return 1;
// 		}
// 		//kaam
// 		return tilingProblem(a-1)+tilingProblem(a-2);
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add number: ");
// 		int s = sc.nextInt();
// 		System.out.print("rezult : ");
// 		System.out.print(tilingProblem(s));
// 	}
// }



// // 11 remove duplicates kis String

// public class JavaBasics{
// 	public static void remoDup(String s,StringBuilder a,boolean map[],int idx){
// 		//base
// 		if(idx==s.length()){
// 			System.out.print(a);
// 			return;
// 		}
// 		//kaam
// 		char ch = s.charAt(idx);
// 		if(map[ch - 'a']==true){
// 			remoDup(s,a,map,idx+1);
// 		}else{
// 			map[ch - 'a']=true;
// 			remoDup(s,a.append(ch),map,idx+1);
// 		}
// 	}
// 	public static void main(String args[]){
// 		String s = "ssaammkkkkiiiiccooodde";
// 		remoDup(s,new StringBuilder(""),new boolean[26],0);
// 	}
// }


// // 12 friend pairing problem
// public class JavaBasics{
// 	public static int pairFriend(int s){	
// 		//base
// 		if(s==0 || s ==1){
// 			return 1;
// 		}
// 		//kaam

// 		return pairFriend(s-1)+((s-1)*pairFriend(s-2));
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("add number of friends: ");
// 		int s = sc.nextInt();
// 		System.out.print("ways of matching friends: ");
// 		System.out.print(pairFriend(s));
// 	}
// }




// // 15 megre sort

// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i = 0;i<s.length;i++){
// 			System.out.print(s[i] + " ");
// 		}
// 	}
// 	public static void mergreSort(int s[],int si, int ei){
// 		//base
// 		if(si>=ei){
// 			return ;
// 		}
// 		//kaam
// 		int mid = si+(ei-si)/2;
// 		mergreSort(s,si,mid);
// 		mergreSort(s,mid+1,ei);
// 		merge(s,si,mid,ei);

// 	}
// 	public static void merge(int s[],int si,int mid, int ei){
// 		int temp[] = new int[ei-si+1];
// 		int i = si;
// 		int j = mid+1;
// 		int k = 0;

// 		while(i<=mid && j<=ei){
// 			if(s[i]<=s[j]){
// 				temp[k]=s[i];
// 				i++;
// 			}else{
// 				temp[k]=s[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while(i<=mid){	
// 			temp[k++]=s[i++];
// 		}
// 		while(j<=ei){
// 			temp[k++]=s[j++];
// 		}
// 		for(k=0,i=si;k<temp.length;k++,i++){
// 			s[i]=temp[k];
// 		}
// 	}
// 	public static void main(String args[]){
// 		int s[] = {6,1,7,2,3,9,0};
// 		mergreSort(s,0,s.length-1);
// 		print(s);
// 	}
// }


// // 13 binary string problem

// public class JavaBasics{
// 	public static void binaryChair(int s, int lastplace, String str){
// 		//base 
// 		if(s==0){
// 			System.out.println(str);
// 			return;
// 		}
// 		//kaam
// 		binaryChair(s-1,0,str + '0');
// 		if(lastplace == 0){
// 			binaryChair(s-1,1,str + '1' );
// 		}


// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("How many chairs? : ");
// 		int s = sc.nextInt();
// 		binaryChair(s,0,"");
// 	}
// }


// // 16 Quick sort


// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i=0;i<s.length;i++){
// 			System.out.print(s[i]+ " ");
// 		}
// 	}
// 	public static void quickSort(int s[],int si,int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		int pidx = part(s,si,ei);
// 		quickSort(s,si,pidx-1);
// 		quickSort(s,pidx+1,ei);
// 	}
// 	public static int part(int s[],int si,int ei){
// 		int pivot = s[ei];
// 		int i = si-1;
// 		for(int j= si;j<ei;j++){
// 			if(s[j]<=pivot){
// 				i++;
// 				int temp = s[j];
// 				s[j] = s[i];
// 				s[i]=temp;
// 			}
// 		}
// 		i++;
// 		int temp = pivot;
// 		s[ei] = s[i];
// 		s[i]=temp;		
// 		return i;
// 	} 
// 	public static void main(String args[]){
// 		int s[] = {4,9,1,8,3,7,0};
// 		quickSort(s,0,s.length-1);
// 		print(s);
// 	}
// }




// // 17 sorted and rotated array




// quick sort

// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i=0;i<s.length;i++){
// 			System.out.print(s[i]+" ");
// 		}
// 	}
// 	public static void quickSort(int s[], int si, int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		int pidx = part(s,si,ei);
// 		quickSort(s,si,pidx-1);
// 		quickSort(s,pidx+1,ei);
// 	}
// 	public static int part(int s[], int si, int ei){
// 		int pivot = s[ei];
// 		int i =si-1;

// 		for(int j=si;j<ei;j++){
// 			if(s[j]>=pivot){
// 				i++;
// 				int temp = s[j];
// 				s[j] = s[i];
// 				s[i] = temp;
// 			}
// 		}
// 		i++;
// 		int temp = pivot;
// 		s[ei] = s[i];
// 		s[i] = temp;
// 		return i;

// 	}
// 	public static void main(String args[]){
// 		int s[] = {3,9,1,7,2,3,9,3,5,7,5,1,3};
// 		quickSort(s,0,s.length-1);
// 		print(s);
// 	}
// }









// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i=0;i<s.length;i++){
// 			System.out.print(s[i]+" ");
// 		}
// 	}
// 	public static void mergeSort(int s[],int si, int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		int mid = si+(ei-si)/2;
// 		mergeSort(s,si,mid);
// 		mergeSort(s,mid+1,ei);
// 		merge(s,si,mid,ei);

// 	}
// 	public static void merge(int s[],int si, int mid,int ei){
// 		int temp[] = new int[ei-si+1];
// 		int i=si;
// 		int j=mid+1;
// 		int k=0;

// 		while(i<=mid && j<=ei){
// 			if(s[i]>=s[j]){
// 				temp[k]=s[i];
// 				i++;
// 			}else{
// 				temp[k]=s[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while(i<=mid){
// 			temp[k++]=s[i++];
// 		}
// 		while(j<=ei){
// 			temp[k++]=s[j++];
// 		}
// 		for(k=0, i=si;k<temp.length;k++,i++){
// 			s[i]=temp[k];
// 		}
// 	}
// 	public static void main(String args[]){
// 		int s[] = {4,1,9,2,8,4,0,5,6};
// 		mergeSort(s,0,s.length-1);
// 		print(s);
// 	}
// }





// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i=0; i<s.length;i++){
// 			System.out.print(s[i] + " ");
// 		}
// 	}
// 	public static void mergeSort(int s[],int si,int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		int mid = si+(ei-si)/2;
// // 		mergeSort(s,si,mid);
// // 		mergeSort(s,mid+1,ei);
// // 		merge(s,si,mid,ei);
// // 	}
// // 	public static void merge(int s[],int si,int mid,int ei){
// // 		int temp[] = new int[ei-si+1];
// // 		int i = si;
// // 		int j = mid+1;
// // 		int k = 0;
// // 		while(i<=mid && j<=ei){
// // 			if(s[i]>=s[j]){
// // 				temp[k] = s[i];
// // 				i++;
// // 			}else{
// // 				temp[k] = s[j];
// // 				j++;
// // 			}
// // 			k++;
// // 		}
// // 		while(i<=mid){
// // 			temp[k++] = s[i++];
// // 		}
// // 		while(j<=ei){
// // 			temp[k++] = s[j++];
// // 		}
// // 		for(k=0,i=si;k<temp.length;k++,i++){
// // 			s[i]=temp[k];
// // 		}
// // 	}
// // 	public static void main(String args[]){
// // 		int s[] = {4,1,9,2,8,4,5,7,6,0};
// // 		mergeSort(s,0,s.length-1);
// // 		print(s);
// // 	}
// // }





// public class JavaBasics{
// 	public static void print(int s[]){
// 		for(int i=0;i<s.length;i++){
// 			System.out.print(s[i]+" ");
// 		}
// 	}
// 	public static void quickSort(int s[],int si, int ei){
// 		if(si>=ei){
// 			return;
// 		}
// 		int pidx = part(s,si,ei);
// 		quickSort(s,si,pidx-1);
// 		quickSort(s,pidx+1,ei);
// 	}
// 	public static int part(int s[],int si,int ei){
// 		int pivot = s[ei];
// 		int j= si-1;

// 		for(int i = si; i<ei;i++){
// 			if(s[i]<=pivot){
// 				j++;
// 				int temp = s[i];
// 				s[i] = s[j];
// 				s[j] = temp;
// 			}
// 		}
// 		j++;
// 		int temp = pivot;
// 		s[ei]= s[j];
// 		s[j]=temp;
// 		return j;
// 	}
// 	public static void main(String args[]){
// 		int s[] = {9,1,0,2,7,3,8,4,6,5};
// 		quickSort(s,0,s.length-1);
// 		print(s);
// 	}
// }