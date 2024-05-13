import java.util.*;

// public class JavaBasics {

//   //1   
//     // public static void printHelloworld(){
//     // System.out.println("Hello World!");
//     // System.out.println("Hello World!");
//     // System.out.println("Hello World!");
//     // }

//     //2
//     // public static int calculateSum(int num1, int num2) {// num 1 and num 2 is formal parameters
//     //     int sum = num1 + num2;
//     //     return sum;
//     // }

//     //3 
    // public static int swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b=temp;
    //     System.out.println("a : " +a);
    //     System.out.println("b : "+ b);
    //     return a & b;

//     //4 product a and b
//     // public static int multiPly(int numb1, int numb2) {
//     //     int product = numb1 * numb2;
//     //     return product;

//     //5 factorial of n

    // public static int factorial(int b){

    //     int f = 1;
    //     for (int i = 1 ; i<=b ; i++){
    //         f = f * i;
    //     }
    //     return f;
    // }

    // // 6 prime number or not (normal method) (optimize math.sqrt(n))

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     if (n==2){
    //         return true;
    //     } else{
    //         for (int i = 2; i <= Math.sqrt(n) ;i++){
    //         if (n%i==0){
    //             return false;
    //         }
    //     }
    //     }
    //     return true;
    // }

    // // // // 7 print all primes in range:

    // public static int primeinRange(int n){
    //     for (int i = 2; i<= n ; i++ ){
    //         if(isPrime(i)){
    //             System.out.print(i + " ");
    //         }
    //     }
    //     return n;
    // }


        //binary to dec
        // public static void binToDec(int binNum){
        //     int myNum = binNum;
        //     int pow = 0;
        //     int decNum = 0;
        //     while(binNum>0){
        //         int lastDigit = binNum%10;
        //         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
        //         pow++;
        //         binNum = binNum / 10;
        //     }
        //     System.out.print("decimal of " + myNum + " = " + decNum);
        // }
        


//         //decimal to binary:

//         // public static void decToBin(int n){
//         //     int myNum = n;
//         //     int pow = 0;
//         //     int binNum = 0;
//         //     while (n>0){
//         //         int rem = n%2;
//         //         binNum = binNum + (rem * (int) Math.pow(10,pow));
//         //         pow++;
//         //         n = n/2;

//         //     }

//         //     System.out.print("decimal of " + myNum + " = " + binNum);
//         // }
        
// // --------------------------------------------------------------------------------------------------------



    // public static void main(String args[]){

//       //1  // printHelloworld();

//       //2
//         // Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int total = calculateSum(a,b); // a and b is "argument" actual parameters

//         // System.out.println("Sum is : " + total);

//         //3  Swap  avalue exchnage

//         // int a = 5;
//         // int b = 10;
//         // swap(a,b);
//         // System.out.println("a : " + a);
//         // System.out.println("b : " + b);


//         //4 product of a and b

//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("a : " );
//         // int a = sc.nextInt();
//         // System.out.print("b : ");
//         // int b = sc.nextInt();
//         // int total = multiPly(a,b);
//         // System.out.print("a x b : " + total ); 

//         //5 factorial of n number:
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("factorial of number  : " );
//         // int a = sc.nextInt();
//         // System.out.print("factorial of " +  a + ":" +factorial(a));
        
//         //6 check if a prime number: + 7 range in prime number
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("number  : " );
//         // int a = sc.nextInt();
//         // System.out.println( a + " is prime: " + isPrime(a) + " ");
//         // System.out.println(  " all the prime number below: "  + primeinRange(a));
        

//         // //binary to decimal:
//         // binToDec(111);

        
//         // //decimal to debinarycimal:
//         // decToBin(7);


//     }
// }

// // //note:

// // Functions/methods:

// // =>  its like button on remote.
// // => reusable


// // Syntax:

// // public static "(Access modifier) "returntype"(void, int, etc)" functionName("formal Parameters" it can be empty){
// //     "body"

// //     return statement;

// // }

// // call back:

// // =>  functionName(argument patrameter);



// // Syntax with parameters:

// // public static "(Access modifier) "returntype"(void, int, etc)" functionName(type param1, type param2){
// //     "body"

// //     return statement;

// // }

// // call back:

// // =>  functionName(argument param1, argument param2);


// // Call stack Memory 

//         // |     |
//         // |_____| int          Memory occupy in stack frame
//         // |_____|  String 


// // Java always call by value

// // methods:

// // 1. user defined method: (defined by us)
// // 2. inbuilt method (inbuilt method):  (math.sqrt math.pow sc.next)


// //function overloading:
// // Multiple functions with the same name but different parameter

// // using parameters:
// // sum(int a , int b) 
// // sum(int a , int b, int c) 

// // using data type:
// // sum(int a , int b) 
// // sum(float a , float b) 





// // convert from binary to decimal:

// // {0,1}

// // (0)10 = (0)2
// // (1)10 = (01)2
// // (2)10 = (10)2
// // (3)10 = (11)2
// // (4)10 = (100)2
// // (5)10 = (101)2
// // (6)10 = (110)2
// // (7)10 = (111)2
// // (8)10 = (1000)2



// // import java.util.*;
// // public class q {

// // Q1 
//     // public static int avg (int a , int b, int c) {

//     //     int avgt = (a+b+c)/3;
//     //     return avgt;
//     // }


// //Q2 
//     // public static boolean isEven(int a){
//     //     boolean even = true;
//     //     if (a%2 == 0){
//     //         even = true;
//     //     } else {
//     //         even = false;
//     //     }
//     //     return even;

//     // }


// //q3 

//     // public static boolean isPali(int a){
//     //     int palindrome = a;
//     //     int reverse = 0;
//     //     while(palindrome != 0){
//     //         int rem = palindrome % 10;
//     //         reverse = reverse * 10 + rem;
//     //         palindrome = palindrome /10;
//     //     }
//     //     if (a == reverse ){
//     //         return true;
//     //     } return false;
//     // }


// //q5

//     // public static int sum (int a) {
//     //    int newNum = 0;
//     //     while(a>0){
//     //         int b = a%10;
//     //         newNum += b;
//     //         a/=10;
//     //     }
//     //     return newNum;
//     // }

    

//     // public static void main(String arg[]){
// // Q1 
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("x : " );
//         // int x = sc.nextInt();
//         // System.out.print("y : " );
//         // int y = sc.nextInt();
//         // System.out.print("z : " );
//         // int z = sc.nextInt();
//         // System.out.print("Average of 3 : " + avg(x,y,z) );

// //Q2 
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("e : " );
//         // int e = sc.nextInt();
//         // System.out.print("is even: " + isEven(e) );

// //Q3
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("f : " );
//         // int f = sc.nextInt();
//         // System.out.print("is palindrome: " + isPali(f) );


// //q5

//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("h : " );
//         // int h = sc.nextInt();
//         // System.out.print("sum of: " + sum(h) );

// //     }
// // }







public class JavaBasics{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Number  : " );
        int a = sc.nextInt();
        int st = 1;
        int sp = 1;

        for (int i = 1; i <= a ; i++){

            for (int j = 1; j <= i ; j++){
                System.out.println("* ");
            }
            // st++;

            // for (int j = 1; j<= sp ; j++){
            //     System.out.println(" ");
            
            // }
            // sp++;

        }
        System.out.println();
    }
}


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