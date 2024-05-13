import java.util.*;

// bubble sort

// public class JavaBasics{

//     public static void sortBuuble(int n[]){
//         for(int i = 0; i<n.length-1; i++){
//             for(int j = 0; j<n.length-1-i; j++){
//                 if(n[j]<n[j+1]){ //if > then decreasing order
//                     int temp = n[j];
//                     n[j] = n[j+1];
//                     n[j+1] = temp;
//                 }
//             } 
//         }
//     }

//     public static void print(int n[]){
//         for(int i = 0; i<n.length; i++){
//             System.out.print(n[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         int sam[] = {5,4,1,3,2};
//         sortBuuble(sam);
//         print(sam);
//     }
// }

//selection sort

// public class JavaBasics{

//     public static void sortSelection(int n[]){
//         for(int i = 0; i<n.length-1; i++){
//             int minPos = i;
//             for(int j = i+1; j<n.length; j++){ //if > then decreasing order
//                 if(n[minPos]>n[j]){
//                     minPos=j;
//                 }
//             } 
//             //swap
//             int temp = n[minPos];
//             n[minPos] = n[i];
//             n[i] = temp;
//         }
//     }
//         public static void print(int n[]){
//         for(int i = 0; i<n.length; i++){
//             System.out.print(n[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int sam[] = {5,4,1,3,2};
//         sortSelection(sam);
//         print(sam);
//     }
// }


//Insertion sort:

// public class JavaBasics{

//     public static void sortInsertion(int n[]){
//         for(int i = 1; i<n.length; i++){
//             int  curr = n[i];
//             int prev = i-1;
//             //finding out the correct position to insert
//             while(prev>=0 && n[prev] > curr){
//                 n[prev+1]= n[prev];
//                 prev--;
//             }
//             //insertion 
//             n[prev+1] = curr;
//         }
//     }

//         public static void print(int n[]){
//         for(int i = 0; i<n.length; i++){
//             System.out.print(n[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         int sam[] = {5,4,1,3,2};
//         sortInsertion(sam);
//         print(sam);
//     }
// }

// inbuilt function:

// public class JavaBasics{

//     public static void print(int n[]){
//         for(int i = 0; i<n.length; i++){
//         System.out.print(n[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         int sam[] = {5,4,1,3,2};
//         int sam1[] = {5,4,1,3,2};
//         Integer sam3[] = {5,4,1,3,2};
//         Arrays.sort(sam);
//         Arrays.sort(sam1,0,3); // sorting from index
//         print(sam);
//         print(sam1);
//         Arrays.sort(sam3,collection.reverseOrder());
//          print(sam3);
//     }
// }




//counting sort

// public class JavaBasics{

//         public static void sortInsertion(int num[]){
//                 int largest = Integer.MIN_VALUE;
//                 for (int i = 0;i<num.length;i++){
//                     largest = Math.max(largest,num[i]);    
//                 }

//                 int counter[] = new int[largest+1];
//                 for (int i = 0;i<num.length;i++){
//                     counter[num[i]]++;  
//                 }
                
//                 //sorting
//                 int j = 0;
//                 for (int i = 0;i<counter.length;i++){
//                         while(counter[i]>0){
//                                 num[j] = i;
//                                 j++;
//                                 counter[i]--;
//                         }
//                 }

//         }

//         public static void print(int n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//              int sam[] = {1,4,1,3,2,4,3,7};
//              sortInsertion(sam);
//              print(sam);   

//         }
// }






// notes


// sort:

// basic algorithms

// 1. bubble sort:

//     inspiration from bubble in water 
//     Ideas: large elements come to the end of the array by swapping with adjacent elements

//     {5,4,1,3,2} unsorted array
//     {1,2,3,4,5} increasing array
//     {5,4,3,2,1} decreasing array

// 2. selection sort
        // pick smallest (from unsorted), put it at the beginning

// 3. intertion sort:

        // pick and element (from unsorted part) & place in the right position in sorted part

// inbuilt function

// import java.util.Arrays;
// Arrays.sort(arr)
// 0(n logn)

// 4. counting sort

// public class JavaBasics{

