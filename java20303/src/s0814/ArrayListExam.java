package s0814;

import java.net.PortUnreachableException;
import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("권순호");
		list.add("유재석");
		list.add("김옥순");
		list.add("김성빈");
		list.add("옥자");
		System.out.println(list.toString());
		list.remove("유재석");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("-----------------");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		list.removeAll(list);
		System.out.println("지운후 사이즈" + list.size());
		
		System.out.println("-----------------");
		list.add("서울");
		list.add("로봇");
		if(list.contains("서울")== true) {
			System.out.println("서울을 포함하고 있음");
		}
		
		
	}

}
