import java.util.*;

// fibonacci 


// fibonacci with dp  - memoization
// public class JavaBasics{
// 	public static int fibonacci(int n, int f[]){
// 		if(n == 0 || n == 1){
// 			return n;
// 		}
// 		if(f[n] != 0){
// 			return f[n];
// 		}
// 		f[n] = fibonacci(n-1,f) + fibonacci(n-2,f) ;
// 		return f[n];
// 	}
// 	public static void main(String args[]){
// 		int n = 6;
// 		int f[] = new int[n+1];
// 		System.out.print(fibonacci(n,f));
// 	}
// }


// fibonacci with dp  - Tabulation
// public class JavaBasics{
// 	public static int fibonacci(int n){
// 		int dp[] = new int[n+1];
// 		for(int i=0;i<=n;i++){
// 			if(i==0||i==1){
// 				dp[i] = i;
// 			}else{
// 				dp[i] = dp[i-1] + dp[i-2];
// 			}
// 		}
// 		return dp[n];
// 	}
// 	public static void main(String args[]){
// 		int n = 6;
// 		System.out.print(fibonacci(n));
// 	}
// }


// Climbing stairs (Questions) (normal recursion) 0(2^n)

// public class JavaBasics{
// 	public static int climbStairs(int n){
// 		if(n == 0){
// 			return 1;
// 		}
// 		if(n < 0){
// 			return 0;
// 		}

// 		return climbStairs(n-1) + climbStairs(n-2);
// 	}	

// 	public static void main(String args[]){
// 		int n = 5;
// 		System.out.print(climbStairs(n));
// 	}
// }


// Climbing stairs (Questions) (memoization) 0(n)

// public class JavaBasics{
// 	public static int climbStairs(int n, int ways[]){
// 		if(n == 0){
// 			return 1;
// 		}
// 		if(n < 0){
// 			return 0;
// 		}
// 		if(ways[n] != -1){
// 			return ways[n];
// 		}
// 		ways[n] = climbStairs(n-1,ways) + climbStairs(n-2,ways);
// 		return ways[n];
// 	}	

// 	public static void main(String args[]){
// 		int n = 5;
// 		int ways[] = new int[n+1];
// 		Arrays.fill(ways,-1);
// 		System.out.print(climbStairs(n, ways));
// 	}
// }


// Climbing stairs (Questions) (Tabulation) 0(n)

// public class JavaBasics{
// 	public static int climbStairs(int n){
// 		int ways[] = new int[n+1];
// 		Arrays.fill(ways,-1);
// 		// Tabulation loop
// 		for(int i = 0 ; i <= n ; i++){
// 			if(i == 0 || i == 1){
// 				ways[i] = 1;
// 			}else{
// 				ways[i] = ways[i-1] + ways[i-2] ;
// 			}
// 		}
// 		return ways[n];
// 	}	

// 	public static void main(String args[]){
// 		int n = 5;
		
// 		System.out.print(climbStairs(n));
// 	}
// }





// 0-1 knapsack

// Types of knapsack problem

// 1. Fractional knapsack - done in greedy
// 2. 0 - 1 knapsack
// 3. unbounded knapsack



// 2. 0 - 1 knapsack - (normal recursion) 0(2^n)

// public class JavaBasics{
// 	public static int zeroOneKnapsack(int val[], int wt[], int w, int n){
// 		// base case
// 		if(w == 0 || n == 0 ){
// 			return 0;
// 		}
// 		// kaam
// 		if(wt[n-1] <= w ){
// 			//include
// 			int ans1 = val[n-1] + zeroOneKnapsack(val, wt, w - wt[n-1], n-1);
// 			//exclude
// 			int ans2 = zeroOneKnapsack(val, wt, w , n-1);
// 			return Math.max(ans1, ans2);
// 		}else{ // not valid
// 			return zeroOneKnapsack(val, wt, w , n-1);
// 		}
// 	}
// 	public static void main(String args[]){
// 		int val[] = {15,14,10,45,30};
// 		int wt[] = {2,5,1,3,4};
// 		int w = 7;

// 		System.out.print(zeroOneKnapsack(val, wt, w, val.length));

// 	}
// }

// 2. 0 - 1 knapsack - memoization  0(n*w)

