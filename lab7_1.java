package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class lab7_1 {

	public static void main(String[] args) {
		System.out.println("lab7_1 : �ֹο�");
		// ���� ���� ��ü ����
		Stack<Character> stack = new Stack<Character>();
		// ����ڷκ��� �� ���� ���忭�� �Է¹���
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		// ���ڿ��� ���ڸ� �ϳ��� ���ÿ� ����
		for(int i=0;i<line.length();i++) {
			char ch = line.charAt(i);
			stack.push(ch);
		}
		// ������ �뷮�� �˾Ƴ��� ���
		System.out.println(stack.capacity());
		// ���ؿ� �� �������� ���ڸ� �ϳ��� �����Ͽ� ������� ���
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
