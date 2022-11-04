package lab9_1;

public class lab_9_1 {

	public static void main(String[] args) {
		System.out.println("lab9_1 : �ֹο�");
		// �Է��� ���ҵ��� ������ ������ �迭
		int[] dataArray = {3,2,5,7,4,8,-1,0,5,9};
		// �Է��� ���� ���� ���� �뷮�� ���� �ִ����� ����
		MyMaxHeap heap = new MyMaxHeap(dataArray.length);
		// ������ �迭�� ����� ���Ҹ� �ִ����� �ϳ��� ������ ��, ���� ���
		for(int item : dataArray) {
			heap.add(item);
			heap.print();
		}
	}
}
// ���� �迭�� ������ �ִ��� Ŭ����
class MyMaxHeap{
	private int[] array; // �ִ��� ���Ҹ� ������ �迭
	private int n; // �ִ����� ����� ���� ��
	// �뷮�� capacity�� ���� �ִ����� ����
	public MyMaxHeap(int capacity) {
	    n = 0;
	    array = new int[capacity];
	}
	// �Ű������� ���� ���� item�� �ִ����� ����
	public void add(int item) {
		array[n++] = item;
	}
	// �迭�� ������ ȭ���ϱ� ���� �迭 ���ҵ��� ���ʴ�� �� �ٿ� ���
	public void print() {
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}