// public class JavaBasics{
// 	public static int zeroOneKnapsack(int val[], int wt[], int w, int n, int dp[][]){
// 		// base case
// 		if(w == 0 || n == 0 ){
// 			return 0;
// 		}
// 		// Dp check
// 		if(dp[n][w] != -1){
// 			return dp[n][w];
// 		}
// 		// kaam
// 		if(wt[n-1] <= w ){
// 			//include
// 			int ans1 = val[n-1] + zeroOneKnapsack(val, wt, w - wt[n-1], n-1, dp);
// 			//exclude
// 			int ans2 = zeroOneKnapsack(val, wt, w , n-1, dp);
// 			dp[n][w] = Math.max(ans1, ans2);
// 			return dp[n][w];
// 		}else{ // not valid
// 			dp[n][w] = zeroOneKnapsack(val, wt, w , n-1, dp);
// 			return dp[n][w];
// 		}
// 	}
// 	public static void main(String args[]){
// 		int val[] = {15,14,10,45,30};
// 		int wt[] = {2,5,1,3,4};
// 		int w = 7;
// 		int dp[][] = new int[val.length + 1][w+1];
// 		for(int i = 0 ; i < dp.length ; i++){
// 			for(int j = 0 ; j < dp[0].length ; j++){
// 				dp[i][j] = -1;
// 			}
// 		}
// 		System.out.print(zeroOneKnapsack(val, wt, w, val.length, dp));
// 	}
// }


// 2. 0 - 1 knapsack - tabulation

// public class JavaBasics{

// 	public static int zeroOneKnapsack(int val[], int wt[], int w){
// 		int n = val.length;
// 		int dp[][] = new int[ n + 1][w+1];
// 		for(int i = 0 ; i < dp.length ; i++){
// 			dp[i][0] = 0;
// 		}
// 		for(int j = 0 ; j < dp[0].length ; j++){
// 			dp[0][j] = 0;
// 		}
// 		for(int i = 1 ; i < n+1; i++){
// 			for(int j = 1 ; j < w+1 ; j++){
// 				int v = val[i-1];
// 				int W = wt[i-1];
// 				if(W <= j){ // valid
// 					int incProfit = v + dp[i-1][j-W]; // include
// 					int excProfit = dp[i-1][j]; // exclude
// 					dp[i][j] = Math.max(incProfit, excProfit);
// 				} else{ //invalid
// 					int excProfit = dp[i-1][j];
// 					dp[i][j] = excProfit; 
// 				}
// 			}
// 		}	

// 		return dp[n][w];
// 	}

// 	public static void main(String args[]){
// 		int val[] = {15,14,10,45,30};
// 		int wt[] = {2,5,1,3,4};
// 		int w = 7;

// 		System.out.print(zeroOneKnapsack(val, wt, w));
// 	}
// }



// Target Sum Subsets 
// Variation of 0-1 Knapsack
// Target Sum Subsets - (normal recursion) 0(2^n)


// public class JavaBasics{
	
// 	public static boolean tarSumSubset(int num[], int target){
// 		int n = num.length;
// 		boolean dp[][] = new boolean[n+1][target+1];
// 		for(int i = 0 ; i < n+1 ; i++){
// 			dp[i][0] = true; 
// 		}
// 		for(int i = 1 ; i < n+1 ; i++){
// 			for(int j = 1 ; j < target+1 ; j++){
// 				int v = num[i-1];
// 				//include
// 				if(v <= j && dp[i-1][j-v] == true){
// 					dp[i][j] = true;
// 				}else if(dp[i-1][j] == true){ // exclude
// 					dp[i][j] = true; 
// 				}
// 			}			
// 		}

// 		return dp[n][target];
// 	} 

// 	public static void main(String args[]){
// 		int num[] = {4,2,7,1,3};
// 		int target = 10;
// 		System.out.println(tarSumSubset(num, target));
// 	}
// }




// 3.    unbounded knap sack



// Unbounded Knapsack - minor changes from 0-1 knapsack

// public class JavaBasics{
// 	public static int unboundKnapsack(int val[], int wt[], int w){
// 		int n = val.length;
// 		int dp[][] = new int[n+1][w+1];
// 		for(int i = 0 ; i < dp.length ; i++){
// 			dp[i][0] = 0;
// 		}
// 		for(int i = 0 ; i < dp[0].length ; i++){
// 			dp[0][i] = 0;
// 		}

