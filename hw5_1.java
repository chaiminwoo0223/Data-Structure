package hw5_1;

public class hw5_1 {

	public static void main(String[] args) {
		System.out.println("lab5_1 : 최민우");
		//MyArrayList형 리스트 객체 list를 생성
		MyArrayList list = new MyArrayList(100);
		// 1~10
		for(int i=0;i<10;i++) {
			list.add(i,i+1);
		}
		System.out.println(list);
		//3개 삽입
		list.add(0,99);
		list.add(3,999);
		list.add(12,999);
		System.out.println(list);
	}
	//배열을 이용하여 정수 리스트를 구현하는 클래스
	public class MyArrayList{
		private int[] array; //원소를 저장할 배열
		private int numItems; //배열에 저장된 원소 수(리스트 길이)
		public static final int DEFAULT_CAPACITY = 100; //배열의 기본 용량
		//생성자1
		public MyArrayList() {
			array = new int[DEFAULT_CAPACITY];
			numItems = 0;
		}
		//생성자2
		public MyArrayList(int capacity) {
			array = new int[capacity];
			numItems = 0;
		}
		//삽입
		public void add(int item) {
			if(numItems < array.length)
				array[numItems++] = item;
		}
		public void add(int index,int item) {
			array[index] = item;
		}
		@Override
		public String toString() {
			String result = "";
			for(int i=0;i<numItems;i++) {
				result += array[i] + " ";
			}
			return result;
		}
	}
}


