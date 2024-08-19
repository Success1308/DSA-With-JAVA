import java.util.*;



// Sum of number
// public class JavaBasics{
//     public static void sumsubarray(int number[]){
//         int cursum = 0;
//           for (int i = 0; i < number.length; i++) {
//             cursum = 0;
//             for (int j = i; j < number.length ; j++) {  
//                 cursum = 0;
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(number[k]+ " ");
//                     cursum += number[k];
//                 }
//                 System.out.println("sum = " + cursum);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){

//         int sam[] = {2,4,6,8,10};
//         sumsubarray(sam);
//     }
// }


// // max sum using brute force method:
// public class JavaBasics{
//     public static void maxsumsubarray(int number[]){
//         int cursum = 0;
//         int maxsum =  Integer.MIN_VALUE;

//         for (int i = 0; i < number.length; i++) {
//             for (int j = i; j < number.length ; j++) {  
//                 cursum = 0;
//                 for (int k = i; k <= j; k++) {
//                     // System.out.print(number[k]+ " ");
//                     cursum += number[k];
//                 }
//                 System.out.print(cursum + " ");
//                 System.out.println();
//                 if (maxsum < cursum ){
//                     maxsum = cursum ; 
//                 } 
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("max sum : " + maxsum);
//     }

//     public static void main(String args[]){

//         int sam[] = {2,4,6,8,10};
//         maxsumsubarray(sam);
//     }

// }

//max sum using prefix method: 
// prefix[end] - prefix[start-1]


// public class JavaBasics{
//     public static void maxSum(int number[]){
//         int cursum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int preFix[]= new int[number.length];

//         preFix[0] = number[0];
//         //calculate prefix array
//         for (int i = 1; i < preFix.length; i++){ 
//             preFix[i] = preFix[i-1] + number[i];
//         }
        
//         for (int i = 0; i < number.length; i++){
//             int start = i;
//             for (int j = i; j < number.length; j++){
//                 int end = j;

//                 cursum = start == 0 ? preFix[end] : preFix[end] - preFix[start-1];

//                 if (cursum > maxsum){
//                     maxsum = cursum;
//                 }
//             }   
//         }
//         System.out.print(maxsum + " "); 
//     }
 
//     public static void main(String args[]){
//         int sam[] = {1, -2,6,-1,3};
//         maxSum(sam);

//     }
// }



// Max sum kadane's algorithm

// public class JavaBasics{
//     public static void kadane(int number[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for (int i = 0; i <number.length ; i++){
//             cs = cs + number[i];
//             if(cs<0){
//                 cs = 0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.println("max sum " + ms);

//     }
 
//     public static void main(String args[]){
//         int sam[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadane(sam);
//         int sam1[] = {1,-2,6,-1,3};
//         kadane(sam1);
//         int sam2[] = {-1,-2,-3,-4};
//         kadane(sam2);

//     }
// }



// Trapping Rain water:


// public class JavaBasics{

//     public static int trappedWater(int height[]){
//         //calculate left max boundry - array
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for (int i =1; i<height.length ; i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }
//         //calculate right max boundry - array
//         int rightMax[] = new int[height.length];
//         rightMax[height.length - 1] = height[height.length - 1];
//         for (int i = height.length-2; i>=0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }
//         int trappedwater = 0;
//         //loop
//         for (int i =1; i<height.length ; i++){
//             //waterlevel = min(leftmax bound, rightmax bound)
//             int waterlevel = Math.min(leftMax[i],rightMax[i]);
//             // trapped water = waterlevel - height
//             trappedwater += waterlevel - height[i];
//         }
//         return trappedwater;
//     }
 
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedWater(height));
//     }
// }


// stocks:




// public class JavaBasics{


//     public static int stock(int buy[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxprofit = 0;
//         for(int i=0; i<buy.length ; i++){
//             int sellPrice = buy[i];
//             if (buyPrice < sellPrice){
//                 int profit = sellPrice - buyPrice; //today s profit
//                 maxprofit = Math.max(profit, maxprofit); // global profit
//             } 
//             else {
//                 buyPrice = buy[i];
//             }
//             }
//         return maxprofit;
//     }
//     public static void main(String args[]) {       
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println("max profit : " + stock(prices));
//     }

// }


















// // self practice

// public class JavaBasics{

//     public static int trappedWater(int h[]){

//         int H = h.length;
//         int tw = 0;
//         int  wl = 0;
//         //lM
//         int LM[] = new int[H];
//         LM[0] = h[0];
//         for (int i = 1; i < H ; i++){
//             LM[i] = Math.max(h[i], LM[i-1]);
//         }
//         //RM
//         int RM[] = new int[H];
//         RM[H-1] = h[H-1];
//         for (int i = H-2; i >= 0 ; i--){
//             RM[i] = Math.max(h[i], RM[i+1] );
//         }
//         //calculation
//         for (int i = 0; i < H ; i++){
//             wl = Math.min(LM[i],RM[i]);
//         //water level min of rm and lm
//         //tw = wl - h
//             tw += wl - h[i]; 
//         }
//         return tw;
//     }
 
//     public static void main(String args[]){
//         int sam[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedWater(sam));
//     }
// }







// Assignment

//1 