// 		for(int i = 1 ; i < n+1 ; i++){
// 			for(int j = 1 ; j < w+1 ; j++){
// 				int v = val[i-1]; 
// 				int W = wt[i-1]; 

// 				if(W <= j){ // valid
// 					int incProfit = v + dp[i][j-W];
// 					int excProfit = dp[i-1][j];
// 					dp[i][j] = Math.max(incProfit, excProfit);
// 				}else{ //invalid
// 					int excProfit = dp[i-1][j];
// 					dp[i][j] = excProfit;
// 				}
// 			}
// 		}
// 		return dp[n][w];
// 	}		
// 	public static void main(String args[]){
// 		int val[] = {15,14,10,45,30};
// 		int wt[] = {2,5,1,3,4};

// 		int w = 7;
// 		System.out.println(unboundKnapsack(val, wt, w));
// 	}
// }




// coin change problem - Tabulation  (total way so we need to add all ways not maximum ways)
// similar to unbounded knap sack 

// public class JavaBasics{

// 	public static void coinChange(int coins[] , int sum ){
// 		int n = coins.length;
// 		int dp[][] = new int[n+1][sum+1];
// 		for(int i = 0; i < dp.length ; i++){
// 			dp[i][0] = 1;
// 		}
// 		for(int i = 0; i < dp[0].length ; i++){
// 			dp[0][i] = 0;
// 		}

// 		for(int i = 1; i < n+1 ; i++){
// 			for(int j = 1; j < sum+1 ; j++){
// 				int v = coins[i-1];  
// 				//valid
// 				if( v <= j ){
// 					int incWay = dp[i][j-v];
// 					int excWay = dp[i-1][j];
// 					dp[i][j] = incWay + excWay;
					
// 				}else{//invalid
// 					int excWay = dp[i-1][j];
// 					dp[i][j] = excWay;
// 				}			
// 			}
// 		}
// 		System.out.println(dp[n][sum]);
// 	}
// 	public static void main(String args[]){
// 		int coins[] = {2,5,3,6};
// 		int sum = 10;
// 		coinChange(coins, sum);
// 		int coins1[] = {1,2,3};
// 		int sum1= 4;
// 		coinChange(coins1, sum1);
// 	}
// }



// Rod Cutting - kind of knapsack
// it is maximum so need to us math.max and add price to dp

// public class JavaBasics{
// 	public static int rodCut(int length[], int price[], int rodLength){
// 		int n = price.length;
// 		int dp[][] = new int[n+1][rodLength+1];
// 		for(int i = 0; i < n+1; i++){
// 			dp[i][0] = 0;
// 		}
// 		for(int i = 0; i < rodLength+1; i++){
// 			dp[0][i] = 0;
// 		}
// 		for(int i = 1; i < n+1; i++){
// 			for(int j = 1; j < rodLength+1; j++){
// 				int v = price[i-1]; 
// 				int l = length[i-1];
// 				if(l <= j){ // valid
// 					int inc = v + dp[i][j - l];
// 					int exc = dp[i-1][j];
// 					dp[i][j] = Math.max(inc,exc);
// 				}else{ // invalid
// 					int exc = dp[i-1][j];
// 					dp[i][j] = exc;
// 				}
// 			}
// 		}
// 		return dp[n][rodLength];
// 	}
// 	public static void main(String args[]){
// 		int length[] = {1,2,3,4,5,6,7,8};
// 		int price[] = {1,5,8,9,10,17,17,20};
// 		int rodLength = 8;
// 		System.out.println(rodCut(length, price,rodLength));
		
// 	}
// }







// 4. LCS(longest common subsequence)

// Longest common subsequence (LCS) - regular recursion

// public class JavaBasics{

// 	public static int lCS(String str1, String str2, int n, int m){
// 		//base case 
// 		if(n == 0 || m == 0){
// 			return 0;
// 		}

// 		// kaam
// 		if(str1.charAt(n-1) == str2.charAt(m-1)){
// 			return lCS(str1, str2,n-1,m-1) + 1 ;
// 		}else{
// 			int ans1 = lCS(str1, str2,n-1,m);
// 			int ans2 = lCS(str1, str2,n,m-1);
// 			return Math.max(ans1, ans2);
// 		}
// 	}
// 	public static void main(String args[]){
// 		String str1 = "abcdge";
// 		String str2 = "abedg";
// 		System.out.println(lCS(str1, str2, str1.length(), str2.length()));	
// 	}
// }


