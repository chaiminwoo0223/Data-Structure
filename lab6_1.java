package lab6_1;

import java.util.LinkedList;

public class lab6_1 {
	public static void main(String[] args) {
		System.out.println("lab6_1 : 최민우");
		
		// 정수원소를저장할LinkedList형리스트객체list를생성
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//list에 2가 존재하는지 여부 출력
		System.out.println(list.contains(2));
		
		// list의맨앞에1, 2를, 맨뒤에3, 4를차례대로삽입한후,리스트출력
		list.addFirst(1); 
		list.addFirst(2); 
		list.addLast(3);
		list.addLast(4);
		System.out.println(list);
		
		// list에2, 4, 6이존재하는지여부출력
		System.out.println(list.contains(2));
		System.out.println(list.contains(4));
		System.out.println(list.contains(6));
		
		//list 길이(크기) 출력
		System.out.println(list.size());
		
		// list의맨앞원소, 맨뒤원소를삭제한후, 두원소의합출력,리스트출력
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);
		// list의맨앞원소, 맨뒤원소를삭제한후, 두원소의합출력,리스트출력
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);
	}
}
