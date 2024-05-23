import java.util.*;


// Create Graph - Adjancylist

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

// 	public static void main(String args[]){
// /*
// 				(5)
// 		0 -------------- 1
// 					   /   \
// 				(1)   /     \ (3) 
// 					 /       \
// 					2 ------- 3
// 					|   (1) 
// 					|
// 				(2) |
// 					4
// */

// 		int v = 5;

// 		ArrayList<Edge>[] graph = new ArrayList[v]; // then have to initialize empty array list

// 		for (int i = 0 ; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		// 0 - vertex
// 		graph[0].add(new Edge(0,1,5));
// 		// 1 - vertex
// 		graph[1].add(new Edge(1,0,5));
// 		graph[1].add(new Edge(1,2,1));
// 		graph[1].add(new Edge(1,3,3));
// 		// 2 - vertex
// 		graph[2].add(new Edge(2,1,1));
// 		graph[2].add(new Edge(2,3,1));
// 		graph[2].add(new Edge(2,4,2));
// 		// 3 - vertex
// 		graph[3].add(new Edge(3,2,1));
// 		graph[3].add(new Edge(3,1,3));
// 		// 4 - vertex
// 		graph[4].add(new Edge(4,2,2));


// 		// 2's neighbour

// 		for(int i = 0 ; i < graph[2].size() ; i++ ){
// 			Edge e = graph[2].get(i);
// 			System.out.print(e.dest + " ");
// 		}
// 	}
// }







//  BFS (Breath First search) and DFS (Depth First search)

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


// 	public static void BFS(ArrayList<Edge>[] graph){
// 		Queue<Integer> q = new LinkedList<>();
// 		boolean vis[] = new boolean[graph.length];

// 		q.add(0);

// 		while(! q.isEmpty() ){
// 			int curr = q.remove();

// 			if(!vis[curr]){ // vistit curr
// 				System.out.print( curr + " " );
// 				vis[curr] = true;

// 				for(int i = 0 ; i < graph[curr].size() ; i++){
// 					Edge e = graph[curr].get(i);
// 					q.add(e.dest);
// 				}
// 			}
// 		}

// 	}

// 	public static void main(String args[]){
// /*
// 				(5)
// 		0 -------------- 1
// 					   /   \
// 				(1)   /     \ (3) 
// 					 /       \
// 					2 ------- 3
// 					|   (1) 
// 					|
// 				(2) |
// 					4
// */

// 		int v = 7;

// 		ArrayList<Edge>[] graph = new ArrayList[v]; // then have to initialize empty array list

// 		for (int i = 0 ; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		// 0 - vertex
// 		graph[0].add(new Edge(0,1,1));
// 		graph[0].add(new Edge(0,2,1));
// 		// 1 - vertex
// 		graph[1].add(new Edge(1,0,1));
// 		graph[1].add(new Edge(1,3,1));
// 		// 2 - vertex
// 		graph[2].add(new Edge(2,0,1));
// 		graph[2].add(new Edge(2,4,1));
// 		// 3 - vertex
// 		graph[3].add(new Edge(3,1,1));
// 		graph[3].add(new Edge(3,4,1));
// 		graph[3].add(new Edge(3,5,1));
// 		// 4 - vertex
// 		graph[4].add(new Edge(4,2,1));
// 		graph[4].add(new Edge(4,3,1));
// 		graph[4].add(new Edge(4,5,1));
// 		// 5 - vertex
// 		graph[5].add(new Edge(5,3,1));
// 		graph[5].add(new Edge(5,4,1));
// 		graph[5].add(new Edge(5,6,1));
// 		// 6 - vertex
// 		graph[6].add(new Edge(6,5,1));
// 		//  BFS (Breath First search)
// 		BFS(graph);
// 	}
// }





// DFS (Depth First search)

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


// 	public static void DFS(ArrayList<Edge>[] graph, int curr, boolean vis[]){
// 		// visit
// 		System.out.print(curr + " ");
// 		vis[curr] = true;

// 		for(int i = 0 ; i < graph[curr].size() ; i++){
// 			Edge e = graph[curr].get(i);
// 			if(! vis[e.dest]){
// 				DFS(graph,e.dest,vis);
// 			}
// 		}

// 	}

// 	public static void main(String args[]){
// /*
// 				(5)
// 		0 -------------- 1
// 					   /   \
// 				(1)   /     \ (3) 
// 					 /       \
// 					2 ------- 3
// 					|   (1) 
// 					|
// 				(2) |
// 					4
// */

// 		int v = 7;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v]; // then have to initialize empty array list

