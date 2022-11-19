package hw7_1;

import java.util.Scanner;
import java.util.EmptyStackException;

public class hw7_1 {

	public static void main(String[] args) {
		System.out.println("hw7_1 : 최민우");
		// MyArrayStack 객체 stack 생성
		MyArrayStack stack = new MyArrayStack();
		// 사용자로부터 한 줄의 문장열을 입력받음
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		// 문자열의 문자를 하나씩 스택에 삽입
		for(int i=0;i<line.length();i++){
			stack.push(line.charAt(i));
		}
		// 스택의 용량을 알아내어 출력
		System.out.println(stack.Capacity);
		// 스택이 텅 빌때까지 문자를 하나씩 삭제하여 순서대로 출력
		while(!stack.IsEmpty()){
			System.out.print(stack.pop());
		}
	}
}
// 배열로 구현한 문자 스택
class MyArrayStack{
	private char[] Array;
	private int top;
	public int Capacity;
	// 크기가 10인 공백 스택 생성
	public MyArrayStack(){
		top = -1;
		Capacity = 10;
		Array = new char[Capacity];
	}
	// 스택이 비어있는지를 검사
	public boolean IsEmpty(){
		return (top==-1);
	}
	// 스택이 가득찼는지를 검사
	public boolean IsFull(){
		return (top==Capacity-1);
	}
	// 스택에서 원소를 삭제하여 리턴
	public char pop(){
		if(IsEmpty())
			throw new EmptyStackException(); // 예외 처리
		else
			return Array[top--];
	}
	// 스택에 input을 삽입
	public void push(char input){
		if(IsFull()){
			Capacity *= 2; // 배열의 크기를 2배로 확장
			char[] temp = new char[Capacity];
			for(int i=0;i<Capacity/2;i++){
				temp[i]=Array[i];
			}
			Array = temp;
		}
		Array[++top]=input;
	}
}
