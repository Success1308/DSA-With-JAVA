import java.util.*;

public class JavaBasics {
    public static void main(String arg[]){


//      1. while Loop:

//     Normal example

        // int counter = 0;

        // while(counter < 10){
        //     System.out.println("Hi");
        //     counter ++;

        // }

        
//      Print first 10 numbers

        // int counter = 0;

        // while(counter <= 10){

        //     System.out.println(counter);
        //     counter++;

        // }

//      Print N numbers

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // int counter = 1;

        // while (counter <= number) {

        //     System.out.println(counter);

        //     counter ++;

        // }

//      sum of N natural numbers

        // Scanner sc = new Scanner(System.in);
        // System.out.print("sum of first numbers : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= n){

        //     sum += i;
        //     i++;

        // }
        // System.out.println(sum);


//      2. for Loop

//     Normal example

        // for (int i=1; i<=10; i++){

        //     System.out.println("Hello success!");

        // }

//     Square pattern example:

// with for loop:
// Special pattern
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = sc.nextInt();
        // for (int i= 1; i <= n; i++){
        //         for (int j =1; j<=i; j++){
        //          System.out.print(sum);
        //          sum++;
        //         }
        //         System.out.println();
        // }



// with while loop

        // int line = 1;

        // while(line <= 4){
        //     System.out.println("* * * *");
        //     line++;

        // }

//     reverse the number excercise example:

        // int n = 10899;

        // while (n>0){
        //     int lastnumber = n % 10;
        //     System.out.println(lastnumber);
        //     n /= 10;
        //     }


//    save reverse  number and print excercise example:

        // easy method (revrse by print):
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Add Number to reverse : ");
        // int n = sc.nextInt();
        // while (n>0){
        //     int lastnumber = n % 10;
        //     System.out.println(lastnumber);
        //     n /= 10;
        //     }

        // shrdha method (reverse first than save then print)

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Add Number to reverse : ");
        // int n = sc.nextInt();
        // int rev = 0;

        // while (n >0){

        //         int lastnumber = n % 10;
        //         rev = (rev*10) + lastnumber;
        //         n /= 10;

        // }

        // System.out.println(rev);


//      3. do while Loop:

        // Normal example:


        // int counter = 1; 

        // do {

        //         System.out.println("Hello success!");

        //         counter++;
        // } while(counter <= 10);


//      Break;

        
        // for(int i = 1;i<=10; i++){
        //         if(i == 7){
        //                 break;
        //         }
        //         System.out.println(i);
        // }
        // System.out.println("out of the loop");


// Question 1 keep entering numbers till user enters a multiple of 10:

        // Scanner sc = new Scanner(System.in);

        // do {
        //         System.out.println("enter your number");
        //         int n = sc.nextInt();

        //         if(n%10 == 0){
        //                 break;
        //         }
        //         System.out.println(n);
        // } while(true);
        // System.out.println("No 10 number please");


//      Continue;

        // for(int i = 1 ; i < 10; i++){
        //         if(i==6){
        //                 continue;
        //         }
        //         System.out.println(i);
        // }


// Question 1 display all numbers except user enters a multiple of 10:

        // Scanner sc = new Scanner(System.in);

        // do {
        //         System.out.println("enter your number");
        //         int n = sc.nextInt();

        //         if(n%10 == 0){
        //                 continue;       
        //         }
        //         System.out.println(n);
                

        // } while(true);


// Excecise 

// check if a number is prime or not 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("check your prime number here n : ");
        // int n = sc.nextInt();

        // if (n==2){
        //         System.out.println("n is prime number");
        // } else{
        
        //         boolean isPrime = true;
                
        //         for(int i = 2 ; i  <= /*n-1*/ Math.sqrt(n) ; i++ ){

        //                 if (n % i == 0){ // n is multiple of i (i not equal to 1 or n)
        //                         isPrime = false;
        //                 }
        //         }
                
        //         if (isPrime == true){
        //         System.out.println( n + " is prime number");
        //         }else{
        //         System.out.println( n + " is not prime number");
        //         }
        // }
       

// Q 1  @ 2 time


        // for (int i=0; i<5; i++){
        //         System.out.println("hello world");
        //         i+=2;
        // }

// Q 2

        // Scanner sc = new Scanner(System.in);

        // int number;
        // int evenSum = 0;
        // int oddSum = 0;
        // int choice;

        // do {
        //         System.out.print("Add your integers : ");
        //         number = sc.nextInt(); 

        //         if (number % 2 == 0){
        //                 evenSum += number;

        //         } else{         
        //                 oddSum += number;

        //         }

        //         System.out.print("press 1 to add more numbers or press 0 to finish :  " );
        //         choice = sc.nextInt();

        //         if (choice == 1 || choice == 0){
                       
        //                 {if(choice == 1){
        //                         System.out.print("Add your next integers : ");
        //                 } else if (choice == 0) {

        //                         System.out.println("see your result : ");
        //                 } }

        //         } else{
        //                 System.out.print("Invalid choice. ");
        //                 System.out.println("Press 1 to add more numbers or press 0 to finish: ");
        //                 choice = sc.nextInt();
        //                 }

        // } while (choice == 1);

        // System.out.println("sum of even number : " + evenSum);
        // System.out.println("sum of even number : " + oddSum);

     

// again practice:

        // Scanner sc = new Scanner(System.in);

        // int number; 
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;

        // do {
        //         System.out.print("add your integer buddy :" ); 
        //         number = sc.nextInt();

        //         if (number%2 == 0){
        //                 evenSum += number;

        //         }else {
        //                 oddSum += number;
        //         }
        //         System.out.print("PRESS 1 FOR ADD MORE  press 0 to see result :" ); 
        //         choice = sc.nextInt();

        //         if (choice == 1 || choice == 0){
        //                 if (choice == 1){
        //                 System.out.print("now " ); 

        //                 } else {
        //                    System.out.println("See result buddy : " );     
        //                 }

        //         } else{
        //                 System.out.print("that wrong bro! add valid option : " );
        //                 choice = sc.nextInt();

        //         }


        // } while (choice == 1);

        // System.out.println("sum of even Number :" + evenSum );
        // System.out.println("sum of odd Number :" + oddSum );







// Q 3


        // Scanner sc = new Scanner(System.in);
        // System.out.print("factorial of given number : ");
        // int n = sc.nextInt();
        // int fact = 1;

        // for (int i =1; i<=n  ; i++){
        //         fact *= i;

        // }


        //  System.out.print("factorial  : " + fact);



// Q 4


        // Scanner sc = new Scanner(System.in);
        // System.out.print("muliplication table of given number : ");
        // int n = sc.nextInt();
        // int multi;
        

        // for (int i =1; i<=10  ; i++){
                
        //         multi = n * i;

        //        System.out.println( n + "*" + i + "=" + multi + "  ");

        // }

// Q 5
// after loop print using i varibale is not valid it is out of scope.
  


// Additional practice:

        // Take 10 integers from keyboard using loop and print their average value on the screen.
        
        // Scanner sc = new Scanner(System.in);
        // int sum = 0;

        // for (int i = 0 ; i<10 ; i++){
        //         System.out.print("add your " + i + " number : ");
        //         int number = sc.nextInt();
        //         sum += number;
        // }

        // System.out.print("average of 10 number : " + sum/10 );





    }
    
}


//  Loops

//      1. while Loop:

            // while(Condition){
                //do something
            // }

//      2. for Loop

            // for (initialisation; condition; updation){
                //do something
                
            // }

//      3. do while Loop:


                // do {
                //         //do something
                // } while (condition);


        // * Break;

        // to exit the loop


        // * Continue
        // to continue loop