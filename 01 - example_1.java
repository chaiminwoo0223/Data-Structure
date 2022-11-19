package hw3_1;

import java.util.Scanner;

public class hw3_1 {
	public static void main(String[] args) {
		System.out.println("hw3_1 : 최민우"); //과제 : 이름

		Scanner input = new Scanner(System.in); //정수 개수 입력
		System.out.print("정수 개수 입력 : ");
		int n = input.nextInt();

		System.out.print(+n+"개의 정수값 입력 : "); //배열에 정수값 입력
		int[] array = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt(); 
		}

		int sum = 0; //배열에 정수값 더하기
		for(int j=0;j<array.length;j++) {
			sum += array[j]; 
		}

		double avg = (double)sum/array.length;
		System.out.println("평균 = "+avg); //평균 구하기

		System.out.print("평균 초과 = "); //평균 초과 검사
		for(int k=0;k<array.length;k++) {
			if(array[k] > avg)
				System.out.print(array[k]+" ");
		}

		input.close();
	}
}
