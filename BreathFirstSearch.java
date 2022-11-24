import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BreathFirstSearch {
	
	private int vertices;
	private int edgeSize;
	private LinkedList<Integer>[] adj;
	
	public BreathFirstSearch(int nodes) {
		this.adj=new LinkedList[nodes];
		this.vertices=nodes;
		this.edgeSize=0;
		for(int i=0;i<nodes;i++) {
			this.adj[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int u,int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		edgeSize++;
	}
	
	public void bfs(int s) {
		boolean[] visited=new boolean[vertices];
		Queue<Integer> q=new LinkedList<>();
		visited[s]=true;
		q.offer(s);
		while(!q.isEmpty()) {
			int u= q.poll();
			System.out.print(u+" ");
			for(int v : adj[u]) {
				if(!visited[v]) {
					visited[v]=true;
					q.offer(v);
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nodes : ");
		int nodes=s.nextInt();
		BreathFirstSearch g=new BreathFirstSearch(nodes);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.bfs(0);
		
	}

}
