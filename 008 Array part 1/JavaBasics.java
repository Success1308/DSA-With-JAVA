import java.util.*;

// public class JavaBasics{

//     public static void main(String arg[]){

//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Add Array: ");
//         // int a =sc.nextInt();

//         // int marks[] = new int[50];
//         // int numbers[] = {1,2,3};
//         // int moreNumbers[] = {4,5,6};
//         // String fruits[] = {"apple", "Mango" , "orange"};

//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Add marks: ");
//         marks[0] = sc.nextInt(); //phy
//         marks[1] = sc.nextInt(); //chem
//         marks[2] = sc.nextInt(); //maths
//         System.out.println("Phy : " + marks[0] + " Chem : " + marks[1] +" Maths : " + marks[2] );
//         marks[2]++;
//         System.out.println("Maths : " + marks[2] );
//         //Lenght of array
//         System.out.println("Lenght of array : " + marks.length );
//     }
// }


// array by reference

// public class JavaBasics{
//     public static void update(int marks[], int unchangeable){
//             unchangeable = 10;
//         for (int i = 0 ; i < marks.length; i++ ){
//             marks[i]++;
//         }
//     }

//     public static void main(String args[]){
//         int marks[] = {54, 76, 34};
//         int unchangeable = 5;
//         System.out.println(marks[2]);
//         System.out.println(unchangeable);
//         update(marks,unchangeable);
//         System.out.println(marks[2]);

//         for (int i = 0 ; i < marks.length; i++ ){
//             System.out.print ("addition through loop: " + marks[i] +" " + unchangeable+ " ");
//         }
//          System.out.println();

//          System.out.println(unchangeable);
//     }
// }



//liner search:

// public class JavaBasics{

//     public static int linearSearch(int number[], int key){

//         for (int i = 0; i<number.length; i++){
//             if(number[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 10;
//         int index = linearSearch(numbers,key);
//         if(index == -1){
//             System.out.println("Not Found");
//         }else{
//             System.out.println("key use at index : " + index);
//         }
//     }
// }



//largest Number

// public class JavaBasics{

//     public static int getLargest(int numbers[]){

//             int largest  = Integer.MIN_VALUE  ; // - inifinity
//             int smallest = Integer.MAX_VALUE;

//         for (int i = 0; i<numbers.length; i++){
//              if (largest<numbers[i])  { 
//                 largest = numbers[i];
//              }
//             if (smallest>numbers[i])  { 
//                 smallest = numbers[i];
//              }
//         }
//         System.out.println("smallest value is: " + smallest);
//         return largest;
//     }

//     public static void main(String args[]){
//         int numbers[] = {1,2,6,3,5};
//         System.out.println("largest : " + getLargest(numbers));
//     }
// }

//Binary search:

// public class JavaBasics{

//     public static int binarySearch(int numbers[], int key){
//         int start = 0 , end = numbers.length-1;
//         while(start<= end){
//             int mid = (start+end)/2;
//             //comarisons
//             if(numbers[mid] == key ){
//                 return mid;
//             }
//             if(numbers[mid] < key){// right
//                 start=mid+1;
//             }else { //left
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14};
//         int key = 12;
//         System.out.println("index for key is: " + binarySearch(numbers,key));
//     }
// }


// Reverse in array:

// public class JavaBasics{

//     public static void reverse(int numbers[]){
//         int first = 0 , last = numbers.length-1;
//         while(first<last){
//             //swap
//             int temp = numbers[last];
//             numbers[last] =numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;
//         }
//     }

//     public static void main(String args[]){
//         int sam[] = {2,4,6,8,10,12,14};
//         System.out.println("reverse is: ");
//         reverse(sam);
//         for(int i= 0; i<sam.length; i++){
//             System.out.print(sam[i] + " ");
//         }
//         System.out.println();
//     }
// }


//pairs in array

// public class JavaBasics{

//     public static void pairs(int numbers[]){
//         int tp = 0;
//         for (int i = 0; i<numbers.length ;i++){
//             int curr = numbers[i]; // 2,4,6,8,10
//             for (int j = i+1; j<numbers.length ;j++){
//                 System.out.print("(" + curr + "," + numbers[j] + ")" );
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs: " + tp);
//     }

//     public static void main(String args[]){
//         int sam[] = {2,4,6,8,10};
//         pairs(sam);
//     }
// }


//print sub arrays
//a continous part of array

//second function sum of array brute force method

// public class JavaBasics{
//     public static void subarray(int numbers[]){
//        int ts = 0;
//         for (int i = 0; i<numbers.length ;i++){
//             int start = i; // 2,4,6,8,10
//             for (int j = i; j<numbers.length ;j++){
//                 int end = j;
//                  for (int k = start; k<=end ;k++){
//                     System.out.print(numbers[k] + " ");
//                  }

//                  ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarray: " + ts);
//     }
//         //brute force n rest to 3 time complexity
//         public static void sumsubarray(int numbers[]){

//         for (int i = 0; i<numbers.length ;i++){
//             int start = i; // 2,4,6,8,10
//             int sum = 0;
//             for (int j = i; j<numbers.length ;j++){
//                 int end = j;
//                  sum = 0;
//                  for (int k = start; k<=end ;k++){
//                     sum += numbers[k];
//                  }
//                 System.out.println("sum:");
//                 System.out.println(sum + " ");
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String args[]){
//         int sam[] = {2,4,6,8,10};
//         subarray(sam);
//         System.out.println();
//         sumsubarray(sam);

//     }
// }




//Note:

// Array
// list of elements of the same type.
// placed un a contiguous (one by one) memory location.

// 0-based indexing

// type should be same

//OPERATIONS in array

// -create
// -input
// -output
// -update


// Syntax:
// creating array:


// dataType arrayName[] = new dataType[size];

// Ex:

// int marks[] = new int[50];
// int numbers[] = {1,2,3};
// int moreNumbers[] = {4,5,6};
// String fruits[] = {"apple", "Mango" , "orange"};


// if we dont add value it will take null value


//input/output


// liner search 
// find the index of the element in a given array


// largest number:
// find the largest number in given array


//Binary search:
// prerequisite - sorted array

// pseudo code

// start = o ; end = n-1

// while(start<=end)

// find mid
// compare mid & key
// mid== key Found
// mid> key left
// mid<key Right