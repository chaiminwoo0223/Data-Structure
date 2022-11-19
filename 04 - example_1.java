package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class lab7_1 {

	public static void main(String[] args) {
		System.out.println("lab7_1 : 최민우");
		// 문자 스택 객체 생성
		Stack<Character> stack = new Stack<Character>();
		// 사용자로부터 한 줄의 문장열을 입력받음
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		// 문자열의 문자를 하나씩 스택에 삽입
		for(int i=0;i<line.length();i++) {
			char ch = line.charAt(i);
			stack.push(ch);
		}
		// 스택의 용량을 알아내어 출력
		System.out.println(stack.capacity());
		// 스이 텅 빌때까지 문자를 하나씩 삭제하여 순서대로 출력
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
