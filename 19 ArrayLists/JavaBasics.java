import java.util.*;

// public class JavaBasics{
// 	public static void main(String args[]){

// 		// Java collection framework;

// 		ArrayList<Integer> list = new ArrayList<>();
// 		ArrayList<String> list1 = new ArrayList<>();
// 		ArrayList<Boolean> list2 = new ArrayList<>();
// 		// add function
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);

// 		list.add(1,9);
// 		list.add(2,18);

// 		System.out.println(list);

// 		//get function
// 		int element = list.get(2);
// 		System.out.println(element);

// 		//remove function
// 		list.remove(2);
// 		System.out.println(list);

// 		// set element function
// 		list.set(2,10);
// 		System.out.println(list);

// 		// contain elements
// 		System.out.println(list.contains(3)); 
// 		System.out.println(list.contains(11)); 
		
// 		//size function
// 		System.out.println(list.size());
	
// 		// print fun
// 		for(int i=0; i<list.size(); i++){
// 			System.out.print( list.get(i)+ " ");
// 		}
// 		System.out.println();

// 		// print revrse
// 		for(int i=list.size()-1; i>=0; i--){
// 			System.out.print(list.get(i)+ " ");
// 		}
// 		System.out.println();
// 	}
// }



// find maximum

// public class JavaBasics{
// 	public static void main(String args[]){
// 		ArrayList<Integer> list= new ArrayList<>();
// 		list.add(2); 
// 		list.add(5); 
// 		list.add(9); 
// 		list.add(3); 
// 		list.add(6); 
// 		int max = Integer.MIN_VALUE;
// 		for (int i = 0; i<list.size();i++){
// 			// if(max<list.get(i)){
// 			// 	max=list.get(i);
// 			// }

// 			 max = Math.max(max,list.get(i));
// 		}
// 		System.out.println(" largest element: " + max);
// 	}
// }



// Swap numbers


// public class JavaBasics{

// 	public static void swap(ArrayList<Integer> list, int idx1 , int idx2){
// 		int temp = list.get(idx1);
// 		list.set(idx1, list.get(idx2));
// 		list.set((idx2),temp);
// 	}

// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);
// 		list.add(6);
// 		int idx1 = 1, idx2 = 3;
// 		System.out.println(list);
// 		swap(list,idx1,idx2);
// 		System.out.println(list);
// 	}
// }


// sorting array

// bubble sort
// public class JavaBasics{
// 	public static void sort(ArrayList<Integer> list){
// 		for(int i = 0; i<list.size();i++){
// 			for(int j = i+1; j<list.size();j++){
// 				if(list.get(i)>= list.get(j) ){
// 					int temp = list.get(i);
// 					list.set(i,list.get(j));
// 					list.set(j,temp);
// 				}
// 			}
// 		}
// 	}
// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(3);
// 		list.add(9);
// 		list.add(2);
// 		list.add(5);
// 		list.add(6);
// 		list.add(7);
// 		list.add(1);
// 		list.add(4);
// 		list.add(0);
// 		System.out.println(list);
// 		sort(list);
// 		System.out.println(list);
// 	}
// }


// inbuilt sort (collections.sort) method

// public class JavaBasics{
// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(3);
// 		list.add(9);
// 		list.add(2);
// 		list.add(5);
// 		list.add(6);
// 		list.add(7);
// 		list.add(1);
// 		list.add(4);	
// 		list.add(0);
// 		System.out.println(list);
// 		Collections.sort(list);
// 		System.out.println(list);

// 		// descending
// 		Collections.sort(list,Collections.reverseOrder());
// 		// comperator logic
// 		System.out.println(list);
// 	}
// }




 
// multidimentional array

// public class JavaBasics{
// 	public static void main(String args[]){	
// 		ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
// 		ArrayList<Integer> list1 = new ArrayList<>();
// 		list1.add(1); 
// 		list1.add(2); 
// 		mainlist.add(list1);
// 		ArrayList<Integer> list2 = new ArrayList<>();
// 		list2.add(3); 
// 		list2.add(4); 
// 		mainlist.add(list2);

// 		for(int i = 0; i<mainlist.size(); i++){
// 			ArrayList<Integer> currList	= mainlist.get(i);
// 			for(int j = 0; j<currList.size(); j++){
// 				System.out.print(currList.get(j)+" ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println(mainlist);
// 	}
// }

// practice

// public class JavaBasics{
// 	public static void main(String args[]){
// 		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
// 		ArrayList<Integer> list1 = new ArrayList<>();
// 		ArrayList<Integer> list2 = new ArrayList<>();
// 		list1.add(1);
// 		list1.add(2);
// 		mainList.add(list1);
// 		list2.add(1);
// 		list2.add(2);
// 		mainList.add(list2);

// 		for(int i = 0; i<mainList.size();i++){
// 			ArrayList<Integer> currList = mainList.get(i);
// 			for(int j = 0;j <currList.size();j++){
// 				System.out.print(currList.get(j) + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println(mainList);
// 	}
// }





