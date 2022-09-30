package lab6_1;

import java.util.LinkedList;

public class lab6_1 {
	public static void main(String[] args) {
		System.out.println("lab6_1 : 최민우");
		
		// LinkedList형 리스트 객체 list를생성
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// list에 2가 존재하는지 여부 출력
		System.out.println(list.contains(2));
		
		// 삽입
		list.addFirst(1); 
		list.addFirst(2); 
		list.addLast(3);
		list.addLast(4);
		System.out.println(list);
		
		// list에 값이 존재하는지 여부 출력
		System.out.println(list.contains(2));
		System.out.println(list.contains(4));
		System.out.println(list.contains(6));
		
		//list 길이(크기) 출력
		System.out.println(list.size());
		
		System.out.println(list.removeFirst() + list.removeLast()); // list의 맨앞원소, 맨뒤원소를 삭제한 후, 합 출력
		System.out.println(list); // 리스트 출력
		System.out.println(list.removeFirst() + list.removeLast()); // list의 맨앞원소, 맨뒤원소를 삭제한 후, 합 출력
		System.out.println(list); // 리스트 출력
	}
}