// Longest common subsequence (LCS) - memoization

// public class JavaBasics{

	// public static int lCS(String str1, String str2, int n , int m, int dp[][]){
	// 	if(n == 0 || m == 0){
	// 		return 0;
	// 	}

	// 	if(dp[n][m] != -1){
	// 		return dp[n][m];
	// 	}
		
	// 	if(str1.charAt(n-1) == str2.charAt(m-1)){
	// 		return dp[n][m] = lCS(str1, str2,n-1,m-1, dp) + 1 ;
	// 	}else{
	// 		int ans1 = lCS(str1, str2,n-1,m, dp);
	// 		int ans2 = lCS(str1, str2,n,m-1, dp);
	// 		return dp[n][m] = Math.max(ans1, ans2);
	// 	}
	// }

// 	public static void main(String args[]){
// 		String str1 = "abcdge";
// 		String str2 = "abedg";
		
// 		int n = str1.length();
// 		int m = str2.length();

// 		int dp[][] = new int[n+1][m+1];
// 		for(int i = 0; i < n+1 ; i++ ){
// 			for(int j = 0; j < m+1 ; j++ ){
// 				dp[i][j] = -1;
// 			}
// 		}
// 		System.out.println(lCS(str1, str2, n, m, dp));

// 	}
// }



// Longest common subsequence (LCS) - tabulation 0(n*m)

// public class JavaBasics{

// 	public static int lCS(String str1, String str2){
// 		int n = str1.length();
// 		int m = str2.length();
// 		int dp[][] = new int[n+1][m+1];
// 		for(int i = 0; i < n+1 ; i++ ){
// 			dp[i][0] = 0;
// 		}
// 		for(int j = 0; j < m+1 ; j++ ){
// 			dp[0][j] = 0;
// 		}

// 		for(int i = 1; i < n+1 ; i++){
// 			for(int j = 1; j < m+1 ; j++){
// 				if(str1.charAt(i-1) == str2.charAt(j-1)){
// 					dp[i][j] = dp[i-1][j-1] + 1;
// 				}else{
// 					int ans1 = dp[i][j-1];
// 					int ans2 = dp[i-1][j];
// 					dp[i][j] = Math.max(ans1, ans2);
// 				}
// 			}
// 		}
// 		return dp[n][m];
// 	}
// 	public static void main(String args[]){
// 		String str1 = "abcdge";
// 		String str2 = "abedg";
// 		System.out.println(lCS(str1, str2));
// 	}
// }




// Longest common substring

// public class JavaBasics{

// 	public static int longestCommonSubstring(String str1, String str2){
// 		int n = str1.length();
// 		int m = str2.length();

// 		int dp[][] = new int[n+1][m+1];
// 		for(int i = 0 ; i < n+1 ; i++){
// 			dp[i][0] = 0;
// 		} 
// 		for(int i = 0 ; i < m+1 ; i++){
// 			dp[0][i] = 0;
// 		} 
// 		int ans = 0; 
// 		for(int i = 1 ; i < n+1 ; i++){
// 			for(int j = 1 ; j < n+1 ; j++){
// 				if(str1.charAt(i-1) == str2.charAt(j-1)){
// 					dp[i][j] = dp[i-1][j-1] + 1;
// 					ans = Math.max(dp[i][j], ans);
// 				}else{
// 					dp[i][j] =  0;
// 				}
// 			}
// 		}
// 		return ans;
// 	}

// 	public static void main(String args[]){
// 		String str1 = "abcdgh";
// 		String str2 = "acdghr";

// 		//4
// 		System.out.println(longestCommonSubstring(str1,str2));
// 	}
// }



// Longest increasing subsequence

// public class JavaBasics{
// 	public static int lcs(int arr[], int arr2[]){
// 		int n = arr.length;
// 		int m = arr2.length;

// 		int dp[][] = new int[n+1][m+1];
// 		for(int i = 0 ; i < n+1 ; i++){
// 			dp[i][0] = 0 ; 
// 		}
// 		for(int i = 0 ; i < m+1 ; i++){
// 			dp[0][i] = 0 ; 
// 		}
		
