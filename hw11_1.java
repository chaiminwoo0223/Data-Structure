package hw11_1;

import java.util.Scanner;

public class hw11_1 {
	public static void main(String[] args) {
		System.out.println("hw11_1 : 최민우");
		// 단어 개수(n)와 n개의 단어를 입력받아 String 배열에 저장한다.
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] array = new String[n];
		for(int i=0;i<n;i++) {
			array[i] = input.next(); 
		}
		// n개의 단어를 사전순으로 오름차순 정렬한다.
		insertionSort(array);
		// 정렬된 순서대로 n개의 단어를 출력한다.
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
	// array에 저장된 단어들을 사전순으로 삽입 정렬
	private static void insertionSort(String[] array) {
		int i, j;
		String item;
		String temp = null;
		for(i=0;i<array.length-1;i++) {
			item = array[i];
			// item이 삽입될 위치 j를 찾음
			for(j=i+1;j<array.length+1;j++) {
				if(array[j-1].compareTo(item) > 0) {
					temp = array[i];
					array[i] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
}
