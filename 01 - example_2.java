package hw3_2;

public class hw3_2 {
	public static void main(String[] args) {
		System.out.println("hw3_1 : 최민우"); //과제 : 이름

		//4개의 정수 배열을 초기화
		int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] array2 = {50, 10, 0, 50, 20};
		int[] array3 = {-50, -10, -40, -50, -20};
		int[] array4 = {10};

		//getMaxIndex 메소드 호출
		getMaxIndex(array1);
		getMaxIndex(array2);
		getMaxIndex(array3);
		getMaxIndex(array4);
	}

	private static void getMaxIndex(int[] array) {
		int num = 0;
		int max_a = 0;
		int max_b = array[0];
		//양수일 떄
		for(int i=0;i<array.length;i++) {
			if(array[i] > max_a) {
				max_a = array[i];
				num = i;
			}
		}
		//음수일 때
		for(int j=1;j<array.length;j++) {
			if(array[j] < 0) {
				if(array[j] > max_b) {
					max_b = array[j];
					num = j;
				}
			}
		}
		//조건문을 이용한 출력
		if(max_a > 0)
			System.out.println(num+" "+max_a);
		else
			System.out.println(num+" "+max_b);
	}
}
