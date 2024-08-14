import java.util.*;

public class JavaBasics {
    public static void main(String arg[]){

        // 1. arithmetic operators (binary/unary/ternary)



        // binary

        int A = 10;
        int B = 5;
        System.out.println("add = " + (A+B));
        System.out.println("minus = " + (A-B));
        System.out.println("multiply = " + (A*B));
        System.out.println("divide = " + (A/B));
        System.out.println("modulo = " + (A%B));

        //unary

        System.out.println("plus one = " + (A++));
        System.out.println("minus one= " + (A--));

        // pre increment (simillarly works for decrement)

        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);


        // post increment (simillarly works for decrement)
        int e = 10;
        int f = c++;
        System.out.println(e);
        System.out.println(f);


        // 2. relational operators

        int g = 10;
        int h = 10;
        int i = 5;
        System.out.println("is it equal = " + (g == h));
        System.out.println("is it equal = " + (g != h));
        System.out.println("is it equal = " + (g != i));
        System.out.println("is it equal = " + (g == i));
        System.out.println("is it greater than = " + (g > i));
        System.out.println("is it greater than = " + (i > g));
        System.out.println("is it less than = " + (i < g));
        System.out.println("is it less than = " + (g < i));
        System.out.println("is it greater or equal than = " + (g >= h));
        System.out.println("is it greater or equal than = " + (h >= g));
        System.out.println("is it less or equal than = " + (h <= g));
        System.out.println("is it less or equal than = " + (g <= h));

        // 3. logical operators:

        //   &&
        System.out.println("is it right " + ((3 < 5) && (5 == 5)));
        System.out.println("is it right " + ((3 > 5) && (5 == 5)));
        //   ||
        System.out.println("is it right " + ((5 < 3) || (5 == 5)));
        System.out.println("is it right " + ((5 < 3) || (3 > 5)));
        // !
        System.out.println(!true);
        System.out.println(!false);


        // 5. assignment operators

        int j = 10;
        int k = 10;
        int l = 10;
        int m = 10;


        System.out.println(j += 5);
        System.out.println(k -= 5);
        System.out.println(l *= 5);
        System.out.println(m /= 5);

        int n = j;
        System.out.println(n);



    }
}




// Notes :

// operators

// types:

// 1. arithmetic operators (binary/unary/ternary)
// 2. relational operators
// 3. logical operators
// 4. bitwise operators (bitmanipulation)
// 5. assignment operators


// 1. arithmetic operators:

// a = 10 , b = 5

// binary :          unary:  ++ increment operator  -- decrement operator ( unary operator do add or minus only one)
                    //   ( ++a --a pre increment and a++ a-- post increment) 

// + ==> a + b = 15
// - ==> a - b = 5
// * ==> a * b = 50
// / ==> a / b = 2
// % ==> a % b = 10 % 5 = 0



// 2. relational operators:

// == equal to
// != not equal to
// > greater than
// < less than
// >= greater or equal to
// <= less or equal to

// 3. logical operators:
//         st 1   st 2  final ans     st 1   st 2  final ans     st 1   st 2  final ans
// &&       T      T      T             T      f      f             f      T      f
// ||       F      f      f             T      f      T             f      T      T

// !        F             T             T             F


// 5. assignment operators

// =   
// +=   A= A + 5   ==>  A += 5
// -=   A= A - 5   ==>  A -= 5
// *=   A= A * 5   ==>  A *= 5
// /=   A= A / 5   ==>  A ?= 5




// Test:

// Q1 : exp1   5, exp2  8
// Q2 :  java
// Q3 : 0 0 0
// Q4 : 2841
// Q5 : exp1 : 20  exp2: 20


// actual ans:

// Q1 : exp1   5, 4
// Q2 :  java
// Q3 : 4 0 0
// Q4 : 278
// Q5 : exp1 : 20  exp2: 20


// Q4: 


// public class Test {
// public static void main(String[] args){
// int x = 9, y = 12;
// int a = 2, b = 4, c = 6;
// int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
// System.out.println(exp)}}


//    4/3  * (x + 34)

//         4/3 = 1
//         x = 9, so x + 34 = 9 + 34 = 43

//         1 * 43 = 43

//     9 * (a + b * c)
//         b * c = 4 * 6 = 24
//         a + (b * c) = 2 + 24 = 26
//         9 * 26 = 234

//     (3 + y * (2 + a)) / (a + b * y)
//         2 + a = 2 + 2 = 4
//         y * (2 + a) = 12 * 4 = 48
//         3 + (y * (2 + a)) = 3 + 48 = 51
//         a + (b * y) = 2 + (4 * 12) = 2 + 48 = 50
//         (3 + y * (2 + a)) / (a + b * y) = 51 / 50 = 1 

// Now, add these values together: 43 + 234 + 1 = 278.