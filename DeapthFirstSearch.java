import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class DeapthFirstSearch {
	
	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edgeSize;
	
	public DeapthFirstSearch(int nodes) {
		this.vertices=nodes;
		this.edgeSize=0;
		this.adj=new LinkedList[nodes];
		for(int i=0;i<nodes;i++) {
			this.adj[i]=new LinkedList();
		}
	}
	
	public void addEdge(int u,int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		edgeSize++;
	}
	
	public void dfs(int s) {
		boolean[] visited=new boolean[vertices];
		Stack<Integer> stack=new Stack<>();
		stack.push(s);
		while(!stack.isEmpty()) {
			int u=stack.pop();
			if(!visited[u]) {
				visited[u]=true;
				System.out.print(u+" ");
				for(int v:adj[u]) {
					if(!visited[v]) {
						stack.push(v);
					}
				}
			}
		}
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nodes : ");
		int nodes=s.nextInt();
		DeapthFirstSearch g=new DeapthFirstSearch(nodes);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.dfs(0);
	}

}