// 		for (int i = 0 ; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		// 0 - vertex
// 		graph[0].add(new Edge(0,1,1));
// 		graph[0].add(new Edge(0,2,1));
// 		// 1 - vertex
// 		graph[1].add(new Edge(1,0,1));
// 		graph[1].add(new Edge(1,3,1));
// 		// 2 - vertex
// 		graph[2].add(new Edge(2,0,1));
// 		graph[2].add(new Edge(2,4,1));
// 		// 3 - vertex
// 		graph[3].add(new Edge(3,1,1));
// 		graph[3].add(new Edge(3,4,1));
// 		graph[3].add(new Edge(3,5,1));
// 		// 4 - vertex
// 		graph[4].add(new Edge(4,2,1));
// 		graph[4].add(new Edge(4,3,1));
// 		graph[4].add(new Edge(4,5,1));
// 		// 5 - vertex
// 		graph[5].add(new Edge(5,3,1));
// 		graph[5].add(new Edge(5,4,1));
// 		graph[5].add(new Edge(5,6,1));
// 		// 6 - vertex
// 		graph[6].add(new Edge(6,5,1));
// 		//  DFS (Depth First search)
// 		DFS(graph, 0 , new boolean[v]);
// 	}
// }




// Question has path or no

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

// 	public static void dfs(ArrayList<Edge>[] graph, int curr , boolean vis[]){
// 		System.out.print( curr + " " );
// 		vis[curr] = true ; 

// 		for(int i = 0 ; i < graph[curr].size() ; i++ ){
// 			Edge e = graph[curr].get(i);
// 			if(! vis[e.dest]){
// 				dfs(graph,e.dest,vis);
// 			}
// 		}
// 	}

// 	public static boolean hasPath(ArrayList<Edge>[] graph, int src , int dest, boolean vis[]){
// 		if(src == dest){
// 			return true;
// 		}
		
// 		vis[src] = true;

// 		for(int i = 0 ; i < graph[src].size() ; i++){
// 			Edge e = graph[src].get(i);
// 			if(! vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
// 				return true;
// 			}
// 		}
// 		return false;
// 	}

// 	public static void main(String args[]){
// 		int v = 7;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0 ; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		// 0 - vertex
// 		graph[0].add(new Edge(0,1,1));
// 		graph[0].add(new Edge(0,2,1));
// 		// 1 - vertex
// 		graph[1].add(new Edge(1,0,1));
// 		graph[1].add(new Edge(1,3,1));
// 		// 2 - vertex
// 		graph[2].add(new Edge(2,0,1));
// 		graph[2].add(new Edge(2,4,1));
// 		// 3 - vertex
// 		graph[3].add(new Edge(3,1,1));
// 		graph[3].add(new Edge(3,4,1));
// 		graph[3].add(new Edge(3,5,1));
// 		// 4 - vertex
// 		graph[4].add(new Edge(4,2,1));
// 		graph[4].add(new Edge(4,3,1));
// 		graph[4].add(new Edge(4,5,1));
// 		// 5 - vertex
// 		graph[5].add(new Edge(5,3,1));
// 		graph[5].add(new Edge(5,4,1));
// 		graph[5].add(new Edge(5,6,1));
// 		// 6 - vertex
// 		graph[6].add(new Edge(6,5,1));

// 		// dfs(graph, 0, new boolean[v]);
// 		System.out.print(hasPath(graph,0,5,new boolean[v]));
// 	}
// }




// Cycle deteaction

// public class JavaBasics{
	
// 	static class Edge{
// 		int src;
// 		int dest;
// 		public Edge(int s, int d){
// 			this.src = s;
// 			this.dest = d;
// 		}
// 	} 

// 	public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
// 		vis[curr] = true;

// 		for(int i = 0 ; i < graph[curr].size(); i++){
// 			Edge e = graph[curr].get(i);
// 			// case 3
// 			if(! vis[e.dest] ){ 
// 				if(detectCycleUtil(graph,vis, e.dest, curr)){
// 					return true;
// 				}				
// 			}
// 			//case 1
// 			else if(vis[e.dest] && e.dest == par){
// 				return true;
// 			}
// 			// case 2 do nothing continue
// 		}
// 		return false;
// 	}

// 	public static boolean detectCycle(ArrayList<Edge>[] graph){
// 		boolean vis[] = new boolean[graph.length];
// 		for(int i = 0; i < graph.length ; i++){
// 			if(! vis[i]){
// 				if(detectCycleUtil(graph, vis, i, -1)){
// 					return true; // cycle exist
// 				}				
// 			}
// 		}
// 		return false;
// 	}

// 	public static void main (String args[]){
// 		int v = 5;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		graph[0].add(new Edge(0,1));
// 		graph[0].add(new Edge(0,2));
// 		graph[0].add(new Edge(0,3));

// 		graph[1].add(new Edge(1,0));
// 		graph[1].add(new Edge(1,2));

