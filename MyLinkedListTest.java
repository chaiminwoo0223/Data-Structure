package hw6_1;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("hw6_1 : 최민우");
		// MyLinkedList 객체 list 생성
		MyLinkedList list = new MyLinkedList();
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
	}
}
// 정수 선형 리스트를 단순 연결리스트로 구현하는 클래스
class MyLinkedList{
	private Node head;    // 리스트의 첫번째 노드를 가리키는 변수
	private int numItems; // 리스트 길이(원소 수)
	//연결 리스트 노드 구조
	private class Node{
		int data;
		Node link;
	}
	// 공백 리스트를 생성
	public MyLinkedList() {
		head = null;
		numItems = 0;
	}
	// 리스트의 맨 앞에 data를 삽입
	public void addFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = head;
		head = newNode;
		numItems++;
	}
	// 리스트의 맨 뒤에 data를 삽입
	public void addLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
		numItems++;
	}
	// 리스트가 data를 포함하는지 여부를 리턴
	public boolean contains(int data) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == data) 
				return true;
			temp = temp.link;
		}
		return false;
	}
	//리스트의 길이(크기)
	public int size(){
		return numItems;
	}
	// 리스트 원소들을 하나의 문자열로 만들어 리턴
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("(");
		Node temp = head;
		if(numItems > 0) {
			for(int i=0;i<numItems-1;i++) {
				result.append(temp.data + ",");
				temp = temp.link;
			}
			result.append(temp.data);
		}
		result.append(")");
		return result.toString();
	}
}
