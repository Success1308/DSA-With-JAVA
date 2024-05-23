import java.util.*;

// //  topological sort  - Dfs - easy

// public class JavaBasics{
// 	static class Edge{
// 		int src ;
// 		int dest ;
// 		public Edge(int s , int d){
// 			this.src = s;
// 			this.dest = d;
// 		}
// 	}

// 	public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[] , Stack<Integer> s){
// 		vis[curr] = true;

// 		for(int i = 0 ; i < graph[curr].size() ; i++){
// 			Edge e = graph[curr].get(i);
// 			if(! vis[e.dest]){
// 				topSortUtil(graph, e.dest, vis, s);
// 			}
// 		}

// 		s.push(curr);
// 	}

// 	public static void topSort(ArrayList<Edge>[] graph){
// 		boolean vis[] = new boolean[graph.length];
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = 0 ; i < graph.length ; i++){
// 			if(! vis[i]){
// 				topSortUtil(graph,i ,vis , s ); // modified dfs
// 			}
// 		}

// 		while(! s.isEmpty()){
// 			System.out.print( s.pop() + " ");
// 		}

// 	}

// 	public static void main (String args[]){
// 		int v = 6;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0 ; i< v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}
// 		graph[2].add(new Edge(2,3));

// 		graph[3].add(new Edge(3,1));

// 		graph[4].add(new Edge(4,0));
// 		graph[4].add(new Edge(4,1));

// 		graph[5].add(new Edge(5,0));
// 		graph[5].add(new Edge(5,2));

// 		topSort(graph);

// 	}
// }



//  topological sort   - bfs
 
// public class JavaBasics{
// 	static class Edge{
// 		int src ;
// 		int dest ;
// 		public Edge(int s , int d){
// 			this.src = s;
// 			this.dest = d;
// 		}
// 	}

// 	public static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]){
// 		for(int  i = 0; i < graph.length; i++){
// 			int v = i ;
// 			for(int j = 0 ; j < graph[v].size(); j++){
// 				Edge e = graph[v].get(j);
// 				indeg[e.dest]++;

// 			}
// 		}
// 	}

// 	public static void topSort(ArrayList<Edge>[] graph){
// 		int indeg[] = new int[graph.length];
// 		calcIndeg(graph , indeg);
// 		Queue<Integer> q = new LinkedList<>();
		
// 		for(int  i = 0; i < indeg.length; i++){
// 			if(indeg[i] == 0){
// 				q.add(i);
// 			}
// 		}

// 		while( ! q.isEmpty()){
// 			int curr = q.remove();
// 			System.out.print(curr + " ");

// 			for(int i = 0 ; i < graph[curr].size(); i++ ){
// 				Edge e =  graph[curr].get(i);
// 				indeg[e.dest]--;
// 				if(indeg[e.dest] == 0){
// 					q.add(e.dest);
// 				}
// 			}
// 		}
// 		System.out.println();

// 	}

// 	public static void main (String args[]){
// 		int v = 6;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0 ; i< v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}
// 		graph[2].add(new Edge(2,3));

// 		graph[3].add(new Edge(3,1));

// 		graph[4].add(new Edge(4,0));
// 		graph[4].add(new Edge(4,1));

// 		graph[5].add(new Edge(5,0));
// 		graph[5].add(new Edge(5,2));

// 		topSort(graph);

// 	}
// }



// Dijkstra ' s algorithm

// public class JavaBasics{
// 	static class Edge{
// 		int src;
// 		int dest;
// 		int wt;
// 		public Edge(int s, int d, int w){
// 			this.src = s;
// 			this.dest = d;
// 			this.wt = w;
// 		}
// 	}

// 	static class Pair implements Comparable<Pair>{
// 		int n;
// 		int path;

// 		public Pair(int n, int path){
// 			this.n = n;
// 			this.path = path;
// 		}

// 		@Override
// 		public int compareTo(Pair p2){
// 			return this.path - p2.path;
// 		}
// 	}

// 	public static void dijkstra(ArrayList<Edge>[] graph, int src){
// 		int dist[] = new int[graph.length]; // dist[i] -> src to i
// 		for(int i = 0 ; i < graph.length ; i++){
// 			if(i != src ){
// 				dist[i] = Integer.MAX_VALUE;
// 			}
// 		}

// 		boolean vis[] = new boolean[graph.length];
// 		PriorityQueue<Pair> pq = new PriorityQueue<>();
// 		pq.add(new Pair(src,0));
// 		//loop

// 		while(! pq.isEmpty()){
// 			Pair curr = pq.remove();
// 			if(! vis[curr.n]){
// 				vis[curr.n] = true;
// 				for(int i = 0 ; i < graph[curr.n].size() ; i++){
// 					Edge e = graph[curr.n].get(i);
// 					int u = e.src;
// 					int v = e.dest;
// 					int wt = e.wt;
// 					if(dist[u] + wt  < dist[v]){
// 						dist[v] = dist[u] + wt;
// 						pq.add(new Pair(v,dist[v]));
// 					}
// 				}
// 			}
// 		}
// 		// print all source to vertices shortest dis

// 		for(int i = 0 ; i < dist.length ; i++){
// 			System.out.print(dist[i] + " ");
// 		}
// 		System.out.println();
// 	}


// 	public static void main(String args[]){
// 		int v = 6 ; 
// 		@SuppressWarnings("unchecked") 
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0 ; i < graph.length ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		graph[0].add(new Edge(0,1,2));
// 		graph[0].add(new Edge(0,2,4));

// 		graph[1].add(new Edge(1,3,7));
// 		graph[1].add(new Edge(1,2,1));

// 		graph[2].add(new Edge(2,4,3));

// 		graph[3].add(new Edge(3,5,1));
		
// 		graph[4].add(new Edge(4,3,2));
// 		graph[4].add(new Edge(4,5,5));
// 		int src = 0 ;
// 		dijkstra(graph,src );
// 	}
// }




// bellman ford algorithm 0(v*E)

// public class JavaBasics{
// 	static class Edge{
// 		int src;
// 		int dest;
// 		int wt;
// 		public Edge(int s, int d, int w){
// 			this.src = s;
// 			this.dest = d;
// 			this.wt = w;
// 		}
// 	}

// 	public static void bellmanFord(ArrayList<Edge>[] graph, int src){
// 		int dist[] = new int[graph.length];
// 		for(int i = 0 ; i < dist.length ; i++){
// 			if(i != src){
// 				dist[i] = Integer.MAX_VALUE;
// 			}
// 		}

// 		int V = graph.length;
// 		//algo  0(V)
// 		for(int i = 0 ; i < V-1; i++){
// 			//edges - 0(e)
// 			for(int j = 0; j< graph.length; j++ ){
// 				for(int k = 0 ; k < graph[j].size() ; k++){
// 					Edge e = graph[j].get(k);
// 					//u v wt
// 					int u = e.src;
// 					int v = e.dest;
// 					int w = e.wt;
// 					if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
// 						dist[v] = dist[u] + w ;
// 					}
// 				}
// 			}
// 		}
// 		for(int i = 0 ; i < dist.length; i++){
// 			System.out.print(dist[i] + " " );
// 		}
// 	}


// 	public static void main(String args[]){
// 		int v = 5 ; 
// 		@SuppressWarnings("unchecked") 
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0 ; i < graph.length ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		graph[0].add(new Edge(0,1,2));
// 		graph[0].add(new Edge(0,2,4));
// 		graph[1].add(new Edge(1,2,-4));
// 		graph[2].add(new Edge(2,3,2));
// 		graph[3].add(new Edge(3,4,4));
// 		graph[4].add(new Edge(4,1,-1));
// 		int src = 0 ;

// 		bellmanFord(graph,0);
// 	}
// }




// minimum spanning tree

// minimum distance between vertex


// Prims algorithm

// public class JavaBasics{
// 	static class Edge{
// 		int src;
// 		int dest;
// 		int wt;
// 		public Edge(int s, int d, int w){
// 			this.src = s;
// 			this.dest = d;
// 			this.wt = w;
// 		}
// 	}	

// 	static class Pair implements Comparable<Pair>{
// 		int v;
// 		int cost;
// 		public Pair(int v , int c){
// 			this.v = v;
// 			this.cost = c;
// 		}

// 		@Override
// 		public int compareTo(Pair p2){
// 			return this.cost - p2.cost;
// 		}
// 	}

// 	public static void mstPrim(ArrayList<Edge>[] graph){
// 		boolean vis[] = new boolean[graph.length];
// 		PriorityQueue<Pair> pq = new PriorityQueue<>();

// 		pq.add(new Pair(0,0));
// 		int finalCost = 0;

// 		while(! pq.isEmpty()){
// 			Pair curr = pq.remove();
// 			if(! vis[curr.v]){
// 				vis[curr.v] = true;
// 				finalCost += curr.cost;

// 				for(int i = 0 ; i < graph[curr.v].size() ; i++){
// 					Edge e = graph[curr.v].get(i);
// 					pq.add(new Pair(e.dest, e.wt));
// 				}
// 			}
// 		}
// 		System.out.print("final (min) cost of MST = " + finalCost);
// 	}

// 	public static void main(String args[]){
// 		int V = 4;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[V];
// 		for(int i = 0 ; i < V; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		graph[0].add(new Edge(0,1,10));
// 		graph[0].add(new Edge(0,2,15));
// 		graph[0].add(new Edge(0,3,30));

// 		graph[1].add(new Edge(1,0,10));
// 		graph[1].add(new Edge(1,3,40));

// 		graph[2].add(new Edge(2,0,15));
// 		graph[2].add(new Edge(2,3,50));

// 		graph[3].add(new Edge(3,1,40));
// 		graph[3].add(new Edge(3,2,50));

// 		mstPrim(graph);

// 	}
// }






// Chepeast flight with k stop - SImilar to (Dijkstra algo)

// public class JavaBasics{
// 	static class Edge{
// 		int src;
// 		int dest;
// 		int wt;
// 		public Edge(int s, int d, int w){
// 			this.src = s;
// 			this.dest = d;
// 			this.wt = w;
// 		}
// 	}
// 	public static void createGraph(int flights[][], ArrayList<Edge>[] graph ){
// 		for(int i = 0 ; i < graph.length ; i ++){
// 			graph[i] = new ArrayList<>();
// 		}
// 		for(int i = 0 ; i < flights.length; i++){
// 			int src =  flights[i][0];
// 			int dest =  flights[i][1];
// 			int wt =  flights[i][2];
// 			Edge e = new Edge(src,dest,wt);
// 			graph[src].add(e);
// 		}
// 	}
// 	static class Info{
// 		int v;
// 		int cost;
// 		int stops;
// 		public Info(int v ,int c, int s){
// 			this.v = v;
// 			this.cost = c;
// 			this.stops = s;
// 		}
// 	}
// 	public static int chepestFlight(int n, int flights[][] , int src, int dest, int k){
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[n];
// 		createGraph(flights, graph);

// 		int dist[] = new int[n];
// 		for(int i = 0 ; i < dist.length; i++){
// 			if(i != src){
// 				dist[i] = Integer.MAX_VALUE;
// 			}
// 		}
// 		Queue<Info> q = new LinkedList<>();
// 		q.add(new Info(src,0,0));

// 		while(! q.isEmpty()){ //bfs - Dijkstra
// 			Info curr = q.remove();
// 			if(curr.stops > k){
// 				break;
// 			}
// 			for(int i = 0 ; i < graph[curr.v].size() ; i++ ){
// 				Edge e = graph[curr.v].get(i);
// 				int u = e.src; 
// 				int v = e.dest; 
// 				int w = e.wt; 
// 				if(  curr.cost + w < dist[v] && curr.stops <= k){
// 					dist[v] = curr.cost  + w;
// 					q.add(new Info(v,dist[v],curr.stops+1));
// 				}
// 			}
// 		}
// 		if(dist[dest] == Integer.MAX_VALUE){
// 			return -1;
// 		}else{
// 			return dist[dest];
// 		}
// 	}

// 	public static void main(String args[]){
// 		int n = 4;
// 		int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
// 		int src = 0, dst = 3 , k = 1; 

// 		System.out.print(chepestFlight(n,flights,src,dst,k));
// 	}
// }





// connecting cities with minimum cosr - prims algorithm

// public class JavaBasics{
// 	static class Edge{
// 		int src;
// 		int dest;
// 		int wt;
// 		public Edge(int s, int d, int w){
// 			this.src = s;
// 			this.dest = d;
// 			this.wt = w;
// 		}
// 	}
// 	public static void createGraph(int cities[][], ArrayList<Edge> graph[]){
// 		for(int i = 0 ; i < graph.length; i++ ){ 
// 			graph[i] = new ArrayList<>();
// 		}
// 		for(int i = 0 ; i < cities.length; i++ ){ 
// 			for(int j = 0 ; j < cities[0].length; j++ ){ 
// 				int src = i; 
// 				int dest = j; 
// 				int wt = cities[i][j]; 
								
// 				if( wt != 0 ){
// 					Edge e = new Edge(src,dest,wt);
// 					graph[src].add(e);
// 				}
// 			}
// 		}
// 	}
// 	static class Info implements Comparable<Info>{
// 		int v ;
// 		int cost ;
// 		public Info(int v , int c){
// 			this.v = v ;
// 			this.cost = c ;
// 		}
// 		@Override
// 		public int compareTo(Info P2){
// 			return this.cost - P2.cost;
// 		}
// 	}
// 	public static int minCost(int cities[][], int src){
// 		// cretaegraph 
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge> graph[] = new ArrayList[cities.length];
// 		createGraph(cities,graph);
// 		//prim's algo
// 		PriorityQueue<Info> pq = new PriorityQueue<>();
// 		boolean vis[] = new boolean[graph.length];  
// 		int finalCost = 0; 
// 		pq.add(new Info(src,0));

// 		while(! pq.isEmpty()){
// 			Info curr = pq.remove();
// 			if(!vis[curr.v]){
// 				finalCost += curr.cost;
// 				vis[curr.v] = true;
// 				for(int i = 0 ; i < graph[curr.v].size() ; i++ ){
// 					Edge e = graph[curr.v].get(i);
// 					pq.add(new Info(e.dest,e.wt));
// 				}
// 			}
// 		}
// 		return finalCost;
// 	}

// 	public static void main(String args[]){
// 		int cities[][] = {{0,1,2,3,4},
// 						  {1,0,5,0,7},
// 						  {2,5,0,6,0},
// 						  {3,0,6,0,0},
// 						  {4,7,0,0,0}};

// 		System.out.println(minCost(cities,0));
// 	}
// }





// Disjoint set DS 


// public class JavaBasics{
// 	static int n = 7 ; 
// 	static int par[] = new int[n];
// 	static int rank[] = new int[n];

// 	public static void init(){
// 		for(int i = 0 ; i < n ; i++){
// 			par[i] = i;
// 		}
// 	}

// 	public static int find(int x){
// 		if(x == par[x]){
// 			return x;
// 		}
// 		return par[x] = find(par[x]);
// 	}

// 	public static void union(int a, int b){
// 		int parA = find(a);
// 		int parB = find(b);

// 		if(rank[parA] == rank[parB]){
// 			par[parB] = parA;
// 			rank[b]++;
// 		}else if(rank[parA] < rank[parB]){
// 			par[parA] = parB;
// 		}else{
// 			par[parB] = parA;
// 		}
// 	}


// 	public static void main(String args[]){
// 		init();
// 		System.out.println(find(3));
// 		union(1,3);
// 		System.out.println(find(3));
// 		union(2,4);
// 		union(3,6);
// 		union(1,4);
// 		System.out.println(find(3));
// 		System.out.println(find(4));
// 		union(1,5);

// 	}
// }




// Kruskal's algorithm

// public class JavaBasics{

// 	static class Edge implements Comparable<Edge>{
// 		int src;
// 		int dest;
// 		int wt;
// 		public Edge(int s, int d, int w){
// 			this.src = s;
// 			this.dest = d;
// 			this.wt = w;
// 		}
// 		@Override
// 		public int compareTo(Edge e2){
// 			return this.wt - e2.wt;
// 		}
// 	}
// 	static void createGraph(ArrayList<Edge> edges){
// 		edges.add(new Edge(0,1,10));
// 		edges.add(new Edge(0,2,15));
// 		edges.add(new Edge(0,3,30));
// 		edges.add(new Edge(1,3,40));
// 		edges.add(new Edge(2,3,50));
// 	}
// 	static int n = 4;
// 	static int par[] = new int[n];
// 	static int rank[] = new int[n];

// 	public static void init(){
// 		for(int i = 0 ; i < n ; i++){
// 			par[i] = i;
// 		}
// 	}

// 	public static int find(int x){
// 		if(x == par[x]){
// 			return x;
// 		}
// 		return par[x] = find(par[x]);
// 	}

// 	public static void union(int a, int b){
// 		int parA = par[a];
// 		int parB = par[b];
// 		if(rank[parA] == rank[parB]){
// 			par[parB] = parA;
// 			rank[parA]++;
// 		}else if(rank[parA] < rank[parB]){
// 			par[parA] = parB;
// 		}else{	
// 			par[parB] = parA;
// 		}
// 	}

// 	public static void kruskaldMST(ArrayList<Edge> edges , int V){
// 		init();
// 		Collections.sort(edges);
// 		int mstCost = 0;  
// 		int count = 0;

// 		for(int i = 0 ; count < V-1 ; i++){
// 			Edge e = edges.get(i);
// 			//(src,dest,wt)
// 			int parA  = find(e.src); //src =a
// 			int parB  = find(e.dest); //src = b
// 			if(parA != parB){
// 				union(e.src,e.dest);
// 				mstCost += e.wt;
// 				count++;
// 			}
// 		}

// 		System.out.println(mstCost);
// 	}

// 	public static void main(String args[]){
// 		int V = 4;
// 		ArrayList<Edge> edges = new ArrayList<>();
// 		createGraph(edges);

// 		kruskaldMST(edges,V);
// 	}
// }







// flood fill algorithm problem 733 leetcode


public class JavaBasics{
	public static void floodFillUtil(int[][] image, int sr, int sc, int color,boolean vis[][],int orgCol ){
		if(sr < 0 || sc < 0 || sr >= image.length ||sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
			return;
		}
        vis[sr][sc] = true;
        image[sr][sc] = color;
		//left 
		floodFillUtil(image, sr, sc-1, color, vis, orgCol);
		//right
		floodFillUtil(image, sr, sc+1, color, vis, orgCol);
		//up
		floodFillUtil(image, sr-1, sc, color, vis, orgCol);
		//dowN
		floodFillUtil(image, sr+1, sc, color, vis, orgCol);

	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int color){
		boolean vis[][] = new boolean[image.length][image[0].length];
		int orgCol = image[sr][sc];
		floodFillUtil(image, sr, sc, color, vis, orgCol);
		return image;
	}

	public static void main(String args[]){
		int image[][] = {{1,1,1},
						 {1,1,0},
						 {1,0,1}};

		
		int images[][] = floodFill(image, 0, 0, 2);

		for(int i = 0 ; i < images.length; i++){
			for(int j = 0 ; j < images[0].length; j++){
				System.out.print(images[i][j] + " ");
			}
			System.out.println();
		}		
	}
}