// 		for(int i = 1 ; i < n+1 ; i++){
// 			for(int j = 1 ; j < m+1 ; j++){
// 				if(arr[i-1] == arr2[j-1]){
// 					dp[i][j] = dp[i-1][j-1] + 1 ;
// 				}else{
// 					int ans1 = dp[i][j-1];
// 					int ans2 = dp[i-1][j];

// 					dp[i][j] = Math.max(ans1, ans2);
// 				}
// 			}
// 		}
// 		return dp[n][m];
// 	}

// 	public static int lIS(int arr[]){
// 		HashSet<Integer> set = new HashSet<>();
// 		for(int num : arr){
// 			set.add(num);
// 		}
// 		int arr2[] = new int[set.size()];
// 		int idx = 0;
// 		for(int num : set){
// 			arr2[idx++] = num;
// 		}		
// 		Arrays.sort(arr2);
// 		return lcs(arr,arr2);
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {50,3,10,7,40,80};
// 		System.out.println(lIS(arr));
// 	}
// }
		



// Edit distance

// public class JavaBasics{

// 	public static int editDistance(String str1, String str2){
// 		int n = str1.length();
// 		int m = str2.length();
// 		int dp[][] = new int[n+1][m+1];
// 		for(int i = 0 ; i < n+1 ; i++ ){
// 			dp[i][0] = i;
// 		}
// 		for(int i = 0 ; i < m+1 ; i++ ){
// 			dp[0][i] = i;
// 		}

// 		for(int i = 1 ; i < n+1 ; i++ ){
// 			for(int j = 1 ; j < m+1 ; j++ ){
// 				if(str1.charAt(i-1)  == str2.charAt(j-1) ){
// 					dp[i][j] = dp[i-1][j-1] ;	
// 				}else{
// 					int add = dp[i][j-1] + 1;
// 					int del = dp[i-1][j] + 1;
// 					int rep = dp[i-1][j-1] + 1;
// 					dp[i][j] = Math.min(add, Math.min(del,rep));	
// 				}
// 			}
// 		}
// 		return dp[n][m];
// 	}

// 	public static void main (String args[]){
// 		String str1 = "intention";
// 		String str2 = "execution";

// 		System.out.println(editDistance(str1,str2));
// 	}
// }




// String conversion


// public class JavaBasics{

// 	public static int lcs(String str1, String str2){
// 		int n = str1.length();
// 		int m = str2.length();

// 		int dp[][] = new int[n+1][m+1];
// 		for(int i = 0; i < n+1 ; i++){
// 			for(int j = 0; j < m+1 ; j++){
// 				if(i == 0){
// 					dp[i][j] = 0;
// 				}else if(j == 0){
// 					dp[i][j] = 0;
// 				}
// 			}
// 		}

// 		for(int i = 1; i < n+1 ; i++){
// 			for(int j = 1; j < m+1 ; j++){
// 				if(str1.charAt(i-1) == str2.charAt(j-1)){
// 					dp[i][j] = dp[i-1][j-1] + 1 ;
// 				}else{
// 					int ans1 = dp[i][j-1]; 
// 					int ans2 = dp[i-1][j]; 
// 					dp[i][j] = Math.max(ans1, ans2); 
// 				}
// 			}
// 		}
// 		return dp[n][m];
// 	}

// 	public static int stringConv(String str1, String str2){
// 		int lcsNum = lcs(str1, str2);
// 		int dif1 = Math.abs(lcsNum - str1.length());
// 		int dif2 = Math.abs(lcsNum - str2.length());
// 		int totalminOp =  dif1 + dif2;
// 		return totalminOp;
// 	}



// 	public static void main(String args[]){
// 		String str1 = "abcdef"; 
// 		String str2 = "aceg"; 
// 		System.out.println(stringConv(str1, str2));
// 	}
// }





// Wildcard matching


// public class JavaBasics{
// 	public static boolean wildCardMatching(String s, String p){
// 		int n = s.length();
// 		int m = p.length();
// 		// dp
// 		boolean dp[][] = new boolean[n+1][m+1];
// 		dp[0][0] = true;
// 		for(int i = 1; i < n+1; i++){
// 			dp[i][0] = false;
// 		}
// 		for(int j = 1; j < m+1; j++){
// 			if(p.charAt(j - 1) == '*'){
// 				dp[0][j] = dp[0][j-1];
// 			}
// 		}
// 		// bottom up
// 		for(int i = 1; i < n+1; i++){
// 			for(int j = 1; j < m+1; j++){
// 				if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
// 					dp[i][j] = dp[i-1][j-1];
// 				}else if(p.charAt(j-1) == '*'){
// 			//**-- match star in pattern--//  //ignore star in pattern
// 					dp[i][j] = dp[i-1][j]  || dp[i][j-1]  ;
// 				}else{
// 					dp[i][j] = false;
// 				}
// 			}
// 		}
// 		return dp[n][m];
// 	}
// 	public static void main(String args[]){
// 		String s = "baaabab";
// 		String p = "*****ba*****ab";
// 		System.out.print(wildCardMatching(s,p));
// 	}
// }







