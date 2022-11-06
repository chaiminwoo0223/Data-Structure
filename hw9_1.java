package hw9_1;

public class MyMaxHeapTest {
	public static void main(String[] args) {
		System.out.println("hw9_1 : 최민우");
		// 입력할 원소들을 저장한 데이터 배열
		int[] dataArray = {3,2,5,7,4,8,-1,0,5,9};
		// 입력할 원소 수와 같은 용량의 공백 최대힙을 생성
		MyMaxHeap heap = new MyMaxHeap(dataArray.length);
		// 데이터 배열에 저장된 원소를 최대힙에 하나씩 삽입한 후, 힙 내용 출력
		for(int item : dataArray) {
			heap.add(item);
			heap.print();
		}
	}
}
// 정수 배열로 구현한 최대힙 클래스
class MyMaxHeap{
	private int[] array; // 최대힙 원소를 저장할 배열
	private int n; // 최대힙에 저장된 원소 수
	private int temp; //원소를 임시 저장할 temp
	// 용량이 capacity인 공백 최대힙을 생성
	public MyMaxHeap(int capacity) {
	    n = 0;
	    array = new int[capacity];
	}
	// 매개변수로 받은 원소 item을 최대힙에 삽입
	public void add(int item) {
		array[n++] = item;
		if(array[n] < array[(n-1)/2]) {
			temp = array[n];
			array[n] = array[2*n+1];
			array[2*n+1] = temp;
		}	
	}
	// 최대힙의 내용을 확인하기 위해 배열에 저장된 순서대로 최대힙 내용을 출력
	public void print() {
		for(int k=0;k<n;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println();
	}
}