// public class JavaBasics{
//     public static boolean twinCheck(int n[]){
//         boolean s = true;        
//         for (int i = 0; i<n.length ;i++){
//             for (int j = i+1; j<n.length ;j++){
//                 if(n[i] == n[j]){
//                     return s = true;
//                 }
//             }
//         }
//          return false;
//     } 
//     public static void main(String args[]){
//         int sam[] = {1,2,3,1};
//         int sam1[] = {1,2,3,4};
//         int sam2[] = {1,2,1,3,3,4,1,2,4,2};

//         System.out.println("result :" + twinCheck(sam));
//         System.out.println("result :" + twinCheck(sam1));
//         System.out.println("result :" + twinCheck(sam2));
//     }
// }



// 3


// public class JavaBasics{
//     public static int stock(int buy[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int i = 0; i<buy.length ;i++){
//             int sell = buy[i];
//             if (buyPrice < sell){
//                 int profit = sell - buyPrice;
//                 maxProfit = Math.max(profit,maxProfit);
//             }else{
//                 buyPrice = buy[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int price[] = {7,1,5,3,6,4};
//         int price1[] = {7,6,4,3,1};
//         System.out.println("Maximum proft :" + stock(price));
//         System.out.println("Maximum proft :" + stock(price1));
//     }
// }


//4 

// public class JavaBasics{
//     public static int trappedWater(int height[]){
//         int wl = 0;
//         int tw = 0;
//         int n = height.length;

//         //left
//         int lM[] = new int[n];
//         lM[0] = height[0]; 
//         for(int i= 1; i<n ;i++){
//             lM[i] = Math.max( height[i],lM[i-1]);
//         }

//         //right
//         int rM[] = new int[n];
//         rM[n-1] = height[n-1];
//         for(int i= n-2; i>=0 ;i--){
//             rM[i] = Math.max( height[i],rM[i+1]);
//         }
//         //calculation
//         for(int i= 0; i<n ;i++){
//             wl = Math.min(lM[i],rM[i]);
//             tw += wl - height[i];
//         }
//         return tw;
//     }

//     public static void main(String args[]){
//         int height1[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         int height2[] = {4,2,0,3,2,5};

//         System.out.println("volume of height 1 : "+ trappedWater(height1));
//         System.out.println("volume of height 2 : "+ trappedWater(height2));
//     }
// }



//5
// public class JavaBasics{
//     public static int triplet(int n[]){
//         for(int i = 0; i<n.length; i++){
//             for(int j = i; j<n.length; j++){
//                 for(int k = j; k<n.length; k++){
//                     if(n[i]+n[j]+n[k]==0){
//                         System.out.print("{" + n[i]+ "," + n[j] +"," + n[k]+"}"); 
//                     }
//                 }
                
//             }   
//         }
//         return 0;
//     } 
//     public static void main(String args[]){
//         // int num[] = {-1,0,1,2,-1,-4};
//         // int num1[] = {};
//         // int num2[] = {0};
//         int num3[] = {0,1,5,2,2,1,2,1,-1,2,3,-2,-1};
//         triplet(num3);
//         // System.out.println("result = " + triplet(num1));
//         // System.out.println("result = " + triplet(num2));
//         // System.out.println("result = " + triplet(num3));
//     }
// }

//2





//practice trappe\d

// public class JavaBasics{
//     public static int trappedWater(int height[]){

// 		int n = height.length;
// 		int tw = 0;
// 		int wl = 0;

// 		// Lm
// 		int Lm[] = new int[n];
// 		Lm[0] = height[0];
// 		for(int i = 1; i<n-1 ;i++ ){
// 			Lm[i] = Math.max(Lm[i-1],height[i]);
// 		}
// 		// Rm
// 		int Rm[] = new int[n];
// 		Rm[n-1] = height[n-1];
// 		for(int i = n-2; i>=0 ;i--){
// 			Rm[i] = Math.max(Rm[i+1],height[i]);
// 		}
// 		// calculation 
// 		for(int i = 0; i<n-1 ;i++ ){
// 		// wl = min of rm lm 
// 			wl = Math.min(Rm[i],Lm[i]);
// 		// tw += wl - height
// 			tw += wl - height[i]; 
// 		}
// 		return tw;	
// 	}

//     public static void main(String args[]){
//         int height1[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         int height2[] = {4,2,0,3,2,5};

//         System.out.println("volume of height 1 : "+ trappedWater(height1)); // 6
//         System.out.println("volume of height 2 : "+ trappedWater(height2)); // 9
//     }
// }




// stock



// public class JavaBasics{
//     public static int stock(int buy[]){
		
// 		int buyPrice = Integer.MAX_VALUE; 
// 		int maxProfit = 0;

// 		for (int i = 0; i<buy.length ; i++){
// 			int sell = buy[i];
// 			if (sell > buyPrice){
// 				int profit = sell - buyPrice;
// 				maxProfit = Math.max(maxProfit,profit);
// 			} else{
// 				buyPrice = buy[i];
// 			}
			
// 		}
// 		return maxProfit;
//     }
//     public static void main(String args[]){
//         int price[] = {7,1,5,3,6,4};
//         int price1[] = {7,6,4,3,1};
//         System.out.println("Maximum proft :" + stock(price)); // 5
//         System.out.println("Maximum proft :" + stock(price1)); // 0
//     }
// }