//         public static void sortBubble(int num[]){
//                 for (int i = 0;i<num.length;i++){
//                         for (int j = 0;j<num.length-1;j++){
//                                 if(num[j]>num[j+1]){
//                                         int temp = num[j];
//                                         num[j] = num[j+1];
//                                         num[j+1] = temp;
//                                 }

//                         }
//                 }
//         }

//         public static void print(int n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//              int sam[] = {5,4,3,1,2};
//              sortBubble(sam);
//              print(sam);   
//         }
// }














// assignment:
// 1. Bubble sort

// public class JavaBasics{

//         public static void sortBubble(int num[]){       
//                 for (int i = 0;i<num.length;i++){
//                         for (int j = 0;j<num.length-1;j++){
//                                 if(num[j]<num[j+1]){
//                                         int temp = num[j];
//                                         num[j] = num[j+1];
//                                         num[j+1] = temp;
//                                 }
//                          }
//                 }

//         }

//         public static void print(int n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//              int sam[] = {3,6,2,1,8,7,4,5,3,1};
//              sortBubble(sam);
//              print(sam);   

//         }
// }



//2. selectionSort:


// public class JavaBasics{

//         public static void sortSelection(int num[]){
//                 for (int i = 0;i<num.length;i++){
//                         int numBig = i;
//                         for (int j = i+1;j<num.length;j++){
//                                 if(num[numBig] < num[j]){
//                                         numBig = j;
//                                 }
//                         }
//                         int temp = num[numBig];
//                         num[numBig] = num[i];
//                         num[i] = temp;
//                 }
//         }

//         public static void print(int n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//              int sam[] = {3,6,2,1,8,7,4,5,3,1};
//              sortSelection(sam);
//              print(sam);   

//         }
// }


// 3. insertion sort:

// public class JavaBasics{

//         public static void sortInsertion(int num[]){
//                 for(int i = 1;i<num.length;i++){
//                         int curr = num[i];
//                         int prev = i-1;
//                         while(prev>=0 && num[prev] < curr){
//                                 num[prev+1] = num[prev];
//                                 prev--;
//                         }
//                         num[prev+1] = curr;
//                 }

//         }

//         public static void print(int n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//                 int sam[] = {3,6,2,1,8,7,4,5,3,1};
//                 sortInsertion(sam);
//                 print(sam);   

//         }
// }

// 4. counter


// public class JavaBasics{

//         public static void sortInsertion(int num[]){
//                 int largest = Integer.MIN_VALUE;
//                 for (int i = 0;i<num.length;i++){
//                     largest = Math.max(largest,num[i]);    
//                 }

//                 int counter[] = new int[largest+1];
//                 for (int i = 0;i<num.length;i++){
//                     counter[num[i]]++;  
//                 }
                
//                 //sorting
//                 int j = 0;
//                 for (int i = 0;i<counter.length;i++){
//                         while(counter[i]>0){
//                                 num[j] = i;
//                                 j++;
//                                 counter[i]--;
//                         }
//                 }

//         }

//         public static void print(int n[]){
//                 for (int i = n.length-1;i>=0;i--){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//             int sam[] = {3,6,2,1,8,7,4,5,3,1};
//              sortInsertion(sam);
//              print(sam);   

//         }
// }


// 5. built in

// public class JavaBasics{


//         public static void print(Integer n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//                 Integer sam[] = {3,6,2,1,8,7,4,5,3,1};
//                 Arrays.sort(sam,Collections.reverseOrder());
//                 print(sam);   

//         }
// }




// public class JavaBasics{

//         public static void sortBubble(int num[]){
//                 for(int i = 0;i<num.length;i++){
//                         int numBig = i;
//                         for(int j = i+1;j<num.length;j++){
//                                 if(num[numBig] < num[j]){
//                                         numBig = j;
//                                 }
//                         }
//                         int temp = num[numBig];
//                         num[numBig] = num[i];
//                         num[i] = temp;
//                 }
//         }

//         public static void print(int n[]){
//                 for (int i = 0;i<n.length;i++){
//                         System.out.print(n[i] + " ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//                 int sam[] = {3,6,2,1,8,7,4,5,3,1};
//                 sortBubble(sam);
//                 print(sam);   

//         }
// }