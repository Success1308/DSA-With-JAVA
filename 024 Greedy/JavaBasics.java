import java.util.*;





// 1. Activity selection
// start = [10,12,20]
// end = [20,25,30]

// activity sorted to end time  // 0(n)

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int start[] = {1,3,0,5,8,5};
// 		int end[] = {2,4,6,7,9,9};

// 		// end time sorted

// 		int maxAct = 0;
// 		ArrayList<Integer> ans = new ArrayList<>();

// 		maxAct = 1;
// 		ans.add(0);
// 		int lastEnd = end[0];

// 		for(int i = 1; i <end.length ; i++){
// 			if(start[i] >= lastEnd){
// 				//Activity select
// 				maxAct++;
// 				ans.add(i);
// 				lastEnd = end[i];
// 			}
// 		}

// 		System.out.println("Max Activities : " + maxAct);
// 		for(int i = 0; i <ans.size() ; i++){
// 			System.out.println("A" + ans.get(i) + " ");
// 		}
// 		System.out.println();
// 	}
// }


// process with sorting if not sorted

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int start[] = {1,3,0,5,8,5};
// 		int end[] = {2,4,6,7,9,9};

// 		//sorting
// 		int activities[][] = new int[start.length][3];
// 		for(int i = 1; i < start.length ; i++){
// 			activities[i][0] = i;
// 			activities[i][1] = start[i];
// 			activities[i][2] = end[i];
// 		}

// 		// lambda dunction -> sort
// 		Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

// 		int maxAct = 0;

// 		ArrayList<Integer> ans = new ArrayList<>();
// 		maxAct = 1;
// 		ans.add(activities[0][0]);
// 		int lastEnd = activities[0][2];

// 		for(int i = 1; i < end.length ; i++){
// 			if(activities[i][1] > lastEnd){
// 				maxAct++;
// 				ans.add(activities[i][0]);
// 				lastEnd = activities[i][2];
// 			}
// 		}
// 		System.out.println("Max activity : " + maxAct);
// 		for(int i = 0; i < ans.size() ; i++){
// 			System.out.println("A" + ans.get(i));
// 		}
// 		System.out.println();
// 	}
// }

// Practice

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int start[] = {1,3,0,5,8,5};
// 		int end[] = {2,4,6,7,9,9};

// 		int activities[][] = new int[start.length][3];
// 		for(int i = 0; i < start.length; i++){
// 			activities[i][0] = i;
// 			activities[i][1] = start[i];
// 			activities[i][2] = end[i];
// 		}


// 		int maxAct = 0; 
// 		//SORT
// 		Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

// 		// Auxilary Arraylist
// 		ArrayList<Integer> ans = new ArrayList<>();

// 		maxAct = 1;
// 		ans.add(activities[0][0]);
// 		int lastEnd = activities[0][2]; 
		
// 		for(int i = 1; i < end.length; i++){
// 			if(activities[i][1] >=  lastEnd){
// 				maxAct++;
// 				ans.add(activities[i][0]);
// 				lastEnd = activities[i][2]  ; 
// 			}
// 		}

// 		System.out.println("Max activities: " + maxAct);
// 		for(int i = 0; i < ans.size(); i++){
// 			System.out.println("A : " + ans.get(i));
// 		}
// 		System.out.println();
// 	}
// }




// // Q2  Fractional Knapsack // self try

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int value[] = {60,100,120};
// 		int weight[] = {10,20,30};
// 		int maxWeight = 50;


// 		double ratio[][] = new double [value.length][3];

// 		for(int i = 0; i < value.length; i++){
// 			ratio[i][0] = value[i];
// 			ratio[i][1] = weight[i];
// 			ratio[i][2] = (double)value[i] / weight[i];
// 		}

// 		// sort
// 		Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

// 		for(int i = 0; i < value.length; i++){
// 			System.out.print(ratio[i][0] + " "); 
// 			System.out.print(ratio[i][1] + " "); 
// 			System.out.print(ratio[i][2] + " "); 
// 			System.out.println();
// 		}
// 		int capacity = maxWeight;
// 		int maxValue = 0;
// 		int currWeight = 0;