// 6. catalan number

// Catalan's number

// c0 = 1
// c1 = 1
// c2 = c0c1 +c1c0 = 2
// c3 = c0c2 + c1c1 +c2c0 = 5
// c4 = c0c3 + c1c2 +c2c1 +c3c0 = 14


// Catalan's number - recursion

// public class JavaBasics{

// 	public static int catRec(int n){
// 		if(n == 0 || n==1){
// 			return 1;
// 		}
// 		int ans = 0;
// 		for(int i = 0 ; i < n ; i++  ){
// 			ans += catRec(i)*catRec(n-i-1) ;
// 		}

// 		return ans;
// 	}

// 	public static void main(String args[]){
// 		int n = 5;

// 		System.out.println(catRec(n));
		
// 	}
// }



// Catalan's number - Memoization (changed dp to long in order to avoid stack overflow)

// public class JavaBasics{

// 	public static long catMemo(int n, long dp[]){
// 		if(n == 0 || n==1){
// 			dp[n] = 1;
// 			return dp[n];
// 		}

// 		if(dp[n] != -1){
// 			return dp[n];
// 		}
// 		long ans = 0;
// 		for(int i = 0 ; i < n ; i++  ){
// 			ans += catMemo(i, dp)*catMemo(n-i-1, dp) ;
// 		}
// 		dp[n] = ans;
// 		return dp[n];
// 	}
// 	public static void main(String args[]){
// 		int n = 10;
// 		long dp[] = new long[n+1];
// 		Arrays.fill(dp, -1);
// 		System.out.println(catMemo(n, dp));
// 	}
// }



// Catalan's number - Tabulation

// public class JavaBasics{
// 	public static int catalanTab(int n){
// 		int dp[] = new int[n+1];
// 		dp[0] = dp[1] = 1;
// 		for(int i = 2 ; i < n+1 ; i++ ){ // catalan of  i 
// 			for(int j = 0 ; j < i ; j++ ){
// 				dp[i] += dp[j] * dp[i-j-1];
// 			}
// 		}
// 		return dp[n];
// 	}
// 	public static void main(String args[]){
// 		int n = 5;
// 		System.out.println(catalanTab(n));
// 	}
// }




// counting BST underneath catalan number


// public class JavaBasics{
// 	public static int countBST(int n){
// 		int dp[] = new int[n+1];
// 		dp[0] = dp[1] = 1 ;

// 		for(int i = 2 ; i < n+1 ; i++){
// 			for(int j = 0 ; j < i; j++){
// 				int left = dp[j];
// 				int right = dp[i-j-1];
// 				dp[i] +=  left * right;
// 			}
// 		}
// 		return dp[n];
// 	}

// 	public static void main(String args[]){
// 		int n = 3;
// 		System.out.println(countBST(n));
// 	}
// }





// Mountain ranges underneath catalan number

// public class JavaBasics{
// 	public static int mountainRange(int n){
// 		int dp[] = new int[n+1];
// 		dp[0] = dp[1] = 1 ;

// 		for(int i = 2 ; i < n + 1 ; i++ ){
// 			for(int j = 0 ; j < i ; j++){
// 				int inside = dp[j];
// 				int outside = dp[i-j-1];
// 				dp[i] +=  inside * outside;
// 			}
// 		}
// 		return dp[n];
// 	}
// 	public static void main(String args[]){
// 		int n = 4;
// 		System.out.println(mountainRange(n));
// 	}
// }






// // Matrix chain multiplication - recursion

// public class JavaBasics{

// 	public static int mCM(int arr[], int i , int j){
// 		if(i == j){
// 			return 0;
// 		}

// 		int ans = Integer.MAX_VALUE;