// 2d array

// public class JavaBasics{
// 	public static void main(String args[]){
		
// 		ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
// 		ArrayList<Integer> list1 = new ArrayList<>();
// 		ArrayList<Integer> list2 = new ArrayList<>();
// 		ArrayList<Integer> list3 = new ArrayList<>();
	

// 		for(int i = 1; i<=5; i++){
// 			list1.add(i*1); // 12345
// 			list2.add(i*2); //2 4 6 8 10
// 			list3.add(i*3);//3 6 9 12 15
// 		}
// 		mainlist.add(list1);
// 		mainlist.add(list2);
// 		mainlist.add(list3);

// 		System.out.println(mainlist);


// 		// nested loops
// 		for(int i = 0; i<mainlist.size(); i++){
// 			ArrayList<Integer> currList= mainlist.get(i);
// 			for(int j = 0; j<currList.size(); j++){
// 				System.out.print(currList.get(j) + " ");
// 			}	
// 			System.out.println();
// 		}
// 	}
// }





// Most water problem (Important) // Brute force

// public class JavaBasics{
// 	public static void storeWtaer(ArrayList<Integer> waterTank){
// 		int maxArea = 0;
// 		// Burte force
// 		for(int i = 0; i<waterTank.size() ; i++){
// 			int area = 1;
// 			for(int j = i+1; j<waterTank.size() ; j++){
// 				int width = j-i;
// 				int height = Math.min(waterTank.get(i),waterTank.get(j));
// 				area = width*height;
// 			}
// 			maxArea = Math.max(maxArea,area);
// 		}
// 		System.out.print("Max Area : ");
// 		System.out.println(maxArea);
// 	}

// 	public static void main(String args[]){
// 		ArrayList<Integer> waterTank = new ArrayList<>();
// 		waterTank.add(1);
// 		waterTank.add(8);
// 		waterTank.add(6);
// 		waterTank.add(2);
// 		waterTank.add(5);
// 		waterTank.add(4);
// 		waterTank.add(8);
// 		waterTank.add(3);
// 		waterTank.add(7);

// 		System.out.println("Water tank formation:  ");
// 		System.out.println(waterTank);
// 		storeWtaer(waterTank);
// 	}
// }



// watertank 2 pointers B0(n)

// public class JavaBasics{
// 	public static void storeWtaer(ArrayList<Integer> waterTank){
// 		int lp = 0;
// 		int rp = waterTank.size() -1;
// 		int maxArea = 0;
// 		while(lp<rp){
// 			int width = rp - lp;
// 			int height = Math.min(waterTank.get(lp), waterTank.get(rp));
// 			int area = width * height;
// 			maxArea = Math.max(area,maxArea);
// 			if(waterTank.get(lp) < waterTank.get(rp)){
// 				lp++;
// 			}else{
// 				rp--;
// 			}
// 		}
// 		System.out.print("Max area: ");
// 		System.out.println(maxArea);
// 	}

// 	public static void main(String args[]){
// 		ArrayList<Integer> waterTank = new ArrayList<>();
// 		waterTank.add(1);
// 		waterTank.add(8);
// 		waterTank.add(6);
// 		waterTank.add(2);
// 		waterTank.add(5);
// 		waterTank.add(4);
// 		waterTank.add(8);
// 		waterTank.add(3);
// 		waterTank.add(7);
// 		System.out.println("Water tank formation:  ");
// 		System.out.println(waterTank);
// 		storeWtaer(waterTank);
// 	}
// }



// pair sum  - 1 

// Brute force  

// public class JavaBasics{
// 	public static void suM(ArrayList<Integer> list, int target){
// 		for(int i = 0; i<list.size();i++){
// 			for(int j = i+1; j<list.size();j++){
// 				if(list.get(i)+list.get(j) == target ){
// 					System.out.println( " your first num : " +list.get(i)+ "  your second num : "+ list.get(j));
// 				}
// 			}
// 		}
// 	}
// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);
// 		System.out.println("Given Array: " + list);
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("WHat are you looking for in total: ");
// 		int s = sc.nextInt();
// 		suM(list,s);
// 	}
// }


// optimized approach b(o) = n

// public class JavaBasics{
// 	public static void suM(ArrayList<Integer> list, int target){
// 		int lp = 0;
// 		int rp = list.size()-1;
// 		while(lp!=rp){
// 			if(list.get(lp)+list.get(rp)==target){
// 				System.out.println("First num: " + list.get(lp) + " Second num: "+ list.get(rp));
// 			}
// 			if(list.get(lp)+list.get(rp)<target){
// 				lp++;
// 			}else{
// 				rp--;
// 			}
// 		}
// 	}

// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);
// 		System.out.println("Given Array: " + list);
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("WHat are you looking for in total: ");
// 		int s = sc.nextInt();
// 		suM(list,s);
// 	}
// }



