import java.util.*;


public class JavaBasics {
    public static void main(String arg[]){



        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // 1. if else: 

        // if( number > 18 ){
        //     System.out.println("Grown up you can vote!");
        // }
        // else {
        //     System.out.println("Grow up bro!");

        // }

        // int a = 10;
        // int b = 17;

        // if( a>b ){
        //     System.out.println("largest is :" + a);
        // }
        // else {
        //     System.out.println("largest is :" + b);

        // }

        // int c = sc.nextInt();


        // if( c % 2 == 0 ){
        //     System.out.println( c + " is even");
        // }
        // else {
        //     System.out.println(c + " is odd");

        // }
        
        // 2. else if: 

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // 1. if else: 

        // if( number > 18 ){
        //     System.out.println("Grown up you can vote!");
        // }
        // else if (number > 13 && number <18) {
        //     System.out.println("Grow up bro!");

        // } else  {
        //     System.out.println("Kid!");

        // }




        // income tax calculator

        // income < 5L
        // 0% tax

        // income < 5 -10 L
        // 20% tax

        // income < 10L
        // 30% tax

        // Scanner sc = new Scanner(System.in);
        // double income = sc.nextDouble();

        // if( income < 500000 ){
        //     double tax = 0;
        //     double incomeWithtax = income * tax;
        //     System.out.println("your tax will be:  " +  tax );
        //     System.out.println("your income with tax: " + (int)(income + incomeWithtax));
        // }
        // else if (income > 500000 && income < 1000000) {
        //     double tax = 0.2;
        //     double incomeWithtax = income * tax ;
        //     System.out.println("your tax will be:  " +  tax );
        //     System.out.println("your income with tax : " + (int)(income + incomeWithtax) );

        // } else if (income > 1000000) {
        //     double tax = 0.3;
        //     double incomeWithtax = income * tax ;
        //     System.out.println("your tax will be:  " + tax );
        //     System.out.println("your income with tax : " + (int)(income + incomeWithtax) );

        // }



        //Highest value among 3

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a:   ");
        // int a = sc.nextInt();
        // System.out.println("Enter b:   ");
        // int b = sc.nextInt();
        // System.out.println("Enter c:   ");
        // int c = sc.nextInt();

        // if (a >= b && a>= c ) {
        //     System.out.println("The Highest Value is: " + a );
        // } else if(b>=c) {
        //     System.out.println("The Highest Value is: " + b );
        // } else{
        //     System.out.println("The Highest Value is: " + c );
        // }




        //     3. ternary operator

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input value of a : ");
        // int a = sc.nextInt();
        // System.out.print("Input value of b : ");
        // int b = sc.nextInt();
        // System.out.print("Input value of c : ");
        // int c = sc.nextInt();

        // //if else
        // String largeValue1 = (a > b)? "Largest value is a among a and b :  " + a : "Largest value is b among a and b :  " + b;
        // System.out.println(largeValue1);
        // //else if
        // String largeValue = (a > b && a > c)? "Largest value is a :  " + a : (b > c)? "Largest value is b :  " + b : "Largest value is c :  " + c;
        // System.out.print(largeValue);


        //student pass or fail

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Marks : ");
        // int marks = sc.nextInt();
        // String result = (marks>= 33)? "Pass ty gyo!" : "Fail ! kyni next time vadhare mennat krje!";
        // System.out.print("Result : " + result);

        //student pass or fail toduk advance 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Marks : ");
        // int marks = sc.nextInt();
        // String result = (marks>= 70)? "Pass ty gyo! with bo badha %" : (marks >= 33 && marks <= 40)? "Pass ty gyo! point pr" : "Fail ! kyni next time vadhare mennat krje!";
        // System.out.print("Result : " + result);


        //     4. switch

        // order number
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Number : ");
        // int number = sc.nextInt();

        // switch(number){
        //     case 1 : System.out.print(" order number 1 samosa ");
        //              break;
        //     case 2 : System.out.print(" order number 2 vadapaw ");
        //              break;
        //     case 3 : System.out.print(" order number 3 Dhosa ");
        //              break;
        //     default : System.out.print("order number not found ");
        // }


        // Calculator 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("First value a: ");
        // int a = sc.nextInt();
        // System.out.print("Second value b: ");
        // int b = sc.nextInt();        
        // System.out.print("action : ");
        // char operator = sc.next().charAt(0);

        // switch (operator){
        //     case '+' : System.out.println(a+b);
        //                break;
        //     case '-' : System.out.println(a-b);
        //                break;
        //     case '*' : System.out.println(a*b);
        //                break;
        //     case '/' : System.out.println(a/b);
        //                break;
        //     case '%' : System.out.println(a%b);
        //                break;
        //     default : System.out.println("wrong values");
        //                break;
        // }



    // Assignment :

        // Question 1:

        // Scanner sc = new Scanner(System.in);
        // System.out.print("input Number : ");
        // int a = sc.nextInt();
        // String result = (a>=0) ? "Positive" : "Negative";
        // System.out.print("Number is : " + result);


        // Question 2:

        // double temp = 103.5;
        // String result = (temp > 100) ? "You have a Fever" : "You dont have fever";
        // System.out.println("result is :" + result );


        // Question 3:

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Week number : ");
        // int weekNumber = sc.nextInt();

        // switch (weekNumber) {

        //     case 1 : System.out.println("Monday");
        //             break;
        //     case 2 : System.out.println("Tuesday");
        //             break;
        //     case 3 : System.out.println("Wednesday");
        //             break;
        //     case 4 : System.out.println("Thursday");
        //             break;
        //     case 5 : System.out.println("Friday");
        //             break;
        //     case 6 : System.out.println("saturday");
        //             break;
        //     case 7 : System.out.println("sunday");
        //             break;
        //     default : System.out.println("wrong input!");

        // }



        // Question 4:

        //  X = false
        //  y = 63


        // Question 5:

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter year : ");
        // int a = sc.nextInt();
        // if (a%4 == 0 ){
        //     if(a%100 == 0 && a%400 == 0){
        //         System.out.println("It is Leap year");
        //     } else if (a%100 != 0){
        //         System.out.println("It is Leap year");
        //     } else {
        //         System.out.println("It is not leap year");
        //     }
        // }
        //  else {
        //     System.out.println("It is not leap year");
        //  }





        // Notes:


        // Conditional statement
        //     parathesis = > ()
        //     curly braces = > {}

        //     1. if else
        //         Syntax:

        //             if (condition){

        //             }

        //             else{
                        
        //             }

        //     2. else if
        //         Syntax:

        //             if (condition){

        //             }

        //             else if () {
                        
        //             }

        //             else  {
                        
        //             }
                


        //     3. ternary operator

        //            variable = condition? (statment 1) : (Statment 2);

        //            Boolean larger = (5>3)? 5 : 3;

        //            string type = (5%2 == 0)? "even" : "odd";

        //     4. switch

        //            switch (variable){
        //            case 1:
        //            case 2:
        //            case 3:
        //            default:


        //            }




    }
}