// 		for(int k = i ; k <= j-1 ; k++){
// 			int cost1 = mCM(arr,i,k);
// 			int cost2 = mCM(arr,k+1,j);
// 			int cost3 = arr[i-1] * arr[k] * arr[j];
// 			int finalCost = cost1 + cost2 + cost3;
// 			ans = Math.min(ans ,finalCost);

// 		}

// 		return ans;
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {1,2,3,4,3}; 
// 		int n = arr.length;

// 		System.out.println(mCM(arr,1,n-1));
// 	}
// }




// // Matrix chain multiplication - Memoization

// public class JavaBasics{

// 	public static int mCM(int arr[], int i , int j, int dp[][]){
// 		if(i == j){
// 			dp[i][j] = 0;
// 			return dp[i][j];
// 		}

// 		if(dp[i][j] != -1){
// 			return dp[i][j] ;
// 		}

// 		int ans = Integer.MAX_VALUE;

// 		for(int k = i ; k <= j-1 ; k++){
// 			int cost1 = mCM(arr,i,k,dp);
// 			int cost2 = mCM(arr,k+1,j,dp);
// 			int cost3 = arr[i-1] * arr[k] * arr[j];
// 			int finalCost = cost1 + cost2 + cost3;
// 			ans = Math.min(ans ,finalCost);
// 		}
// 		dp[i][j] = ans;
// 		return dp[i][j];
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {1,2,3,4,3}; 
// 		int n = arr.length;

// 		int dp[][] = new int[n][n];
		
// 		for(int i = 0 ; i < n ; i++){
// 			Arrays.fill(dp[i] ,-1);
// 		}
		
// 		System.out.println(mCM(arr,1,n-1,dp));
// 	}
// }





// Matrix chain multiplication - Tabulation

// public class JavaBasics{
// 	public static int mCM(int arr[]){
// 		int n = arr.length;
// 		int dp[][] = new int[n+1][n+1];
// 			for(int i = 0 ; i < n ; i++){
// 			dp[i][i] = 0;
// 		}
// 		int ans = Integer.MAX_VALUE;
// 		for(int len = 2 ; len <= n-1 ; len++){
// 			for(int i = 1 ; i <= n-len ; i++){
// 				int j = i+len-1;
// 				dp[i][j] = Integer.MAX_VALUE;
// 				for(int k = i ; k <= j-1 ; k++){
// 					int cost1 = dp[i][k];
// 					int cost2 = dp[k+1][j];
// 					int cost3 = arr[i-1]* arr[k] * arr[j] ;

// 					dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);

// 				}
// 			}
// 		}
// 		return dp[1][n-1];
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {1,2,3,4,3}; 
// 		System.out.println(mCM(arr));
// 	}
// }





// Minimum partitioning - similar to 0-1 knapsack

// public class JavaBasics{
// 	public static int miniParti(int arr[]){
// 		int capacity = 0;
// 		for(int i = 0; i < arr.length; i++){
// 			capacity += arr[i];
// 		}
// 		capacity = capacity/2;
// 		int n = arr.length;
// 		int ans = arr.length;
// 		int dp[][] = new int[n+1][capacity+1];
// 		for(int i = 0 ; i < n+1 ; i++){
// 			dp[i][0] = 0;
// 		}
// 		for(int i = 0 ; i < capacity+1 ; i++){
// 			dp[0][i] = 0;
// 		}

// 		for(int i = 1 ; i < n+1 ; i++){
// 			for(int j = 1 ; j < capacity+1 ; j++){
// 				int val = arr[i-1] ;
// 				if( j >=  val){
// 					dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-val], dp[i-1][j]);
// 				}else{
// 					dp[i][j] = dp[i-1][j];
// 				}
// 			}
// 		}

// 		int sum1 = dp[n][capacity];
// 		int sum2 = capacity - sum1;
// 		return Math.abs(sum1-sum2);
// 	}
// 	public static void main(String args[]){
// 		int arr[] = {1,6,11,5}; 
// 		System.out.println(miniParti(arr));
// 	}
// }




// Minimum array jumps - tabulation

// public class JavaBasics{

// 	public static int MiniArrayJump(int arr[]){
// 		int n = arr.length;
// 		int dp[]= new int[n];
// 		Arrays.fill(dp , -1);
// 		dp[n-1] = 0;

