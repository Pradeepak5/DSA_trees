import java.util.Scanner;
public class Graphes {
	private int[][] array;
	private int edgeSize;
	private int vertices;
	
	public Graphes(int nodes) {
		this.array=new int[nodes][nodes];
		this.edgeSize=0;
		this.vertices=nodes;
	}
	
	public void addEdges(int u,int v) {
		array[u][v]=1;
		array[v][u]=1;
		edgeSize++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(vertices+" vertices, "+edgeSize+" edges");
		sb.append("\n");
		for(int i=0;i<vertices;i++) {
			sb.append(i +" : ");
			for(int w : array[i]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of nodes : ");
		int nodes=s.nextInt();
		Graphes g=new Graphes(nodes);
		g.addEdges(0,1);
		g.addEdges(3, 0);
		System.out.println(g);

	}

}
