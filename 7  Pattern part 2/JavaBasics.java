
import java.util.*;

// Hollow rectangle

// * * * * * *
// *         *
// *         *
// * * * * * *

// public class JavaBasics {

//     public static void hollowRec(int row, int col){
//         //outer loop
//         for(int i=1; i<= row; i++){
//             //inner - columns
//             for(int j=1; j<= col; j++){
//                     //cell (i,j)
//                     if (i==1||i==row||j==1||j==col){
//                     //boundry cell
//                         System.out.print("* ");
//                     } else{
//                         System.out.print("  ");
//                     }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){

//         System.out.println("Hollow rectangle detail: ");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("add row : ");
//         int row = sc.nextInt();
//         System.out.print("add column : ");
//         int col = sc.nextInt();
//         System.out.println("your result : ");
//         hollowRec(row,col);


//     }
// }

// Hollow Square

// * * * *
// *     *
// *     *
// * * * *

// public class JavaBasics {

//     public static void hollowRec(int num){
//         //outer loop
//         for(int i=1; i<= num; i++){
//             //inner - columns
//             for(int j=1; j<= num; j++){
//                     //cell (i,j)
//                     if (i==1||i==num||j==1||j==num){
//                     //boundry cell
//                         System.out.print("* ");
//                     } else{
//                         System.out.print("  ");
//                     }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         System.out.println("Hollow rectangle detail: ");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("add Number : ");
//         int a = sc.nextInt();
//         System.out.println("your result : ");
//         hollowRec(a);
//     }
// }


// inverted roatated pyramid

//       *
//     * *
//   * * *
// * * * *