// 		graph[2].add(new Edge(2,0));
// 		graph[2].add(new Edge(2,1));

// 		graph[3].add(new Edge(3,0));
// 		graph[3].add(new Edge(3,4));

// 		graph[4].add(new Edge(4,3));
		

// 		System.out.print(detectCycle(graph));
		
// 	}
// }




// Bipartite Graph

// public class JavaBasics{
	
// 	static class Edge{
// 		int src;
// 		int dest;
// 		public Edge(int s, int d){
// 			this.src = s;
// 			this.dest = d;
// 		}
// 	} 

// 	public static boolean isBipartite(ArrayList<Edge>[] graph ){
// 		int col[] = new int[graph.length];
// 		for(int i = 0 ; i < col.length ; i++){
// 			col[i] = -1; // no colorr
// 		}

// 		Queue<Integer> q = new LinkedList<>();

// 		for(int i = 0 ; i < graph.length ; i++){
// 			if(col[i] == -1){ // bfs
// 				q.add(i);
// 				col[i] = 0; // yellow
// 				while( !q.isEmpty()){
// 					int curr = q.remove();
// 					for(int j = 0 ; j < graph[curr].size() ; j++){
// 						Edge e = graph[curr].get(j); // e.dest
// 						if(col[e.dest] == -1){
// 							int nextCol = col[curr] == 0 ? 1 : 0 ; 
// 							col[e.dest] =  nextCol;
// 							q.add(e.dest);
// 						}else if(col[e.dest] == col[curr]){
// 							return false; // no bipartite
// 						}
// 					}
// 				}
// 			}
// 		}
// 		return true;
// 	}

// 	public static void main (String args[]){
// 		int v = 5;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];
// 		for(int i = 0; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		graph[0].add(new Edge(0,1));
// 		graph[0].add(new Edge(0,2));

// 		graph[1].add(new Edge(1,0));
// 		graph[1].add(new Edge(1,3));

// 		graph[2].add(new Edge(2,0));
// 		graph[2].add(new Edge(2,4));

// 		graph[3].add(new Edge(3,1));
// 		graph[3].add(new Edge(3,4));

// 		graph[4].add(new Edge(4,2));
// 		graph[4].add(new Edge(4,3));
		
// 		System.out.print(isBipartite(graph));
// 	}
// }


// cycle detection - directed graph

public class JavaBasics{
	static class Edge{
		int src;
		int dest;
		public Edge(int s, int d){
			this.src = s;
			this.dest = d;
		}
	}

	public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[] , boolean stack[]){
		vis[curr] = true;
		stack[curr] = true;

		for(int i = 0 ; i < graph[curr].size(); i++){
			Edge e = graph[curr].get(i);
			if(stack[e.dest]){ // cycle
				return true;
			}
			if(! vis[e.dest] && isCycleUtil(graph,e.dest,vis, stack)){
				return true;
			}
		}
		stack[curr] = false;
		return false;
	}

	public static boolean isCycle(ArrayList<Edge>[] graph){
		boolean vis[] = new boolean[graph.length];
		boolean stack[] = new boolean[graph.length];

		for(int i = 0 ; i < graph.length; i++){
			if(! vis[i]){
				if(isCycleUtil(graph, i, vis, stack)){
					return true;
				}	
			}
		}
		return false;
	}

	public static void main(String args[]){
		int v = 4;
		@SuppressWarnings("unchecked")
		ArrayList<Edge>[] graph = new ArrayList[v];
		for(int i = 0; i < v ; i++){
			graph[i] = new ArrayList<>();
		}

		// first graph
		
		graph[0].add(new Edge(0,2));

		graph[1].add(new Edge(1,0));

		graph[2].add(new Edge(2,3));

		graph[3].add(new Edge(3,0));

		// Second graph

		// graph[0].add(new Edge(0,1));
		// graph[0].add(new Edge(0,2));

		// graph[1].add(new Edge(1,3));

		// graph[2].add(new Edge(2,3));

		System.out.println(isCycle(graph));



	}
}








// Notes


/* 

* Graphs
Networks of nodes

Edges

	1. unidirectional

		A -----------> B

	2. un directed

		A ----------- B

	3. bidirectional

		A <-----------> B


Types

1. Weighted graph
1. unWeighted graph


* Storing a Graph (Structure represent)

1 Adjancy list
2 Adjancy matrix
3 edge list
4 2D matrix (Implicit graph)



1. Adjancy list

	- List of lists

	0 --->  (1)
	1 --->  (0,2,3)
	2 --->  (1,3)

		It can be arraylist of arraylist
			arraylist<arraylist>

		It can be array of arraylist
			array<arraylist>

		it can be hashmap
			hashmap<int,lists>

	We will use Array of arraylist.

		find neighbours in 0(K)


2. Adjancy matrix

	take more space	


	    0  1  2  3
        ----------
   0 |  0  1  0  0
   0 |  1  0  1  1 
   0 |  0  1  0  1
   0 |  0  1  1  0


3 edge list

	Edges = {{0,1},{1,2},{1,3},{2,3}}

4 2D matrix (Implicit graph)



























*/




