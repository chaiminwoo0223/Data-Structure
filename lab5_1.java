package lab5_1;

import java.util.ArrayList;

public class lab5_1 {

	public static void main(String[] args) {
		System.out.println("lab5_1 : ÃÖ¹Î¿ì");

		ArrayList<Integer> list = new ArrayList<Integer>();
		// 1~10
		for(int i=0;i<10;i++) {
			list.add(i+1);
		}
		System.out.println(list);
		// »ðÀÔ
		list.add(0,99);
		list.add(3,999);
		list.add(12,999);
		System.out.println(list);
		// »èÁ¦
		System.out.println(list.remove(12));
		System.out.println(list.remove(4));
		System.out.println(list.remove(0));
		System.out.println(list);
	}
}
