package s0814;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("권순호");
		list.add("김옥지");
		list.add("김기명");
		
		System.out.println(list.toString());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.addFirst("김기훈");
		list.addLast("박승철");
		for (String str : list) {
			System.out.println(str);
		}
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
	}

}