// public class JavaBasics {
//     public static void Pyra(int num){
//         //outer loop
//         for(int i=1; i<= num; i++){
//             //inner - columns
//             for(int j=1; j<= num-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<= i; j++){
//                 System.out.print("*");
//             } 
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){

//         System.out.println("Hollow rectangle detail: ");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("add Number : ");
//         int a = sc.nextInt();
//         System.out.println("your result : ");
//         Pyra(a);
//     }
// }

// inverted half pyramid with number

// 12345
// 1234
// 123
// 12
// 1

// public class JavaBasics{

//     public static void Pyro(int n){

//         for(int i = 1 ; i<= n ; i++){
//             for(int j = 1 ; j<= n - i + 1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Add number: ");
//         int a = sc.nextInt();
//         Pyro(a);
//     }
// }


// floyd triangle:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class JavaBasics{

//     public static void floyd(int n){
//         int s = 1;
//         for (int i=1 ; i<=n ;i++){
//             for (int j=1 ; j<= i ;j++){
//                 System.out.print( s + " ");
//                 s++;
//             } 
//             System.out.println();           
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Add Number : ");
//         int a = sc.nextInt(); 
//         System.out.println("result : ");
//         floyd(a);
//     }
// }



// 0 to 1 triangle:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


// public class JavaBasics{
//     public static void tri(int n){
//         for (int i =1 ; i<=n ;i++){
//             for (int j =1 ; j<=i ;j++){
//                 if ((i+j)%2 == 0){
//                     System.out.print("1 ");
//                 } else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Add Number : ");
//         int a = sc.nextInt();
//         System.out.println("result : ");
//         tri(a);
//     }  
// }



// Butter fly pattern:

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


// public class JavaBasics{

//     public static void butt(int n){

//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=i; j++){   
//                 System.out.print("*");
//             }   
//             for (int j=1; j<= 2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=i; j++){   
//                 System.out.print("*");
//             } 
//             System.out.println();
//         }


//         for (int i=n; i>=1; i--){
//             for (int j=1; j<=i; j++){   
//                 System.out.print("*");
//             }   
//             for (int j=1; j<= 2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=i; j++){   
//                 System.out.print("*");
//             } 
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("add Number: ");
//         int a = sc.nextInt();
//         System.out.println("your butter: ");
//         butt(a);
//     }
// }


// Solid Rhombus
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *

// public class JavaBasics{
//     public static void romb(int n){
//         for(int i=1;i<=n;i++){
//             //space
//             for(int j=1;j<= n-i ;j++){
//                 System.out.print(" ");
//             }
//             //st
//             for(int j=1;j<=n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Add Number : ");
//         int a = sc.nextInt();
//         System.out.println("rombo baby : ");
//         romb(a);
//     }
// }


// Hollow Rhombus:
//     * * * * *
//    *       *
//   *       *
//  *       *
// * * * * *


// public class JavaBasics{

//     public static void holrom(int n){

//         for(int i = 1 ; i<=n ; i++){
//             for(int j = 1 ; j<= n-i ; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<=n ; j++){
//                 if (i==1 || j== n || i == n || j ==1){
//                     System.out.print("* ");
//                 } else{
//                     System.out.print("  "); 
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Add Number: ");
//         int a = sc.nextInt();
//         System.out.println("Result : ");
//         holrom(a);
//     } 
// }


// Diamond pattern


//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *


// public class JavaBasics{
//     public static void dia(int n){
//         for(int i = 1; i<=n; i++ ){
//             for(int j = 1; j<= n-i; j++ ){
//                 System.out.print("  "); 
//             }
//             for(int j = 1; j<= 2*i - 1; j++ ){
//                 System.out.print("* "); 
//             }
//             System.out.println();
//         }
//         for(int i = n - 1; i>=1; i-- ){
//             for(int j = 1; j<= n-i; j++ ){
//             System.out.print("  "); 
//             }
//             for(int j = 1; j<=2*i - 1; j++ ){
//             System.out.print("* "); 
//             }
//             System.out.println();
//             }
//     }

//     public static void main(String arg[]){

//         Scanner sc= new Scanner(System.in);
//         System.out.print("Add number : ");
//         int a = sc.nextInt();
//         System.out.println("your diamond : ");
//         dia(a);

//     }


// }


// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
//         * *
//       * * * *
//     * * * * * *
//   * * * * * * * *


// public class JavaBasics{
//     public static void patt(int n){

//         for(int i = 1 ; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("* ");  
//             }
//             for(int j = 1 ; j<=2*(n-i); j++){
//                 System.out.print("  "); 
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("* ");  
//             }
//             System.out.println();
//         }

//         for(int i = n - 1 ; i >= 1; i--){
//             for(int j = 1; j<=i; j++){
// //                 System.out.print("  ");  
// //             }
// //             for(int j = 1 ; j<=2*(n-i); j++){
// //                 System.out.print("* "); 
// //             }
// //             for(int j = 1; j<=i; j++){
// //                 System.out.print("  ");  
// //             }
// //             System.out.println();
// //         }
// //     }

// //     public static void main(String arg[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Add Number : ");
// //         int a = sc.nextInt();
// //         System.out.println("result: ");
// //         patt(a);
// //     }
// // }

// //   * * * * * * * *
// //     * * * * * *
// //       * * * *
// //         * *

// //          *
// //          *
// //         * *
// //       * * * *
// //     * * * * * *
// //   * * * * * * * *


// public class JavaBasics{
//     public static void patt(int n){

//         for(int i = 1 ; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("  ");  
//             }
//             for(int j = 1 ; j<=2*(n-i); j++){
//                 System.out.print("* "); 
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("  ");  
//             }
//             System.out.println();
//         }
//             System.out.println("         * ");
//             System.out.print("         * ");
//         for(int i = n ; i>=1; i--){

//             for(int j = 1; j<=i; j++){
//                 System.out.print("  ");  
//             }
//             for(int j = 1 ; j<=2*(n-i); j++){
//                 System.out.print("* "); 
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("  ");  
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Add Number : ");
//         int a = sc.nextInt();
//         System.out.println("result: ");
//         patt(a);
//     }
// }



// revrse Diamond pattern


// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *

// *               *
// * *           * *
// * * *       * * *
// * * * *   * * * *


// public class JavaBasics{

//     public static void dia(int n){

//         for(int i = 1; i<=n; i++ ){

//             for(int j = 1; j<= n-i; j++ ){
//                 System.out.print("* "); 
//             }
//             for(int j = 1; j<= 2*i - 1; j++ ){
//                 System.out.print("  "); 
//             }
//             for(int j = 1; j<= n-i; j++ ){
//                 System.out.print("* "); 
//             }
//             System.out.println();
//         }

//         for(int i = n -1; i>=1; i-- ){

//             for(int j = 1; j<= n-i; j++ ){
//             System.out.print("* "); 
//             }
//             for(int j = 1; j<=2*i - 1; j++ ){
//             System.out.print("  "); 
//             }
//             for(int j = 1; j<= n-i; j++ ){
//                 System.out.print("* "); 
//             }
//             System.out.println();
//             }
//     }

//     public static void main(String arg[]){

//         Scanner sc= new Scanner(System.in);
//         System.out.print("Add number : ");
//         int a = sc.nextInt();
//         System.out.println("your diamond : ");
//         dia(a);
//     }
// }
