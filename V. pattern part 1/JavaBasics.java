import java.util.*;

public class JavaBasics{

    public static void main(String arg[]){

// Self attempt: did nt work: so moving to video: lol
// pattern

// *
// **
// ***
// **** 


        // Scanner sc = new Scanner(System.in);
        // System.out.print("please eneter how many line you wanna star : ");
        // int range = sc.nextInt();

        // // row
        // for (int i = 1 ; i <= range ; i++){
        //     // column 
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



// **** 
// ***
// **
// *
      //Shrdha method
        // Scanner sc = new Scanner(System.in);
        // System.out.print("please eneter how many line you wanna star : ");
        // int range = sc.nextInt();

        // // row
        // for (int i = 1 ; i <= range ; i++){
        //     // column 
        //     for(int j = 1 ; j < (range - i +1) ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
// **** 
// ***
// **
// *
        //my method
        // Scanner sc = new Scanner(System.in);
        // System.out.print("please eneter how many line you wanna star : ");
        // int range = sc.nextInt();

        // // row
        // for (int i = range ; i >= 1 ; i--){
        //     // column 
        //     for(int j = 1 ; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
// 12345
// 1234
// 123
// 12
// 1
        // my method
        // Scanner sc = new Scanner(System.in);
        // System.out.print("please eneter how many line you wanna star : ");
        // int range = sc.nextInt();
        // int sum = 1;

        // // row
        // for (int i = range ; i >= 1 ; i--){
        //     // column 
        //     for(int j = 1 ; j <= i; j++){
        //         System.out.print(j);
             
        //     }
        //     System.out.println();
        // }
    






    // half pyramid with numbers


// 1
// 12
// 123
// 12345
            // // my method
            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int range = sc.nextInt();
            // // row
            // for (int i = 1 ; i <= range ; i++){
            // // column 
            //     for(int j = 1 ; j <= i; j++){
            //         System.out.print(j); 
            //     }

            // System.out.println();
            // }
// 1
// 22
// 333
// 4444
// 55555
            // // my method
            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int range = sc.nextInt();
            // // row
            // for (int i = 1 ; i <= range ; i++){
            // // column 
            //     for(int j = 1 ; j <= i; j++){
            //         System.out.print(i);  
            //     }

            // System.out.println();
            // }

// 1+1
// 2+12+2
// 3+13+23+3
// 4+14+24+34+4
// 5+15+25+35+45+5


            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int range = sc.nextInt();
            // // row
            // for (int i = 1 ; i <= range ; i++){
            // // column 
            //     for(int j = 1 ; j <= i; j++){
            //         System.out.print((i)+"+"+ (j));  
            //     }

            // System.out.println();
            // }


// 1
// 11
// 111
// 1111
// 11111
// 111111

            // // my method
            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int range = sc.nextInt();
            // int sum = 0;
            // // row
            // for (int i = 1 ; i <= range ; i++){
            // // column 
            //     for(int j = 1 ; j <= i; j++){
            //         sum++;
            //         System.out.print(sum); 
            //         sum = 0;
            //     }

            // System.out.println();
            // }
// 1
// 23
// 456
// 78910
 
            // // my method
            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int range = sc.nextInt();
            // int sum = 0;
            // // row
            // for (int i = 1 ; i <= range ; i++){
            // // column 
            //     for(int j = 1 ; j <= i; j++){
            //         sum++ ;
            //         System.out.print(sum); 
            //     }
            // System.out.println();
            // }
// A
// BC
// DEF
// GHIJ
// KLMNO   
            // my method
            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int range = sc.nextInt();
            // char ch = 'A';
            // // row
            // for (int i = 1 ; i <= range ; i++){
            // // column 
            //     for(int j = 1 ; j <= i; j++){ 
            //         System.out.print(ch);
            //         ch++; 
                  
            //     }
            // System.out.println();
            // }



// butter fly
// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * * * * * * * * 
// * * * *     * * * *
// * * *         * * *
// * *             * * 
// *                 *

            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int n = sc.nextInt();

            // int st = 1;
            // int sp = 2*n - 2;

            // // row
            // for ( int i =1; i <= 2*n; i++){

            // // Star 
            //     for(int j = 0 ; j < st; j++){ 
            //         System.out.print("* "); 
            //     }
            // // space
            //     for(int j = 0 ; j < sp; j++){ 
            //         System.out.print("  "); 
            //     } 
            // // Star 
            //     for(int j = 0 ; j < st; j++){ 
            //         System.out.print("* "); 
            //     }

            //     if(i<n){
            //             st++;
            //             sp -=2; 
            //     } else if(i>n){
            //             st--;
            //             sp +=2;
            //     }
            //     System.out.println();
            // }

// diamond

//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *


            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int n = sc.nextInt();

            // int st = 1;
            // int sp = n - 1;

            // // row
            // for ( int i =1; i <= 2*n - 1 ; i++){

            // // space
            //     for(int j = 0 ; j < sp; j++){ 
            //         System.out.print("  "); 
            //     }  
           
            // // Star 
            //     for(int j = 0 ; j < st; j++){ 
            //         System.out.print("* "); 
            //     }

            //     if(i<n){
            //             st += 2 ;
            //             sp--; 
            //     } else{
            //             st -= 2;
            //             sp++;
            //     }
            //     System.out.println();
            // }


// hollow rombus

//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * *


            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int n = sc.nextInt();

            // int st = 1;
            // int osp = n - 1;
            // int isp = n - 2;

            // // row
            // for ( int i =1; i <= n ; i++){

            //     if ( i == 1 || i == n){ 
            //             // space
            //                 for(int j = 0 ; j < osp; j++){ 
            //                     System.out.print("  "); 
            //                 }  
                    
            //             // Star 
            //                 for(int j = 0 ; j < n; j++){ 
            //                     System.out.print("* "); 
            //                 }
            //     } else{

            //         //outer space
            //             for(int j = 0 ; j < osp; j++){ 
            //                 System.out.print("  "); 
            //             }  
            //         //star
            //          System.out.print("* "); 
            //         //inner space
            //             for(int j = 0 ; j < isp; j++){ 
            //                 System.out.print("  "); 
            //             }  
            //             System.out.print("* "); 
                     
            //     }
            //     System.out.println();
            //     osp--;
            
            // }}


//Number pattern

//         1
//       2  1  2
//     3  2  1  2  3
//   4  3  2  1  2  3  4  
// 5  4  3  2  1  2  3  4  5

            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int n = sc.nextInt();

            // int st = 1;
            // int sp = n - 1;

            // // row
            // for ( int i =1; i <= n ; i++){

      
            //     // space
            //         for(int j = 0 ; j < sp; j++){ 
            //             System.out.print("  "); 
            //         }  
            
            //     // Star 
            //         int s = i;
            //         for(int j = 0 ; j < st; j++){ 
            //             System.out.print( s + " "); 
            //             if (j < st/2){
            //                 s--;
            //             } else{
            //                 s++;
            //             }
            //             System.out.print( " "); 
            //         }
            //     // next line
            //         sp--;
            //         st+=2;
            //         System.out.println();

// pattern number
//         1
//       2  2
//     3  3  3
//   4  4  4  4
// 5  5  5  5  5 


            // Scanner sc = new Scanner(System.in);
            // System.out.print("please eneter how many line you wanna number : ");
            // int n = sc.nextInt();

            // int st = 1;
            // int sp = n - 1;

            // // row
            // for ( int i =1; i <= n ; i++){

      
            //     // space
            //         for(int j = 0 ; j < sp; j++){ 
            //             System.out.print("  "); 
            //         }  
            
            //     // Star 
       
            //         for(int j = 0 ; j < st; j++){ 
            //             System.out.print( i + " "); 
 
            //             System.out.print( " "); 
            //         }
            //     // next line
            //         sp--;
            //         st++;
            //         System.out.println();

                }
                
            }



}


// Notes:

//pattern

// nested loops:

