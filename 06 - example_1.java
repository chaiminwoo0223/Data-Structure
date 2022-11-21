package lab10_1;

public class lab10_1 {
	public static void main(String[] args) {
		System.out.println("lab10_1 : 최민우");
		// 정점수 5인 방향 그래프 MatrixGraph g1을 생성하고 간선 삽입 후, 인접 행렬 내용 출력
		MatrixGraph g1 = new MatrixGraph(5);
		g1.insertEdge(0,4);
		g1.insertEdge(0,3);
		g1.insertEdge(3,2);
		g1.insertEdge(2,4);
		g1.insertEdge(2,0);
		g1.insertEdge(4,3);
		g1.insertEdge(4,1);
		System.out.println("그래프 g1의 인접행렬 :");
		g1.printAdjMatrix();
		System.out.println();
		// 정점수 5인 방향 그래프 ListGraph g2를 생성하고 간선 삽입 후, 인접 리스트 내용 출력
		ListGraph g2 = new ListGraph(5);
		g2.insertEdge(0,4);
		g2.insertEdge(0,3);
		g2.insertEdge(3,2);
		g2.insertEdge(2,4);
		g2.insertEdge(2,0);
		g2.insertEdge(4,3);
		g2.insertEdge(4,1);
		System.out.println("그래프 g2의 인접행렬 :");
		g2.printAdjList();
		System.out.println();
		// g1에 간선 <0,1>, <1,2>, <4,1>가 존재하는지 여부를 출력
		System.out.println(g1.hasEdge(0,1));
		System.out.println(g1.hasEdge(1,2));
		System.out.println(g1.hasEdge(4,1));
		// g1의 정점 0, 정점 3의 out-degree를 출력
		System.out.println(g1.outDegree(0));
	        System.out.println(g1.outDegree(3));
		System.out.println();
	}
}
class MatrixGraph{
	private int[][] matrix; //인점행렬
	private int n; // vertex 개수
	// 정점이 n개이고, 간선이 없는 그래프 생성
	public MatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}
	// 그래프에 간선 <v1,v2> 삽입
	public void insertEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n )
			System.out.println("그래프에 없는 정점입니다!");
		else
			matrix[v1][v2] = 1;
	}
	// 인접 행렬 출력
	public void printAdjMatrix() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public boolean hasEdge(int v1, int v2){
		return matrix[v1][v2] == 1;
	}
	public int outDegree(int v) {
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(matrix[v][i] == 1) {
				cnt++;
			}
		}
		return cnt;
	}
}
class ListGraph{
	//단순 연결 리스트 노드 구조
	private class Node{
		int vertex;
		Node link;
	}
	private Node[] list; // 인점 리스트
	private int n; // vertex 개수
	// 정점이 n개이고, 간선이 없는 그래프 생성
	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}
	// 그래프에 간선 <v1,v2> 삽입
	public void insertEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n )
			System.out.println("그래프에 없는 정점입니다!");
		else {
			Node newNode = new Node();
			newNode.vertex = v2;
			newNode.link = list[v1];
			list[v1] = newNode;
		}
	}
	// 인접 리스트 출력
	public void printAdjList() {
		for(int i=0;i<n;i++) {
			System.out.print("정점"+i+"의 인접리스트");
			for(Node temp = list[i];temp != null;temp = temp.link) {
				System.out.print(" ->"+temp.vertex);
			}
			System.out.println();
		}
	}
}