// 		for(int i = arr.length - 2  ; i >= 0  ; i--){
// 			int steps = arr[i];
// 			int ans = Integer.MAX_VALUE; 
// 			for(int j = i+1; j <= i+steps && j<n ; j++){
// 				if(dp[j] != -1){
// 					ans = Math.min(ans, dp[j] + 1);
// 				}
// 			}
// 			if(ans != Integer.MAX_VALUE){
// 				dp[i] = ans;
// 			}

// 		}
// 		return dp[0];
// 	}

// 	public static void main(String args[]){
// 		int arr[] = {2,3,1,1,4};
		
// 		System.out.println(MiniArrayJump(arr));
// 	}
// }









// Target Sum  (samrat bhai - dp lecture) (similar to coin problem)

// Target Sum  - (normal recursion) 0(2^n)

// public class JavaBasics{
// 	public static int tarSum(int num[], int target){
// 		// base case
// 		if(target == 0 ){
// 			return 1;
// 		}
// 		//kaam
// 		int totalWays = 0;
// 		for(int i = 0 ; i < num.length ; i++){
// 			if(target - num[i] >= 0){
// 				totalWays += tarSum(num, target - num[i] );
// 			}
// 		}
// 		return totalWays;
// 	}
// 	public static void main(String args[]){
// 		int num[] = {4,2,7,1,3};
// 		int target = 10;

// 		System.out.println(tarSum(num, target));
		
// 	}
// }


// Target Sum  - memoization  0(n*w)

// public class JavaBasics{
// 	public static int tarSum(int num[], int target, int dp[]){
// 		// base case
// 		if(target == 0 ){
// 			return dp[target] = 1;
// 		}

// 		// dp check
// 		if(dp[target] != -1){
//             return dp[target];
//         }
// 		//kaam
// 		int totalWays = 0;
// 		for(int i = 0 ; i < num.length ; i++){
// 			if(target - num[i] >= 0){
// 				totalWays += tarSum(num, target - num[i], dp );
// 			}
// 		}
// 		return dp[target] = totalWays;
// 	}
// 	public static void main(String args[]){
// 		int num[] = {4,2,7,1,3};
// 		int target = 10;
// 		int dp[] = new int[target+1];
// 		Arrays.fill(dp, -1);

// 		System.out.println(tarSum(num, target, dp));
// 	}
// }




// Target Sum  - tabulation  0(n*w)

// public class JavaBasics{
// 	public static int tarSum(int num[], int Target, int dp[]){
// 		for(int target=0; target<=Target; target++){
// 			// base case
// 			if(target == 0 ){
// 				dp[target] = 1;
// 				continue;
// 			}

// 			//kaam
// 			int totalWays = 0;
// 			for(int i = 0 ; i < num.length ; i++){
// 				int curr_coin = num[i];
// 				if(target - curr_coin >= 0){
// 					totalWays += dp[target-curr_coin];
// 				}
// 			}
// 			dp[target] = totalWays; 
// 		}
// 		return dp[Target];  
// 	}
// 	public static void main(String args[]){
// 		int num[] = {4,2,7,1,3};
// 		int target = 10;
// 		int dp[] = new int[target+1];
// 		Arrays.fill(dp, -1);
// 		System.out.println(tarSum(num, target, dp));
// 	}
// }













// Notes


// in dp we save in extra space in form of array and return tha already saved value 
// instead of doing any extra calls.

// recursion in fibonacci - dp is advanced recursion


// What is dp ?
// dp is optimized recursion

// how to identify dp ?
// a. optimal problem
// b. some choice is given (multiple branches in recursion)


// Dynamic Programming is a technique in computer programming that helps to efficiently 
	// class of problems that have overlapping subproblem and optimal substructure property.


// Ways of dp

// 1. Memoization (top down)
// Store the result of each subproblem and use it when the same subproblem occurs again. 
// This is called memoization and it saves time and space in the program.

// 2. Tabulation (bottom up)
// Tabulation is a form of dynamic programming where a table is used to store the result of subproblem. 
// Each subproblem is solved only once and the result is stored in the table for future use. The table is filled in a bottom-up manner, 
// starting from the base case of the problem.


//  7 important Questions in dp

// 1. fibonacci
// 2. 0-1 Knapsack
// 3. unbounded knapsack

// 4. LCS(longest common subsequence)
// 5. Kadane's Algorithm(Arrays)
// 6. catalan number
// 7. dp on grid(2d array)

// 