// 		for(int i = 0; i < value.length; i++){
			
// 			if( currWeight <= capacity){
// 				currWeight += ratio[i][1];
// 				maxValue += ratio[i][0] ;
// 				capacity -= currWeight;
// 			} else{
// 				int remainingWeight = maxWeight - currWeight;
// 				double remainingValue = (double)ratio[i][2] * remainingWeight;
// 				currWeight += remainingWeight/ratio[i][2] ;
// 				maxValue += remainingValue;
// 			}
// 		}

// 		System.out.println(maxValue);
// 	}
// }

 

 // Shradha ben method for knapsack

public class JavaBasics {
    public static void main(String args[]) {
        int value[] = {100, 120, 60};
        int weight[] = {20, 30, 10};
        int w = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        // Sort ratios based on value/weight ratio in descending order
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < value.length; i++) {
            System.out.print((int) ratio[i][0] + " ");
            System.out.print(ratio[i][1] + " ");
            System.out.println();
        }

        int capacity = w;
        double maxValue = 0;

        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                maxValue += value[idx];
            } else {
                maxValue += ratio[i][1] * capacity;
                break;
            }
        }

        System.out.println("Maximum possible value: " + maxValue);
    }
}


// Q 3 minimumn absoulte difference 0(n)

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int a[] = {1,2,3};
// 		int b[] = {2,1,3};

// 		Arrays.sort(a);
// 		Arrays.sort(b);

// 		int minDiff = 0;
// 		for(int i = 0; i<a.length; i++){
// 			minDiff += Math.abs(a[i]-b[i]);
// 		}
// 		System.out.println(minDiff);
// 	}
// }



// Q 4 chain of pairs


// public class JavaBasics{
// 	public static void main(String args[]){
// 		int pair[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

// 		Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

// 		// for(int i = 0; i<pair.length ; i++){
// 		// 	System.out.print(pair[i][0] + " ");
// 		// 	System.out.print(pair[i][1] + " ");
// 		// 	System.out.println();
// 		// }

// 		int maxPair = 1;
// 		int pairend = pair[0][1];

// 		for(int i = 0; i<pair.length ; i++){
// 			if(pair[i][0] > pairend){
// 				maxPair++;
// 				pairend = pair[i][1];
// 			}
// 		}

// 		System.out.println("Max length: "+ maxPair);
// 	}
// }



// Q 5 Indian Coins [1,2,5,10,20,50,100,500,2000] cononical coins system

// public class JavaBasics{
// 	public static void main(String args[]){
// 		Integer coins[] = {1,2,5,10,20,50,100,500,2000};
// 		int value =  590;

// 		Arrays.sort(coins, Comparator.reverseOrder());

// 		int ways = 0;
// 		ArrayList<Integer> ans = new ArrayList<>();

// 		for(int i = 0 ; i<coins.length ; i++){
// 			if(coins[i]<= value){
// 				while(coins[i]<= value){
	// 				ans.add(coins[i]);
	// 				value -= coins[i];
	// 				ways++;
// 				}
// 			}
// 		}

// 		System.out.println("coins used"+ways);
// 		for(int i = 0 ; i<ans.size() ; i++){
// 			System.out.print(ans.get(i)+" ");
// 		}
// 	}
// }



// Q6 Job sequencing problem // important hard

// public class JavaBasics{
// 	static class Job{
// 		int deadline;
// 		int profit;
// 		int id;

// 		public Job(int i, int d, int p){
// 			id = i;
// 			deadline = d;
// 			profit= p;
// 		}
// 	}
// 	public static void main(String args[]){
// 		int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

// 		ArrayList<Job> jobs = new ArrayList<>();

// 		for(int i = 0; i<jobsInfo.length; i++){
// 			jobs.add(new Job(i,jobsInfo[i][0], jobsInfo[i][1]));
// 		}

// 		Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);
// 		// deceaning order of profit

// 		ArrayList<Integer> seq = new ArrayList<>();
// 		int time = 0;
// 		for(int i = 0 ; i<jobs.size();i++){
// 			Job curr = jobs.get(i);
// 			if(curr.deadline > time){
// 				seq.add(curr.id);
// 				time++;
// 			}
// 		}