// pair sum 2  Sorted and rotated array //2 Pointers big 0 n


// public class JavaBasics{
// 	public static void pairsuM2(ArrayList<Integer> list, int target){
// 		int breakPoint = -1;
// 		for(int i = 0; i<list.size() ; i++){
// 			if(list.get(i)>list.get(i+1)){
// 				breakPoint = i;
// 				break;
// 			}
// 		}

// 		int lp = breakPoint+1;
// 		int rp = breakPoint;
// 		int n = list.size();
// 		while(lp!=rp){
// 			//case 1
// 			if(list.get(lp)+list.get(rp) == target){
// 				System.out.println("First num " + list.get(lp) + " Second sum : " + list.get(rp) );
// 			}
// 			//case 2
// 			if(list.get(lp)+list.get(rp) < target){
// 				lp = (lp + 1) % n;
// 			}else{
// 				rp = (n+rp-1) % n;
// 			}
// 		}
// 	}

// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(11);
// 		list.add(15);
// 		list.add(6);
// 		list.add(8);
// 		list.add(9);
// 		list.add(10);
// 		System.out.println("Given Array: " + list);
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("WHat are you looking for in total: ");
// 		int s = sc.nextInt();
// 		pairsuM2(list,s);
// 	}
// }


// Practice

// public class JavaBasics{
// 	public static void pairsuM2(ArrayList<Integer> list, int target){
// 		int breakPoint = 0;
// 		for(int i = 0; i< list.size();i++){
// 			if(list.get(i)>=list.get(i+1)){
// 				breakPoint = i;
// 				break;
// 			}
// 		}
// 		int lp = breakPoint +1;
// 		int rp = breakPoint;
// 		int n = list.size();
// 		while(lp!=rp){
// 			if(list.get(lp)+list.get(rp) == target){
// 				System.out.print("First num : "+ list.get(lp) + " Second num : " +  list.get(rp));
// 			}
// 			if(list.get(lp)+list.get(rp) < target){
// 				lp = (lp + 1) % n;
// 			}else{
// 				rp = (n+(rp-1))%n;
// 			}
// 		}
// 	}

// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(11);
// 		list.add(15);
// 		list.add(6);
// 		list.add(8);
// 		list.add(9);
// 		list.add(10);
// 		System.out.println("Given Array: " + list);
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("WHat are you looking for in total: ");
// 		int s = sc.nextInt();
// 		pairsuM2(list,s);
// 	}
// }






// Notes


// Array List

// array                 |          Arraylists

// fixed size            |         dynamic size
// primitive data type   |         primitive data type        
// can be stored		 |			can't be stored 







// Assignment 1


// public class JavaBasics{
// 	public static boolean monoton(ArrayList<Integer> list){
// 		boolean incre = true;
// 		boolean decre = true;
// 		for(int i = 0 ; i<list.size()-1;i++){
// 			if(list.get(i)>list.get(i+1)){
// 				incre = false;
// 			}else if(list.get(i)<list.get(i+1)) {
// 				decre = false;
// 			}
// 		}
// 		return incre || decre;
// 	}
// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(2);
// 		System.out.println(monoton(list));
// 	}
// }


// Assignment 2


// public class JavaBasics{
// 	public static void lonelyNum(ArrayList<Integer> list){
// 		Collections.sort(list);
// 		ArrayList<Integer> temp = new ArrayList<>();

// 		for(int i=0;i<list.size();i++){
// 			if((i!=0 && i!=list.size()-1) && ((list.get(i)+1 < list.get(i+1)) && (list.get(i-1) < list.get(i)-1) )){
// 				temp.add(list.get(i));
// 			}
// 			if(i==0 && (list.get(i)+1 < list.get(i+1)) ){
// 				temp.add(list.get(i));
// 			}
// 			if(i==list.size()-1 && (list.get(i-1) < list.get(i)-1) ){
// 				temp.add(list.get(i));
// 			}
// 		}
// 		System.out.println(temp);

// 	}
// 	public static void main(String args[]){
// 		ArrayList<Integer> list = new ArrayList<>();
// 		// list.add(10);
// 		// list.add(6);
// 		// list.add(5);
// 		// list.add(12);
// 		// list.add(8);
// 		list.add(1);
// 		list.add(3);
// 		list.add(5);
// 		list.add(3);
// 		lonelyNum(list);
// 	}
// }



// Assignment 4

// import java.util.*;

// public class JavaBasics {
//     public static void BeautifulArray(int n) {
//         List<Integer> nums = new ArrayList<>();
        
//         // Append all odd numbers from 1 to n
//         for (int i = 1; i <= n; i += 2) {
//             nums.add(i);
//         }
//         // Append all even numbers from 1 to n
//         for (int i = 2; i <= n; i += 2) {
//             nums.add(i);
//         }
//         System.out.print(nums); 
//     }

//     public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Add Number of array: ");
// 		int  n = sc.nextInt();
// 		BeautifulArray(n);

//     }
// }
