//BFT using adjacency list
import java.util.*;
public class Bft{
	private int n;
	private ArrayList<ArrayList<Integer>> adjList;
	public Bft(int n){
		this.n=n;
		adjList=new ArrayList<>();
		for(int i=0;i<n;i++){
			adjList.add(new ArrayList<>());
		}
	}
	//Add edges of graph
	public void addEdge(int u,int v){
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	//Breadth first traversal
	public void bft(int startVertex){
		boolean[] visited=new boolean[n];
		Queue<Integer> queue=new LinkedList<>();
		visited[startVertex]=true;
		queue.add(startVertex);
		System.out.print("Breadth First Traversal");
		while(!queue.isEmpty()){
			int current=queue.poll();
			System.out.print(current + " ");
			for(int neighbour:adjList.get(current)){
				if(!visited[neighbour]){
					visited[neighbour]=true;
					queue.add(neighbour);
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("ENter no f vertices");
		int n=s.nextInt();
		Bft graph=new Bft(n);
		System.out.println("Enter no of Edges");
		int e=s.nextInt();
		System.out.print("Enter edges(u,v) pairs");
		for(int i=0;i<e;i++){
			int u=s.nextInt();
			int v=s.nextInt();
			graph.addEdge(u,v);
		}
		System.out.print("Enter Starting vertex:");
		int start=s.nextInt();
		graph.bft(start);
		s.close();
	}
}