//  practice




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

// 	public static void Bfs(ArrayList<Edge>[] graph){
// 		Queue<Integer> q = new LinkedList<>();
// 		boolean vis[] = new boolean[graph.length];

// 		q.add(0);

// 		while(! q.isEmpty()){
// 			int curr = q.remove();
// 			if(! vis[curr]){
// 				System.out.print(curr + " ");
// 				vis[curr] = true;

// 				for(int i = 0 ; i < graph[curr].size() ; i++ ){
// 					q.add(graph[curr].get(i).dest);
// 				}
// 			}
// 		}

// 	}

// 	public static void main(String args[]){
// 		int v= 7;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];

// 		for(int i = 0; i < graph.length; i++){
// 			graph[i] = new ArrayList<>();
// 		}
// 		// 0 - vertex
// 		graph[0].add(new Edge(0,1,1));
// 		graph[0].add(new Edge(0,2,1));
// 		// 1 - vertex
// 		graph[1].add(new Edge(1,0,1));
// 		graph[1].add(new Edge(1,3,1));
// 		// 2 - vertex
// 		graph[2].add(new Edge(2,0,1));
// 		graph[2].add(new Edge(2,4,1));
// 		// 3 - vertex
// 		graph[3].add(new Edge(3,1,1));
// 		graph[3].add(new Edge(3,4,1));
// 		graph[3].add(new Edge(3,5,1));
// 		// 4 - vertex
// 		graph[4].add(new Edge(4,2,1));
// 		graph[4].add(new Edge(4,3,1));
// 		graph[4].add(new Edge(4,5,1));
// 		// 5 - vertex
// 		graph[5].add(new Edge(5,3,1));
// 		graph[5].add(new Edge(5,4,1));
// 		graph[5].add(new Edge(5,6,1));
// 		// 6 - vertex
// 		graph[6].add(new Edge(6,5,1));

// 		Bfs(graph);

// 	}
// }






// import java.util.*;

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

// 	public static void bfs(ArrayList<Edge>[] graph){
// 		Queue<Integer> q = new LinkedList<>();
// 		boolean vis[] = new boolean[graph.length];

// 		q.add(0);
		
// 		while( ! q.isEmpty()){
// 			int curr = q.remove();
// 			if(! vis[curr]){
// 				System.out.print(curr + " ");
// 				vis[curr] = true;

// 				for(int i = 0 ; i < graph[curr].size(); i++){
// 					q.add(graph[curr].get(i).dest);
// 				}
// 			}
// 		}
// 	}

// 	public static void dfs(ArrayList<Edge>[] graph, int curr , boolean vis[] ){
		
// 		System.out.print(curr + " " );
// 		vis[curr] = true;
// 		for(int i = 0 ; i < graph[curr].size() ; i ++){
// 			Edge e = graph[curr].get(i);
// 			if(! vis[e.dest]){
// 				dfs(graph, e.dest, vis);
// 			}
// 		}
// 	}


// 	public static void main(String args[]){
// 		int v = 7;
// 		@SuppressWarnings("unchecked")
// 		ArrayList<Edge>[] graph = new ArrayList[v];

// 		for(int i = 0 ; i < v ; i++){
// 			graph[i] = new ArrayList<>();
// 		}

// 		// 0 vertex
// 		graph[0].add(new Edge(0,1,1));
// 		graph[0].add(new Edge(0,2,1));
// 		// 1 vertex
// 		graph[1].add(new Edge(1,0,1));
// 		graph[1].add(new Edge(1,3,1));
// 		// 2 vertex
// 		graph[2].add(new Edge(2,0,1));
// 		graph[2].add(new Edge(2,4,1));
// 		// 3 vertex
// 		graph[3].add(new Edge(3,1,1));
// 		graph[3].add(new Edge(3,4,1));
// 		graph[3].add(new Edge(3,5,1));
// 		// 4 vertex
// 		graph[4].add(new Edge(4,2,1));
// 		graph[4].add(new Edge(4,3,1));
// 		graph[4].add(new Edge(4,5,1));
// 		// 5 vertex
// 		graph[5].add(new Edge(5,3,1));
// 		graph[5].add(new Edge(5,4,1));
// 		graph[5].add(new Edge(5,6,1));
// 		// 6 vertex
// 		graph[6].add(new Edge(6,5,1));


// 		bfs(graph);
// 		System.out.println();
// 		dfs(graph,0, new boolean[v]);


// 	}
// }


