package lab6_1;

import java.util.LinkedList;

public class lab6_1 {
	public static void main(String[] args) {
		System.out.println("lab6_1 : �ֹο�");
		
		// �������Ҹ�������LinkedList������Ʈ��ülist������
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//list�� 2�� �����ϴ��� ���� ���
		System.out.println(list.contains(2));
		
		// list�ǸǾտ�1, 2��, �ǵڿ�3, 4�����ʴ�λ�������,����Ʈ���
		list.addFirst(1); 
		list.addFirst(2); 
		list.addLast(3);
		list.addLast(4);
		System.out.println(list);
		
		// list��2, 4, 6�������ϴ����������
		System.out.println(list.contains(2));
		System.out.println(list.contains(4));
		System.out.println(list.contains(6));
		
		//list ���� ���
		System.out.println(list.size());
		
		// list�ǸǾտ���, �ǵڿ��Ҹ���������, �ο����������,����Ʈ���
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);
		// list�ǸǾտ���, �ǵڿ��Ҹ���������, �ο����������,����Ʈ���
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);
	}
}
