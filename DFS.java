//DFS of a graph by Adjacency Matrix
import java.util.*;
public class DFS{
	int n;
	int[][] visited;
	DFS(int n){
		this.n=n;
		adj=new int[n][n];
		visited=new boolean[n];
	}
	//Adding edges
	void addEdge(int u,int v){
		adj[u][v]=1;
		adj[v][u]=1;
	}
	//DFS traversal
	void dfs(int v){
		visited[v]=true;
		System.out.print(v + " ");
		for(int i=0;i<n;i++){
			if(adj[v][i]==1 && !visited[i]){
				dfs(i);
			}
		}
	}
	public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.print("Enter no of vertices");
	int n=s.nextInt();
	DFS graph=new DFS(n);
	System.out.print("Enter no of edges");
	int e=s.nextInt();
	System.out.print("Enter Edges(u,v) pairs");
	for(int i=0;i<e;i++){
		int u=
	}