// 		System.out.println("max JOb " + seq.size());
// 		for(int i = 0 ; i<seq.size();i++){
// 			System.out.print( seq.get(i) + " ");
// 		}
// 		System.out.println();
// 	}
// }



// Q 7 chocola problem

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int n = 4, m = 6;
// 		Integer costVer[] = {2,1,3,1,4}; // m-1
// 		Integer costHor[] = {4,1,2};  // n -1


// 		Arrays.sort(costVer, Collections.reverseOrder());
// 		Arrays.sort(costHor, Collections.reverseOrder());

// 		int v = 0 , h = 0;
// 		int vp = 1, hp =1;
// 		int cost = 0;

// 		while(v<costVer.length && h<costHor.length){
			
// 			if(costVer[v] >= costHor[h]){ // Vertical cut
// 				cost += ( hp *  costVer[v]);
// 				vp++;
// 				v++;
// 			}else{
// 				cost += ( vp *  costHor[h]); // horizontal cut
// 				hp++;
// 				h++;
// 			}

// 		}

// 		while(v<costVer.length){
// 			cost += ( hp *  costVer[v]);
// 			vp++;
// 			v++;
// 		}

// 		while(h<costHor.length){
// 			cost += ( vp *  costHor[h]);
// 			hp++;
// 			h++;
// 		}

// 		System.out.print("total cost : " + cost);
 
// 	}
// }



// Practice 

// public class JavaBasics{
// 	public static void main(String args[]){
// 		int n = 4, m = 6;
//         Integer costVer[] = {3, 2, 4, 1}; 
//         Integer costHor[] = {2, 4, 1, 3, 1};

// 		Arrays.sort(costVer, Collections.reverseOrder());
// 		Arrays.sort(costHor, Collections.reverseOrder());

// 		int v = 0, h = 0;
// 		int vp = 1, hp = 1;
// 		int cost = 0;

// 		while(v < costVer.length && h < costHor.length){
// 			if(costVer[v] >= costHor[h]){ // vertical cut
// 				cost += (hp * costVer[v]); 
// 				vp++;
// 				v++;
// 			}else{
// 				cost += (vp * costHor[h]);  // horizontal cut
// 				hp++;
// 				h++;
// 			}
// 		}

// 		while(v < costVer.length){
// 		 // vertical cut
// 			cost += (hp * costVer[v]); // vertical cut
// 			vp++;
// 			v++;
// 		}

// 		while(h < costHor.length){
// 		 // vertical cut
// 			cost += (vp * costHor[h]);  // horizontal cut
// 			hp++;
// 			h++;
// 		}
// 		System.out.print("Min cost :  " + cost);
// 	}	
// }





// public class JavaBasics{
// 	public static void main(String args[]){
//         Integer costVer[] = {3, 2, 4, 1}; 
//         Integer costHor[] = {2, 4, 1, 3, 1};


// 		Arrays.sort(costVer, Collections.reverseOrder());
// 		Arrays.sort(costHor, Collections.reverseOrder());

// 		int v = 0, h = 0;
// 		int vp = 1, hp = 1;
// 		int cost = 0; 

// 		while(v < costVer.length && h < costHor.length){
// 			if(costVer[v] >=  costHor[h]){ // vertical cut
// 				cost += (costVer[v] * hp);
// 				vp++;
// 				v++;
// 			} else{// Horizontal cut
// 				cost += (costHor[h] * vp);
// 				hp++;
// 				h++;
// 			}
// 		}

// 		while(v < costVer.length){
// 			cost += (costVer[v] * hp);
// 			vp++;
// 			v++;
// 		}

// 		while(h < costHor.length){
// 			cost += (costHor[h] * vp);
// 			hp++;
// 			h++;
// 		}

// 		System.out.print("Minamal cost : " + cost );
// 	}
// }












//Notes

// Greedy algorhtym

// is the problem solving techinque where we make the locally optimum choice at each stage & hope to achieve a global optimum.

// 1. optimization / min, max 
// 2. sorting
// 3. no fixed rule
// 4. not realize
