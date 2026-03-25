//Bfs using adjacency matrix
import java.util.*;
public class Bfs{
	private int n;
	private int[][] adjmat;
	public Bfs(int n){
		this.n=n;
		adjmat=new int[n][n];
	}
	//Adding edges to traversal order
	void addEdge(int u,int v){
		adjmat[u][v]=1;
		adjmat[v][u]=1;
	}
	//BFS traversal method
	 public void bft(int startVertex){
		boolean[] visited=new boolean[n];
		Queue<Integer> queue=new LinkedList<>();
		visited[startVertex]=true;
		queue.add(startVertex);
		System.out.print("Breadth First Traversal");
		while(!queue.isEmpty()){
			int current=queue.poll();
			System.out.print(current +" ");
			for(int i=0;i<n;i++){
				if(adjmat[current][i]==1 && !visited[i]){
					visited[i]=true;
					queue.add(i);
				}
			}
		}
	}
	//user inputs for BFS
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int n=s.nextInt();
		Bfs graph=new Bfs(n);
		System.out.println("Enter no of edges");
		int e=s.nextInt();
		System.out.println("Enter edges(u,v) pairs");
		for(int i=0;i<e;i++){
			int u=s.nextInt();
			int v=s.nextInt();
			graph.addEdge(u,v);
		}
		System.out.println("Enter starting vertex for Bfs");
		int start=s.nextInt();
		graph.bft(start);
	}
} 				

