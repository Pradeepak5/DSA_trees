import java.util.LinkedList;
import java.util.Scanner;
public class GraphList {
	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edgeSize;
	
	public GraphList(int nodes) {
		this.vertices=nodes;
		this.edgeSize=0;
		this.adj=new LinkedList[nodes];
		for(int i=0;i<nodes;i++) {
			this.adj[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int u,int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);		
		edgeSize++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(vertices+" vertices, "+edgeSize+" edges");
		sb.append("\n");
		for(int i=0;i<vertices;i++) {
			sb.append(i +" : ");
			for(int w : adj[i]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nodes : ");
		int nodes=s.nextInt();
		GraphList g=new GraphList(nodes);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		System.out.println(g);
	}

}
